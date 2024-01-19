package days06;

import java.io.IOException;

/**
 * @author BongGu
 * @date 2024. 1. 8. - 오후 2:06:03
 * @subject
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) throws IOException {
		char one;
		int code;

		// read(); : 표준입력장치의 입력스트림으로 부터 다음 byte를 읽어서
		//					0~255 까지의 int 정수를 반환하는 함수 (메서드)
		//					스트림의 끝을 만나면 -1 값을 반환 (더 이상 읽을 값이 없으면)
		System.out.print(" > 한 문자 입력 ? ");
		code = System.in.read();
		one = (char)code;
		System.out.printf("%c\n", one);
		
		/*
		System.in.read(); // 13 CR ( Cariage Return => 제일 처음 칸으로... ) 제거
		System.in.read(); // 10 LF ( Line Feed => 다음 줄로... ) 제거
		*/							// 엔터키는 \r\n가 합쳐진 것.
		
		System.in.skip(System.in.available());		 // 입력스트림에 남아있는 바이트 수를 skip 하겠다는 것. 위의 2줄과 동일
		// System.in.available(); > 입력스트림에 남아있는 바이트 수
		// System.in.skip(); > 스킵

		System.out.print(" > 한 문자 입력 ? ");
		code = System.in.read();
		one = (char)code;		
		System.out.printf("%c\n", one);

		System.out.println("end");
	} //main

} //class
