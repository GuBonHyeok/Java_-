package days12;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author BongGu
 * @date 2024. 1. 16. - 오전 11:33:49
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {

		int [][] n = { //2행 4열짜리 배열
				{1,2,3,4},
				{5,6,7,8}
		};
		//dispN(n);
		
		int row = n.length; //행 갯수
		int cal = n[0].length; //열 갯수
		int [] m =new int [row*cal]; //8개짜리 1차원 배열
		
		System.out.println(n.length);
		System.out.println(n[0].length);
		
		// 2차원 배열 -> 1차원 배열 옮기는 코딩.
		
		for (int i = 0; i < n.length; i++) {
			for(int j = 0; j <n[i].length; i++) {				
				m[i*cal+j] = n[i][j];
				//System.out.printf("m [%d] = %d",i,m[i]);
			}
			
		}
		
		//dispM(m);

	} //main

	private static void dispN(int[][] n) {
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.printf("m[%d][%d] = %d\n",i,j,n[i][j]);

			}//for j

		}//for i

	}//dispN (2차원)

	private static void dispM(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d] = %d ",i,m[i]);

		}//for
		System.out.println();
	}//dispM (1차원)

} //class
