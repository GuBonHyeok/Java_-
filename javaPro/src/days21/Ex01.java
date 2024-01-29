package days21;

/**
 * @author Bonggu
 * @date 2024. 1. 29.- 오전 9:51:32
 * @subject jave.time 패키지 
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		/*		[ java.time 패키지 ]
		 *  ㅁ Date , Calendar 클래스에서 부족한 부분을 보완한 기능 제공하는 패키지 (jdk 1.8부터 제공)
		 * 1. java time : 날짜, 시간을 다루는 핵심 클래스 제공
		 * 			ㄴ j.t.chrono 		: 표준 (ISO)이 아닌 달력 시스템을 위한 클래스 제공
		 * 			ㄴ j.t.format		: 형식화(파싱) 클래스 제공
		 * 			ㄴ j.t.temporal	: 날짜와 시간의 필드(field)와 단위(unit) 클래스 제공
		 * 			ㄴ j.t.zone			: 시간대(time - zone) 클래스 제공
		 * 	   1) 날짜 : LocalDate 클래스
		 *    2) 시간 : LocalTime 클래스
		 *    3) 날짜+시간 : LocalDateTime 클래스
		 *    4) 날짜+시간+시간대 :  ZonedDateTime 클래스
		 *    
		 *    		-> temporal, TemporalAdjuster 인터페이스를 구현한 클래스 
		 * 2. Period 클래스		= 날짜와 날짜 사이의 간격을 다루는 클래스
		 * 		Duration 클래스   	= 시간과 시간 사이의 간격
		 * 
		 *			-> temporalAmount 인터페이스 구현한 클래스 
		 * 3. j.t 핵심 클래스는 new 연산자로 객체 생성하지 않는다.
		 * 		객체 생성 방법 1 : .now()
		 * 		객체 생성 방법 2 : .of ()
		 * 4. 날짜+시간의 단위를 정의해 놓은 인터페이스		 	: TemporalUnit
		 * 		TemporalUnit 인터페이스를 구현한 클래스	 	: ChronoUnit
		 * 5. 날짜+시간의 필드를 정의해 놓은 인터페이스			: TemporalField
		 * 		TemporalUnit 인터페이스를 구현한 클래스 		: ChronoField
		 * 6. 특정 필드 (년,월,일,시간,분,초,요일 등등) 가져올 때 사용하는 메서드
		 * 		: get~~~()  ex) get(field)를 하면 특정 필드를 얻어올 수 있다. > getYear()
		 * 7. 특정 필드 수정
		 * 		: with()
		 * 		   plus()
		 *        minus()
		 */

	} //main

}//class
