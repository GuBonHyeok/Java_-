package days04;

import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 4. - 오후 2:21:24
 * @subject 정수(n)를 입력 받아서
 * @content 짝수면 짝수(even number), 홀수면 홀수(odd number) 라고 출력하자
 */
public class Ex05_04 {

	public static void main(String[] args) {
		int n;

		try(Scanner sc = new Scanner(System.in);) {
			System.out.print("> 정수(n) 입력 ? ");
			n = sc.nextInt();
			String result = "홀수";
			if (n % 2 == 0) {
				result = "짝수";
			} 	//if
			System.out.println(result);
		} catch (Exception e) {

		} // try~catch
	} //main

} //class
