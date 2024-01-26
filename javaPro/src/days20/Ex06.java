package days20;

import java.text.DecimalFormat;

/**
 * @author Bonggu
 * @date 2024. 1. 26.- 오후 2:25:58
 * @subject 형식화 클래스 4가지 - 전부 Format으로 끝난다
 * @content 1. SimpleDateFormat ***
 * 					2. DecimalFormat <<<<
 * 					3. ChoiceFormat
 * 					4. MessageFormat
 */
public class Ex06 {

	public static void main(String[] args) {
		// 3257600 > 3,257,600 으로 만들자
		
		//DecimalFormat
		//숫자를 형식화하는 클래스
		//int money = 3257600;
		double money = 3257600.8;
		
		// [3] 3번 풀이 : DecimalFormat 숫자의 형식화 클래스
		//String pattern = "\u00A4#,###"; //\u00A4 : 원화 
		String pattern = "#,###.00"; //\u00A4 : 원화 
		DecimalFormat df = new DecimalFormat(pattern);
		String result =df.format(money); 
		System.out.println(result);
		
		
		
		// [2] 2 번 풀이 : "%,d"
		/*
		String result = String.format("%,d", money);
		System.out.println(result);
		*/
		
		/* [1] 1 번 풀이...
		String result = "";
		String strMoney = money + "";
		for (int i = 0 ; i < strMoney.length(); i++) {
			char one = strMoney.charAt(i);
			int placeValue = strMoney.length() - i;
			//System.out.print(one + " " + placeValue);
			result += one;
			if (placeValue % 3 ==1) {//System.out.println(",");				
			result +=",";
			}	
		}
		//System.out.println(result);
		System.out.println(result.substring(0, result.length() -1));
		*/
		




	} //main

} //class
