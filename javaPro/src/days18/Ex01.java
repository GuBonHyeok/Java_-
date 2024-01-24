package days18;
/**
 * @author Bonggu
 * @date 2024. 1. 24.- 오전 9:39:43
 * @subject FileReader 클래스. 한 문자씩 읽기
 * @content
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class Ex01 {
	
	public static void main(String[] args) {
		// [FileReader] / FileWriter
		FileReader reader = null; //파일 내용 읽어오는 File
		String fileName = "C:\\Setup.log";
		int one = -1;
		// try문에서 작업을 수행하다가 예외가 발생하면 해당 catch문으로 이동하고 finally 구문을 실행함
		try {
			reader = new FileReader(fileName); //예외처리 필요
			//다중 catch문
			// EOF (End Of File). 파일의 끝을 만나면 -1을 반환
			while((one = reader.read()) != -1) { //한 문자씩 읽어서 -1이 아닐 동안 반복하라는 의미
				System.out.printf("%c", (char)one); //정수형 one 을 char로 형변환해서 출력
			
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally { //예외의 여부와 상관없이 실행되는 구문
			if (reader != null) { // reader가 정상적으로 잘 끝냈으면 
				try {
					reader.close(); 	//	꼭 닫아줘야함. (아니면 엑셀 읽기전용 처럼 문제 발생할 수도 있음)
				} catch (IOException e) {
					e.printStackTrace();
				}//try ~ catch
			
			} //if 
			
		} //finally	

	} //main

} //class










