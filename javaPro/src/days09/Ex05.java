package days09;

import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 11. - 오전 11:20:17
 * @subject 복습문제 5번 : 머니(money)를 입력받아서 각 화폐단위 갯수 출력 코딩
 * @content 반복 패턴을 파악한 후 boolean 형 스위칭변수로 반복시키기
 */
public class Ex05 {

	public static void main(String[] args) {
		int money= 125760; 
		int unit = 50000;
		boolean sw = false; //스위칭 변수 선언
		int count = 0; //화폐 갯수
		// 50000 10000 5000 1000 500 100 50 10 5 1
		//        /5        /2     /5      /2   /5    /2  /5 /2/5
		
		while ( unit >= 1) {
			count = money / unit; //돈/화폐로 나누면 n원 짜리가 몇장 나오는지 알 수 있다
			System.out.printf("%d원 : %d개\n", unit, count);
			money %= unit;
			unit /= (sw ? 2 : 5); // 나누기 5,2가 반복되기 때문에 번갈아가며 연산해주기 위해서
			sw = !sw;		//나누기 5를 끝냈으면 2로, 2를 끝냈으면 5로 바꿔주기 위해서 부정연산자 사용	
		} //class
		
	} //main

}
