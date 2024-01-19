package days02;

/**
 * @author BongGu
 * @date 2024. 1. 2. - 오후 3:42:08
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// [진법 변환]
		// 16진수 : 0 1 2 3 4 5 6 7 8 9 a(10) b(11) c(12) d(13) e(14) f(15)
		// 10진수 : 0 1 2 3 4 5 6 7 8 9
		// 8진수	: 0 1 2 3 4 5 6 7
		// 2진수 : 0 1
		
		byte b = 10; // 1byte [0] [0] [0] [0] [1] [0] [1] [0]
		//00 01 10 11 100 101 110 111 1001 1010
		System.out.println(Integer.toBinaryString(b)); //1010 출력. 10을 10진수 > 2진수로 변환
		System.out.println(Integer.toOctalString(b)); //12 출력. 10을 10진수 > 8진수로 변환
		System.out.println(Integer.toHexString(b)); //a 출력. 10을 10진수 > 16진수로 변환
		

	} //main

} //class
