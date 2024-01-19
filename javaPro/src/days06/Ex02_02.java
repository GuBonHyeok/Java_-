package days06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * @author BongGu
 * @date 2024. 1. 8. - 오후 12:02:19
 * @subject 쪽지시험 2번 문제
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		// [2] 아직 몰라도 되지만 통으로 외워두면 좋다. 검색해서 ints 가 뭔지 limit가 뭔지 확인 필요
		// 이거 쪽지시험에 나옴 (19~21번째 줄)
		// 람다식과 스트림
		// int [] m = new Random().ints(5, 16).limit(10).toArray();
		// ints int타입 5~16의 값들로 limit 10개로
		// System.out.println( Arrays.toString(m));
		
		int max = new Random().ints(5, 16). limit(10).max().getAsInt();
		System.out.println(max);
		
	} //main

} //class