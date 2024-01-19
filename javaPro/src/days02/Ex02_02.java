package days02;

/**
 * @author BongGu
 * @date 2024. 1. 2. - 오전 10:06:50
 * @subject
 * @content 지역변수
 */
public class Ex02_02 {

	public static void main(String[] args) {
		
		// String : 문자열 자료형  				%s
		// char : 하나의 문자 자료형				%c 
		// double : 숫자(실수) 대표적 자료형  	%f
		// int : 숫자(정수) 대표적 자료형  		%d
		
		// 지역변수(local variable)
		String name = "홍길동"; //main() 메서드 안에서만 사용가능한 지역변수
		
		// {} : 지역(범위,영역) 연산자
		{
			// Type mismatch: cannot convert from char to String
			// String grade = 'A';
			char grade = 'A'; // []
			System.out.printf("1. 이름 : %s\"\n", name);
			// 개행 시 System.out.println(); 써도 됨
			System.out.printf("1. 등급 : '%c\'\n", grade);
		}
		System.out.printf("2. 이름 : %s\"\n", name);
		// grade cannot be resolved to a variable > grade를 변수로 인식하지 못함
		// System.out.printf("2. 등급 : '%c\'\n", grade);
		
	} //main

} //class
