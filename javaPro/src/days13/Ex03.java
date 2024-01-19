package days13;

public class Ex03 {

	public static void main(String[] args) {

		int [][] m = new int[5][5];

		// 마방진
		magicSquare(m);

		//fillM04(m);
		//fillM03(m);
		//fillM02(m);
		// fillM01(m);

		dispM(m);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	} // main

	private static void magicSquare(int[][] m) {
	      // 1) 첫 번째 행의 가운데 열    1 
	      // 2) 출력한 값이 5의 배수 O    행만 증가
	      //                         X
	      //          열증가, 행감소
	      //              ㄴ행 벗어나는 경우 -가장 큰 행의 값으로 설정. 
	      //              ㄴ열 벗어나는 경우 -가장 작은 열의 값으로 설정.	      
	      int n = 1;
	      int row = 0, col = 2;	      
	      while( n <= 25) {
	         m[row][col] = n;      
	         if (n % 5 == 0) {
	            row++;
	         } else {
	            col++; row--;
	            // 행 X, 열 X
	            if( col == 5 ) col = 0;
	            else if( row == -1) row = 4;
	         }      
	         n++;
	      } // while      
	   } // magicSquare

	// 대각선 > 어떻게 찍을지 고민

	// 골뱅이 > 어떻게 찍을지 고민
	/*[01][02][03][04][05]
		[16][17][18][19][06]
		[15][24][25][20][07]
		[14][23][22][21][08]
		[13][12][11][10][09]

	 */



	private static void fillM04(int[][] m) {
		// [2]
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][i%2==0 ? j : 4-j] = 5 * i + j + 1;
			} //for j
		} //for i

		/* [1]
			   for (int i = 0; i < m.length; i++) {
				   for (int j = 0; j < m[i].length; j++) {
					   //if (i%2 == 0) m[i][j] = 5 * i +j+1;
					   //else m[i][j] = (i+1) * 5 - j;
					 m[i][j] = i%2 == 0 ? 5*i+j+1 : (i+1)*5-j;

				}

			}
		 */

	}

	private static void fillM03(int[][] m) {
		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				m[i][j] = 5-i + 5*j;
			} // for j         
		} // for i

		/*
		      [05][10][15][20][25]
		      [04][09][14][19][24]
		      [03][08][13][18][23]
		      [02][07][12][17][22]
		      [01][06][11][16][21]

		      00 -> 40
		      01 -> 30
		      02 -> 20
		      03 -> 10
		      04 -> 00

		      10 -> 41
		      11 -> 31
		      12 -> 21
		      13 -> 11
		      14 -> 01

		      20 -> 42
		      21 -> 32
		      22 -> 22
		      23 -> 12
		      24 -> 02



		 */
		// i=0 j=01234
		// i=1 j=01234
		// i=2 j=01234
		// i=3 j=01234
		// i=4 j=01234


		// [1]
		/*
		      for (int i = 0; i < m.length; i++) { // 행갯수
		         for (int j = 0; j < m[i].length; j++) { // 열갯수
		            m[4-j][i] = 5*i+j+1; 
		         } // for j         
		      } // for i
		 */


	}

	private static void fillM02(int[][] m) {
		/*
		      [25][24][23][22][21]
		      [20][19][18][17][16]
		      [15][14][13][12][11]
		      [10][09][08][07][06]
		      [05][04][03][02][01] 
		 */
		// p114~230 

		/*
		      for (int i = 0, value = 25; i < m.length; i++) { // 행갯수
		         for (int j = 0; j < m[i].length; j++, value--) { // 열갯수
		            m[i][j] = value; 
		         } // for j         
		      } // for i

		      for (int i = 0; i < m.length; i++) { // 행갯수
		         for (int j = 0; j < m[i].length; j++) { // 열갯수
		            m[i][j] = 25 - (5 * i + j) ; 
		         } // for j         
		      } // for i
		 */

		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				m[4-i][4-j] = 5 * i + j + 1; // 1,2,3,4,~ 25
			} // for j         
		} // for i


	}

	// 00  1
	// 01  2
	// *** 2차원 -> 1차원
	// 1차원 -> 2차원
	// [2]
	/*
		   private static void fillM01(int[][] m) {
		      for (int i = 0; i < m.length; i++) { // 행갯수
		         for (int j = 0; j < m[i].length; j++) { // 열갯수
		             m[i][j] = 5 * i + j + 1; // 1,2,3,4,~ 25
		         } // for j         
		      } // for i

		   } // dispM
	 */

	// [1]
	/*
		   private static void fillM01(int[][] m) {
		      for (int i = 0, value = 1; i < m.length; i++) { // 행갯수
		         for (int j = 0; j < m[i].length; j++, value++) { // 열갯수
		             m[i][j] = value;
		         } // for j         
		      } // for i

		   } // dispM
	 */

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				System.out.printf("[%02d]", m[i][j]);
			} // for j
			System.out.println();
		} // for i

	} // dispM

} // class
