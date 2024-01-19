package days03;

/**
 * @author BongGu
 * @date 2024. 1. 3. - 오후 3:50:24
 * @subject 증감연산자 ++  --
 * @content 복합대입연산자 += -=
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// 증감연산자 ++ --
		// ++변수 ↔ 변수++ 차이는
		// 
		
		int x = 10;
		//int y = x++;
		//int y = ++x;
		
		// int y = x++; 	// 후위형 증감연산자. 대입 연산자를 먼저 실행시킴
		int y = ++x; 		// 전위형 증감연산자. 
		// int y = ++x + x++;
		System.out.printf("> x = %d, y = %d\n", x, y);
		
		int n = 100;
		//System.out.println(n++ == 100); 후위 증감 연산자는 나중에 실행된다.
		System.out.println(++n == 100);
		
		// 증감연산자 우선순위 검색, 학습

	} //main

} //class
