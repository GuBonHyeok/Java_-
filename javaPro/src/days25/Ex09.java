package days25;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @author Bonggu
 * @date 2024. 2. 2.- 오후 3:06:41
 * @subject 기본형 8가지를 읽기/쓰기 가능한 바이트 스트림
 * @content Data[InputStream] / Data[OutputStream]
 */
public class Ex09 {

	public static void main(String[] args) {
		String name = "김김김";
		int kor=32, eng=32, mat=42;
		int tot=kor+eng+mat;
		double avg = (double) tot/3;
		boolean gender =false;
		
		// 한 학생 정보를 student.txt 파일 저장...
		// 문자 스트림 + 파일 스트림
		String fileName = ".\\src\\days25\\student.txt";
		try(FileWriter fw = new FileWriter(fileName, true);
				BufferedWriter bw = new BufferedWriter(fw)) {
			
			String data = String.format("%s, %d, %d, %d, %d, %02f, %b\n", name, kor, eng, mat, tot, avg, gender);
			bw.append(data);
			bw.flush();
			System.out.println(data);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	} //main

} //class
