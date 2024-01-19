package days08;

import java.util.Arrays;

/**
 * @author BongGu
 * @date 2024. 1. 10. - 오후 4:17:54
 * @subject 주민번호 별 찍기 (substring / concat)
 * @content
 */
public class Ex06_04 {

	public static void main(String[] args) {
		String rrn = "830412-1800000";
		
		//String printRRN = rrn.substring(0,8) + "******";
		System.out.println("실행결과 : " +rrn.substring(0,8).concat("*****1"));

	} //main

} //class
