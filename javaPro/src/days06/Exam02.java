package days06;

import java.util.Scanner;

public class Exam02 {

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
 
		 for (int i = min + (min / 2) ; i <= max; i += 2) {
	            sum += i;
			
			System.out.printf("%d +", i);	
		} // for
		System.out.printf("= %d", sum);

	}
}