package days25;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;

/**
 * @author Bonggu
 * @date 2024. 2. 2.- 오후 3:06:41
 * @subject 기본형 8가지를 읽기/쓰기 가능한 바이트 스트림
 * @content Data[InputStream] / Data[OutputStream]
 */
public class Ex10_02 {

	public static void main(String[] args) {
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		boolean gender;

		// 첫 번째 학생 정보를 student.txt 로 부터 읽어와서 출력
		// 문자 스트림 + 파일 스트림
		String fileName = ".\\src\\days25\\student.dat";
		try(FileInputStream fis = new FileInputStream(fileName);
				DataInputStream dis = new DataInputStream(fis)) {		

			name = dis.readUTF();
			kor = dis.readInt();
			eng = dis.readInt();
			mat = dis.readInt();
			tot = dis.readInt();
			avg = dis.readDouble();
			gender = dis.readBoolean();

			System.out.printf("%s, %d, %d, %d, %d, %02f, %b\n", name, kor, eng, mat, tot, avg, gender);

		} catch (Exception e) {
			e.printStackTrace();
		}


	} //main

} //class
