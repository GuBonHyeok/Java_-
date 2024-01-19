package days02;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author BongGu
 * @date 2024. 1. 2. - 오후 12:30:32
 * @subject
 * @content (암기 필요) 키보드(표준 입력 장치)로 부터 입력 받기
 * 
 * 키보드 -> System.in ->  이진 -> 텍스트 변환 -> 문자열
 *            Stream
 */          
public class Ex06 {

	public static void main(String[] args) throws IOException {

		// 이거만 치고 Ctrl + Shift + O : import문 삽입
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("> 이름을 입력하세요. ");
		// new : 객체 생성 연산자        
		// 어떤 클래스를 사용하려면 어떤 패키지 안에 있는 클래스인지 명시해줘야한다.
		String name = "";
		name = br.readLine(); //Unhandled exception type IOException 예외 처리해야 함. 나중에 배움

		System.out.printf("> 이름 : %s\n", name);

	} //main

} //class