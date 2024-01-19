package days12;

import java.util.Random;
import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 16. - 오후 12:34:13
 * @subject 로또게임 2차원 배열로 변경 (days09_ex02_02)
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {

		// 로또 게임 횟수 입력 (n) : 3
		Scanner scanner = new Scanner(System.in);
		System.out.print(" > 로또 몇 번 할래? : ");
		int n = 5; //scanner.nextInt();

		//int [] lotto = new int[n*6]; // 30 
		int [][] lotto = new int[n][6]; // 5행 6열 2차원 배열



	} // main

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
				
		// 내일 시험 문제!!
		OUT :while(index <= 5) { 
			lottoNumber = rnd.nextInt(45)+1;
			System.out.println(lottoNumber);
	          for (int i = 0; i < index; i++) {
	            if( lottoNumber == lotto[i]) {
	               continue OUT; //라벨 반복문 사용해서 for문 탈출이 아닌 while문을 탈출한다 
	            }
	         }
	         lotto[index++] = lottoNumber;
	          //index++;
		}

	}

} //class
