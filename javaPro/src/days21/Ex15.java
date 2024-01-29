package days21;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Bonggu
 * @date 2024. 1. 29.- 오후 4:36:27
 * @subject 문자열 자르기 ( ArrayList -> String으로 변환 작업.)
 * @content
 */
public class Ex15 {

	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		String [] answer = solution(my_str, n);

		System.out.println(Arrays.toString(answer));


	} //main
	public static String[] solution(String my_str, int n) {
		String[] answer = {};
		ArrayList list = new ArrayList();

		StringBuilder sb = new StringBuilder(my_str);
		try {
			while (true) {
				list.add(sb.substring(0,n)); 
				sb.delete(0, n);
			}//while

		} catch (Exception e) {
			list.add(sb.substring(0));
		}//try~catch
		
		//ArrayList -> String으로 변환 작업. 외워두면 좋을 듯
		//String -> ArrayList로도 바꾸는 방법 알아두면 좋을 듯 (때때로 씀)
		list.forEach(name -> System.out.println(name));
		
		// JAVA 8 Stream 사용 예제
		// answer = (String[]) list.stream().toArray(String[] :: new);		
		
		answer = (String[]) list.toArray(new String[0]);

		return answer;
	}

} //class
