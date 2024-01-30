package days20;

import java.util.Date;

import javax.annotation.processing.AbstractProcessor;

/**
 * @author kenik
 * @date 2024. 1. 26. - 오전 7:32:14
 * @subject
 * @content
 * 
 *   1조 : 구본혁(팀장),류영은,윤형준,김영진,강명건,김진성,유진,이동찬
 *   2조 : 원대안(팀장),이동영,한재호,권맑음,박우현,이시은,조연화
 */
public class Ex01 {

	public static void main(String[] args) {
		// [풀이]
		// 4. 개강일(2023.12.29. 9:00:00)로 부터 
		//    오늘까지 지난 일수 계산을 하세요..
		// [2]
		Date o = new Date(2023-1900, 12-1, 29, 9, 0, 0);
		// 1970.1.1  00:00:00.000
		// 1703808000000 ms
		System.out.println( o.getTime() );
		
		Date t = new Date();
		// 1706231614558 ms
		System.out.println( t.getTime() );
		
		long diff = t.getTime() -  o.getTime();
		// 2423667746 지난간 일수X  ,  밀리초
		
		// ??일  ??시간 ?? 분 ?? 초 ??? 밀리초 지났다.
		d_day();
		
		
		/* 
		System.out.println( diff +"ms");
		System.out.println( diff/1000 +"s");
		System.out.println( diff/(1000*60) +"m");
		System.out.println( diff/(1000*60*60) +"h");
		System.out.println( diff/(1000*60*60*24) +"d");
		*/
		// [1]
		/*
		// 총날짜수 메서드 		
		// 738855
		System.out.println( days10.Ex02.getTotalDays(2023, 12,  29) );
		// 738886
		System.out.println( days10.Ex02.getTotalDays(2024, 1,  26) );		
		System.out.println(  738886 - 738855 );
		*/
		
	} // main
	
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

} // class


















// https://github.com/petercai/UMLMark-release/raw/main/release
//  - JRE 17 종속됨.
