package days06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 8. - 오후 4:01:17
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {

		String name;
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine(); // gu bon hyeok 입력
		System.out.printf("name : %s\n", name);
		// 1) String -> char[] . 스트링을 문자 배열로 변환하는 함수
		// String.toCharArray() 메서드
		char[] nameCharArray = name.toCharArray();

		System.out.println(Arrays.toString(nameCharArray));
		//배열 안의 값을 확인하는 용도의 메서드		
		
		// 2) char[] -> String 으로 변환하는 방법
		// String.valueOf() 메서드
		//name = String.valueOf(nameCharArray);
		System.out.printf("name : %s\n", name);

	} //main

} //class
