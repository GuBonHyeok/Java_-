package days17;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Bonggu
 * @date 2024. 1. 23.- 오후 4:17:01
 * @subject throws와 try ~ catch 
 * @content 
 */
public class Ex14_02 {

	public static void main(String[] args) {
		
		//Unchecked 예외 - RuntimeException 상속
		//checked 예외 - Exception 상속
		int kor;
		try {
			kor = getScore();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(kor); //try문에서 예외가 발생하면 초기화가 되지 않기 때문에 빨간 줄이 그어짐.

		System.out.println("end");
	} //main

	private static int getScore() throws IOException { 
		Scanner scanner = new Scanner(System.in);
		int score;
		System.out.print("점수 입력 >");
		String input = scanner.next();
		String regex = "100|[1-9]?\\d";
		if (input.matches(regex)) {
			score = Integer.parseInt(input);
			return score;
		} else {
			throw new IOException("점수 범위를 벗어남 (0~100)");
		} //if
	} //getScore

} //class
