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


public class Ex01_02 {
	
	public static void main(String[] args) {
		FileReader fr = null; 
		BufferedReader br = null;		
		int lineNumber = 0;
		
		String fileName = "C:\\Setup.log";
		String line = null;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr); //한 문자씩 읽어들이는 기능을 보조할 거기 때문에 fr을 준다
			/*
			while((one = fr.read()) != -1) { //한 문자씩 읽어들이는 작업
				System.out.printf("%c", (char)one);			
			}			
			*/
			while((line = br.readLine()) != null) { //readLine은 파일의 끝을 만나면 -1이 아니라 null을 반환하기 때문에
				System.out.printf("[%02d] : %s\n", ++lineNumber, line);			
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {  
				try {
					fr.close(); 	
					br.close(); 	
				} catch (IOException e) {
					e.printStackTrace();
				}//try ~ catch
			
			} //if 
			
		} //finally	

	} //main

} //class










