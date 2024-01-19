package days09;

import java.util.Arrays;

/**
 * @author BongGu
 * @date 2024. 1. 11. - 오전 11:34:23
 * @subject 복습문제 6번 : 정수 입력받아서 2진수로 출력
 * @content 00000000	00000000 00000000 00000101 형태
 */
public class Ex06 {

	public static void main(String[] args) {
		/*//[1]번 풀이
		int n = 10;
		String binaryN = Integer.toBinaryString(n);

		System.out.println(binaryN);
		System.out.printf("%032d", Integer.parseInt(binaryN));
		 */

		// [2]번 풀이

		int [] binaryArr = new int[32]; //2진수로 입력될 배열 선언
		int n = 10; // 2진수로 바꿀 값 
		int index = binaryArr.length -1; //배열크기-1
		int reminder; //나머지를 저장할 변수
		int share; //몫을 저장할 변수

		while (n != 0) {
			share = n / 2;
			reminder = n %2;
			binaryArr[index--] = reminder;
			n = share;
		}
		for (int i = 0; i < binaryArr.length; i++) {
			System.out.printf("%d", binaryArr[i]);
			if(i%8 == 7) System.out.print("");				

		} //while

		System.out.println(Arrays.toString(binaryArr));


		//String binaryN = Integer.toBinaryString(num);
		//System.out.printf("%s", binaryN);
		/*
		while ( num != 0) {
			binaryNum = num % 2;
		}
		System.out.printf("bn : %d, num : %d",binaryNum, num);
		 */





	} //main

} //class
