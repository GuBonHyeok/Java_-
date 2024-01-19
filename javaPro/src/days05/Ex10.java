package days05;

import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 5. - 오후 4:51:42
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		//
		/*
		int sum=0;
		int n ;
		Scanner scanner = new Scanner(System.in);
		System.out.print(" > n 입력 ? ");
		n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			sum += i;
			System.out.printf("%d + ", i);
		}
		System.out.printf("= %d ", sum);
		 */

		// [문제] 두 정수 n, m을 입력받아서
		// 두 정수의 합을 출력하는 코딩

		int n, m;
		int sum=0;

		Scanner scanner = new Scanner(System.in);
		System.out.print(" > n,m 입력 ? ");
		scanner = new Scanner(scanner.next()).useDelimiter(",");
		n = scanner.nextInt();
		m = scanner.nextInt();
		
		/* [1번] - if문 2번 사용해서 큰수, 작은수 순으로 입력받아도 
		if (n > m ) {
			for (int i = m+1;i<n;i++) {
				System.out.printf("%d +", i);
				sum += i;
			}
			System.out.printf("= %d", sum);
			
		}
		
		if (m > n ) {
			for (int i = n+1;i<m;i++) {
				System.out.printf("%d +", i);
				sum += i;
			}
			System.out.printf("= %d", sum);
			
		}
		*/
		/* [2] - if 를 사용해서 변수 추가선언 후 자리바꿈으로 해결
		if ( n > m) {
			int temp = n;
			n = m;
			m = temp;
			
		}
			for (int i = n+1;i<m;i++) {
				System.out.printf("%d +", i);
				sum += i;
			} // for
			System.out.printf("= %d", sum);
			
		}
		*/ 
		// [3] 시험은 이걸로!
		int min = n > m ? m : n;
		int max = n > m ? n : m;
		
		for (int i = min;i<max;i++) {
			System.out.printf("%d +", i);
			sum += i;
		} // for
		System.out.printf("= %d", sum);
		
		// [문제]
		// 두 정수 n,m을 입력받아서
		// 두 정수의 홀수의 합을 출력
		
	} //main

} //class
