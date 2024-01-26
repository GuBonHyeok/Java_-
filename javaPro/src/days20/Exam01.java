package days20;

import java.util.Date;

/**
 * @author Bonggu
 * @date 2024. 1. 26.- 오전 8:32:42
 * @subject 복습문제 4번 풀이 [개강일로부터 지난 날짜 출력하기]
 * @content 
 */
public class Exam01 {

	public static void main(String[] args) {
		//[풀이]
		// 4. 개강일(2023.12.29. 09:00:00)로 부터
		//		오늘까지 지난 일수 계산을 하세요
		// [2]
		Date oDate = new Date(2023-1900, 12-1, 29, 9, 0 , 0);
		// 1970.1.1 00:00:00.000
		// > 1703808000000 
		System.out.println(oDate.getTime());

		Date tDate = new Date();	
		// 1706231632671
		System.out.println(tDate.getTime());

		//개강일 - 오늘까지 차이만큼의 밀리세컨
		long diff = tDate.getTime() - oDate.getTime();
		long dayArr[] = new long [4];

		diff = diff%(1000*60*60*24); //일
		System.out.println(diff);
		diff = diff%(1000*60*60);
		System.out.println(diff);
		diff = diff%(1000*60);
		System.out.println(diff);
		diff = diff%(1000);
		System.out.println(diff);


		//System.out.printf("%d일  %d시 %d분 %d초",dayArr[0],dayArr[1],dayArr[2],dayArr[3]);		 


		/*
		System.out.println(diff + "ms");
		System.out.println(diff/1000 + "s");
		System.out.println(diff/(1000*60) + "m");
		System.out.println(diff/(1000*60*60) + "h");
		System.out.println(diff/(1000*60*60*24) + "day");
		 */

	}//main

	// [시험1] 
	// 수료일(D-Day) 까지 남은 시간 출력 메서드 
	private static void d_day() {
		Date endDay = new Date(2024-1900, 6-1, 14, 18,0,0); 
		Date today = new Date();
		long diff =  endDay.getTime() - today.getTime(); 
		long 몫 = diff / (1000*60*60*24);
		System.out.print( 몫 +"d ");
		diff %= (1000*60*60*24); 

		몫 = diff /  (1000*60*60);
		System.out.print( 몫 +"h:");
		diff %= (1000*60*60); 

		몫 = diff /  (1000*60);
		System.out.print( 몫 +"m:");
		diff %= (1000*60); 

		몫 = diff /  (1000);
		System.out.print( 몫 +"s.");
		diff %= (1000); 

		System.out.println( diff +"ms");

		try {
			System.out.println("\n\n\n\n");
			Thread.sleep(10);
			d_day();

		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
	}
}//class