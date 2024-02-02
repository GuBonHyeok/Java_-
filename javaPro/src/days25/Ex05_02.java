package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Bonggu
 * @date 2024. 2. 2.- 오후 12:07:37
 * @subject txt 파일 복사
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		// 버퍼 기능이 있는 보조스트림을 사용해서 파일 복사
		
		String sourceFile = ".\\src\\days25\\Exam01.java";
		String copyFile = ".\\src\\days25\\Exam01_copy.java";;
		//복사 처리 시간은 83203100(ns)
		//복사 처리 시간은 1269100(ns) 
		fileCopyTextStream(sourceFile, copyFile);	

	}//main

	private static void fileCopyTextStream(String sourceFile, String copyFile) {		
		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;
		try (FileReader fr = new FileReader(sourceFile);
				FileWriter fw = new FileWriter(copyFile);
				BufferedReader br = new BufferedReader(fr, BUFFER_SIZE); //BUFFER만큼의 크기를 가지고 있는 bf 
				BufferedWriter bw = new BufferedWriter(fw, BUFFER_SIZE)) { //BUFFER만큼의 크기를 가지고 있는 bw
			/*
			int code;
			code = fr.read();
			while ((code = fr.read() )!= -1) {
				System.out.printf("%c", (char)code);
				//fw.append(code); 이건 char 혹은 CharSequence 를 줘야하기 때문에 지금은 쓰지 않음
				fw.write(code);
				//fw.flush(); 여기서 이걸 쓰면.. 비유하자면 바구니 다 안찼는데 비워주는 꼴
			} //while
			fw.flush(); //굳이 안써도 자동으로 호출된 close() 메서드가 자동으로 스트림에서 비워줌
			*/
			
			/* 한 라인 단위로 출력
			String line = null;
			while ( (line = br.readLine()) != null) {
			bw.write(line);				
			} 
			 */ 
			// 파일크기가 1035인데 첫 배열에서 1024만큼 읽어오면 다음 배열엔 11만큼만 읽어와야한다.
			char [] cBuf = new char[BUFFER_SIZE];
			int readCharNumber; //읽어온 갯수. 
			while ((readCharNumber = br.read(cBuf))!= -1) { //읽은 갯수가 -1이라는 것은 파일의 끝을 만났다는 것
				bw.write(cBuf, 0, readCharNumber); //0부터, 즉 처음부터 읽어서 읽어온 읽어온 횟수까지 쓴다
				
			}
			
			
			System.out.println("파일 복사 성공");
			long end = System.nanoTime();
			System.out.printf("복사 처리 시간은 %d(ns)",(end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}//class
