package days04;

import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 4. - 오후 3:08:49
 * @subject  조건문 if, if~else 활용 예제
 * @content  국어 점수를 입력받아서
 * 					  등급(수, 우, 미, 양, 가) 출력 
 */
public class Ex05_06 {

	public static void main(String[] args) {

		int kor;
		char grade = '수';

		try(Scanner sc = new Scanner(System.in);) {


			System.out.print("국어 점수를 입력해주세요 : ");
			kor = sc.nextInt();

			if (0<= kor && kor <=100) {

				if (kor >=  90 && kor <=100) {
					System.out.println("당신의 등급은 : 수");
				}
				if (kor >=  80 && kor <90) {
					System.out.println("당신의 등급은 : 우");
				}
				if (kor >=  70 && kor <80) {
					System.out.println("당신의 등급은 : 미");
				}
				if (kor >=  60 && kor <70) {
					System.out.println("당신의 등급은 : 양");
				}
				if (kor >=0 && kor <60) {
					System.out.println("당신의 등급은 : 가");
				}
			}else {
				System.out.println("다시");
			} 

		}

		catch (Exception e) {
			System.out.println("다시 입력하쇼");

		} //try~catch



	} //main

} //class
