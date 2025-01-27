package days25;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author Bonggu
 * @date 2024. 2. 2.- 오후 3:06:41
 * @subject 기본형 8가지를 읽기/쓰기 가능한 바이트 스트림
 * @content Data[InputStream] / Data[OutputStream]
 */
public class Ex09_02 {

	public static void main(String[] args) {
		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		boolean gender;
		
		// 두 번째 학생 정보를 student.txt 로 부터 읽어와서 출력
		// 문자 스트림 + 파일 스트림
		String fileName = ".\\src\\days25\\student.txt";
		try(FileReader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr)) {		
			
			br.readLine(); //홍길동 학생 정보 읽어오기
			String data = br.readLine(); //두번째 학생 정보 읽어와서 data에 저장
			String [] datas = data.split(", ");
			name = datas[0];
			kor = Integer.parseInt(datas[1]);
			eng = Integer.parseInt(datas[2]);
			mat = Integer.parseInt(datas[3]);
			tot = Integer.parseInt(datas[4]);
			avg = Double.parseDouble(datas[5]);
			gender = Boolean.parseBoolean(datas[6]);		
			
			System.out.printf("%s, %d, %d, %d, %d, %02f, %b\n", name, kor, eng, mat, tot, avg, gender);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	} //main

} //class
