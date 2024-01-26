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
		
		int [][] counts = new int[2]['Z' - 'A' + 1];
				
		int countNum = 0;
		String fileName = "\\src\\days18\\Ex01.java";
		String key = "user.dir";
		String userDir = System.getProperty(key); 
		
		String path = String.format("%s%s",userDir, fileName);

		System.out.println(path);

		try (FileReader fr = new FileReader(path)) {
			int code;
			char UpperOne;
			char LowerOne;
			char NumOne;
			
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

