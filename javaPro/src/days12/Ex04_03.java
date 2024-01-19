package days12;

/**
 * @author BongGu
 * @date 2024. 1. 16. - 오후 12:07:17
 * @subject 2차원배열 > 2차원배열 값 옮기기
 * @content 수업 종료 후 풀이
 */
public class Ex04_03 {

	public static void main(String[] args) {
		//3행 4열 2차원 배열
		int [][] n = { 
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};

		//2행 6열 2차원 배열
		int [][] m = new int [2][6];
		//dispN(n);

		int row = n.length; //행 갯수
		int cal = n[0].length; //열 갯수
		int [] m1 =new int [row*cal]; //8개짜리 1차원 배열

		System.out.println(n.length);
		System.out.println(n[0].length);

		// 2차원 배열 -> 1차원 배열 옮기는 코딩.

		for (int i = 0; i < n.length; i++) {
			for(int j = 0; j <n[i].length; i++) {				
				m1[i*cal+j] = n[i][j];
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