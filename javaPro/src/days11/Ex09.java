package days11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author BongGu
 * @date 2024. 1. 15. - 오후 3:19:30
 * @subject 1~100번째 방까지 0~9가 몇개씩 들어가있는지
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		//int [] m = new Random().ints(100, 0, 10).toArray(); //100개가 필요, 0에서 부터 9까지
		int [] m = { 8, 3, 3, 0, 1, 7, 0, 1, 1, 4, 2, 0, 1, 7, 1, 9, 3, 9, 5, 0, 5, 0, 0, 9, 1, 4, 7, 8, 3, 2, 1, 7, 1, 1, 7, 3, 8, 3, 4, 0, 4, 3, 2, 3, 6, 1, 3, 1, 8, 8, 0, 4, 1, 8, 9, 9, 2, 2, 2, 5, 2, 7, 6, 1, 2, 0, 6, 6, 2, 6, 4, 9, 7, 8, 0, 6, 7, 6, 6, 0, 7, 3, 9, 2, 5, 6, 7, 8, 7, 7, 7, 5, 1, 3, 2, 7, 9, 8, 0, 4};
		System.out.println(Arrays.toString(m));

		// [출력 결과 ] 예를들어
		// 0 : 5개
		// 1 : 16개
		// :
		// :
		// 9 : 22개

		// 풀이 [1]
		/*
		 int count=0 ;
	      for (int i = 0; i <10; i++) {
	         count =0;
	         for (int j = 0; j < m.length; j++) { 
	            if (i==m[j]) {
	               count++;
	            } 

	         }
	         System.out.println(i +"-"+count+"개");
	      }
		 */
		
		//풀이 [2]
		int [] countArray = new int [10]; //새로운 배열 countArray를 생성하면 방이 10개가 되기 떄문에
															//0~9값을 위 배열의 각 index에 저장시키면 된다
		for (int i = 0; i < m.length; i++) { //m의 길이인 100까지 반복하며
			// int index = m[i];;						   
			countArray [ m[i] ]++;				  //m[i]번째 값을 countArray의 해당 i번째에 대입한다
	
		}
		System.out.println(Arrays.toString(countArray));

		/*
		int i =0, j =0;
		int mArr [] = new int [10]; 
		for (j = 0; j < 9; j++) {
			for (i = 0; i < m.length; i++) {
				if (m[i] == 1) mArr[i] = m[i];			
			}
			mArr[i]= mArr[i] / i;
		}
		System.out.println(Arrays.toString(mArr));
		 */

	} //main

} //class
