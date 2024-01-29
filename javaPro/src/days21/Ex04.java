package days21;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author Bonggu
 * @date 2024. 1. 29.- 오전 11:10:04
 * @subject java.time 패키지의 클래스들 특징
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		//String 은 불변! 새로운 문자열을 생성함
		
		/*
		String a = "xyz";
		//a.replace('y', '와'); 이렇게 한다고 a에 있는 xyz가 바뀌지 않는다.
		String b = a.replace('y', '와');
		System.out.println(b);
		*/
		
		/*
		// java.time 핵심 클래스도 불변 성질 가지고 있음. 대입 연산자를 넣어 새롭게 대입해줘야 함
		LocalDate ld = LocalDate.now();
		System.out.println(ld); //2024-01-29
		
		// 날짜, 시간 수정 - with(), plus(), minus(), roll(), add()
		LocalDate newLd = ld.withYear(2020);
		ld = ld.with(ChronoField.YEAR, 2000);
		
		ld = ld.withMonth(5);
		ld = ld.with(ChronoField.MONTH_OF_YEAR, 10);
		
		ld = ld.withDayOfMonth(15);
		ld = ld.with(ChronoField.DAY_OF_MONTH, 20);
		
		System.out.println(ld);
		*/
		
		/*
		LocalDateTime dt = LocalDateTime.now(); //2024-01-29T11:18:21.198501400
		System.out.println(dt);
		
		dt = dt.plusMonths(1); //1달 더하는 작업
		System.out.println(dt);
		
		dt = dt.minusMonths(3); //3달 빼는 작업
		System.out.println(dt);
		
		dt = dt.plusDays(1); //하루 더하는 작업
		System.out.println(dt);
		*/
		
		LocalTime t = LocalTime.now();
		System.out.println(t); //11:22:24.323158700
		 //  truncated : 끝을 잘라내는 것. 절삭하다. 
		//t = t.truncatedTo(ChronoUnit.HOURS); //11:00. 시간보다 작은 단위는 싹 절삭됨
		t = t.truncatedTo(ChronoUnit.MINUTES); //11:26. 분보다 작은 단위는 싹 절삭됨
		System.out.println(t); // 
		
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		dt = dt.truncatedTo(ChronoUnit.DAYS); //시간, 분, 초 , 나노초 절삭
		System.out.println(dt);
		
		
	}//main

}//class






