package days19;

import java.io.UnsupportedEncodingException;

/**
 * @author Bonggu
 * @date 2024. 1. 25.- 오후 12:09:42
 * @subject 문자열 바꿔보기 (맛보기 예제 느낌)
 * @content
 */
public class Ex03 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "가";
		byte [] barr = str.getBytes("UTF-8"); //"가"를 UTF-8 형식의 바이트로 만들어서 barr으로 넣기
		
		//[ea][b0][80]
		for (int i = 0; i < barr.length; i++) {
			System.out.printf("[%02x]",barr[i]); //16진수로 출력
		}
		System.out.println();
		
		// byte [] => String 변환
		String s = new String(barr, "UTF-8"); //다시 UTF-8 형식으로 barr을 s에 입력
		System.out.println(s);
		
		barr = str.getBytes("EUC-KR"); //"가"를 EUC-KR 형식으로 바이트로 만들어서 barr으로 넣기
				
		//[ea][b0][80]
		for (int i = 0; i < barr.length; i++) {
			System.out.printf("[%02x]",barr[i]); //16진수로 출력
		}
		System.out.println();
		
		// byte [] => String 변환
		s = new String(barr, "UTF-8"); //다시 UTF-8 형식으로 barr을 s에 입력
		System.out.println(s);
		

	} //main

} //class
