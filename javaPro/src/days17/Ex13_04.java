package days17;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Bonggu
 * @date 2024. 1. 23.- 오후 3:46:58
 * @subject 중첩 try ~ catch문 설명. (try ~ catch 문 안의 try ~ catch문)
 * @content
 */
public class Ex13_04 {

	public static void main(String[] args) {
		int a = 0, b = 0;
		
		Scanner scanner = new Scanner(System.in);
				
		try {
			System.out.print("> a, b 두 정수 입력");
			// 1)InputMismatchException
			a = scanner.nextInt();
			b = scanner.nextInt();		
		
			try { // [중첩 try ~ catch문]
				double c =a / b; 
				System.err.printf("%d / %d = %.2f\n",a,b,c);					
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//
			//
			
		} catch (InputMismatchException e) {
			System.out.println("[1]\n"+ e.toString());		
			System.out.println("[2]\n"+ e.getMessage());		
		} catch (Exception e) { // 모든 예외가 나올 수 있는 Exception 문
			e.printStackTrace(); //에러메세지 출력
		} finally { // 예외의 발생 유무에 상관없이 처리할 구문
						 // 파일, DB를 열어서 사용 -> 파일 close 작업 꼭 해줘야함
						 // finally 구문 안에도 try~catch 문이 올 수 있음
		}
				
		System.out.println("=정상 종료=");

	}//main

}//class
