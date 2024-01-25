package days19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Bonggu
 * @date 2024. 1. 25.- 오후 3:46:20
 * @subject 자바의 정규표현식 (Regular Expression) , regex
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		// 정규표현식? == 정규식
		// - 문자열 속에 원하는 조건(패턴)과 일치하는 문자열을 찾아내기 위해서 사용된다.
		// - 미리 정의된 기호
		// - java.util.regex 패키지 안에 2개의 클래스가 존재함
		//	  1) Pattern 클래스  - 패턴을 정의
		//   2) Matcher 클래스 - 일치하는지 여부 확인
		String [] data = {"bat","baby","bonus","cA","ca","co", "c.", "c0", "car"
				, "combat", "count", "date", "disc", "fx"};
		// 1) c 로 시작하는 모든 문자(data)를 출력하고싶다 ?
		for (int i = 0; i < data.length; i++) {
			if(data[i].startsWith("c")) {
				System.out.println(data[i]);
			} //if
		}//for
		/*
		String regex = "c.*"; // c.* : c로 시작하고, 그 뒤로는 어떤 문자가 와도 상관없다.
		for (int i = 0; i < data.length; i++) {
			if(data[i].matches(regex)) {//정규표현식과 일치하는지 확인하는 작업
			
			}
		}
		*/
		/*
		String regex = "c.*"; //c로 시작하고 아무 문자
		regex = "c[a-zA-Z]*"; //c로 시작하고 다음은 알파벳 0개 혹은 여러개가 와야한다
		regex = "c[a-zA-Z0-9]*"; //c로 시작하고 다음은 알파벳 0개 혹은 여러개, 숫자가 와야한다
		regex = "c\\w*"; //c로 시작하고 다음은 알파벳 0개 혹은 여러개, 숫자가 와야한다. \\w == [a-zA-Z0-9] 위 기호와 동일한 것
		regex = "c."; //c다음 어떤 문자가 오든 상관 X
		regex = "c\\."; //c다음 .이 오는 것
		regex = "c[0-9]"; //c다음 숫자가 와야함
		regex = "c\\d"; //c다음 숫자가 와야함. 위 기호와 ㄷㅇ일
		regex = "c.*"; //c로 시작하고 t로 끝나되 그 사이에는 어떤 문자든 상광없다
		regex = "c.[^0-9]"; //c로 시작하고 두번째는 두번째는 숫자가 오면 안된다는 부정의 '^'
		regex = "c.\\D"; //c로 시작하고 두번째는 두번째는 숫자가 오면 안된다. 위 코딩과 동일함 [^0-9] == \\d
		regex = "(b|c).{2}"; //첫번째는 b 혹은 c, 그 뒤는 아무문자나 상관없는데 2개가 와야함 (총 길이 3)
		regex = "[bc].{2}"; //첫번째는 b 혹은 c, 그 뒤는 아무문자나 상관없는데 2개가 와야함 (총 길이 3)
		regex = "[bcd].{2,3}"; //첫번째는 b 혹은 c혹은 d, 그 뒤는 아무문자나 상관없는데 2개나 3개가 와야함 (총 길이 3 or 4 )
		regex = "[b-d].{2,3}"; //첫번째는 b 혹은 c혹은 d, 그 뒤는 아무문자나 상관없는데 2개나 3개가 와야함 (총 길이 3 or 4 ) 위와 같음 
		//  b,c,d 문자는 제외한 알파벳 대소문자
		regex = "[A-Za-z&&[^b-d]].*"; //b,c,d 문자는 제외한 알파벳 대소문자가 오고, 아무 문자 상관없이 0개 이상
		regex = "[A-Za-z&&[^b-d]].+"; //b,c,d 문자는 제외한 알파벳 대소문자가 오고, 아무 문자 상관없이 1개 이상
		regex = "[A-Za-z&&[^b-d]].?"; //b,c,d 문자는 제외한 알파벳 대소문자가 오고, 아무 문자 상관없이 0개~1개
		*/
		
		Pattern p = Pattern.compile(regex); //Pattern 은 객체 생성할 수 없음.
		for (int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]); //체크하고자 하는 문자열
			if (m.matches()) {
				System.out.println(data[i]);				
			} //if
		}//for
		

	}//main

}//class









