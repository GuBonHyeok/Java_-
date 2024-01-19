package days12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {

		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print(" > 로또 게임 몇 번 할래 ? ");
		n = scanner.nextInt();

		int [][] lottos = new int[n][6];
		for (int i = 0; i < lottos.length; i++) {
			for (int j = 0; j < lottos[i].length; j++) {
				System.out.printf("lotto%02d=[%02d] ", i, lottos[i][j]);
				if (j % 6 ==5) {
					System.out.println();				
				}				
			}//for j
		}//for i
		fillLotto(lottos, n);
	} //main
	private static void fillLotto(int[][] lottos, int n) {
		Random rd = new Random();
		int lottoNumber = rd.nextInt(45)+1;
		lottos[0][0] = lottoNumber;
		int index = 1;

		OUT :while(index <= 5) { 
			lottoNumber = rd.nextInt(45)+1;
			System.out.println(lottoNumber);
			for (int i = 0; i < index; i++) {
				for (int j = 0; j < lottos.length; j++) {
					if( lottoNumber == lottos[i][j]) {
						continue OUT; 
					}
				}
				lottos[n][index++] = lottoNumber;
				//index++;
			}

		}
	}

}
