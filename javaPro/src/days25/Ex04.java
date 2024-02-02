package days25;

import java.io.File;
import java.io.FileReader;
import java.util.Date;

/**
 * @author Bonggu
 * @date 2024. 2. 2.- 오전 11:03:48
 * @subject File 클래스
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		//String dir = ".\\src\\days25";
		//String fName = "Exam01.java";
		
		String parent = ".\\src\\days25";
		String child = "Exam01.java";
		
		// [파일 정보]
		// File 클래스 - 파일, 폴더(디렉터리)를 다루는 여러 기능이 구현된 클래스
		//					생성, 파일(폴더)명 변경, 삭제, 정보 등등
		//String path = dir + "\\" + fName;
		//File openFile = new File(path); //path를 매개변수로 File 객체 생성
		File openFile = new File(parent, child); //parent, child로 파일 오픈.
		
		System.out.println(openFile.length() + "(bytes)"); //length() : 파일 크기 가져오기. 단위는 바이트임
		System.out.println(openFile.lastModified()); //lastModified() : 마지막에 수정된 날짜. 단위는 long으로 1970년 기준
		//1706836051213
		long lm = openFile.lastModified();
		Date d = new Date(lm);
		System.out.print(d.toLocaleString());
		
		try (FileReader fr = new FileReader(openFile)) {
			// 
			int code;
			code = fr.read(); //FileReader는 문자를 다루는 스트림. read() -> char 를 읽어와서 int로 돌려준다
			while ((code = fr.read() )!= -1) {
				System.out.printf("%c", (char)code);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	} //main

} //class
