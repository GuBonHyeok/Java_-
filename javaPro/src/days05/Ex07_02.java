package days05;

import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 5. - 오후 3:36:12
 * @subject if 조건문, switch 분기문, for 반복문, while 조건 반복문 
 *                 > 이제 do~while 문은? 
 * @content break (제어문 빠져 나올 때)
 */
public class Ex07_02 {

	public static void main(String[] args) {

		/*
		 * [while / do~while의 차이점]
		 * 
		 * */

		/*
		int i = 10;
		while ( i < 2) {
			System.out.println("A");
		}

		do {
			System.out.println("B");
		} while (i<2);
		 */

		int kor;
		Scanner scanner = new Scanner(System.in);
		String strKor;
		//String regex = "\\d{1,3}"; //숫자가 1자리~3자리냐? 물어보는 것
													// 정규표현식을 만들어 넣어주는 작업
		//							= "[0-9]{1,3}
		String regex = "\\d{1,2}|100"; //0~99까지 (두자릿수) 숫자와 100 둘 중에 하나만 받는다
		int count = 0;
	      
	      do {
	    	    if( count != 0) {
	            System.out.printf("[%d]번 실패!!!\n", count);
	            if( count == 5) {
	               System.out.println("> 오늘은 그만 하자 <");
	               return ;
	            }
	         }
	         System.out.printf("국어 점수 입력 ? ");         
	         strKor = scanner.next(); // 0~100    
	         count++;
	      } while (!strKor.matches(regex));

		// 다시 입력하세요 코딩
		// N번 실패하면 프로그램 나가게 하는 것 코딩 (return문)
		kor = Integer.parseInt(strKor);
		System.out.printf("국어 점수는 : %d", kor);

	} //main

} //class
