package days25;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 * @author Bonggu
 * @date 2024. 2. 2.- 오후 3:06:41
 * @subject 기본형 8가지를 읽기/쓰기 가능한 바이트 스트림 (다른 스트림을 보조해주는 보조스트림)
 * @content Data[InputStream] / Data[OutputStream]
 */
public class Ex10 {

	public static void main(String[] args) {
		String name = "김김김";
		int kor=32, eng=32, mat=42;
		int tot=kor+eng+mat;
		double avg = (double) tot/3;
		boolean gender =false;
		
		// 한 학생 정보를 student.txt 파일 저장...
		// 문자 스트림 + 파일 스트림
		String fileName = ".\\src\\days25\\student.dat"; // data저장한 파일이라는 뜻..   .ini : 초기 설정 파일
		try(FileOutputStream fos = new FileOutputStream(fileName);
				DataOutputStream dos = new DataOutputStream(fos)) {
			
			dos.writeUTF(name); //String은 기본형이 아니라 이걸로
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
			
			dos.flush();
			System.out.println("end");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	} //main

} //class
