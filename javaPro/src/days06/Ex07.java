package days06;

/**
 * @author BongGu
 * @date 2024. 1. 8. - 오후 4:17:45
 * @subject 2중 for문
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// 이중 for 문
		
		/*
		 * [구구단] == [multiplication table]
		 * 		2단   == 2 times table
		 * 2*1 =
		 * 2*2 =
		 * 2*3 =
		 * 2*4 =
		 * 2*5 =
		 * 2*6 =
		 * 2*7 =
		 * 2*8 =
		 * 2*9 =
		 * */
		
		//i = 2  →  2단
		//j = 1,2,3,4,5,6,7,8,9		j = 10일때 두번째 for문 탈출, 다시 첫번째 for문
		//i = 3  →  3단
		//j = 1,2,3,4,5,6,7,8,9		j = 10일때 두번째 for문 탈출, 다시 첫번째 for문
		//....
		//i = 9  →  9단
		//j = 1,2,3,4,5,6,7,8,9		j = 10일때 두번째 for문 탈출, i도 10이라 첫번째 for문도 탈출
		for (int i = 2; i <= 9; i++) {
			System.out.printf("[%d 단을 외자]\n", i);
			for (int j = 1;j<=9; j++) {
				System.out.printf("%d * %d = %d\n",i, j, i*j);
			} //for2
						
		} //for1
		

	} //main

} //class
