package days06;

import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 8. - 오후 4:01:17
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {

		String name;
		System.out.print("이름을 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine(); // gu bon hyeok 입력
		System.out.printf("name : %s\n", name);
		int arrayLength = name.length();

		char [] nameCharArray = new char[arrayLength];
		for (int i = 0; i < nameCharArray.length; i++) {
			nameCharArray[i] = name.charAt(i);
		} //for1
		// nameCharArray 출력
		for (char c : nameCharArray) {
			System.out.printf(" '%c'\n", c);
		} //for2

	} //main

} //class
