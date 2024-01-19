package days02;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author BongGu
 * @date 2024. 1. 2. - 오후 2:25:30
 * @subject
 * @content String -> 숫자(byte, short, int, long...) 형 변환
 *                 기본형 래펴 클래스.parseXXX(String "23");
 */
public class Ex06_03 {

	public static void main(String[] args) throws IOException {
		
		// 기본형 래퍼(wrapper) 클래스. 기본형을 사용하기 쉽도록 만들어 놓은 클래스
		// 0000 x = 0000.parse0000();
		// int -> Integer 클래스
		// 
		
		int maxValue = Integer.MAX_VALUE;
		int minValue = Integer.MIN_VALUE;
		System.out.println( maxValue);
		System.out.println( minValue);
		
		String n = "23";
		int m = Integer.parseInt(n); // String -> int 형 변환
		System.out.println( m + 1);
		
		String b = "22";
		byte a = Byte.parseByte(b); // String -> Byte 형 변환
		System.out.println(a + 1);
		
		String x = "20";
		short y = Short.parseShort(x); // String -> short 형 변환
		System.out.println(y + 1);
		
		/////////////////////////////////////////////////////////////
		
		//int, double 숫자형 -> String 형 변환 : 숫자 + 빈 문자열 == 문자열 형변환
		System.out.println("홍길동" + 7); 
		System.out.println("" + 3.14);
		
	} //main   

} //class
