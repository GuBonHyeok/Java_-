package days19;

import java.util.Date;
import java.util.Scanner;

/**
 * @author Bonggu
 * @date 2024. 1. 26.- 오전 9:28:45
 * @subject
 * @content
 */
public class Exam03 {

	public static void main(String[] args) {
		int month;
		Scanner scanner = new Scanner(System.in);
		System.out.print(" > 출력하고 싶은 달의 숫자를하세요 (1~12): ");
		month = (scanner.nextInt());

		System.out.println("2005년");
		System.out.printf("%d 월 : %d", month, getLastDay(month));

	} //main

	private static int getLastDay(int month) {
		Date d = new Date(2005, month, 1);
		int last = d.getDate()-1;
		d.setDate(last);

		return d.getDate();		
	}//getLastDay

}//class
