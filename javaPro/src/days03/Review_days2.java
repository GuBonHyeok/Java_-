package days03;

import java.util.Scanner;

public class Review_days2 {

	public static void main(String[] args)  {
		int x, y;
		Scanner sc = new Scanner(System.in);
					
		System.out.print("x : ");
		x = sc.nextInt();
		System.out.print("y : ");
		y = sc.nextInt();
		
		int max = ( x > y ? x : y );
		
		System.out.printf("더 큰 값은 : %d ", max);
		

		 
	}

} 