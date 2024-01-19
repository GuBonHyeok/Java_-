package days09;

import java.util.Random;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {

		int [] numArr = new int[32];
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
		}

		Scanner scanner = new Scanner(System.in);
		System.out.print(" > 정수 입력 : ");
		int num = scanner.nextInt();

		numArr[0] = num;
		System.out.printf("%032d", numArr[0]);



		//String numBinary = Integer.toBinaryString(num);
		//String num1 = numBinary.substring(0,4);
		

	} // main

} //class