package days20;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * @author Bonggu
 * @date 2024. 1. 26.- 오후 3:12:10
 * @subject DecimalFormat  추가 예제
 * @content String > double로 바꾸기
 */
public class Ex06_02 {

	public static void main(String[] args) {
		String strMoney = "3,257,600.80";
		double money;

		// [2] DecimalFormat 형식화 클래스
		//					ㄴ format()
		//					ㄴ parse() 파싱
		String pattern = "#,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		try { //파싱이 주어진 형태가 되지 않으면 예외처리를 해줘야하기 때문에 try-catch 문
			Number n = df.parse(strMoney);
			// Number -> int, double 등 기본형 타입으로 전환하는 작업
			money =  n.doubleValue();
			System.out.println(money);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		/* [1] 
		strMoney = strMoney.replace("," , " "); //,를 빈 문자열로 바꾸기
		money = Double.parseDouble(strMoney);
		System.out.println(money);
		 */



	} //main

} //class
