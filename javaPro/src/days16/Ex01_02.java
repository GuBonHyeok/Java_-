package days16;

/**
 * @author Bonggu
 * @date 2024. 1. 22.- 오전 10:14:57
 * @subject 연습문제 5번 - 문자열 알파벳 비교 [2번 풀이]. 그냥 봐두고 알아두기
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		String n = "keNik";   
		String m= "kKnie";
		
		n = n.toUpperCase().chars().sorted()
				.collect(StringBuilder::new
						, StringBuilder::appendCodePoint
						, StringBuilder::append);
		.toString();

	} //main

} //class
