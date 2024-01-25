package days19;

import java.util.StringTokenizer;

/**
 * @author Bonggu
 * @date 2024. 1. 25.- 오후 12:16:33
 * @subject StringTokenizer
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// StringTokenizer 클래스
		// String.split() 와 동일한 기능. 구분자를 가지고 문자열을 자르는 기능
		String s = "구본혁, 권맑음, 김영진, 김진성";
		StringTokenizer st = new StringTokenizer(s, ","); // 정규표현식 대신 ""으로 구분자만 넣어주면 됨
		/*
		System.out.println(st.countTokens()); // 토큰 갯수(콤마로 잘린 것) 몇개인지  int 반환
		System.out.println(st.hasMoreTokens()); // 토큰 더 가지고 있는지 boolean 반환
		System.out.println(st.nextToken()); // 다음 토큰 가져오기
		System.out.println(st.hasMoreTokens()); // 토큰 더 가지고 있는지 boolean 반환
		System.out.println(st.nextToken());  // 다음 토큰 가져오기
		System.out.println(st.hasMoreTokens()); // 토큰 더 가지고 있는지 boolean 반환
		System.out.println(st.nextToken());  // 다음 토큰 가져오기
		*/
		
		while (st.hasMoreTokens()) {
			String name = st.nextToken();
			System.out.println(name.stripLeading());  //  토큰이 있을 때는 계속 토큰 출력 (stripLeading으로 앞 공백 자르고)			
		}

	} //main

} //class
