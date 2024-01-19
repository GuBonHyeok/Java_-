package days11;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author BongGu
 * @date 2024. 1. 15. - 오후 2:02:30
 * @subject 배열 내에서 가장 큰 값(max)이 있는 인덱스 값 찾기
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		//max 가장 큰 값을 찾아서 그 위치(index)를 배열에 담아서 출력하려면?
		int [] maxIndexArray;

		// 1) max 값 구하기
		int max = IntStream.of(m).max().getAsInt();
		System.out.println(max);
		// 2) max 의 갯수 -> maxIndexArray 배열의 크기
		/*
		int maxCount = 0;
		for (int i = 0; i < m.length; i++) {
			if (max ==m[i]) maxCount++;
		}
		*/
		
		int maxCount = (int) IntStream.of(m).filter(i -> i ==max).count(); //위의 for문과 같은 코딩임..; 
		// IntStream : int 배열 m을 Stream으로 나열했다.
		System.out.println(maxCount);
		// 3) max 의 index를 maxIndexArray에 저장하는 작업
		maxIndexArray = new int[maxCount];
		for (int i = 0, idx=0; i < m.length; i++) {
			if (max ==m[i]) maxIndexArray[idx++]= i; //???????
		}
		System.out.println(maxIndexArray);

			// 4) 배열 출력
			/*
		int max = m[0];
		for (int i = 0; i <= m.length; i++) {
			if (m[i] >= m[i+1]) {
				maxIndexArray[i] = m[i];		
			} 
		}
		System.out.println(Arrays.toString(maxIndexArray));
			 */		

		}//main

	}//class
