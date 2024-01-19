package days05;

/**
 * @author BongGu
 * @date 2024. 1. 5. - 오후 12:36:46
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		String todo = "Auto-generated method stub";
		// 1.문자열 길이		todo.length() - 문자열 길이 가져오는 메서드. 여기서 todo는 String 자료형의 변수
		// char String
		// 괄호 있는 것 : 메서드. 	ex) String.charAt(), String.valueOf() 등등등 
		// 괄호 없는 것 : 속성.   	
		// char

		/*
		int strLength = todo.length();
		char one;
		for (int i =0; i <strLength; i++) {
			one = todo.charAt(i);
			System.out.printf("%d - '%c'\n", i, one);

		}
		 */
		int strLength = todo.length(); //문자열 todo의 길이와 같은 크기의 정수 strLength에 입력
		char one;
		char [] todoArray = new char[strLength]; 
		//strLength → str의 길이만큼 배열 크기를 갖는 todoArray 배열 초기화 (배열 생성 + 배열 초기화 = 배열 초기화)

		for (int i = 0 ; i <  strLength ; i++){
			todoArray[i] = one = todo.charAt(i); // todoArray의 각 배열에 문자열 todo의 문자를 각각 입력한다 
			// todoArray			: 0	1	2	3	4	5	6	7	8	...
			// toto.charAt(i) 	: A	u	t	o	-	g	e	n	e	...
			System.out.printf("%d - '%c'\n", i, todo.charAt(i));
		} // for



	} //main

} //class
