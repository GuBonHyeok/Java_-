package days04;

import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 4. - 오후 5:23:05
 * @subject
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {

		int kor;
		char grade = '수';

		try(Scanner sc = new Scanner(System.in);) {
			System.out.print("국어 점수를 입력해주세요 : ");
			kor = sc.nextInt();
			
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
			case 5: {
				System.out.println("가");
			}
			break;
			case 4: {
				System.out.println("가");
			}
			break;
			case 3: {
				System.out.println("가");
			}
			break;
			case 2: {
				System.out.println("가");
			}
			break;
			case 1: {
				System.out.println("가");
			}
			break;
			case 0: {
				System.out.println("가");	
			}
			break;

			default: 
				System.out.println("다시 입력");
				break;
			}

		} 	catch (Exception e) {
			System.out.println("다시 입력하쇼");
		} //try~catch
		
	} //main

} //class
