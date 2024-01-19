package days07;

/**
 * @author BongGu
 * @date 2024. 1. 9. - 오후 3:31:19
 * @subject 계차수열 풀이
 * @content 
 */
public class Ex08 {
	public static void main(String[] args) {
		// 계차 수열
		// 항의 갯수가 20개 까지의 합
		// 1+2+4+7+11+16+22+29+37+46+56+67+...???=???

		/* [1] 공식으로 풀기
		int  term = 1;
		int sum = 0;

		for (int i = 1;i<=20 ; i++) {
			term = (int) ((Math.pow(i, 2)-1)/2);
		}
		 */
		// [3] 계차수열 문제 풀이
		int term = 1;
		int sum = 0;
		int defference = 0;

		for (int i = 1; i <= 20; i++) {
			term += defference;
			System.out.printf("%d+",term);
			defference++;
			sum+=term;
		}
		System.out.printf("=%d\n", sum
				);

	} //main

} //class
