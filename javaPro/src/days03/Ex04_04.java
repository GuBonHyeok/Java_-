package days03;

/**
 * @author BongGu
 * @date 2024. 1. 3. - 오후 12:48:27
 * @subject 논리 연산자
 * @content return값 boolean 형 (참/거짓)
 */
public class Ex04_04 {

	public static void main(String[] args) {
		
		/*
		 * 1. 일반 논리 연산자 
		 *    1) && 일반 논리 AND 연산자 (논리곱)		     ∴ 두 피연산자가 둘 다 참이어야 참
		 *       > 피연산자 && 피연산자      결과
		 *            true	&&   true        true
		 *            true	&&   false		false
		 *            false	&&   true		false
		 *            false	&&   false		false
		 *            * 앞쪽 피연산자가 false면 뒤쪽 피연산자는 처리하지 않음. 어차피 거짓!
		 */
			System.out.println( 3 >= 5 );  	// false
			System.out.println( 10 >= 5 );  	// true
			System.out.println( 3 >= 5 && 10 >= 5 );  	// false
			System.out.println( 3 <= 5 && 10 >= 5 );  	// true
			System.out.println( 3 <= 5 && 10 < 5 );  	// false
		/*
		 *    2) || 	일반 논리 OR 연산자 (논리합)				∴ 두 피연산자 중 하나라도 참이면 참
		 *       > 피연산자 || 피연산자		결과
		 *            true	&&   true       	true
		 *            true	&&   false		true
		 *            false	&&   true		true
		 *            false	&&   false		false 
		 *				* 앞쪽 피연산자가 true면 뒤쪽 피연산자는 처리하지 않음. 어차피 참!            
		 */
			System.out.println( 3 >= 4 || 4 > 1);  	// true
			System.out.println( 3 <= 4 || 4 > 1);  	// true
			System.out.println( 3 <= 4 || 4 < 1);  	// true
			System.out.println( 3 >= 4 || 4 < 1);  	// false
		/*    3) !		부정(NOT) 연산자		 
		 * 		  >       !참 => 거짓
		 *		  >       !거짓 => 참 */
			System.out.println(true);
			System.out.println(!true); //true
			
			System.out.println(false);
			System.out.println(!false); //true
			
			System.out.println(3>=4);
			// System.out.println(!3>=4); The operator ! is undefined for the argument type(s) int
			// 비교 연산자보다 not 연산자가 우선순위가 높다. 그리고 int 값은 따라서
			System.out.println(! (3>=4) ); //로 처리하면 논리 연산이 가능하다

			// 다르다 != 같다 ==
			// sysout.print( 3 = ! 2 )
		/*
		 * 2. 비트 논리 연산자
		 *    1) &	비트 논리 AND 연산자
		 *    2) |	비트 논리 OR 연산자
		 *    3) ^	XOR 연산자 (둘 중 하나만 참일 때만 참)
		 *    4) ~	틸드 연산자 (비트 부정 연산자)
		 * 
		 * */

	} //main

} //class
