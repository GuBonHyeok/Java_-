package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author BongGu
 * @date 2024. 1. 4. - 오전 11:49:03
 * @subject 이름,국,영,수 한 번에 입력 받기 / 배열 사용
 * @content 총점, 평균
 * 					BufferedReader 복습
 */
public class Ex03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;
		String data;


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Toggle Breakpoint : 토글(토글 스위치로 이해) 중단점. Ctrl + Shift + B
		System.out.print("> 이름, 국어, 영어, 수학 입력 : ");
		data = br.readLine(); //"홍길동, 89, 78, 56"
		// 콤마를 구분자로 data 문자열을 잘라내기 => "홍길동" "89" "78" "56"
		// String String.format(String format, Object...args)
		// boolean String.equals(비교할 문자열)
		// String [] String.split(구분자). 잘라내면 문자열이기 때문에 String[] 리턴자료 
		String regex = ",";
		String[] datas= data.split(regex);
		
		
		name = datas[0]; // "홍길동"
		kor = Byte.parseByte(datas[1].trim()); // 89
		eng = Byte.parseByte(datas[2].trim()); // 78
		mat = Byte.parseByte(datas[3].trim()); // 56
		
		/*
		System.out.print("1. 이름 입력 : ");
		name = br.readLine();

		System.out.print("2. 국어 점수 : ");
		kor = Byte.parseByte(br.readLine());

		System.out.print("3. 영어 점수 : ");
		eng = Byte.parseByte(br.readLine());

		System.out.print("4. 수학 점수 : ");
		mat = Byte.parseByte(br.readLine());
		*/
	
		
		tot =(short) (kor + eng + mat);  // + 덧셈연산자
		// int 보다 작은 자료형은 연산할 때 CPU가 int 자료형으로 처리해서 연산한다.
		// 따라서 kor == byte, eng == byte, mat==byte지만 int로 처리되어 short 자료형인 tot에 산입이 되지 않음
		// 그러므로 (short)로 강제 형변환 해줘야함
		avg = tot / 3;

		System.out.printf("%s님은 국 : %d 영 : %d 수 : %d 총점 :%d 평균 :%.2f 이다."
				,name, kor, eng,mat, tot, (double) avg);
		

		

	}

}
