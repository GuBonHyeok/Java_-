package days21;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 * @author Bonggu
 * @date 2024. 1. 29.- 오전 10:34:25
 * @subject LocalDate로 년월일 ~~ 가져오는 작업
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld); // 2024-01-29
		
		//년
		int year=ld.get(ChronoField.YEAR); 
		System.out.println(year); // 2024
		year = ld.getYear();
		System.out.println(year); // 2024
		
		//월
		int month =ld.get(ChronoField.MONTH_OF_YEAR); // 
		System.out.println(month); // 
		
		month = ld.getMonthValue(); //MonthValue 는 int 값 리턴
		System.out.println(month); // 
		
		Month emonth = ld.getMonth();
		System.out.println(month); // 2024		
		
		//일
		int date =ld.get(ChronoField.DAY_OF_MONTH); // 
		System.out.println(date); // 
		
		date = ld.getDayOfMonth(); //
		System.out.println(date); // 

		LocalTime lt = LocalTime.now();
		//시간
		//int hour = ld.get(ChronoField.HOUR_OF_DAY); //시간 정보가 없는 LocalDate가 아니라 LocalTime 을 사용해줘야한다.
		int hour = lt.get(ChronoField.HOUR_OF_DAY);
		System.out.println(hour);
		
		hour = lt.getHour();
		System.out.println(hour);
		//분
		int minute = lt.get(ChronoField.MINUTE_OF_HOUR);
		System.out.println(minute);
		
		minute = lt.getMinute();
		System.out.println(minute);
		
		//초
		int second = lt.get(ChronoField.SECOND_OF_MINUTE);
		System.out.println(second);
		
		second = lt.getSecond();
		System.out.println(second);
		
		//밀리초
		int mSecond = lt.get(ChronoField.MILLI_OF_SECOND);
		System.out.println(mSecond);
		
		mSecond = lt.getNano();
		System.out.println(mSecond);
		
		//요일
		int day = ld.get(ChronoField.DAY_OF_WEEK);		
		System.out.println(day);//		월(1) ~ 일(7)
		//									Date		일(0) ~ 토(6)
		//								Calendar	일(1) ~ 토(7)
		DayOfWeek dow= ld.getDayOfWeek(); // DayOfWeek  :  열거형 타입
		System.out.println(dow); //MONDAY
		System.out.println(dow.getValue()); //MONDAY > 1
	}

}
