package days03;

/**
 * @author BongGu
 * @date 2024. 1. 3. - 오후 5:39:15
 * @subject 수식 표현 : 연산자 사용
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {

		// 1) x는 10보다 크다.
		//    → x > 10
		// 2) x는 10보다 크고, 20보다 작다.
		//    → 10 < x && x < 20
		// 3) x는 2의 배수이다.
		//    → x % 2 == 0 
		// 4) x는 2의 배수 또는 3의 배수이다. 
		//    → x % 2 || x % 3
		// 5) x는 2의 배수이지만 6의 배수는 아니다. 
		//    → x % 2 ==0 &&  x % 6 != 0
		// 6) 한 문자(ch)가  숫자이다. 
		//    → 'ch' >=48 && 'ch' <57 
		// 7) 한 문자가 소문자이다. 
		//    → 'x' > 97 && 'x' < 122 
		// 8) 한 문자가 알파벳이다 ( 대문자이거나 또는 소문자 이니 ) 
		//    → ('x' > 65 && 'x' < 90) || ('x' > 97 && 'x' < 122)
		System.out.println( 5 % 0 );
		System.out.println( 5.2 / 0 ); 
		System.out.println( 5.2 % 0 );
	} //main

} //class
