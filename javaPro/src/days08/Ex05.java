package days08;

import java.util.Random;

/**
 * @author BongGu
 * @date 2024. 1. 10. - 오후 2:00:59
 * @subject 로또 게임 만들기
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// [로또 게임]]
		// Lotto 6/45
		// 1~45번 임의의 정수 6개 발생
		// 0.0 < double Math.random() * 45 < 45.0
		// 0.0 < (int) Math.random() * 45  < 45.0
		// 0.0 < (int)(Math.random() * 45) + 1  < 46.0

		/* 중복 제거 필요
		for (int i = 1; i <= 6; i++) {
			System.out.println((int)(Math.random() * 45 + 1);
		}
		 */

		Random rnd = new Random();
		for (int i = 1; i <= 600; i++) {
			int lottoNumber = rnd.nextInt(45)+1; //1번~45번까지 랜덤으로 숫자 생성
			if (lottoNumber < 0 || lottoNumber > 45) { //로또번호가 0보다 작거나 45보다 큰 숫자가 있는지 확인
				System.out.println(lottoNumber);
			}
		}
		System.out.println("end");

	} //main

} //class
