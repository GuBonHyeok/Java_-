package days02;

/**
 * @author BongGu
 * @date 2024. 1. 2. - 오후 4:03:38
 * @subject
 * @content 유니코드 변환
 */
public class Ex09 {

	public static void main(String[] args) {
		
		// 10진수 10 -> 2진수 00001010 (1byte)
		//				--> 8진수 00 001 010           : 3자리씩 끊어서 읽기
		//				-->          0    1   2
		//				--> 16진수 0000 1010			: 4자리씩 끊어서 읽기
		//				-->             0      a
		
		short s = 65;
		char c = 'A';
		
		System.out.printf("s : %d\n", s);
		System.out.printf("c : %c\n ", (int)c);
		

		// char(2byte)
		// 2진수로 변환
		// 'A' -> 문자 코드표 -> [] [] [] [] [] [] [] []  [] [] [] [] [] [] [] []
		// 	A  ->      65     ->
		// 	ASCII , 유니코드로 변환 
		char ch = 'A'; // ~'Z'		'a' ~ 'z'
		System.out.printf("%c-%d\n",ch ,(int)ch);
		System.out.printf("%c-%d\n", 'Z', (int)'Z');
		System.out.printf("%c-%d\n", 'a', (int)'a');
		System.out.printf("%c-%d\n", 'z', (int)'z');
		
		
		// 한글은 '가' ~ '힣' 까지 있음
		System.out.printf("%c-%d\n", '가', (int)'가'); //44032
		System.out.printf("%c-%d\n", '힣', (int)'힣'); //55203
		
		char x = '\u0061'; // \u0000는 유니코드 값을 찍겠다는 뜻. 유니코드 상 61의 문자인 'a'가 출력 
		System.out.printf("x : %c\n", x); //소문자 'a'
		// 0xFFFF  -> 16진수 2바이트짜리

	} //main

} //class
