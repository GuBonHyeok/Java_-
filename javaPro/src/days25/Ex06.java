package days25;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Bonggu
 * @date 2024. 2. 2.- 오후 12:33:40
 * @subject 바이트 스트림을 사용해서 파일 복사하기
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// 실행 파일 복사 -> 바이트 스트림을 사용해야한다
		// FileInputStream / FileOutputStream 사용

		String sourceFile = "C:\\Program Files\\Bandizip\\Bandizip.exe";
		String copyFile = "C:\\Users\\user\\Documents\\Bandizip_copy.exe";

		fileCopyBinaryStream(sourceFile, copyFile);

	} //main

	  private static void fileCopyBinaryStream(String sourceFile, String copyFile) {
	      long start = System.nanoTime();

	      try (FileInputStream fis = new FileInputStream(sourceFile);
	          FileOutputStream fos = new FileOutputStream(copyFile)){

	         int code;
	         while( ( code = fis.read() ) != -1 ) {
	            System.out.printf("%08d\n"
	                  , Integer.parseInt(Integer.toBinaryString(code))); 
	            fos.write(code); 
	         } // while 
	         fos.flush();
	         System.out.println("파일 복사 완료!!!");

	         long end = System.nanoTime();
	         System.out.printf("> 복사 처리 시간 : %d(ns)\n", (end-start));
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }

	} // class