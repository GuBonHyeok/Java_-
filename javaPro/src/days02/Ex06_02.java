package days02;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author BongGu
 * @date 2024. 1. 2. - 오후 2:01:30
 * @subject
 * @content 키보드로 부터 나이를 입력받아서 입력받은 나이를 출력하는 코딩
 */
public class Ex06_02 {

	public static void main(String[] args) throws IOException {
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("나이를 입력하세요. >\n");
		byte age = "";
		age = br.readLine(); //Type mismatch: cannot convert from String to byte
		System.out.printf("나이 : %d", age);
		*/
		//1. 나이를 저장할 변수 선언 
		byte age; //-128~127
		//2. br 객체 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(">나이 입력.");
		//Type mismatch: cannot convert from String to byte
		// 문자열 "23"
		age = Byte.parseByte(br.readLine()); //입력한 한 라인을 전부 읽어가는 함수. 리턴값 잘 확인해야함. readLine 은 String을 리턴시킴
		                           	 // 문자열 "23" -> 숫자(정수) byte 형 변환 해야함
		System.out.printf("> 나이 : %d \n", age);

			
		
	} //main
	
	
} //class
