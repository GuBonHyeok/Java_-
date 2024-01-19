package days14;

/**
 * @author Bonggu
 * @date 2024. 1. 18.
 * @subject 접근 지정자에 대해서
 * @content
 */
public class Ex04 {
	
	private class Member{
		
	}

	public static void main(String[] args) {
		/*
		 * [접근지정자]
		 * 1. 클래스 앞에 붙는 접근지정자
		 *   1) public					: 패키지 내부, 외부 어디서든 상속과 참조(사용) 가능
		 *   	  ex) Ex04.java와 Tv.java는 같은 같은 패키지 (패키지 내부)에 존재할 경우 가능 Tv tv1 = new Tv(); //참조 가능
		 *       ex) days13.Ex01.java 에서도 가능. 하지만 import 구문이 존재해야함
		 */
		Student s1 = new Student(); //참조 가능
		/*
		 *   2) package(default): 패키지 내부에서만 상속과 참조(사용) 가능
		 *       ex) Ex04.java와 Tv.java는 같은 같은 패키지 (패키지 내부)에 존재할 경우 가능 Tv tv1 = new Tv(); //참조 가능
		 *       ex) days13.Ex01.java 에서는 불가능. 외부 패키지이기 때문
		 *       
		 *       독립적인 클래스를 선언할 때는 사용할 수 없는 접근지정자이다.
		 *       <-> 중첩 클래스 (클래스 안에 클래스를 선언하는 경우)로만 선언 가능
		 *       		 * 내부 클래스 4가지가 있음
		 *   3) private 비활성화		: 같은 파일 내에서만 상속, 참조 가능
		 *   4) protected 비활성화	: package(default) 기능 + 패키지 외부에서는 상속만 가능하다.
		 *1-2. 클래스 앞에 붙는 기타 제어자
		 *      1) abstract		   - 추상 클래스
		 *      2) final   			   - 최종 클래스 (상속 안됨)
		 *          (상수 선언할 때와 final과 의미 다름)
		 *      3) static (비활성화) - 중첩 클래스 선언할 때만 사용 가능
		 *
		 * 2. 멤버	앞에 붙는 접근지정자
		 *    ※ 두 개는 다른 의미이다.
		 * */

	} //main

} //class
