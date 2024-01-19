package days08;

import java.util.Arrays;

/**
 * @author BongGu
 * @date 2024. 1. 10. - 오후 4:17:54
 * @subject 복습 복습 복습!!!!! 각종 메서드들 외우자. 코딩하면서 로직 기르면 된다
 * @content
 */
public class Ex06_03 {

	public static void main(String[] args) {
		String rrn = "950518-1800000";

		String[] rrnArr = rrn.split("-");
		System.out.println(rrnArr[0]); //950518
		System.out.println(rrnArr[1]); //1800000
		System.out.println(rrnArr[1].charAt(0)); //rnnArr의 두번째 인덱스인 1800000에 첫번째 자리인 1이 출력 

		System.out.println(rrnArr[0]+"-"+rrnArr[1].charAt(0)+ "******"); 
		//rrnArr의 첫 번째 인덱스와 두번째 인덱스의 첫번째 자리인 1이 출력되고 나머지는 ******로 채운 출력

		// 주민등록번호를 출력
		// 950518-1******



	} //main

} //class
