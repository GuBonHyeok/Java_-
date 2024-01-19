package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author BongGu
 * @date 2024. 1. 2. - 오후 5:13:00
 * @subject 이름, 국어, 영어, 수학 입력
 * @content 총점, 평균 계산
 * 		[출력형식]
 * 		홍길동님은 국 :89 영 :78 수 : 56 총점 :000 평균 :00.00 이다.
 */
public class Ex12 {

	public static void main(String[] args) throws IOException {
		 String name;
		 byte kor, eng, mat;
		 short tot; // 0~300점
		 double avg; //소수점까지 나오니까 double
		 		
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.print("1. 이름 입력 : ");
		 name = br.readLine();
		 
		 System.out.print("2. 국어 점수 : ");
		 kor = Byte.parseByte(br.readLine());
		 
		 System.out.print("3. 영어 점수 : ");
		 eng = Byte.parseByte(br.readLine());
		 
		 System.out.print("4. 수학 점수 : ");
		 mat = Byte.parseByte(br.readLine());
		 //총점, 평균 계산 코딩 / Type mismatch: cannot convert from int to short
		 tot = (short) (kor + eng + mat);  // + 덧셈연산자, 강제 형변환 했음
		 avg = (double) tot / 3; //short 나누기 int 하면 int 로, int 나누기 double하면 double로 나옴
		 //따라서 소수점 둘째 자리까지 나오려면 tot / 3.0;으로 해주면 됨
		 // 혹은 (double) tot / 3; 해도 됨
		 
		 System.out.printf("%s님은 국 : %d 영 : %d 수 : %d 총점 :%d 평균 :%.2f 이다."
				 ,name, kor, eng,mat, tot, (double) avg);
 
		 		 
	} //main
	
	

} //class
