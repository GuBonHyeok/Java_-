package days20;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Bonggu
 * @date 2024. 1. 26.- 오후 12:20:19
 * @subject days19.Ex11_03  달력 만드는 작업
 * @content
 */
public class Ex05 {


	public static void main(String[] args) {
		int year = 2024;
		int month = 1;

		// int lastDay   = getLastDay(year,  month);
		int dayOfWeek = getDayOfWeek(year, month, 1);

		Calendar start = new GregorianCalendar(year, month-1, 1);
		start.add(Calendar.DATE, -dayOfWeek);

		//System.out.println( Ex04.getFormatDate(start, "yyyy-MM-dd") );

		Calendar today = Calendar.getInstance();
		
		//today 는 지금 이 시점의 시간이라 이렇게 시,분,초,밀리초를 0으로 맞춰줘야 비교하는 start랑 맞춰줘야한다
		today.set(Calendar.HOUR_OF_DAY, 0);
		today.set(Calendar.MINUTE, 0);
		today.set(Calendar.SECOND, 0);
		today.set(Calendar.MILLISECOND, 0);


		for (int i = 0; i < 42; i++) {
			// System.out.println( Ex04.getFormatDate(start, "yyyy-MM-dd") );

			if ( start.get(Calendar.MONTH)+1  == month) {
				if( start.equals(today)) {
					System.out.print("*");
				}
				System.out.printf("[%02d]\t", start.get(Calendar.DATE));
			} else {
				System.out.printf("%02d\t", start.get(Calendar.DATE));
			}

			start.add(Calendar.DATE, 1);
			if( i %  7 == 6 ) System.out.println();
		}//for   	       

	} // main

	private static int getLastDay(int year, int month) {
		Calendar c = new GregorianCalendar(year, month-1, 1); 
		return c.getActualMaximum(Calendar.DATE);
	}

	private static int getDayOfWeek(int year, int month, int date) {      
		Calendar c = new GregorianCalendar(year, month-1, date);
		return c.get(Calendar.DAY_OF_WEEK) - 1; // 0(일)~6(토)
	}

} // class



