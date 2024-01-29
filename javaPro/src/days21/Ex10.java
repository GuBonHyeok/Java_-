package days21;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Bonggu
 * @date 2024. 1. 29.- 오후 2:01:17
 * @subject DateTimeFormatter 날짜 형식 클래스 
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		// DateTimeFormatter 형식화 클래스
		// 날짜 형식 문자열 -> 파싱 -> 핵심클래스 변환
		//[2]
		String source = "2023년 8월 10일 (목)"; //파싱
		String pattern = "yyyy년 MM월 dd일 (E)"; //파싱
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		LocalDate d = LocalDate.parse(source, formatter); //source를 변경하기 위해 formatter 객체를 넘겨받는다
		System.out.println(d);

		//					   <- 포맷 <-
		/* [1]
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

		String pattern = "yyyy/MM/dd (E) hh:mm:ss.SSS "; //dt를 이 형태로 출력하기 위해 패턴을 만들어줌
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern); //pattern의 형태를 띈 dtf 만들기
		System.out.println(dtf.format(dt));

		 */


	} //main

} //class
