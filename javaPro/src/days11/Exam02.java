package days11;

import java.security.PublicKey;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {		
		int year = 2020, month = 5;
		for (int i = 1; month <= 12; i++) {			
			printCalendar(year, month);
		}
		
		
		private static int getLastDay(int year, int month) {
			// Date, Calendar 클래스 - 날짜, 시간 다루는 클래스
			LocalDate d = LocalDate.of(year, month, 1); //Date 클래스와 비슷한 클래스.
			//System.out.println(d.toString()); //2020-05-001
			LocalDate ld = d.withDayOfMonth(d.lengthOfMonth()); //Date 클래스와 비슷한 클래스.
			System.out.println(ld.toString());
			int lastDay = ld.getDayOfMonth();
			return lastDay;
			
			
			return 0;
		} //LastDay

		private static int getDayOfweek(int year, int month, int day) {
			LocalDate d = LocalDate.of(year, month, 1);
			DayOfWeek w = d.getDayOfWeek();
			return w.getValue();

		} //Day
		
		
	}

	private static void printCalendar(int year, int month) {
		
		int lastDay = getLastDay(year, month);
		// TODO Auto-generated method stub
		
	}

	private static int getLastDay(int year, int month) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//총 날짜수를 반환하는 함수를 만든다고 하면?
	private static int getTotalDays(int year, int month, int day) {
		LocalDate startDate = LocalDate.parse("0001-01-01");
		LocalDate endDate = LocalDate.of(year, month, day);
		
		return (int) (startDate.until(endDate, ChronoUnit.DAYS) + 1); //끝나는 날 부터 0001-01-01까지
		
		
	}
}//class