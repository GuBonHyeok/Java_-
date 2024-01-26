package days19;

import java.util.Date;

/**
 * @author Bonggu
 * @date 2024. 1. 25.- 오후 5:13:13
 * @subject 달력 그리는 함수 [시험2]
 * @content 사용클래스 : getLastDay
 */
public class Ex11_03 {

	public static void main(String[] args) {
		int year = 2023;
		int month = 8;
		
		int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year, month, 1);
		
		Date start = new Date(year - 1900, month-1, 1); //2023. 8. 1.
		start.setDate(start.getDate() -dayOfWeek);
		
		for (int i = 0; i < 35; i++) { //왜 42개? > 1주일 7일을 6주치를 찍으려고 하기 때문에
			if (start.getMonth() == month-1) {
				System.out.printf("[%02d]\t", start.getDate());
			} else {
				System.out.printf("%02d\t", start.getDate());
			}
			start.setDate(start.getDate() +1);
			if (i % 7 == 6) {
				System.out.println();				
			}//if
		}//for
		

	}//main
	private static int getLastDay(int year, int month) {
	      Date d = new Date(year -1900, month , 1 );
	      int date = d.getDate() - 1;
	      d.setDate(date);
	      return d.getDate();
	   }

	   private static int getDayOfWeek(int year, int month, int date) {
	      Date d = new Date(year -1900, month - 1, date );  
	      return d.getDay(); // 0(일)~6(토)
	   }

}//class







