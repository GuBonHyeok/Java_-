package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author BongGu
 * @date 2024. 1. 3. - 오전 10:35:42
 * @subject
 * @content 
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("1. 이름 입력 : ");
		name = br.readLine();

		System.out.print("2. 국어 점수 : ");
		kor = Byte.parseByte(br.readLine());

		System.out.print("3. 영어 점수 : ");
		eng = Byte.parseByte(br.readLine());

		System.out.print("4. 수학 점수 : ");
		mat = Byte.parseByte(br.readLine());
	

		tot =(short) (kor + eng + mat);  // + 덧셈연산자
		// int 보다 작은 자료형은 연산할 때 CPU가 int 자료형으로 처리해서 연산한다.
		// 따라서 kor == byte, eng == byte, mat==byte지만 int로 처리되어 short 자료형인 tot에 산입이 되지 않음
		// 그러므로 (short)로 강제 형변환 해줘야함
		avg = tot / 3;

		System.out.printf("%s님은 국 : %d 영 : %d 수 : %d 총점 :%d 평균 :%f 이다."
				,name, kor, eng,mat, tot, (double) avg);

	}

}
