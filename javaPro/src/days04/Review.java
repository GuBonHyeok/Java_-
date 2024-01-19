package days04;

import java.util.Scanner;

public class Review {


	public static void main(String[] args)  {
		String name = null;
		byte kor, eng, mat;
		short tot;
		double avg;
		Scanner sc = new Scanner(System.in);
					
		System.out.print("1. 이름, 국어, 영어, 수학  입력 : ");
		
		sc = new Scanner(sc.next()).useDelimiter(",");
		//Resource leak: 'sc' is not closed at this location
		//리소스(자원)이 누수(누출)가 발생하고 있음.
		//sc.close(); 로 해결 가능
		
		name = sc.next();
		kor = sc.nextByte();
		eng =sc.nextByte();
		mat = sc.nextByte();
				
		tot = (short) (kor + eng + mat);
		avg = (double) tot / 3;
		
		System.out.printf("이름 = \"%s\", 국어 = %d, 영어 = %d, 수학 = %d, 총점 = %d, 평균 = %.2f"
				,name, kor, eng, mat, tot, avg);


	}

}
