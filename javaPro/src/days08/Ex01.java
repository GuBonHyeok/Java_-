package days08;

import java.util.Scanner;

import com.util.Draw2D;
// import java.lang.*; <컴파일할 때 자동으로 컴파일러가 자동으로 import 해줌 
public class Ex01 {

	public static void main(String[] args) {
		// 선 긋기

		//원래는 com.util.Draw2D.drawLine(); 으로 써야하는데 import로 추가해주면 됨
		//원래는 java.lang.System.out.println(); 으로 써야하는데 컴파일러가 자동으로 import해줌
		
		int firstTerm = 1;
		int secondTerm = 1;
		int nextTerm;
		int sum = firstTerm + secondTerm;

		System.out.print("1+1+");
		while ((nextTerm = firstTerm + secondTerm) <= 100) {
						
			sum += nextTerm;			
			System.out.printf("%d+", nextTerm);
			
			firstTerm = secondTerm;
			secondTerm= nextTerm;			
		}
		System.out.printf("=%d\n", sum);

	}

	public static int score (int kor) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(" > 점수 입력 :");
		kor = scanner.nextInt();

		switch ( kor / 10 ) { 

		case 10:   
		case 9: 
			System.out.println("수");
			break;		
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		case 6:
			System.out.println("양");
			break;
		default:
			System.out.println("가");
			break;
		} //switch		

		return kor;
	}

}


