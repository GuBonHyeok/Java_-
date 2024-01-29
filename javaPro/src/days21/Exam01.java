package days21;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Bonggu
 * @date 2024. 1. 29.- 오전 8:44:51
 * @subject
 * @content
 */
public class Exam01 {
	public static void main(String[] args) throws ParseException {
		Date today = new Date();
		Date endDay = new Date(2024-1900, 6, 14, 0,0,0);			
				
		long diff = endDay.getTime() - today.getTime();			
		long days = diff / (1000*60*60*24);
				
		System.out.print( days +"일");
		diff %= (1000*60*60*24); 

		days = diff /  (1000*60*60);
		System.out.print( days +"시간");
		diff %= (1000*60*60); 

		days = diff /  (1000*60);
		System.out.print( days +"분");
		diff %= (1000*60); 

		days = diff /  (1000);
		System.out.print( days +"초");
		diff %= (1000); 

		System.out.println( diff +"밀리초");

	} //main

} //class
