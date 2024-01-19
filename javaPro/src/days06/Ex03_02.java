package days06;

import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 8. - 오후 12:40:51
 * @subject 한 문자 입력 두번 받기
 * @content
 */
public class Ex03_02 {
	public static void main(String[] args) {

		char one;
		//Syntax error on token "continue", invalid VariableDeclaratorId . 
		//con 말고 continue 쓰면 오류. 예약어를 변수명으로 사용할 수 없기 때문
		char con = 'y';
		

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("> 한 문자 입력 ?");
			one = scanner.next().charAt(0); // 첫번째 문자 읽어서 출력
			System.out.printf("one = '%c' \n", one);
			System.out.print("\n\n 계속 하시겠습니까?");
			con = scanner.next().charAt(0); // 'y'를 입력하든지 'n'을 입력하든지 하게끔 스캐너

		} while (con =='y' || con == 'Y');
		
		System.out.println("End");

	} //main

} //class
