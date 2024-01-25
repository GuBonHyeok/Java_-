package days19;

import java.util.Date;

/**
 * @author Bonggu
 * @date 2024. 1. 25.- 오후 4:31:10
 * @subject 날짜, 시간, 형식화 (formatting 클래스)
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		/*
		 * 1. 날짜, 시간, 형식화 (formatting 클래스)
		 * 2. 컬렉션 프레임워크 (컬렉션 클래스)
		 * 3. 자바 IO (입출력)
		 * 4. 열거형, 제네릭
		 * 
		 *  - 스레드, 네트워크, 람다+스트림은 하지 않을 것임.
		 */
		
		// jdk 1.0			java.util.Date
		// jdk 1.1			java.util.Calendar
		//								ㄴ Gre 
		// jdk 1.8			java.time 패키지 + 하위패키지
		
		Date d = new Date(); //java.util 선택!!!! java.sql 아님!!!!!!!!
		System.out.println(d.toString());
		System.out.println(d); //toString과 같은 명령이 됨
		System.out.println(d.toGMTString());
		// 2024. 1. 25. 오후 4:41:09
		System.out.println(d.toLocaleString());
		
		//년
		System.out.println(d.getYear() + 1900); // 1900 더해줘야 제대로 나온다
		//월
		System.out.println(d.getMonth() + 1); //1 더해줘야 제대로 나온다
		//일
		System.out.println(d.getDate());
		//시
		System.out.println(d.getHours());
		//분
		System.out.println(d.getMinutes());
		//초
		System.out.println(d.getSeconds());
		//요일
		System.out.println("일월화수목금토".charAt(d.getDay())); // 0 : 일요일, 6 : 토요일
		
		//long d.getTime()
		// 1970.1.1-00.00.00.000~
		System.out.println(d.getTime());		
		long time = d.getTime();
		
		Date d2 = new Date(time);
		System.out.println(d2.toLocaleString());
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
