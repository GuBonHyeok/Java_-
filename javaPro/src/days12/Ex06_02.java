package days12;

import java.util.Random;
import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 16. - 오후 12:34:13
 * @subject 로또게임 2차원 배열로 변경 (days09_ex02_02)
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {

		// 로또 게임 횟수 입력 (n) : 3
		Scanner scanner = new Scanner(System.in);
		System.out.print(" > 로또 몇 번 할래? : ");
		int n = 5; //scanner.nextInt();

		//int [] lotto = new int[n*6]; // 30 
		int [][] lotto = new int[n][6]; // 5행 6열 2차원 배열
		for (int i = 0; i < lotto.length; i++) { //배열의 배열이니까 2번 돌리면 됨.... 굳이 매개변수 다 건들필요 없음!!
			fillLotto(lotto[i]);			
		}
		for (int i = 0; i < lotto.length; i++) {
			dispLotto(lotto[i]);			
		}



	} // main

	private static void dispLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("lotto[%d]=[%d]\n", i, lotto[i]);
		}
		System.out.println();		 
	}

	private static void fillLotto(int[] lotto) { 
		Random rnd = new Random(); 
	    int lottoNumber = rnd.nextInt(45)+1;
	    lotto[0] = lottoNumber;
	    System.out.println(lottoNumber); 
	    
	    int index = 1;	     
	    while (index<=5) {	    	 
	    	lottoNumber = rnd.nextInt(45)+1;
	    	System.out.println(lottoNumber);
	    	
	    	if( !isDuplicateLotto(lotto,lottoNumber , index ) ) 
	    		lotto[index++] = lottoNumber;
	    	//index++;
		} // while
	}

	// 중복이 되면 true 반환
	// 중복이 되지 않으면 false 반환
	private static boolean isDuplicateLotto(int[] lotto, int lottoNumber, int index) {
		for (int i = 0; i < index; i++) {
			if( lottoNumber == lotto[i]) {
				return true;					 
			}
		}
		return false;
	}
} //class
