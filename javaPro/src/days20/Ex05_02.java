package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex05_02 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 12; i++) {
			Calendar c = new GregorianCalendar(2024, i-1, 1); 
			System.out.println( c.getActualMaximum(Calendar.DATE));			
		}
		
		/*
		Calendar c = new GregorianCalendar(2024,  1-1, 1);
		System.out.println(Ex04.getFormatDate(c, "yyyy MM dd"));
		System.out.println(c.getActualMaximum(Calendar.DATE)); //가장 큰 숫자 가져오기
		
		c.add(Calendar.DATE, 1); // add(n,m) : n에 m을 더하겠다는 것. 1일 더하기
		System.out.println(Ex04.getFormatDate(c, "yyyy MM dd"));
		c.add(Calendar.DATE, 1); // add(n,m) : n에 m을 더하겠다는 것. 1일 더하기
		System.out.println(Ex04.getFormatDate(c, "yyyy MM dd"));
		c.add(Calendar.MONTH, 1); // add(n,m) : n에 m을 더하겠다는 것. 1달 더하기
		System.out.println(Ex04.getFormatDate(c, "yyyy MM dd"));
		*/
	}

}
