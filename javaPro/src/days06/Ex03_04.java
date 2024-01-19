package days06;

import java.io.IOException;

/**
 * @author BongGu
 * @date 2024. 1. 8. - 오후 2:06:03
 * @subject 한 문자 입력받고 계속 하겠냐는 코드
 * @content
 */
public class Ex03_04 {

	public static void main(String[] args) throws IOException {
		char one, con ='y';
		int code;

		do {
			System.out.print(" > 한 문자 입력 ? ");
			code = System.in.read();
			one = (char)code;
			System.out.printf("%c\n", one);
			System.in.skip(System.in.available());		// 한 문자 입력받고 엔터에 해당하는 \r\n 바이트 제거해주는 코드 

			System.out.print("\n\n 계속 하시겠습니까?");

			con = (char) System.in.read(); // 'y'를 입력하든지 'n'을 입력하든지 하게끔 스캐너
			System.in.skip(System.in.available());		// Y 입력한 이후 엔터에 해당하는 \r\n 바이트 제거해주는 코드

		} while ( Character.toUpperCase(con) == 'Y' );


		System.out.println("end");
	} //main

} //class
