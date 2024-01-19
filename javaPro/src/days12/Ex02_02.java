package days12;

public class Ex02_02 {

	public static void main(String[] args) {
		// 2행 4열 2차원 배열
		int [][] m = new int [2][4];
		// 2차원 배열 = 1차원 배열의 배열이다. (그림 이해 필요)
		
		System.out.println(m.length);		// 2 행 갯수
		System.out.println(m[0].length); // 4 0행의 열 갯수
		System.out.println(m[1].length); // 4 1행의 열 갯수
		
		//2행 4열 2차원배열 초기화
		int [][] m1 = {
								{1,2,3,4},
								{5,6,7,8}
							  };
		
		dsipM(m);

	} //main

	private static void dsipM(int[][] m) {
		for (int i = 0; i < m.length; i++) { 		//행 갯수
			for (int j = 0; j < m[i].length; j++) {	//열 갯수
				System.out.printf("m[%d][%d]", i, j, m[i][j]);
							}
			System.out.println();
		}
		
	} //dispM

} //class
