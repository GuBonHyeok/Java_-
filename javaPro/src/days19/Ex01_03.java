package days19;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Bonggu
 * @date 2024. 1. 25.- 오전 10:44:38
 * @subject
 * @content 내일 시험.. 암기한 번 해볼걸. (익명 클래스(어나니머스), 람다)
 */
public class Ex01_03 {

	public static void main(String[] args) {
		String [] names= {"구본혁", "권맑음", "김영진", "김진성"}; 
		System.out.println(Arrays.toString(names));
		//Arrays.sort(names, Collections.reverseOrder());  내림차순 정렬. 참조형 배열만 와야함
		/* 제네릭 사용
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1); // 내림차순
			}
		});
		*/ 
		//위 주석과 동일한 코딩 => 람다식으로 표현
		Arrays.sort(names, (o1, o2)->o2.compareTo(o1)); //람다로 만든 내림차순
		
		System.out.println(Arrays.toString(names));
		
	}//main

}//class
