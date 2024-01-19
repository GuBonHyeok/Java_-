package days10;

/**
 * @author BongGu
 * @date 2024. 1. 12. - 오전 10:44:23
 * @subject
 * @content
 */
public class Ex01_02_02 {

	public static void main(String[] args) {

		int n = 125;

		int remainder=0, share=0;

		//String strHex = "";
		StringBuilder sb = new StringBuilder();
		
		String hex = "0123456789ABCDEF";
		while ( n != 0 ) {
			share = n / 16;
			remainder = n % 16;
			
			sb.append(hex.charAt(remainder)); //검색 필요

			n = share;
		} //while
		System.out.println(sb.reverse()); //문자열을 뒤집어줌
	
	}//main

}//class
