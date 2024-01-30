package days22;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex01 {

	/*
	 *   1) 팀원들의 이름을 요소로 추가    add(), addAll()
  2) 반복자를 사용해서 모든 요소(팀원들) 출력 
  3) 팀원들의 인원수를 출력
  4) 두 번째 팀원이 누구인지 확인 후 "홍길동" 팀원으로 수정

  5) "홍길동" 팀원의 존재 유무를 확인 후 삭제
  6) "이"씨 팀원들만 삭제 후 확인.
	 */

	public static void main(String[] args) {
		ArrayList team1 = new ArrayList();
		ArrayList team2 = new ArrayList();
		String Team1List = "구본혁, 김영진, 이동찬, 유진, 윤형준, 류영은, 강명건, 김진성";
		String Team2List = "원대안,이동영,한재호,권맑음,박우현,이시은,조연화";
		team1.add(Team1List);
		team1.add("구봉구");
		team1.add("김김김");
		team1.add("이이이");
		
		System.out.println(team1.get(1));
		int index = -1;
		if ((index = team1.indexOf("김김김")) != -1 ) { 
			team1.set(1, "홍길동");			 					
		}
		System.out.println(team1);
		
		
		

		//System.out.println(team1.contains("윤형준"));
		team1.addAll(team2);
		//System.out.println(team1);

		//System.out.println(team1.size());

		Iterator ir = team1.iterator(); 
		while (ir.hasNext()) { 
			String name = (String) ir.next(); 
			System.out.println(name);
		}
		

	}//main

}//class
