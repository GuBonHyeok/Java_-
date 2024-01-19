package days06;

/**
 * @author BongGu
 * @date 2024. 1. 8. - 오후 4:17:45
 * @subject while문 사용 구구단 만들기 (가로 출력)
 * @content
 */
public class Ex07_03 {

	public static void main(String[] args) {
		// 2단 while문 사용해서 구구단 코딩

		/*
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
		*/

		// [구구단 가로 출력]
		for (int i = 2; i <= 9; i++) {
			//System.out.printf("[%d 단을 외자]", i);
			for (int j = 1;j<=9; j++) {
				System.out.printf("%d*%d=%02d ",i,j,i*j);
			} //for i
			System.out.println();

		} //for j
		 

	} //main

} //class
