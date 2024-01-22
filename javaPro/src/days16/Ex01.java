package days16;

import java.util.Arrays;

/**
 * @author Bonggu
 * @date 2024. 1. 22.- 오전 9:43:41
 * @subject 연습문제 5번 - 문자열 알파벳 비교 [1번 풀이]
 * @content    String n = "keNik";   
  String m= "kKnie";   

  위의 두 문자열 n, m 이 알파벳과 알파벳갯수가 똑같은지 비교하는 코딩 
  결과는 같을 경우 true/ 다를 경우 false 로 출력.
  조건) 대소문자는 구분하지 않는다.  
 */
public class Ex01 {

	public static void main(String[] args) {
		String n = "keNik";   
		String m= "kKnie";    

		// 1. n,m 대문자로 변환
		n = n.toUpperCase();
		m = m.toUpperCase();
		// 2. n,m 문자열 오름차순 정렬
		char[] nArr = n.toCharArray(); //문자 배열에 문자열 쪼개서 저장
		Arrays.sort(nArr); //EIKKN
		char[] mArr = m.toCharArray(); //문자 배열에 문자열 쪼개서 저장
		Arrays.sort(mArr); //EIKKN
		// 3. n,m 같은지 비교
		n = String.valueOf(nArr); //문자열로 다시 변환
		m = String.valueOf(mArr); //문자열로 다시 변환
		System.out.println(n.equals(m));

	} //main

} //class
