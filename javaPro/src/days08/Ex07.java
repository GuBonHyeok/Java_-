package days08;

/**
 * @author BongGu
 * @date 2024. 1. 10. - 오후 5:09:20
 * @subject 정처기 실기 기출문제 풀이 (2)
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		int money = 125760;
		int count = 0;
		// 화폐단위 : 5만원, 1만원, 5천원, 1천원, 5백원, 1백원, 5십원, 1십원, 5원, 1원
		
	      // 5만원 : 2개
	      count = money/50000;
	      System.out.printf("5만원 : %d개\n", count);
	      money %= 50000; // 남은 돈 : 25760

	      // 1만원 : 2개 
	      count = money/10000;
	      System.out.printf("1만원 : %d개\n", count);
	      money %= 10000; // 남은 돈 : 5760

	      // 5천원 : 1개
	      count = money/5000;
	      System.out.printf("5천원 : %d개\n", count);      
	      money %= 5000; // 남은 돈 : 760

	      // 1천원 : 0개
	      count = money/1000;
	      System.out.printf("1천원 : %d개\n", count);      
	      money %= 1000; // 남은 돈 : 760

	      // 5백원 : 1개
	      count = money/500;
	      System.out.printf("5백원 : %d개\n", count);      
	      money %= 500;  // 남은 돈 : 260

	      // 1백원 : 2개
	      count = money/100;
	      System.out.printf("1백원 : %d개\n", count);      
	      money %= 100;  // 남은 돈 : 60

	      // 5십원 : 1개
	      count = money/50;
	      System.out.printf("5십원 : %d개\n", count);      
	      money %= 50; // 남은 돈 : 10

	      // 1십원 : 1개
	      count = money/10;
	      System.out.printf("1십원 : %d개\n", count);      
	      money %= 10; // 남은 돈 : 0

	      //   5원 : 0개
	      count = money/5;
	      System.out.printf("5원 : %d개\n", count);      
	      money %= 5; // 남은 돈 : 0

	      //   1원 : 0개
	      count = money/1;
	      System.out.printf("1원 : %d개\n", count);      
	      money %= 1; // 남은 돈 : 0

	} //main

} //class
