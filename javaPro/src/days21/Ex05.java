package days21;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * @author Bonggu
 * @date 2024. 1. 29.- 오전 11:27:30
 * @subject 날짜, 시간의 비교. isAfter, isBefore, equals
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		//	날짜, 시간의 비교 isAfter(), isBefore(), isEqual()
		// 홍길동의 생일 : 1999. 1. 20. 
		// 올해 홍길동 생일이 지났는지? 지나지 않았는지? 오늘인지 체크.
		LocalDate birth = LocalDate.of(1999,1,20);
		LocalDate today = LocalDate.now();
		System.out.println(birth);
		System.out.println(today);
		
		
		if (birth.equals(today)) {
			System.out.println("오늘은 홍길동님의 생일입니다.");			
		}	else if (birth.isAfter(today)) {
			System.out.println("오늘은 홍길동님의 생일이 지나기 전 입니다.");
		}	else if (birth.isBefore(today)) {
			System.out.println("오늘은 홍길동님의 생일이 지난 후 입니다.");
		}
		
		System.out.println(birth.compareTo(today));


	}//main

}//class
