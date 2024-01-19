package days09;

import java.util.Random;

/**
 * @author BongGu
 * @date 2024. 1. 11. - 오전 10:33:14
 * @subject 로또게임 반복
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		
		//로또 게임 횟수 입력
		int n = 3;

		int [] lotto = new int [n*6];
		fillLotto(lotto); // Call by Reference
		dispLotto(lotto);

	} //main

	// 로또 출력부
	private static void dispLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("Lotto [%d] = [%d]\n",i,lotto[i]);

		}
		System.out.println();

	}

	private static void fillLotto(int[] lotto) {
		Random rnd = new Random();
		/*
		for (int i = 0; i < lotto.length; i++) {
			int num = (rnd.nextInt(45)+1);
			lotto[i] = num;
			for (int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;					
				}
			}
		 */
		int lottoNumber = rnd.nextInt(45)+1;
		lotto[0] = lottoNumber;
		int index = 1;
				
		// 
		
		
		lotto[6] = lottoNumber;
		index = 7;
		
		OUT :while(index <= 11) { 
			lottoNumber = rnd.nextInt(45)+1;
			System.out.println(lottoNumber);
	          for (int i = 0; i < index; i++) {
	            if( lottoNumber == lotto[i+5]) {
	               continue OUT; //라벨 반복문 사용해서 for문 탈출이 아닌 while문을 탈출한다 
	            }
	         }
	         lotto[index++] = lottoNumber;
	          //index++;
		}

	}

}
