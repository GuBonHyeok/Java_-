package days03;

/**
 * @author BongGu
 * @date 2024. 1. 3. - 오후 5:11:42
 * @subject  
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {

		//float pi = 3.141592; //Type mismatch: cannot convert from double to float
		float pi = 3.141592f; //혹은 (float)3.141592;

		//소수점 4번째 자리에서 반올림한 실수 값을 얻어오고 싶다
		// → 3.142
		
		// 2번 풀이
		int i_pi = (int) (pi * 1000 + 0.5); //3141.592 + 0.5 = 3142.092
		System.out.println((float)i_pi / 1000); // 3.142
		
		// 1번 풀이
		System.out.printf("%f\n", pi);
		System.out.printf("%.3f\n", pi);
 
		/*
		 *3번 풀이
		String s_pi = String.format("%.3f", pi); // String.format 으로 원하는 것으로 형 변환
		// String -byte, int ,double, float
		float pi4 = Float.parseFloat(s_pi); //pi4 선언해서 parse한 s_pi 저장
		System.out.println(pi4); //
		*/


	} //main

} //class
