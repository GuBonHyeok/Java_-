package days17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		int a = 0, b = 0;
		
		Scanner scanner = new Scanner(System.in);
		//예외 처리 방법 중 하나. 
		//try 문에서 예외가 발생하게 되면 try를 더 이상 실행하지 않고 
		//catch 문으로 넘어가서 내부를 실행하고 발생하지 않으면 try 문 실행되고 catch문은 넘어간다
		try {
			System.out.print("> a, b 두 정수 입력");
			//InputMismatchException. 정수가 아닌 값 입력하면 나옴
			// java.lang.ArithmeticException 5/0 하면 발생
			a = scanner.nextInt();
			b = scanner.nextInt();			
		} catch (InputMismatchException e) {
			System.out.println("입력 유효성 실패..");
		}		
		
		/* 예외 발생 여부와 상관없이 if문을 항상 체크하기 때문에
		if (b == 0) {
			System.out.println("0으로 나누지 마라");
			return ; //메인함수 빠져나오겠다
		}
		*/
		
		try {
			double c =a/b;
			System.err.printf("%d / %d = %.2f\n",a,b,c);			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다.");
		}
				
		System.out.println("=정상 종료=");

	}

}
