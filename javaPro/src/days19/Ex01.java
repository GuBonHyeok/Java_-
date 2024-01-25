package days19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import days15.Person;

/**
 * @author Bonggu
 * @date 2024. 1. 25.- 오전 8:41:31
 * @subject 복습문제 3번 풀이
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		String fileName = "SS20_Team.txt"; //SS20_Team 경로를 fileName에 저장
		String [] teamMember = null; // 팀원들 저장할 배열
		
		String key = "user.dir";
		String userDir = System.getProperty(key); //user.dir의 경로 확인
		//System.out.println(userDir);
                        
		String path = String.format("%s\\src\\days19\\%s",userDir, fileName); //파일의 전체 경로 불러와서 path에 저장
		//System.out.println(path); //전체 경로 확인
		
		String myName = "구본혁";
		String teamLine = null; // n팀인지 불러오는 라인
		String teamMemberLine = null; // 팀원 불러오는 라인
		String teamLeader = null;
		String regex = "\\s*,\\s";
		
		try (FileReader fr = new FileReader(path)) {
			BufferedReader br = new BufferedReader(fr); //
			while( (teamLine = br.readLine()) != null) {
				teamMemberLine = br.readLine();
				//System.out.printf("[%s] : [%s]\n ", teamLine, teamMemberLine); //잘 나왔는지 확인
				if (teamMemberLine.contains(myName)) { //내 이름이 teamMemberLine에 포함되어 있는지
					System.out.printf("[%s] : [%s]\n ", teamLine, teamMemberLine); //내 이름이 포함되어있는지  contains로 확인 후 해당되는 라인 출력
					
					teamMember = teamMemberLine.split(regex); //regex를 구분자로 split 써서 잘라내기
					teamLeader = teamMember [0].replace("(팀장)", ""); // "팀장" 을 빈 문자열로 만들어서 팀장 변수에 기입		 
					
					// 나머지 팀원들 내림차순으로 정렬
					String [] temp = new String[teamMember.length-1];
					System.arraycopy(teamMember, 1, temp, 0, teamMember.length-1); // 팀 멤버들만 잘라내서 temp에 저장
					//System.out.println("temp : " + Arrays.toString(temp));
					Arrays.sort(temp, Collections.reverseOrder());
					//System.out.println("temp : " + Arrays.toString(temp));
					System.arraycopy(temp, 0, teamMember, 1, teamMember.length-1); // 팀 멤버들만 잘라낸 temp의 0번째부터 
					System.out.println(Arrays.toString(teamMember));
					
					break; //찾았으면 더 이상 다른 팀원 체크 안 하겠다는 의미
				} //if
				
			}// while
			
			// 출력
			String output = "<ul>\n"
					+ "\t<li class=\"leader\">";
			System.out.printf("[%s]\n", teamLine);
			output += String.join("</li>\n<li>", teamMember);
			output += "</li>\r\n"
					+ "</ul>";
			System.out.println(output);
						
		} catch (Exception e) {
			e.printStackTrace();
		}		
     
	} //main

} //class

