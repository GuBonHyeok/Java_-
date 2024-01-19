package days05;

/**
 * @author BongGu
 * @date 2024. 1. 5. - 오후 2:42:38
 * @subject 이때까지 if, switch, for, break 배움
 * @content [while 조건반복문]
 */
public class Ex07 {

	public static void main(String[] args) {

		/*
		if (condition) { 
					반복횟수를 알고 있을 때 쓰면 좋다
			// 명령 코딩;
		}
		while (condition) {	조건을 가지고 반복한다면 while 문이 좋을 수 있다
			// 명령 코딩;			
		}
		 */

		/* [1] 번
		int i = 1, sum=0;
		while (i<=10) {
			sum += i;
			System.out.printf("%d + ", i);
			i++;
		}
		System.out.printf("= %d\n", sum);
		 */

		/* [2]번 > 디버깅으로 위에서부터 while문 돌려보기

		int i = 0, sum = 0;
	      while ( i < 10 ) {  
	         i++;  
	         System.out.printf("%d+", i); 
	         sum += i;  

	      } // while
	      System.out.printf("=%d\n", sum);
		 */

		// [3] 증감 연산자가 후위형이기 때문에 ( i++ <= 10 ) 에서 가장 나중에 1 증가된다
		// 따라서 i == 10 인 상태로 sum에 한 번 더 들어간다.
		/*
		int i = 0, sum = 0;
		while ( i++ <= 10 ) {
			System.out.printf("%d+", i); 
			sum += i;   

		} // while
		System.out.printf("=%d\n", sum);
		*/

		/*
		int i = 1, sum=0;
		while (i<=10) {
			sum += i;
			System.out.printf("%d + ", i);
			i++;
		}
		System.out.printf("= %d\n", sum);
		*/
		int i = 10, sum=0;
		while (true) { //무한루프
			if( i < 1) break;
			sum += i;
			System.out.printf("%d + ", i);
			i--;
		}
		System.out.printf("= %d\n", sum);

	} //main

} //class
