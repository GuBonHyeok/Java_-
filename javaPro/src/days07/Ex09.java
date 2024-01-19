package days07;

/**
 * @author BongGu
 * @date 2024. 1. 9. - 오후 4:06:19
 * @subject  메서드(함수) 설명.
 * @content 1. 기능 2. 매개변수 3. 리턴값 (리턴자료형)
 */
public class Ex09 {

	public static void main(String[] args) {
		/*
		 * 1. 정의 : 프로그래밍에서 "반복되는 명령어들"을 찾아서 별도로 묶어서
		 * 				 필요할 때 마다 재사용하도록 만든 것
		 * 2. 프로그램의 구조화 -> 유지, 보수 관리 용이 
		 * 3. 함수가 기본이 되는 프로그래밍 방식 - 구조적 프로그래밍
		 * 		객체가 기본이 되는 프로그래밍 방식 - 객체지향적 프로그래밍 (OOP)
		 * 4. 함수(메서드) 선언
		 * 		[접근지정자] [기타제어자] 리턴자료형 함수명 ([매개변수]) 함수 원형 == 함수의 프로토타임 (prototype)
		 * 		{ 함수의 몸체(body)
		 * 
		 * 		[return 리턴값;]
		 * 		// return;
		 * */

		//선 긋기 함수 호출
		drawLine();
		System.out.println("부서명 : 사원명");
		//선 긋기 함수 호출
		drawLine(30);
		System.out.println("영업부 : 강명건");
		System.out.println("생산부 : 구본혁");
		System.out.println("총무부 : 권맑음");
		System.out.println("자재부 : 김영진");
		//선 긋기 함수 호출
		drawLine(20, "^");

	} //main

	// 함수 선언 3가지 : 기능, 매개변수, 리턴값(리턴자료형)
	// [함수 선언 부분]
	public static void drawLine() {
		//선 긋기( 100줄 정도 된다고 가정)
		System.out.println("-------------"); //반복적				
	}
	//Duplicate method drawLine() in type Ex09
	// 매개변수의 타입, 개수가 다르면 똑같은 함수명으로 선언할 수 있다
	public static void drawLine(int n) { //중복 함수 == 함수가 중복선언되었다 == Overloading(오버로딩)
		//선 긋기( 100줄 정도 된다고 가정)
		System.out.println("-".repeat(n)); // "-"을 n번 반복하는 함수	
	}
	//com.util.Draw2D
	
	public static void drawLine(int n, String style) { //중복 함수 == 함수가 중복선언되었다 == Overloading(오버로딩)
		System.out.println(style.repeat(n)); // 매개변수로 받은 style을 n번 반복하는 함수
		
		/*
	public static int drawLine(int n) { //리턴 자료형은 달라도 중복선언할 수 없다
		//선 긋기( 100줄 정도 된다고 가정)
		System.out.println("-".repeat(n)); // "-"을 n번 반복하는 함수
		return 1;
		 */
	} //main

} //class
