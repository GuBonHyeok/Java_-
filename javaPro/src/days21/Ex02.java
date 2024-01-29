package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author Bonggu
 * @date 2024. 1. 29.- 오전 10:23:23
 * @subject java.time 패키지 핵심 클래스
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// java.time 패키지 핵심 클래스
		// now() 메서드 사용해서 객체 생성
		LocalDate ld = LocalDate.now(); //날짜만 다루는 클래스. 시간 정보는 없다
		System.out.println(ld.toString()); // "2024-01-29"
		
		LocalTime lt = LocalTime.now(); 
		System.out.println(lt);  // 10:26:43.434685100  나노 세컨까지 출력된다.
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); // 2024-01-29T10:27:37.562738100
		
		// of() 메서드. 현재 시스템의 날짜를 가져오는 것이 아니라 내가 원하는 형태의 년, 월, 일 기입 가능
		ld = LocalDate.of(2023, 12, 29);
		System.out.println(ld);
		
		lt = LocalTime.of(3, 20, 11); //24시간 체계
		System.out.println(lt);
		
		ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt);
		

	} //main

} //class
