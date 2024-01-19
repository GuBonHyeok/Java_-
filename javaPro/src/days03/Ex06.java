package days03;

/**
 * @author BongGu
 * @date 2024. 1. 3. - 오후 3:36:10
 * @subject [단항 연산자] ~ ! (cast)
 * @content 					+ - 는 단항 연산자로 쓰이면 덧셈 뺄셈이 아닌 부호를 나타낸다
 * 									++ -- (증감 연산자)
 *                                 += -= (복합대입연산자)
 */
public class Ex06 {

	public static void main(String[] args) {
		// [문제] 어떤 기억 공간의 값을 1증가 시키는 코딩
		// 1) n = n + 1;
		// 2) n += 1;
		// 3) n++;
		
		int n = 10;
		System.out.printf("초기 n = %d \n", n);
		
		n = n + 1;
		System.out.printf("n = %d \n", n); // 11
		n += 1;
		System.out.printf("n = %d \n", n); // 12
	    n ++;
		System.out.printf("n = %d \n", n); //13
		n --;
		System.out.printf("n = %d \n", n); //12
		
		n --;
		System.out.printf("n = %d \n", n);
		/*
		System.out.println(-3); 		// 단항연산자	(음수, 부호)
		System.out.println(5-3); 		// 이항연산자 (뺄셈)
		System.out.println(+3); 		// 단항연산자	(양수, 부호)
		System.out.println(5+3); 	// 이항연산자 (덧셈)
		*/

	} //main

} //class
