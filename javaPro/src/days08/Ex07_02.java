package days08;

/**
 * @author BongGu
 * @date 2024. 1. 10. - 오후 5:23:33
 * @subject 정처기 기출 풀이 (2)
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		int money = 125760;
		int count = 0;
		// 화폐단위 : 5만원, 1만원, 5천원, 1천원, 5백원, 1백원, 5십원, 1십원, 5원, 1원
		int [] unit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		// 출력할때 sunit 내부 문자열이 출력되도록 배열의 각 인덱스에 문자열 부여
		String [] sunit = { "5만원", "1만원", "5천원", "1천원", "5백원", "1백원", "5십원", "1십원", "5원", "1원" };
		
		for (int  i  = 0; i < unit.length; i++) {
			count = money/unit[i]; //125760을 각 배열의 인덱스로 나눈 몫들을 저장
			System.out.printf("%s : %d개\n", sunit[i], count); //sunit에 저장된 문자열들을 순차적으로 나열하고 위에서 나눴던 각 몫들 나열
			money %= unit[i]; //125760을 각 배열의 인덱스로 나눈 나머지들을 저장.
		} //for
	} //main

} //class
