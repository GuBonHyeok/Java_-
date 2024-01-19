package days11;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 15. - 오전 9:01:27
 * @subject
 * @content
 */
public class Exam {

	public static void main(String[] args) {

		int year, month; 
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("> 년도 월 입력 ?");
			year = scanner.nextInt();
			month = scanner.nextInt();

			printCalendar(year, month); 
		} catch (Exception e) {      
			e.printStackTrace(); 
		} //try~catch

	} // main

	private static void printCalendar(int year, int month) {
		int dayOfWeek = getDay(year, month, 1);
		int lastDay = getLastDay(year, month);

		System.out.printf("\t\t\t[%d년 %d월]\n",year, month);
		System.out.println("-".repeat(60));
		String week = "일월화수목금토";
		for (int i = 0; i < week.length(); i++) { 
			System.out.printf("\t%c",week.charAt(i));
		} //for
		System.out.println(); 
		System.out.println("-".repeat(60)); 

		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");			
		} //for
		for (int i = 1; i <= lastDay; i++) {
			System.out.printf("\t%d", i );
			if((i+dayOfWeek)%7==0){ System.out.println(); 
			} //if
		} //for
		System.out.println();
		System.out.println("-".repeat(60)); 

	} // print

	private static int getLastDay(int year, int month) {
		
		int lastDay = 0;
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);
		lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);      
		return lastDay;

	} //LastDay

	private static int getDay(int year, int month, int day) {

		int totalDays = getTotalDays(year, month, day);
		int dayOfWeek = totalDays % 7;
		return dayOfWeek;

	} //Day

	private static int getTotalDays(int year, int month, int day) {
		int totalDays = 0;

		totalDays = (year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;

		for (int i = 1; i < month; i++) {
			totalDays += getLastDay(year, i); 
		} //for
		totalDays++; 
		return totalDays;		
	} //Total
} //class
