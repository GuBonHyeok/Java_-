package days06;

/**
 * @author BongGu
 * @date 2024. 1. 8. - 오전 10:20:49
 * @subject
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		// 입력받은 한 문자가
		// is 붙은 함수는 ~~이니? 아니니? 라고 해서 true false로 리턴
		// Character.isDigit( 8 ) → 숫자인지 아닌지 체크하는 것 (래퍼 클래스)
		// Character.isAlphabetic ( A ) → 한 문자인지 체크하는 것 (한글 '가' 등 1글자) (래퍼 클래스)
		//
		
		char a;
		a = 'a'; // true
		a = 'b'; // true
		a = '3'; // false
		a = '한'; // true
		a = 'ㄱ'; // true
		a = '感'; // true
		a = '$'; // false
		System.out.println( Character.isAlphabetic(a));
		
		
	} //main

} //class
