package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author Bonggu
 * @date 2024. 1. 29.- 오전 11:42:01
 * @subject 
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now(); // 날짜 정보만
		LocalTime t = LocalTime.now(); // 시간 정보만
		LocalDateTime dt = LocalDateTime.now(); //시간 날짜 정보 모두
		
		System.out.println(dt.toLocalDate()); // toLocalDate 쓰면 날짜 정보만 가져올 수 있다.
		
		LocalDate d2 = dt.toLocalDate();
		LocalTime t2 = dt.toLocalTime();
		
		LocalDateTime dt2 = d.atTime(t); // 날짜 > 시간 가져오기??
		LocalDateTime dt3 = t.atDate(d); // 시간 > 날짜 가져오기??
				
	}//main

}//class
