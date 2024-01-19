package days06;

import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 8. - 오후 3:39:04
 * @subject 두 숫자 사이 짝수의 합 구하기
 * @content
 */
public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int n, m;
		int sum=0;

		Scanner scanner = new Scanner(System.in);
		System.out.print(" > n,m 입력 ? ");
		scanner = new Scanner(scanner.next()).useDelimiter(",");
		n = scanner.nextInt();
		m = scanner.nextInt();

		int min = n > m ? m : n;
		int max = n > m ? n : m;

		/*

		 for (int i = min + (min / 2) ; i <= max; i += 2) {
		           sum += i;

			System.out.printf("%d +", i);	
		} // for
		System.out.printf("= %d", sum);
		 */

		/*
		int x, y, sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 x 입력 : ");
		x = scanner.nextInt();
		System.out.print("숫자 x 입력 : ");

		y = scanner.nextInt();

		int max = Math.max(x, y);
		int min = Math.min(x, y);

		for (int i = min; i <= max ; i++) {
							sum += i;
				System.out.printf("%d + " , i);



		}
		System.out.printf("= %d", sum);
		 */
		if (min % 2 !=0) min++;
		for (int i = min; i <= max ; i++) {
			sum += i;
			System.out.printf("%d + " , i);

		}
		System.out.printf("= %d", sum);

	} //main

} //class
