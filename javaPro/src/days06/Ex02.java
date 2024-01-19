package days06;

/**
 * @author BongGu
 * @date 2024. 1. 8. - 오후 12:02:19
 * @subject 쪽지시험 2번 문제
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		int [] m = new int[10];

		/*
		for (int i = 0; i < m.length; i++ ) {
			m[i] = (int) (Math.random() * 11 + 5); 
			System.out.printf("m[%d] = %d\n", i, m[i]);	
		} //for
		 */

		// [추가 문제] m 배열의 가장 큰 값, 가장 작은 값을 구해서 출력

		int i;
		int max = m[0], min =m[0];
		for ( i = 1; i < m.length; i++) {
			m[i] = (int) (Math.random() * 11 + 5);
			
			max = Math.max(max, m[i]);
			min = Math.min(min, m[i]);
			System.out.printf("max = %d, min = %d \n" , max, min);			
			
		}


	} //main

} //class