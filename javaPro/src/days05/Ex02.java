package days05;

import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;

/**
 * @author BongGu
 * @date 2024. 1. 5. - 오전 10:51:03
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {

		int kor;
		char grade = '가';

		try(Scanner sc = new Scanner(System.in);) {
			System.out.print("국어 점수를 입력해주세요 : ");
			kor = sc.nextInt();

			if(kor >= 0 && kor <=100) {
				switch (kor / 10) {
				
			case 10: {
				System.out.println("수");
			}
			break;
			case 9: {
				System.out.println("수");
			}
			break;
			case 8: {
				System.out.println("우");
			}
			break;
			case 7: {
				System.out.println("미");
			}
			break;
			case 6: {
				System.out.println("양");
			}
			break;
			default:{
				System.out.println("가");	
			}
			break;





			 else {

			}

		} 	catch (Exception e) {
			System.out.println("다시 입력하쇼");
		} //try~catch

	} //main

} //class
