package days19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Bonggu
 * @date 2024. 1. 25.- 오후 4:21:55
 * @subject
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) {
		String source = "HP:010-1234-5678, HOME:02-9999-0099";
		String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})"; //여기서 각 괄호의 순번이 ,m.group(n) 의 n이다.
		
		Pattern p = Pattern.compile(pattern); //패턴 분석하는 객체 p 생성
		Matcher m = p.matcher(source); //일치하는 문자를 찾아내는 작업
		
		//m.find(); //문자열에서 패턴과 일치하는 것을 찾아오겠다는 것
		int no = 0;
		while (m.find()) {
			System.out.printf("%d : %s\t %s-%s-%s \n", ++no,m.group(),m.group(1)
					,m.group(2),m.group(3)); // ,m.group(n) : 위 pattern의 괄호 순번
		}
		
		

	}//main

}//class
