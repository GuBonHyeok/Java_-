package days09;

import java.util.Random;
import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 11. - 오전 10:33:14
 * @subject 로또게임 반복
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {

		// 로또 게임 횟수 입력 (n) : 3
		Scanner scanner = new Scanner(System.in);
		System.out.print(" > 로또 몇 번 할래? : ");
		int n = scanner.nextInt();

		int [] lotto = new int[n*6]; // 18 
		for (int i = 0; i < n; i++) {
			fillLotto(lotto, i); // 한 게임을 채워넣는 함수 

		}
		dispLotto(lotto);

	} // main

	private static void dispLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("lotto%02d=[%02d] ", i, lotto[i]);
			if (i % 6 ==5) {
				System.out.println();				
			}
		}
		System.out.println();       
	}

	private static void fillLotto(int[] lotto, int i) { // i = 0, 1, 2
		Random rnd = new Random(); 
		int lottoNumber = rnd.nextInt(45)+1;
		lotto[6*i] = lottoNumber;
		System.out.printf("[%d]",lottoNumber); 

		int index = 6*i+1;        // 1번째, 7번째, 13번째 칸에 들어가야하기 때문
		while (index<=6*i+5) {           //5번째, 11번째, 17번째 칸까지 돌기 때문
			lottoNumber = rnd.nextInt(45)+1;
			System.out.printf("[%d]",lottoNumber); 

			if( !isDuplicateLotto(lotto,lottoNumber , index, i ) ) 
				lotto[index++] = lottoNumber;
			//index++;
		} // while
		System.out.println();
	}

	private static boolean isDuplicateLotto(int[] lotto, int lottoNumber, int index, int n) {
		for (int i = 6*n; i < index; i++) { //int i = 6*n 인 이유는 0
			if( lottoNumber == lotto[i]) {
				return true;                
			}
		}
		return false;
	}

} // class