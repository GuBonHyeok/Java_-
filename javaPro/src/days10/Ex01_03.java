package days10;

import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 11. - 오후 5:28:56
 * @subject
 * @content
 */
public class Ex01_03 {

	public static void main(String[] args) {

		int n = 125;

		int remainder=0, share=0;

		String strHex = "";
		char ch [] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		while ( n != 0 ) {
			share = n / 16;
			remainder = n % 16;
			strHex = ch[remainder] + strHex;
			n = share;
		} //while

		System.out.print( strHex);

		String reverseStrResult = "";
		for (int i = 0; i < strHex.length(); i++) {
			reverseStrResult += strHex.charAt(strHex.length()-1-i);
		}

	}//main

} //class

