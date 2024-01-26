package days20;

import java.time.chrono.ThaiBuddhistDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Bonggu
 * @date 2024. 1. 26.- 오전 11:03:02
 * @subject Calendar 클래스
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// jdk 1.1 Calendar 추상클래스 - 날짜, 시간. 추상클래스이므로 new 연산자로 객체를 만들 수 없음
		Calendar c =  Calendar.getInstance(); //getInstance로 객체를 받아가서 넣어야 쓸 수 있음
		// 		  ㄴ new GregorianCalendar(); 캘린더의 추상클래스를 받아가서 구현한 클래스
		// System.out.println(c.toString());
		
		//2024년도의 며 칠째?
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		//해당 주의 며 칠째?
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		//년 중의 몇 번째 주?
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
		//달 중의 몇 주
		System.out.println(c.get(Calendar.WEEK_OF_MONTH));
		
		//년
		System.out.println(c.get(1)); //2024
		System.out.println(c.get(Calendar.YEAR)); //2024
		//월
		System.out.println(c.get(2)); //0
		System.out.println(c.get(Calendar.MONTH)); //0
		//일
		System.out.println(c.get(5)); //26
		System.out.println(c.get(Calendar.DATE)); //26
		//시간
		System.out.println(c.get(11)); //시간
		System.out.println(c.get(Calendar.HOUR)); //시간. AM. PM 기준
		System.out.println(c.get(Calendar.HOUR_OF_DAY)); //시간. 24시간 기준.
		//분
		System.out.println(c.get(12)); //분
		System.out.println(c.get(Calendar.MINUTE)); //분
		//초
		System.out.println(c.get(13)); //분
		System.out.println(c.get(Calendar.SECOND)); //초
		//밀리초
		System.out.println(c.get(14)); //분
		System.out.println(c.get(Calendar.MINUTE)); //밀리
		//요일
		System.out.println(c.get(7)); //요일
		System.out.println(c.get(Calendar.MINUTE)); //요일. 1이 일요일 2가 월요일

		System.out.println(c.get(Calendar.AM));
		System.out.println(c.get(Calendar.AM_PM));
		System.out.println(c.get(Calendar.PM));
	}

}
