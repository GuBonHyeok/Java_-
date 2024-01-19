package days05;

/**
 * @author BongGu
 * @date 2024. 1. 5. - 오후 2:00:17
 * @subject ASCII 256가지 출력
 * @content
 * 
 * 					0~31 		: 제어문자
 * 					32~127		: 일반 문자(숫자,알파벳 대소문자 등)
 * 					128~		: ~사선 문자 등등..
 * 					문제1)	 한 라인에 10개씩 출력
 */
public class Ex06 {

	public static void main(String[] args) {
		
	      //ASCII  10번 값 :   개행    LineFeed(LF)         '\n'
	      //ASCII  13번 값 :   개행    CarrageReturn(CR)    '\r'

		for (int i = 0; i < 256; i++) {
			//System.out.printf("%d-%c\n",i, i);
			//0 ~ 9 출력
			//\n
			//10~19 출력
			System.out.printf("[%c]",(char) i);
			if (i % 10 == 9) { //0~9이기 때문에 
				System.out.println();
			}

		} // for
	
	} //main

} //class

/*ㅇㅇ
 * 
 */

