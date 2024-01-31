package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		int gameNumber = 1;
		Scanner scanner = new Scanner(System.in);
		ArrayList lottos = new ArrayList();
		HashSet lotto = null;
		
		System.out.print("> 몇 게임 할래 ? ");
		gameNumber = scanner.nextInt();
		
		for (int i = 0; i < gameNumber; i++) {
			lotto = new HashSet();
			fillLotto(lotto);
			lottos.add(lotto);
			
		}
		

	}//main

	private static void fillLotto(HashSet lotto) {
		Random rnd = new Random();
		while( lotto.size() < 6 ) {
		   int n = rnd.nextInt(45)+1;
		   // System.out.println(n);
		   lotto.add(n);
		}
		
	}
}//class
