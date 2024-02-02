package days25;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {
		// 실행 후
		// 1. 저장할 파일명 입력 ? kenik.txt 엔터
		// 2. 저장할 문자열(Data) 입력 ?내일은 금요일.... 엔터
		//    계속 ?
		//   저장할 문자열(Data) 입력 ? sdafsasfd 엔터
		//    계속 ? n
		String parent = ".\\src\\days25";
		String child = null;
		String content = "";
		char con = 'y';
		try(Scanner scanner = new Scanner(System.in);) {
			System.out.print("1. 저장할 파일명 입력 ? : ");
			child = scanner.next();
			File saveFile = new File(parent ,child);
			do {
				try(FileWriter fw = new FileWriter(saveFile, true)) { 
					//FileWriter(saveFile, true) 에서 두 번째 매개변수로 true를 주면 이어서 쓰기, false는 덮어쓰기로 만든다
					System.out.print("2. 저장할 문자열(Data) 입력 ? :");
					content = scanner.next(); 
					fw.append(content);

				} catch (Exception e) {
					e.printStackTrace();
				} //try ~ catch
				System.out.print("계속?");
				con = (char)System.in.read();
				System.in.skip(System.in.available());
			}	while (Character.toUpperCase(con)=='Y');
		} catch (Exception e) {
			e.printStackTrace();
		}//try~catch
		System.out.println("end");
		
	}//main
	
}//class
