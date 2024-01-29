package days21;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Bonggu
 * @date 2024. 1. 29.- 오후 3:17:34
 * @subject 
 * @content
 */
public class Ex13 {

	public static void main(String[] args) {
		ArrayList team1 = new ArrayList(); //자동으로 크기가 조절되기 때문에 초기화 작업은 필요 없이 선언만 해도 된다.
		String t1 = "구본혁(팀장),류영은,윤형준,김영진,강명건,김진성,유진,이동찬"; 
		String [] t1Names = t1.split(",");
		for (int i = 0; i < t1Names.length; i++) {
			team1.add(t1Names[i]);			
		} //for
		System.out.println(team1);
		
		ArrayList team2 = new ArrayList(); //자동으로 크기가 조절되기 때문에 초기화 작업은 필요 없이 선언만 해도 된다.
		String t2 = "원대안(팀장),이동영,한재호,권맑음,박우현,이시은,조연화"; 
		String [] t2Names = t2.split(",");
		for (int i = 0; i < t2Names.length; i++) {
			team2.add(t2Names[i]);			
		} //for
		System.out.println(team2);
		
		ArrayList class5 = new ArrayList(team1); //컬렉션 타입을  
		//class5.addAll(team2); //매개변수 다형성에 의해 team2를 사용할 수 있다
		System.out.println(class5);
		
		System.out.println(class5.containsAll(team2)); // class5 에 team2가 포함되어있는지
		
		ArrayList class5Clone = (ArrayList) class5.clone(); //
		
		//class5Clone.remove(0); //인덱스로 제거하는 방법
		//class5Clone.remove("윤형준"); //요소를 직접 입력해서 제거하는 방법
		//class5Clone.removeAll(team1);
		
		class5Clone.sort(new Class5Comparator());
		
		System.out.println("원본 : " + class5);
		System.out.println("복제 : " + class5Clone);
		
	} //main

} //class

//5강의장 학생들을 정렬하는데 사용되는 Comparator
class Class5Comparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;
		return s1.compareTo(s2); //오름차순 정렬
		//return s2.compareTo(s1); //내림차순 정렬
	}
	
}











