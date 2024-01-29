package days21;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * @author Bonggu
 * @date 2024. 1. 29.- 오전 11:46:44
 * @subject 날짜 형식의 문자열 String -> LocalDate 클래스 타입으로 변환하자
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// 1) SimpleDateFormat -> parse() 작업해도 되지만
		// 2) LocalDate.parse()로 바꿔보자
		
		String source = "2009년 12월 30일";
		//String source = "2009.12.30";
		//String source = "2009/12/30";
		//String source = "2009-12-30"; //이게 parse 기본 형식.  
		// 날짜 형식의 문자열 String -> LocalDate 클래스 타입으로 변환하자
		
		/*
		// LocalDate d =  LocalDate.parse(source);
		String pattern = "yyyy년 MM월 dd일";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		LocalDate d = LocalDate.parse(source, dtf);
		System.out.println(d);
		*/
		
		/*
		// 이번 달의 마지막 날짜 며칠까지? LocalDate 활용
		 LocalDate d = LocalDate.now();
		 System.out.println(d); // 2024-01-29
		 
		 //1) 1월 1일로 만들자
		 d = d.withDayOfMonth(1);
		 System.out.println(d);//2024-01-01
		 d = d.plusMonths(1);
		 System.out.println(d); //2024-02-01
		 d = d.minusDays(1);
		 System.out.println(d); //2024-01-31
		 System.out.println(d.getDayOfMonth()); //2024-02-01
		 */

		/* [2]
		LocalDate d = LocalDate.now();
		System.out.println(d.lengthOfMonth()); //이번달 길이. 1월은 31일
		d = d.plusMonths(1);
		System.out.println(d.lengthOfMonth()); //2월의 길이. 2월은 29일
		*/
		
		// [3]
		LocalDate d = LocalDate.now();
		LocalDate lastDay = d.with(TemporalAdjusters.lastDayOfMonth()); // 오늘 날자 d. 를 with로 수정할건데 그달의 마지막 날짜로 수정하겠다는 뜻
		//Temporal + Adjuster = 시간 상의 + 조정자
		System.out.println(lastDay);
		
		// [TemporalAdjuster]
		// 날짜, 시간을 수정할 때  with(), plus(), minus()
		// > 다음 달 첫 째주 화요일날 모임     >
		// > 다음 달 마지막 주 토요일날 모임   > 이런건 위 메서드들로 구현하기 힘들다.
		// 근데 TemporalAdjuster를 사용하면 자주 사용하는 날짜 관련된.. 위와 같은 구문들을 사용할 수 있다 
		
	}//main

}//class
