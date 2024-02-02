package days25;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Bonggu
 * @date 2024. 2. 2.- 오후 12:33:40
 * @subject 바이트 스트림을 사용해서 파일 복사하기
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// 실행 파일 복사 -> 바이트 스트림을 사용해야한다
		// FileInputStream / FileOutputStream 사용

		String sourceFile = "C:\\Program Files\\Bandizip\\Bandizip.exe";
		String copyFile = "C:\\Users\\user\\Documents\\Bandizip_copy.exe";

		fileCopyBinaryStream(sourceFile, copyFile);

	} //main

	private static void fileCopyBinaryStream(String sourceFile, String copyFile) {
		long start = System.nanoTime();

		final int BUFFER_SIZE = 1024;

		try (FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(copyFile);
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);){

			byte [] b = new byte[BUFFER_SIZE];
			int readByteNumber;
			while ((readByteNumber= bis.read(b)) != -1) {
				bos.write(b, 0, readByteNumber);

			}//while
			bos.flush();
			System.out.println("파일 복사 완료!!!");

			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 : %d(ns)\n", (end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

} // class