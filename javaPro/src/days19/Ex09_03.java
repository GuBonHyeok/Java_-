package days19;

import java.io.FileReader;
import java.util.Arrays;

/**
 * @author Bonggu
 * @date 2024. 1. 25.- 오후 3:05:48
 * @subject 
 * @content
 */
public class Ex09_03 {

	public static void main(String[] args) {
		//days18.Ex01.java 가 있음.
		//위 파일에서 알파벳을 대소문자, 소문자, 숫자가 몇개인지
		//배열에 저장 후 ###막대그래프를 그리는 작업

		//int [] countsUpper = new int ['Z' - 'A' + 1]; //대문자 26개 저장할 배열 생성
		//int [] countsLower = new int ['z' - 'a' + 1]; //알파벳 26개 저장할 배열 생성
		int [][] counts = new int[2]['Z' - 'A' + 1];
		// 0행 대문자 갯수 저장 0행0열 'A' 0행1열 'B' .... 0행 25열 'Z'
		// 1행 소문자 갯수 저장 1행0열 'a' 1행1열 'b' .... 1행 25열 'z'
		
		
		int countNum = 0; //숫자 종류 상관없이;
		String fileName = "\\src\\days18\\Ex01.java"; //SS20_Team 경로를 fileName에 저장
		String key = "user.dir";
		String userDir = System.getProperty(key); //user.dir의 경로 확인
		//System.out.println(userDir);

		String path = String.format("%s%s",userDir, fileName); //파일의 전체 경로 불러와서 path에 저장

		System.out.println(path);

		try (FileReader fr = new FileReader(path)) {
			int code;
			char UpperOne;
			char LowerOne;
			char NumOne;
			//read() : EOF(End Of File)을 만나면 -1 반환
			while ( ( code = fr.read() )!= -1) {
				UpperOne = (char)code;
				 if (Character.isUpperCase(UpperOne)) { // 대문자 저장
					 System.out.println(UpperOne);
					 countsUpper[UpperOne - 'A'] ++;			 
				 } LowerOne = (char)code;
				 if (Character.isLowerCase(LowerOne)) { // 소문자 저장
					 System.out.println(LowerOne);
					 countsLower[LowerOne - 'a'] ++;			 
				 } 
				 	
			} //while
			
			for (int i = 0; i < countsUpper.length; i++) {
				 System.out.printf("'%c': %s(%d)\n"
		                  , 'A'+i  ,  "#".repeat( countsUpper[i] ) , countsUpper[i]);
			} //대문자 갯수
			System.out.println();
			
			for (int i = 0; i < countsLower.length; i++) {
				 System.out.printf("'%c': %s(%d)\n"
		                  , 'a'+i  ,  "#".repeat( countsLower[i] ) , countsLower[i]);
			} //소문자 갯수
			
			

		} catch (Exception e) {
			e.printStackTrace();
		} //try

	} //main

}//class

