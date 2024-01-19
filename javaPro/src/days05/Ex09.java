package days05;

/**
 * @author BongGu
 * @date 2024. 1. 5. - 오후 4:39:01
 * @subject if, switch, for, while , do~while
 * @content break, foreach
 * 
 * 					[continue 문]
 */
public class Ex09 {

	public static void main(String[] args) {

		/* 1+2+3+4+5+6+7+8+9+10=55
		int sum = 0;
		for (int i = 1; i <= 10; i++) {

			sum += i;
			System.out.printf("%d+", i);

		}
		System.out.printf("=%d", sum);
		 */
		
		/* 1+3+5+7+9 = 25 홀수 합 구하기
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				sum += i;
				System.out.printf("%d+", i);
			} //if		

		}
		System.out.printf("=%d", sum);
		*/
		
		/* [2] 1~10까지 홀수의 합을 출력하자
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i%2 == 0) continue; //조건이 만족하면 for문의 } 닫기 블록으로 가서 다시 증감식을 바로 수행한다.			
				sum += i;
				System.out.printf("%d+", i);

		}
		System.out.printf("=%d", sum);
		*/
		
		// [3] 1~10까지의 홀수의 합을 출력하자 * 시험 *
		int sum = 0;
		for (int i = 1; i <= 10; i += 2) { //i++ 가 아니라 i값을 2씩 증가시키는 i += 2 주면 더 좋음 
				sum += i;
				System.out.printf("%d+", i);

		}
		System.out.printf("=%d", sum);


	} //main

} //class
