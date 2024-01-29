package days20;

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;

/**
 * @author Bonggu
 * @date 2024. 1. 26.- 오후 3:22:44
 * @subject  DecimalFormat
 * @content  숫자 		-> 문자열 format() 변환
 * 					  문자열	-> 숫자		parse() 변환
 * 					 SimpleDateFormat 형식화클래스
 * 					  날짜		-> 문자열 format() 변환 <<<<<
 * 				  	  문자열 	-> 날짜		parse() 변환
 */
public class Ex07 {

	public static void main(String[] args) {
		/* [1]
		Calendar c = Calendar.getInstance();
		String pattern = "yy년 M월 d일 (E요일)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(c.getTime()));
		*/
		
		// [2]
		String strDate = "24년 01월 26일 금"; //날짜 형식을 띈 문자열 생성 
		// 1) Date d 로 만들기
		// 2) Calendar c 로 만들기
		String pattern = "yy년 MM월 d일 E";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			// String -> Date 타입 변환(파싱)
			Date d = sdf.parse(strDate);
			System.out.println(d.toLocaleString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// "24년 1월 26일 (금요일)"

	} //main

} //class
