package days10;

import java.util.Date;
import java.util.Scanner;

import com.util.MyCalendar;

/**
 * @author BongGu
 * @date 2024. 1. 12. - 오전 11:09:53
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		//달력 만들기!!!!
		//int year, month; //출력할 달력의 연도와 월
		getTotalDays(10, 15, 1);
		/*
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print(" > 년도와 월을 입력 ? ");
			year = sc.nextInt();
			month = sc.nextInt();

			//달력 그리는 함수
			printCalender(year, month);
		} catch (Exception e) {
			e.printStackTrace(); //예외 발생 정보 확인. 해당 코드가 있으면 에러메세지가 출력이 된다.
		}
		 */

	} //main
	// 기본 출력 양식 : 2020 5
	// 요일 체크 : 총 날짜 수 % 7 => 0(일요일) 1(월요일) 2(화요일) ... 6(토요일)
	private static void printCalender(int year, int month) {
		// 1. year, month, 1일이 무슨 요일인지
		/*
		Date d = new Date(year-1900, month-1, 1);
		System.out.println(d.toLocaleString());
		System.out.println("일월화수목금토".charAt(d.getDay()));
		 */
		int dayOfWeek = getDay(year, month, 1); //위의 코드를 직접 만들어보자

		getTotalDays(10, 15, month);

		// 2. year, month 마지막 날짜가 무슨 요일인지


	} //main
	private static int getDay(int year, int month, int day) {
		// 1년 1월 1일 부터 year.month.1 총 날짜수 % 7

		int totalDays = getTotalDays(year,month,day);
		int dayOfWeek = totalDays % 7;
		return dayOfWeek;
	} //getDay
	public static int getTotalDays(int year, int month, int day) {
		// year 2020, month 5, day 1
		// 365* 2019(year-1) + 20년 1(31)+2(29)+3(31)+4(30)+1
		char [] week = {'일','월','화','수','목','금','토'};
		int totalDays; 
		year = 2020;
		month = 5;
		day = 7;

		if (year %4 ==0 && year %100 != 0 || year %400 ==0) totalDays = 366;		
		else 	totalDays = 365;

		totalDays = totalDays*year + month + day;  		
		switch (totalDays % 7) {
		case 0:
			System.out.printf("%d년%d월%d일 : %s요일",year, month, day,week[0]);
			break;
		case 1:
			System.out.printf("%d년%d월%d일 : %s요일",year,month, day, week[1]);
			break;
		case 2:
			System.out.printf("%d년%d월%d일 : %s요일",year, month, day, week[2]);
			break;
		case 3:
			System.out.printf("%d년%d월%d일 : %s요일",year, month, day, week[3]);
			break;
		case 4:
			System.out.printf("%d년%d월%d일 : %s요일",year, month, day, week[4]);
			break;
		case 5:
			System.out.printf("%d년%d월%d일 : %s요일",year, month, day, week[5]);
			break;
		case 6:
			System.out.printf("%d년%d월%d일 : %s요일",year, month, day, week[6]);
			break;
		}

		return totalDays
				;
	}
	//[2]




} //class
