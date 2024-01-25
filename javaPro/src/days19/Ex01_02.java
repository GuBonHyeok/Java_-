package days19;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @author Bonggu
 * @date 2024. 1. 25.- 오전 10:29:13
 * @subject 소팅해서 오름(내림)차순으로 정렬하기
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		//  원대안, 유진, 윤형준, 이동찬
		int [] m = {3,5,2,4,1};
		System.out.println(Arrays.toString(m));
		// Bubble sort
		//Arrays.sort(m); // 기본적으로 오름차순 정렬
		
		// 
		/* [ 로직으로 내림차순 하기 ]
		int [] temp = new int[m.length];
		for (int i = 0; i < m.length; i++) {
			temp[m.length-1-i] = m[i];
			
		}
		*/
		//System.out.println(Arrays.toString(temp));
		
		// T[] ? 기본형은 못들어가고 참조형만 가능하다는 것
		//Arrays.sort(m, Collections.reverseOrder()); // 이거 쓰려면 기본형 자료형이 아니라 래퍼 클래스로 변경해줘야함 (int > Integer)
		
		// int [] => Integer[] 변환 ? IntStream  => Stream<Integer> => Integer []
		// IntStream -> Stream<Integer> / Integer를 가지고 있는게 
		// boxing (기본형 -> 래퍼클래스로 객체화 시키겠다), unboxing
		Integer[] temp = Arrays.stream(m).boxed().toArray(Integer[]::new); 
		//Arrays.stream(m) 에서 IntStream 으로 만들어서
		Arrays.sort(temp, Collections.reverseOrder());
		
		m = Stream.of(temp).mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(m));
		
		
	} //main

} //class
