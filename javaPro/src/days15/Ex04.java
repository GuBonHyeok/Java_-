package days15;

import java.util.Date;

import days14.Point;

/**
 * @author Bonggu
 * @date 2024. 1. 19.- 오후 12:03:02
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// 어제 했던 코딩을 생성자를 사용해서 수정
		//클래스 배열 초기화
		/*
		Point [] points = {
				new Point(1, 1),
				new Point(10, 10),
				new Point(20, 20)
		}; 
		*/
		
		int year = 2024;
		int month = 1;
		int day = 19;
		
		//Date, Calendar, LocalDate
		Date d = new Date(year-1900, month-1, day);
		System.out.println(d.toString());
		System.out.println(d.toLocaleString()); //해당 지역에서 사용하는 연/월/일/ 날짜
		System.out.println(d.toGMTString()); //그리니치 표준시로 사용하는 연/월/일/ 날짜
		System.out.println(d.getDay()); //0(일), 1(월), 2(화), 3(수), 4(목) ...

	}//main

}//class
