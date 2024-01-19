package days06;

/**
 * @author BongGu
 * @date 2024. 1. 8. - 오후 4:17:45
 * @subject 2중 for문
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		// 2단 while문 사용해서 구구단 코딩

		int i = 2, j = 1; //i == 단수 j == 숫자
		while ( i <= 9) {
			System.out.printf("[%d 단을 외자]\n", i);
			while (j <= 9) {
				System.out.printf("%d * %d = %d \n", i,j,i*j);
				j++;
			}
			i++;
			j = 1;
		}

		/*
		for (int i = 2; i <= 9; i++) {
			System.out.printf("[%d 단을 외자]\n", i);
			for (int j = 1;j<=9; j++) {
				System.out.printf("%d * %d = %d\n",i, j, i*j);
			} //for i

		} //for j
		 */

	} //main

} //class
