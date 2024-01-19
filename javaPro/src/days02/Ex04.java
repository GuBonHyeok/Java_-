package days02;

/**
 * @author BongGu
 * @date 2024. 1. 2. - 오전 11:22:37
 * @subject 자바에서 사용하는 자료형
 * @content 기본형, 참조형
 */
public class Ex04 {

	public static void main(String[] args) {
		/*
		 * [자료형] == Data Type(데이터 형식)
		 * 1. Data(값) + Type(종류)
		 * 2. 자료형? 값이 저장될 공간의 크기와 저장되는 형식을 정의한 것
		 * 3. 자바 자료형 종류
		 *    가. 기본형(Primitive Type) - 8가지
		 *       1) 숫자형
		 *          가) 정수계열 - byte(1), short(2), [int(4)], long(8)
		 *                         문자 자료형 char(2)
		 *              1byte = 8bit
		 *              1bit = [0] or [1] 2가지 표현 가능						2^1가지
		 *              2bit = [00], [01], [10], [11] 4가지 표현 가능		2^2가지
		 *              3bit = [000], [001], ... [111] 8가지 표현 가능		2^3가지
		 *              8bit =          						256가지 표현 가능	2^8가지
		 *              그래서 byte 정수 표현 범위 : -128 ~ 127 (0 포함) 2^8가지
		 *              short 정수 표현 범위 : -32768 ~ 32767 (0 포함) 2^16가지
		 *              int 정수 표현 범위 : -2,147,483,648 ~ 2,147,483,647 2^32가지  (42억)
		 *              long 정수 표현 범위 : 18,446,744,073,709,551,616 2^64가지  (1800경)
		 *          나) 실수계열 - [double(8)], float(4)
		 *       2) 논리형(boolean (1)) - 참(true) or 거짓(false)
		 *    나. 참조형(Reference Type) - 배열(Array), 클래스, 인터페이스
		 */

		// 성별을 나타내는 변수 선언 : 남자(true), 여자(false)
		boolean gender =true;
		System.out.printf("성별 : %b \n" ,gender);

		// 사람의 나이를 저장할 변수 age 선언하세요
		byte age;
		// 한 학생의 국어 점수를 저장할 변수 kor을 선언하세요.
		byte kor;
		// 자바 		: byte 256가지 표현. -128~127 정수
		// 다른 언어 	: 부호가 없는 것을  

	} //main

} //class
