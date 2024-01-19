package days03;

import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 3. - 오전 11:20:03
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// 
		int i = Integer.MAX_VALUE; // 100;
		int j = 100;
		// int k = i + j; //산술 오버플로우(overflow) 발생. int 값의 최대보다 더 큰 값이 나오면 이상한 값이 나옴
		long k = (long)i + j; //둘 중 하나만 long으로 해주면 자동 형변환에 의해서 long으로 바뀜
		
		Scanner sc = new Scanner(System.in);
			
		System.out.printf("%d + %d = %d", i, j ,k);
	} //main

} //class
