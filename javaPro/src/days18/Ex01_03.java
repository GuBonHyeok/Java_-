package days18;
/**
 * @author Bonggu
 * @date 2024. 1. 24.- 오전 9:39:43
 * @subject FileReader 클래스. 한 라인씩 읽기
 * @content 버퍼(임시 저장, 기억 공간)기능으로 한 문자씩 읽어오면
 * 										[A] [B] [C] [] [] .. [\n] [\r] < 끝에는 엔터값이 들어간다 
 * 										readLine() 으로 \n\r 전까지만 읽는 클래스가 있음.
 * 									> BufferedReader 클래스 (보조 스트림 : 클래스의 다른 기능을 지원하는 것)
 * 
 * 		그리고 한 라인마다 라인 번호를 붙이기
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex01_03 {
	
	public static void main(String[] args) {

		int lineNumber = 0; 
		
		String fileName = "C:\\Setup.log";
		String line = null;
		try (FileReader fr = new FileReader(fileName);
				BufferedReader br =	new BufferedReader(fr);) { 
				//사용하고자 하는 자원을 try() 괄호 안에 넣으면 try문이 끝나면 자동으로 close 한다.
				// : try ~ resources 문
			
			while((line = br.readLine()) != null) { //readLine은 파일의 끝을 만나면 -1이 아니라 null을 반환하기 때문에
				System.out.printf("[%02d] : %s\n", ++lineNumber, line);			
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// try ~ resources 문에 의해서 자동으로 close(); 시킨다
		} //finally	

	} //main

} //class










