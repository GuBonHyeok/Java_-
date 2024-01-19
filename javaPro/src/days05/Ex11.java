package days05;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// [문제]
		// 두 정수 n,m을 입력받아서
		// 두 정수의 사이의 홀수의 합을 출력
		int n, m;
		int sum=0;

		Scanner scanner = new Scanner(System.in);
		System.out.print(" > n,m 입력 ? ");
		scanner = new Scanner(scanner.next()).useDelimiter(",");
		n = scanner.nextInt();
		m = scanner.nextInt();

		int min = n > m ? m : n;
		int max = n > m ? n : m;
 
		for (int i = min ; i<=max ; i++) {
			if (i %2 != 0) {
				System.out.printf("%d +", i);	
				sum += i;
			}
			
		} // for
		System.out.printf("= %d", sum);

	} //main

} //class
