package days08;

import java.util.Iterator;
import java.util.Random;

/**
 * @author BongGu
 * @date 2024. 1. 10. - 오후 2:29:20
 * @subject 중복 없는 로또번호 출력
 * @content
 */
public class Ex05_02 {

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
		int lottoNumber = rnd.nextInt(45)+1;
		lotto[0] = lottoNumber;
		int index = 1;
		boolean isDuplicate = false;
		
		while(index <= 5) {
			isDuplicate = false;
			lottoNumber = rnd.nextInt(45)+1;
			System.out.println(lottoNumber);
	          for (int i = 0; i < index; i++) {
	            if( lottoNumber == lotto[i]) {
	               // continue;
	               isDuplicate = true;
	               break;
	            }
	         }
	          if( !isDuplicate )  lotto[index++] = lottoNumber;
	          //index++;

		}


	}

} //class
