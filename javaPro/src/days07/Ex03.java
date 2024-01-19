package days07;

import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 9. - 오전 10:25:54
 * @subject 각종 별 규칙줘서 만들기
 * @content String.repeat(int count) > 정수형 count 숫자만큼 문자열을 반복
 */
public class Ex03 {

	public static void main(String[] args) {
		// 3번 문제 풀이. 이거 복습 필요
		// 엑셀이나 표를 손으로 그려가면서 로직 찾기
		
		int row, col;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" > 행의 갯수를 입력하세요? ");
		row = scanner.nextInt();
		col = 2*row -1;
		
		for (int i = 1; i <=row ; i++) {
			for (int j = 1; j <= col ; j++) {
				System.out.print(i +j >=row+1 && j-i <=row-1 ? "*":"_");								
			}
			System.out.println();			
		}

		/*
		int line = 4;

		//Scanner scanner = new Scanner(System.in);
		//System.out.print("> 행의 갯수를 입력하세요 : ");
		//line = scanner.nextInt();

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line - i - 1; j++) {
				System.out.print("_");
			}
			System.out.print("*");
			for (int k = 0; k < 2*i; k++) {
				System.out.print("*");
			}
			for (int k2 = line ; k2 <i ;k2-- ) {
				System.out.println("_");
			}
			System.out.println();
		}  
		 */

		/* repeat 함수
		for (int i = 1; i <= 4; i++) { //행 갯수
			System.out.println("*".repeat(4));
		} 
		 */

		/* [2] 별 갯수 하나씩 늘리기
		for (int i = 1; i <= 4; i++) { //행 갯수
			for (int j = 1; j <= i; j++) { //열 (별) 갯수
				System.out.print("*");				
			}
			System.out.println();			
		}

		for (int i = 1; i <= 4; i++) { //행 갯수
			System.out.println("*".repeat(i)); //repeat() 함수 활용해서 별 하나씩 늘리기 
		} 
		 */
		/* [3]
		// ****		i = 1		j = 4
		//	***		i = 2		j = 3
		// **			i = 3		j = 2
		// *			i = 4 	j = 1		
		for (int i = 1; i <= 4; i++) { //행 갯수
			for (int j = 1; j <=5-i; j++) { //열 (별) 갯수
				System.out.print("*");				
			}
			System.out.println();			
		}
		 */
		/*[4]
		// ___*   i = 4  j = 1  i + j = 5 > j = 5 - i
		// __**   i = 3  j = 2 
		// _***   i = 2  j = 3
		// ****   i = 1  j = 4

		for (int i = 1; i <= 4; i++) { //행 갯수
			for (int j = 0; j <= 4-i; j++) { // 공백 갯수
				System.out.print("_");
			} 
			for (int j = 1; j <= i; j++) { //열 (별) 갯수
				System.out.print("*");				
			}
			System.out.println();			
		}
		 */

		/*[5]					공백
		// ****   i = 1  j = 0
		// _***   i = 2  j = 1
		// __**   i = 3  j = 2 
		// ___*   i = 4  j = 3 

		for (int i = 1; i <= 4; i++) { //행 갯수
			for (int j = 1; j <= i-1; j++) { //공백 갯수
				System.out.print("_");
			} 
				for (int j = 1; j <= 5-i; j++) { // 별 갯수
				System.out.print("*");				
			}
			System.out.println();			
		}
		 */		

		/* [6]						  공백
		// __*			i = 1  j = 2  1   i + j = 3 > j = 3-i
		// _***			i = 2  j = 1  3
		// *****   	i = 3  j = 0  5

		for (int i = 1; i <= 3; i++) { //행 갯수
			for (int j = 1; j <= 3-i; j++) { //공백 갯수
				System.out.print("_");
			} 
				for (int j = 1; j <= 2*i-1 ; j++) { // 별 갯수
				System.out.print("*");				
			}
			System.out.println();			
		} 
		 */

		/*[7]						  공백
		// __*			i = 1  j = 2  1   i + j = 3 > j = 3-i
		// _***			i = 2  j = 1  3
		// *****   	i = 3  j = 0  5
		for (int i = 1; i <= 5; i++) { //행 갯수
			for (int j = 1; j <= 5; j++) { //공백 갯수
				//if(i==j) System.out.print("*");
				//else System.out.print("_");
				//System.out.print(i==j ? "*" : "_");
				//System.out.print(i+j==6 ? "*" : "_");
				System.out.print(i==j || i+j ==6 ? "*" : "_");
			} 
			System.out.println();					
		}
		 */

		//[4-1] 삼항연산자 이용해서 규칙 찾기
		// ___*   i = 4  j = 1  i + j = 5 > j = 5 - i
		// __**   i = 3  j = 2 
		// _***   i = 2  j = 3
		// ****   i = 1  j = 4
		/*
		for (int i = 1; i <= 4; i++) { //행 갯수
			for (int j = 0; j <= 4; j++) { // 공백 갯수
				System.out.print(i+j>=5 ? "*" : "_");
			} 
			System.out.println();			
		}
		*/

	} //main

} //class
