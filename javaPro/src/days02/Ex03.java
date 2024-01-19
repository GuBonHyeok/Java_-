package days02;

/**
 * @author BongGu
 * @date 2024. 1. 2. - 오전 10:49:01
 * @subject
 * @content 식별자 명명규칙
 */
public class Ex03 {

	public static void main(String[] args) {
		System.out.println("안녕하세요. 홍길동입니다.");
		// Alt + Shift + Y : 긴 문자열 화면에 맞게 정리
		String name = "구본혁"; 				//%s
		int age = 30;							//%d
		final double PI = 3.141592;		//%f
		char grade = 'A';						//%c
		byte go = 0;								//%d

		System.out.printf("이름 : %s, 나이 : %d, PI : %f, 등급 : %c",
				name, age, PI, grade);
		/*
		 * [식별자명명 규칙]
		 * 1. 자바는 대소문자 구분을 한다
		 *    > String name;
		 *      > sysout (Name); X
		 * 2. 키워드(예약어)를 사용하면 안된다. ex) 이미 의미가 부여되어 있는 것 : int, char, double ...
		 *    > int char; X
		 * 3. $와 _ 특수문자는 사용 가능 (공백 안됨)
		 *    > int $age; O
		 *    > int _age; O
		 * 4. 숫자로 시작할 수 없다. ex) int 1kor; : 안됨
		 *    > int 1kor; X
		 *    > int kor1; O
		 */
		int kor;
		int $age, a$ge;
		int _height, h_eight;
		String firstName; //자바에선 이렇게 권장 String first name; 사용 불가
		// int #age; 사용 불가 //Duplicate local variable age

	} // main

} // class
