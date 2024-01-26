package days20;

import java.util.Date;
import java.util.Scanner;

/**
 * @author Bonggu
 * @date 2024. 1. 26.- 오전 9:01:20
 * @subject
 * @content
 */
public class Exam02 {

	public static void main(String[] args) {
		int month;
		Scanner scanner = new Scanner(System.in);
		System.out.print(" > 출력하고 싶은 달의 숫자를하세요 (1~12): ");
		month = (scanner.nextInt() +1);
		
		System.out.println("2005년");
		System.out.printf("%d 월 : %d", month-1, getLastDay(month));
		
	} //main

	private static int getLastDay(int month) {
		Date d = new Date(2005, month-1, 1);
		int last = d.getDate()-1;
		d.setDate(last);
		
		return d.getDate();		
	}//getLastDay

} //class

/*
 * 년도 year를 입력받아서 
    입력받은 년도의 1월~12월 까지의 마지막 날짜를 출력하는 코딩을 하세요. 
    ( 조건 : Date 클래스 사용 )
    ( 조건 : Scanner 클래스 사용 + try~with~resource문 사용)
    
    실행결과 예제)
    2005년 
    
	1월 : 31일
	2월 : 28일
	3월 : 31일
	4월 : 30일
	5월 : 31일
	6월 : 30일
	7월 : 31일
	8월 : 31일
	9월 : 30일
	10월 : 31일
	11월 : 30일
	12월 : 31일
*/
