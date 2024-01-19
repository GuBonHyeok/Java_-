package days01;

/**
 * @author Bon
 * @date 2023. 12. 29. - 오후 4:04:40
 * @subject
 * @content		 이름, 나이를 저장할 변수를 선언하고
 * 						 출력하는 코딩.
 */
public class Ex04 {

	public static void main(String[] args) {
		// 1. 이름을 저장할 변수 선언
		String name = "권맑음";
		String name2 = "류영은";
		// 2. 나이를 저장할 변수 선언		
		int age, age2;
		age = 31;
		age2 = 28;
		
		// 3. 이름/나이 출력
		System.out.println(name);
		System.out.println(name2);
		System.out.println(age);
		System.out.println(age2);
		// 3-2. 출력형식 : 이름은 "권맑음"이고, 나이는 31살이다.
		// String literal is not properly closed by a double-quote
		// \를 붙이면 이스케이프 문자열이 된다 ex) "를 문자열로 넣고 싶을 때 -> \"
		System.out.println("이름 : \"" + name
				+ "\", 나이 : " + age + " 살 입니다." );
		// System.out.println(age);

	} //main

} //class
