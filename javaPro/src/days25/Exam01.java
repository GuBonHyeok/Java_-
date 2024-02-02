package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

import days24.MemberVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class Exam01 {

	public static void main(String[] args) {
		// Hashtable, HashMap, TreeMap, SortedMap, LinkedHashMap
		String fileName = ".\\src\\days24\\Java 팀 구성.txt";
		HashMap<TeamVO, ArrayList<MemberVO>> teamMap = new LinkedHashMap<>();
		
		String line = null;
		String name =null;
		String teamName = null;
		ArrayList<MemberVO> teamList = null;
		
		try(FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr)	) {
			
			while (   (line = br.readLine()) != null && !line.equals("") ) {
				teamName = line; 
				line = br.readLine();
				String [] tNames = line.split("\\s*,\\s*");
				teamList = new ArrayList<>(); 
				String leader = null;
				for (int i = 0; i < tNames.length; i++) {
					name = tNames[i];
					if ( name.contains("팀장") ) {  // 팀장
						leader = name = name.replace("(팀장)", "");
						teamList.add(new MemberVO( name, "팀장"));
					} else {  // 팀원
						teamList.add(new MemberVO( name, "팀원"));
					} // if
				} // for
				int totalNumber = teamList.size();
								
				teamMap.put(new TeamVO(teamName ,totalNumber, leader), teamList); //
				
			} // while
			
			// 출력
			dispTeamMember(teamMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main

	private static void dispTeamMember(HashMap<TeamVO, ArrayList<MemberVO>> teamMap) {
		
		Set<Entry<TeamVO, ArrayList<MemberVO>>> es = teamMap.entrySet();		
		Iterator<Entry<TeamVO, ArrayList<MemberVO>>> ir = es.iterator();
		
		while (ir.hasNext()) {
			Entry<TeamVO, ArrayList<MemberVO>> entry = ir.next();
			TeamVO key = entry.getKey();
			ArrayList<MemberVO> value = entry.getValue();			
			MemberVO teamReaderVO = value.get(0);
			System.out.printf("[%s(%d명):%s]\n"
					, key.getName(),key.getTotalNumber(), key.getLeader()); 
			Iterator<MemberVO> ir2 = value.iterator();
			int seq = 1;			
			ir2.next();		
			while (ir2.hasNext()) {
				MemberVO vo =  ir2.next();
				System.out.printf("  [%d] %s\n", seq++,  vo.getName()  );
				   
			} // while
			
		} // while
				
	}

} // class

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
class TeamVO {
	String name;
	int totalNumber;
	String leader; 
}

