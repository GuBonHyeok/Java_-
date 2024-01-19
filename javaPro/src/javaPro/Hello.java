package javaPro;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		int line;

		Scanner scanner = new Scanner(System.in);
		System.out.print("> 행의 갯수를 입력하세요 : ");
		line = scanner.nextInt();

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line - i - 1; j++) {
				System.out.print("_");
			}
			System.out.print("*");
			for (int k = 0; k < 2*i; k++) {
				System.out.print("*");
			}
			for (int k2 = line ; k2 <i ;k2-- ) {
				System.out.println("_");
			}
			System.out.println();
		}

	}
}

