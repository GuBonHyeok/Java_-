package days04;

import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 4. - 오후 5:13:38
 * @subject switch문 실습
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// if (condition) 명령코딩;

		// 명령코딩 1줄인 경우에는 { } 블록 생략 가능

		// if(condition) 명령코딩;
		// else 명령코딩;

		// for (초기식 ; 조건식 ; 증감식) 명령코딩; //1줄

		int n;
		String data;

		try(Scanner sc = new Scanner(System.in);) {
			System.out.print("> 정수(n) 입력 ? ");
			n = sc.nextInt();
			
			//key :
			//
			
			final int ZERO = 0;

			switch ( n % 2) {
			case ZERO: //상수로 case에 넣어도 가능. 변수는 불가능!
				System.out.println("n은 짝수입니다.");
				break;

			case 1:
				System.out.println("n은 홀수입니다.");
				break;
			}

		} catch (Exception e) {

		}
	} //main

} //class
