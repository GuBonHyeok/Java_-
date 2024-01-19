package days08;

/**
 * @author BongGu
 * @date 2024. 1. 10. - 오후 12:20:47
 * @subject 재귀 함수 예제
 * @content 팩토리얼 (factorial) == 계승
 */
public class Ex04_03 {

	public static void main(String[] args) {
		// 팩토리얼 정의 : 1에서 양의 정수의 곱
		// n! == n * (n-1) * (n-2) * (n-3) * ... * 1
		// 예) 5! = 5*4*3*2*1
		// 0! == 1 (약속)
		int n = 5;
		int result = recursiveFactorial(n);
		
		System.out.println("=" + result);
	
	} //main

	private static int recursiveFactorial(int n) {

		System.out.printf("%d *", n);		
		if ( n == 1 || n == 0 ) return n;
		else return n * recursiveFactorial(n-1);
	}

	// 재귀 함수
	private static int factorial(int n) {
		int result = 1;
		for (int i = n; i >= 1; i--) {
			System.out.printf("%d *", i);
			result *= i;
			
		}
		return result;
	}

} //class
