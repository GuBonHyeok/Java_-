package days10;

import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 11. - 오후 5:28:56
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {

		int [] binaryArr = new int[32];
		int n;
		int index = binaryArr.length -1;
		int remainder, share;

		Scanner scanner = new Scanner(System.in);
		System.out.print("> 8진수로 변환할 10진수 정수 입력 : ");
		n = scanner.nextInt();

		while ( n != 0 ) {
			share = n / 8;
			remainder = n % 8;
			String strResult= "";

			strResult+= remainder;
			n = share;

			System.out.println( strResult);

			String reverseStrResult = "";
			for (int i = 0; i < strResult.length(); i++) {
				reverseStrResult += strResult.charAt(strResult.length()-1-i);
			}

		}

	}//main


} //class

