package javaPro;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 5. - 오전 11:32:24
 * @subject 컴퓨터 < - > 사용자(USER)
 * @content 가위(1), 바위(2), 보(3) 게임 만들기
 * 					컴퓨터는 게임을 할 때 마다 임의의 1~3 숫자를 발생시킨다
 * 					사용자는 1~3 입력
 */
public class Ex03 {

	public static void main(String[] args) throws IOException {
		int com, user;
		char con= 'y';

		do {

			try (Scanner scanner = new Scanner(System.in)) {
				user = 0;
				com = 0;
				String [] rps = { "", "가위", "바위", "보" };
				com = (int)(Math.random() * 3) + 1;
				System.out.print(" > user 가위(1), 바위(2), 보(3)");			
				user = scanner.nextInt();
				System.out.printf("컴퓨터 : %s, 사용자 : %s\n", rps[com], rps[user] );

				switch (user - com) {
				case -2: case 1:
					System.out.println("사용자 승리");
					break;
				case -1: case 2:
					System.out.println("컴퓨터 승리");
					break;
				default:
					System.out.println("무승부");
					break;				
				}

				System.out.print("\n\n 계속할거냐? ");
				con = (char) System.in.read();
				System.in.skip(System.in.available());
			} catch (Exception e) {

			}					

		} while (  Character.toUpperCase(con) == 'Y'  );

		System.out.println("end");		

	} //main

} // class


