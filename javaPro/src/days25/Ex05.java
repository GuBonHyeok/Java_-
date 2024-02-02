package days25;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Bonggu
 * @date 2024. 2. 2.- 오후 12:07:37
 * @subject txt 파일 복사
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// txt 파일 복사
		// 원본파일을 읽어서 		: FileReader
		// 복사파일에 쓰기작업		: FileWriter
		String sourceFile = ".\\src\\days25\\Exam01.java";
		String copyFile = ".\\src\\days25\\Exam01_copy.java";;
		//복사 처리 시간은 83203100(ns)
		fileCopyTextStream(sourceFile, copyFile);
		
		
		
		

	}//main

	private static void fileCopyTextStream(String sourceFile, String copyFile) {		
		long start = System.nanoTime();
		
		try (FileReader fr = new FileReader(sourceFile);
				FileWriter fw = new FileWriter(copyFile)) {
			int code;
			//code = fr.read();
			while ((code = fr.read() )!= -1) {
				System.out.printf("%c", (char)code);
				//fw.append(code); 이건 char 혹은 CharSequence 를 줘야하기 때문에 지금은 쓰지 않음
				fw.write(code);
				//fw.flush(); 여기서 이걸 쓰면.. 비유하자면 바구니 다 안찼는데 비워주는 꼴
			} //while
			fw.flush(); //굳이 안써도 자동으로 호출된 close() 메서드가 자동으로 스트림에서 비워줌
			System.out.println("파일 복사 성공");
			long end = System.nanoTime();
			System.out.printf("복사 처리 시간은 %d(ns)",(end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}//class
