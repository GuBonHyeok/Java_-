package days21;

import java.util.Arrays;

/**
 * @author Bonggu
 * @date 2024. 1. 29.- 오후 2:25:12
 * @subject ArrayList 컬렉션 클래스
 * @content
 */
public class Ex12 {

	public static void main(String[] args) {
		/*
		 * 1. ArrayList 컬렉션 클래스
		 * 		1) Collection
		 * 					ㄴ List 인터페이스를 구현한 컬렉션 클래스이다.
		 * 		2) 특징 : 순서 유지되고 중복을 허용한다 
		 * 		3) Array(배열) + List(목록) : 배열처럼 구성이 되어있다는 것
		 * 			, 배열의 단점이 보완된 것
		 * 			요소(Element)중 하나 
		 * 
		 */
		String [] names =new String[3];
		names[0] = "구본혁";
		names[1] = "코끼리";
		names[2] = "혁본구";
		System.out.println(names.length);
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("코끼리")) {
				System.out.println(names[i]);				
			}
		}
		Arrays.fill(names, null); //배열에 어떤 값을 초기화하는 함수 : Arrays.fill
		System.out.println(Arrays.toString(names));
	} //main

} //class
