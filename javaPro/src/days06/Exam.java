package days06;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i <= 9; i++) {
			//System.out.printf("[%d 단을 외자]", i);
			for (int j = 1;j<=9; j++) {
				System.out.printf("%d*%d=%02d ",i,j,i*j);
			} //for i
			System.out.println();

		}

	}
}
