package days04;

/**
 * @author BongGu
 * @date 2024. 1. 4. - 오후 4:23:08
 * @subject		for 문 예제
 * @content		
 */
public class Ex06_03 {

	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i<=10 ; i++ ) {
			sum += i;
			System.out.printf("%d+", i);
			
		} 
		System.out.printf("=%d", sum); //Unreachable code. 조건식 빼면 이 문장에 도달할 수 없음.
	} //main

} //class
