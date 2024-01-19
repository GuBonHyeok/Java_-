package days03;

/**
 * @author BongGu
 * @date 2024. 1. 3. - 오후 4:50:12
 * @subject 연산자 활용
 * @content 대문자 -> 소문자 변환
 * 					소문자 -> 대문자 변환
 */
public class Ex08 {

	public static void main(String[] args) {
		System.out.printf("%c : (%d)\n", 'A', (int)'A' ); 
		System.out.printf("%c : (%d)\n", 'B', (int)'B' ); 
		System.out.printf("%c : (%d)\n", 'Z', (int)'Z' ); 
		System.out.printf("%c : (%d)\n", 'a', (int)'a' ); 
		System.out.printf("%c : (%d)\n", 'b', (int)'b' ); 
		System.out.printf("%c : (%d)\n", 'z', (int)'z' );
		System.out.printf("%d : (%d)\n", 0, (int)'0' );
		System.out.printf("%d : (%d)\n", 9, (int)'9' );

		

		// 소문자 -32 = 대문자  → 변환 공식
		// 'x' - 32 = 'X'     ※ char - char 연산하면 int 가 되기 때문에 대입하려면 char로 형변환 필요 
		char upperCase = 'X', lowerCase;
		
		lowerCase = (char) (upperCase + 32);
		
		System.out.printf("%c : (%d)\n", upperCase, (int)upperCase );
		System.out.printf("%c : (%d)\n", lowerCase, (int)lowerCase );
		
		// '0' → 48
		// '1' → 49
		// '9' → 57
		
		System.out.println('4' - '2'); // 52 - 50 = 2
	} //main

} //class
