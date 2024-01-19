package days11;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

/**
 * @author BongGu
 * @date 2024. 1. 15. - 오전 11:24:20
 * @subject 랜덤함수 사용해서 배열 각 자리 섞기
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {

		int [] m = new int [10];
		for (int i = 0; i < m.length; i++) {
			m[i] = i+1;
		}
		System.out.println(Arrays.toString(m));

		Random rd = new Random();
		for (int i = 0; i < m.length; i++) {
			m[i] = m[(int) (Math.random()*9 + 1)];
		}
		System.out.println(Arrays.toString(m));

		shuffle(m);


	} //main


	private static void shuffle(int []m) {
		int idx1 = 0, idx2; // 1~9

		for (int i = 0; i < 10; i++) {
			idx2 = (int)(Math.random()*9)+1; //배열의 첫번쨰 자리(idx1)는 고정시키고 두번째 자리만 랜덤으로 바꾸는 작업

			int temp = m[idx1]; //빈 공간 선언해서 2개 값을 3개 공간 활용해서 섞기
			m[idx1] = m[idx2];
			m[idx2] = temp;

		} //for

	} //shuffle
	/*
	 * 
	 * 	// idx1 = idx2일 확률이 존재한다.
	private static void shuffle(int []m) {
		int idx1, idx2;

		for (int i = 0; i < 10; i++) {
			idx1 = (int)(Math.random()*m.length);
			idx2 = (int)(Math.random()*m.length);

			int temp = m[idx1];
			m[idx1] = m[idx2];
			m[idx2] = temp;

		}

	}
	 */

} //class
