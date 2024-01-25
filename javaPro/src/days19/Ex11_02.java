package days19;

import java.util.Date;

/**
 * @author Bonggu
 * @date 2024. 1. 25.- 오후 4:51:38
 * @subject
 * @content
 */
public class Ex11_02 {

	public static void main(String[] args) {
		// 달력 만들기
		int year = 2010;
		int month =5;
		int date = 1;
		
		// 1) 무슨요일?
		/*
		Date d = new Date();
		d.setYear(year - 1900);
		d.setMonth(month - 1);
		d.setDate(date);
		
		d.setHours(0);
		d.setMinutes(0);
		d.setSeconds(0);
		*/
		//생성자 활용해서 Date 하나에 다 집어넣어서 호출할 수 있다.
		Date d = new Date(year - 1900, month-1, date, 0 , 0, 0);
				
		System.out.println(d.toLocaleString());
		System.out.println(d.getDay());
		
		// 2) 마지막 날짜
		// d == 날짜 : 2010. 5. 1.
		//							+1달
		d.setMonth(d.getMonth()+ 1);
		System.out.println(d.toLocaleString());
		// 				  : 2010. 6. 1.
		d.setDate(d.getDate() -1); // d.setDate(d.getDate() 까지는 6월 1일. 여기서 -1로 하루 더 빼면 5월 31일이 된다.
		System.out.println(d.toLocaleString());
		System.out.println(d.getDate());
		

	}//main
	
}//class
