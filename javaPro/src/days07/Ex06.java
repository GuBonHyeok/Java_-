package days07;

/**
 * @author BongGu
 * @date 2024. 1. 9. - 오후 2:21:18
 * @subject for문으로 1/2 + 2/3 + 3/4 ... 8/9 + 9/10 구하기
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// 1/2+2/3+3/4+...+8/9+9/10=
		// 분자 1 2 3 4 5
		// 분모 2 3 4 5 6

		double sum = 0;
		for (int i = 2; i <= 10; i++) {
			System.out.printf("%d/%d+", i-1, i);
			sum += (i-1)/(double)i;
		}
		System.out.printf("= %03f\n", sum);


	} //main

} //class
