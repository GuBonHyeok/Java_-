package days18;

import java.util.Scanner;

/**
 * @author Bonggu
 * @date 2024. 1. 24.- 오후 4:44:44
 * @subject 
 * @content
 */

/*
문제 설명
길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, 
solution을 완성하세요. 
예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.
입출력 예
n   return
3   "수박수"
4   "수박수박"
 */
public class Ex06_04 {


	public static void main(String[] args) {
		System.out.println(solution(9));
	}//main
	private static String solution(int n) {
		String answer = "";

		StringBuffer stringBuffer = new StringBuffer();

		int num1 = n/2;
		int num2 = n%2;

		for (int i = 0; i < num1; i++) {
			stringBuffer.append("수박");
		}
		if (num2 == 1) stringBuffer.append('수');
		answer = stringBuffer.toString();
		return answer ;
	}




}//class











