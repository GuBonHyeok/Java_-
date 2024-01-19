package days06;

import java.text.StringCharacterIterator;
import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 8. - 오전 10:35:29
 * @subject
 * @content
 */
public class Ex01_04 {

	public static void main(String[] args) {
		// 특수문자가 맞는지 체크하는 코드. 정규식을 만들어주는 [ ] 
		char one = '#';
		String str = "[#@!$]";

		String regex = "[#@!$]";
		// 알파벳을 하고싶으면 [A-Z] 쓰거나 [A-Za-z]
		// 숫자를 하고싶으면 [0-9] 하면 됨. [0123456789] 쓰는 거랑 동일
		
		if ((one+"").matches(regex)) {
			System.out.println("특수문자 O");
		} else {
			System.out.println("특수문자 X");
		}



	} //main

} //class
