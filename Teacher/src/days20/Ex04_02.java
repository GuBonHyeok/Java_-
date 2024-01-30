package days20;

import java.util.Calendar;
import java.util.Date;

/**
 * @author kenik
 * @date 2024. 1. 26. - 오전 11:43:19
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// Calendar - getTime(), setTime() 메서드 
		
		// 1. Calendar -> Date 변환 O
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		
		// 12:01 수업 시작~~
		// 2. Date -> Calendar 변환
		Date n = new Date();
		c.setTime(n);

	} // main

} // class
