package days17;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Bonggu
 * @date 2024. 1. 23.- 오후 3:46:58
 * @subject 다중 catch문 
 * @content try 구문에서 예외가 발생하면 해당되는 catch문이 동작하고 나머지는 건너뜀.
 */
public class Ex13_02 {

	public static void main(String[] args) {
		int a = 0, b = 0;
		
		Scanner scanner = new Scanner(System.in);
		//예외 처리 방법 중 하나. 
		//try 문에서 예외가 발생하게 되면 try를 더 이상 실행하지 않고 
		//catch 문으로 넘어가서 내부를 실행하고 발생하지 않으면 try 문 실행되고 catch문은 넘어간다					
		
		/* 예외 발생 여부와 상관없이 if문을 항상 체크하기 때문에
		if (b == 0) {
			System.out.println("0으로 나누지 마라");
			return ; //메인함수 빠져나오겠다
		}
		*/
		
		try {
			System.out.print("> a, b 두 정수 입력");
			// 1)InputMismatchException
			a = scanner.nextInt();
			b = scanner.nextInt();		
			
			double c =a / b; // 2)b가 0이라면 ArithmeticException
			System.err.printf("%d / %d = %.2f\n",a,b,c);			
		} catch (InputMismatchException e) { // 1) 예외 발생시
			System.out.println("입력값 유효성 실패.");
		} catch (ArithmeticException e) {  //2) 예외 발생시
			e.printStackTrace(); //에러메세지 출력
		} catch (Exception e) { // 모든 예외가 나올 수 있는 Exception 문
			e.printStackTrace(); //에러메세지 출력
		}
				
		System.out.println("=정상 종료=");

	}//main

}//class
