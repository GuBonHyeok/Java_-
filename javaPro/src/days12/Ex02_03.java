package days12;

/**
 * @author BongGu
 * @date 2024. 1. 16. - 오전 11:01:59
 * @subject 3차원 배열 초기화
 * @content
 */
public class Ex02_03 {

	public static void main(String[] args) {
		// 2면 2행 2열 3차원 배열
		int [][][] m = new int [2][2][2];
		// 3차원 배열 = 2차원 배열의 배열이다. (그림 이해 필요)

		System.out.println(m.length);		// 2 면 갯수
		System.out.println(m[0].length); // 2 0행의 열 갯수
		System.out.println(m[1].length); // 2 1행의 열 갯수

		System.out.println(m[0][0]); 		// 2 0면 0행 열 갯수
		System.out.println(m[0][1]); 		// 2 0면 1행 열 갯수
		System.out.println(m[1][0]); 		// 2 1면 0행 열 갯수
		System.out.println(m[1][1]); 		// 2 1면 0행 열 갯수

		//2면 2행 4열 3차원배열 초기화
		int [][][] m1 ={
								{
									{1,2,3,4},
									{5,6,7,8}
								},
								{
									{1,2,3,4},
									{5,6,7,8}
								}
							 };

				dsipM(m);

	} //main

	private static void dsipM(int[][][] m1) {
		for (int i = 0; i < m1.length; i++) { 		//면 갯수
			System.out.printf("%d면\n", i);
			for (int j = 0; j < m1[i].length; j++) {	//행 갯수
				for (int k = 0; k < m1[i][j].length; k++) {
					
					System.out.printf("m[%d][%d][%d]=%d", i, j, k,m1[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}

	} //dispM

} //class
