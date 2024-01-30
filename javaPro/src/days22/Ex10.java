package days22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Bonggu
 * @date 2024. 1. 30.- 오후 2:27:53
 * @subject HashSet 활용 로또게임
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		// 로또 게임 횟수를 입력받아서 
		// 로또 번호를 출력하는 코딩
		// days12.Ex06.java 2차원 배열 선언 예시
		int gameNumber = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("> 게임 횟수 입력 :");
		gameNumber = scanner.nextInt();
		
		ArrayList lottos = new ArrayList(); //하나의 로또 번호로 
		HashSet lotto = null; //하나의 로또 번호로 
		for (int i = 0; i < args.length; i++) {
			lotto = new HashSet();
			fillLotto(lotto);
			lottos.add(lotto);
		}
		
		System.out.println("=============");
		dispLottos(lottos);
		
	} //main

	private static void dispLottos(ArrayList lottos) {
		Iterator ir = lottos.iterator(); //반복자 얻어와서
		int cnt = 1; //처음 1게임 
		while (ir.hasNext()) {
			HashSet lotto = (HashSet) ir.next();
			Iterator ir2 = lotto.iterator();
			System.out.printf(" %d 게임", cnt++);
			while (ir2.hasNext()) {
				int n = (int) ir2.next();
				System.out.printf("[%d] ", n);
			}//while
			System.out.println();
			
		}//while
	}//dispLottos

	private static void fillLotto(HashSet lotto) {
		
		Random rnd = new Random();
		while (lotto.size() < 6) {
			int n = rnd.nextInt(45)+1; // 0+1<= x < 45 +1
			// System.out.println(n);
			lotto.add(n);
		}//while
		
	} //fillLotto
	
}//class
