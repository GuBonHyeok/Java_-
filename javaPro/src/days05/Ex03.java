package days05;

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

	public static void main(String[] args) {

		int com, user;
		String [] rps = { "", "가위", "바위", "보" };

		try (Scanner scanner = new Scanner(System.in)) {
			com = (int)(Math.random() * 3) + 1;
			System.out.print(" > user 가위(1), 바위(2), 보(3)");
			//원래는 입력값에 대한 유효성 검사를 해야한다.
			user = scanner.nextInt();

			//if문으로 1->가위 처리
			System.out.printf("컴퓨터 : %s, 사용자 : %s\n", rps[com], rps[user] );

			//승자 or 패자
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
				//                유 저         
				//      -   가위  바위  보               유저 - 컴퓨터 결과
				//컴  가위   0    1    2            유저 승 	: -2, 1
				//퓨  바위  -1   0    1             컴퓨터 승 : -1 2
				//터    보  -2   -1   0             무승부 	: 0
				//
				//
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	} //main

} //class
