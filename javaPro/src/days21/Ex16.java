package days21;

import java.util.ArrayList;

/**
 * @author Bonggu
 * @date 2024. 1. 29.- 오후 5:10:15
 * @subject 
 * @content
 */
public class Ex16 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("원대안");
		list.add("이시은");
		list.add("박우현");
		list.add("이재호");
		list.add("윤형준");
		list.add("이동찬");
		list.add("한재호");
		list.add("이동영");
		list.add("류영은");

		System.out.println(list);
			
		// 팀에서 "이"씨인 팀원을 삭제하려면?
		
		/* [1]
		for (int i = 0; i < list.size(); i++) {
			String name =(String)list.get(i);
			//if (((String) list.get(i)).startsWith("이") ){
			if ( name.charAt(0)=='이') {
				System.out.println(name); //팀원들 중에 "이"씨 성 가진 사람들 출력		
				list.remove(name); //해당되는 사람들 삭제
			} //if
		}
		System.out.println(list);
		*/
		// [2] 위 코딩과 처리 과정 동일함
		list.removeIf(n -> ((String)n).charAt(0) =='이' ); //() 괄호 속 필터에 해당되는 것들만 삭제하는 것

	} //main

} //class









