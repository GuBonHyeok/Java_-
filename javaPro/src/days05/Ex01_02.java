package days05;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 5. - 오전 9:47:15
 * @subject
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		//배열 선언 + 초기화(동시) == [배열 초기화]
		/*
		int [] kor = new int[3];

		kor[0] = 90; 
		kor[1] = 38;
		kor[2] = 88;
		*/
		
		// 배열 초기화 = 선언 + 생성 + 초기화
		// int [] kors = new int[] {90, 38, 77};   ->   { } 안의 값을 순차적으로 적으면 배열의 길이가 정해진다
		int [] kors = {90, 38, 77}; // 위의 문장과 같다. (자주 사용, 암기 필요) 

		for (int i = 0; i< kors.length ; i++) {
			System.out.printf("> kors[%d] = %d\n", i,kors[i]);
		} //for 배열 이용 for문

	} //class
	
}//main