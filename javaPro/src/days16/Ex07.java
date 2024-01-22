package days16;

import java.io.IOException;

/**
 * @author Bonggu
 * @date 2024. 1. 22.- 오후 12:28:05
 * @subject 오버로딩 (overloading)과 오버라이딩 (overrideing)
 * @content 중복함수						  재정의함수
 * 					drawLine()
 * 					drawLine(int n)
 * 					drawLine(int n, Style s)
 * 
 * 					오버라이딩(재정의함수) ? Super 클래스로부터 
 * 					상속받은 메서드를 재정의한 것.
 * 					- Override의 사전적 의미 : overwrite = 덮어쓰다.
 * 
 * 					[오버라이딩의 조건]
 * 					1. 메서드명 수정할 수 없음
 * 					2. 매개변수 개수, 자료형 동일
 * 					3. 리턴 타입 동일
 * 					4. 접근지정자는 부모의 접근지정자 범위보다 같거나 넓어야 한다.
 * 					5. 부모의 메서드보다 많은 수의 예외를 선언할 수 없다.
 * 					6. 부모는 인스턴스 메서드인데 자식은 static으로,
 * 						부모는 static 메서드인데 자식은 인스턴스로 변경할 수 없다.
 */
public class Ex07 {

	public static void main(String[] args) {
		//오버로딩 : 매개변수 개수, 매개변수 리턴값
		//오버라이딩 : 상속받으면서 추가적으로 내용을 넣어 재정의 하는 것


	} //main

} //class

class Parent{
	int print(String n, int a) throws IOException {
		return 100;
	}

}

class Child extends Parent{

	@Override //형식에 맞게 오버라이딩이 됐는지 컴파일러가 확인해주는 어노테이션
	//부모 클래스인 Parent에게서 상속받았기 때문에 예외 갯수가 더 많을 수 없다.
	// (x )protected int print(String n, int a) throws IOException, NullPointerException {
	//(x )protected static int print(String n, int a) throws IOException, NullPointerException {
	protected int print(String n, int a)  {	
		return 100 + a;
	}
	//오버로딩
	//int print(String n) {
	//	return 100;
	//}


}
