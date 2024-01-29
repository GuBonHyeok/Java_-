package days21;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 * @author Bonggu
 * @date 2024. 1. 29.- 오후 12:33:02
 * @subject 날짜와 나ㅓ
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// 날짜와 날짜 사이의 간격 = period
		// 시간과 시간 사이의 간격 = Duration
		// 문제 ) 수료일 - 오늘 날짜 까지 날짜 간격?
		/*
		LocalDate endDay = LocalDate.of(2024, 6, 14);
		LocalDate today = LocalDate.now();
		
		// 4개월 16일
		Period p = Period.between(today, endDay); //today는 포함, endDay 앞까지
		System.out.println(p.getYears());
		System.out.println(p.getMonths());
		System.out.println(p.getDays());
		*/
		
		//시간 차이 : Duration
		LocalTime e = LocalTime.of(18, 0); //집 가는 시간 18시 00분
		System.out.println(e);
		LocalTime t = LocalTime.now();
		Duration d = Duration.between(t, e);
		System.out.println(d.getSeconds());
		System.out.println(d.getSeconds()/60); //분
		System.out.println(d.getSeconds()/60/60); //시간
		
		
		
	}

}
