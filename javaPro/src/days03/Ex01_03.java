package days03;

import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 3. - 오전 10:35:42
 * @subject
 * @content 
 */
public class Ex01_03 {

	public static void main(String[] args){
		// Ctrl + Shift + O : 자동으로 필요/불필요한 import 구문을 생성/제거한다
		// Tap : 들여쓰기, Shift + Tap : 반대로 들여쓰기
		String name;
		byte kor, eng, mat;
		short tot;
		double avg;

		Scanner scanner = new Scanner(System.in);
		// System.in : 스페이스바(공백)을 구분자로 둔다

		// ☆ Scanner 의 구분자를 콤마(,)로 사용하려면?
		// nextxxx() 메서드 사용
		System.out.print("1. 이름_국어_영어_수학 입력 : ");
		name = scanner.next(); //scanner.nextLine();
		kor = scanner.nextByte();
		eng =scanner.nextByte();
		mat = scanner.nextByte();


		tot =(short) (kor + eng + mat);  // + 덧셈연산자
		// int 보다 작은 자료형은 연산할 때 CPU가 int 자료형으로 처리해서 연산한다.
	
		// 따라서 kor == byte, eng == byte, mat==byte지만 int로 처리되어 short 자료형인 tot에 산입이 되지 않음
		// 그러므로 (short)로 강제 형변환 해줘야함
		avg = (double) tot / 3;

		System.out.printf("%s님은 국 : %d 영 : %d 수 : %d 총점 :%d 평균 :%f 이다."
				,name, kor, eng,mat, tot, (double) avg);

	}

}
