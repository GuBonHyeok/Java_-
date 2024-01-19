package days08;

import java.util.Iterator;
import java.util.Random;

/**
 * @author BongGu
 * @date 2024. 1. 10. - 오후 2:29:20
 * @subject 중복 없는 로또번호 출력 (라벨 반복문)
 * @content
 */
public class Ex05_03 {

	public static void main(String[] args) {

		int [] lotto = new int [6];
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
		// 내일 시험 문제!!
		int lottoNumber = rnd.nextInt(45)+1;
		lotto[0] = lottoNumber;
		int index = 1;
				
		while(index <= 5) { 
			lottoNumber = rnd.nextInt(45)+1;
			System.out.println(lottoNumber);

	         if(!isDuplicateLotto (lotto,lottoNumber, index))
	        	 lotto[index++] = lottoNumber;
	          //index++;
		} //while

	}//main

	//중복이면 true;
	//중복이 아니면 false;
	private static boolean isDuplicateLotto(int[] lotto, int lottoNumber, int index) {
		for (int i = 0; i < index; i++) {
			if (lottoNumber == lotto[i]) {
				return true;				
			}
			
		}
		return false;
	}

} //class
