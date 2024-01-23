package days17;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Bonggu
 * @date 2024. 1. 23.- 오후 4:17:01
 * @subject 개발자가 고의로 예외 발생시키기
 * @content 1. throw 문을 사용해서 예외 발생시킬 수 있다.
 * 					국어점수 입력받아서 반환하는 getScore 메서드 작성
 * 						ㄴ 점수 입력이 잘못된 경우 강제로 예외로 발생시키기
 * 							 !(0 <= score <= 100)  
 */
public class Ex14 {

	public static void main(String[] args) {
		// 함수에서 예외 처리 : try~catch문
		// 호출한 ~~ 에서 예외 처리 : throws 문
		
		try {
			int kor = getScore();
			System.out.println(kor);
		} catch (InputMismatchException e) {
			System.out.println( e );
		} catch (Exception e) {
		}
		//System.out.println(kor); //kor은 현재 try에서 사용중인 지역변수이기 때문에 오류.
		System.out.println("end");
	} //main

	private static int getScore() throws InputMismatchException { 
		Scanner scanner = new Scanner(System.in);
		int score;
		System.out.print("점수 입력 >");
		String input = scanner.next();
		String regex = "100|[1-9]?\\d";
		if (input.matches(regex)) {
			score = Integer.parseInt(input);
			return score;
		} else {
			//강제로 예외 발생시키기
			throw new InputMismatchException("점수 범위를 벗어남 (0~100)");
		} //if
	} //getScore

} //class
