package days06;

import java.text.StringCharacterIterator;
import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 8. - 오전 10:35:29
 * @subject
 * @content
 */
public class Ex01_03 {

	public static void main(String[] args) {
		//내일 시험 []
		//특수문자 맞는지
		String str = "#@$!";
		char one = '!';
		boolean flag = false;

		for (int i = 0; i < str.length(); i++) {
			System.out.printf("%d - %c \n", i, str.charAt(i));		
			if (one == str.charAt(i)) {
				flag = true;
				break;
			} 

			if (flag) {
				System.out.println("특수문자입니다");				
			} else {
				System.out.println("특수문자가 아닙니다");				
			}



		}


	} //main

} //class
