package days03;

/**
 * @author BongGu
 * @date 2024. 1. 3. - 오후 12:28:10
 * @subject 연산자(operator)
 * @content 1. 산술 연산자
 */
public class Ex04_02 {

	public static void main(String[] args) {
		int i = 10, j = 3;
		System.out.println(i + j); // + 연산자 사용
		System.out.println(i - j); // -  연산자 사용
		System.out.println(i * j); // *  연산자 사용
		System.out.println(i / j); // /  연산자 사용. 10이 나온 이유? int / int 이기 때문
		System.out.println((double)i / j); // /  연산자 사용. 이렇게 하면 3.333333... 나옴
		System.out.println(i % j); // %  연산자 사용. 나머지(remainder) 출력
		
		// ★★★ 산술 연산자 사용 시 주의할 점 ★★★
		// 정수를 0으로 나누면 ArithmeticException(산술적 예외) 발생
		// System.out.println(10 / 0);  // 정수를 0으로 나누면 ArithmeticException(산술적 예외) 발생
		System.out.println(10.0 / 0);  // 실수를 0으로 나누면 Infinity(무한대) 리터럴 나옴
		// System.out.println(10 % 0);   // 정수를 0으로 나누면 ArithmeticException(산술적 예외) 
		System.out.println(10.0 % 0);// 실수의 나머지를 구하면 NaN(Not a Number) 리터럴 나옴   
		

	} //main

} //class
