package days22;

import java.util.HashSet;

/**
 * @author Bonggu
 * @date 2024. 1. 30.- 오후 2:19:10
 * @subject Set 계열 컬렉션
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// Collection
		//		 ㄴ			List - (순서유지 O, 중복허용 O) ArrayList, Vector, LinkedList, Stack, Queue(LinkedList), Priority ...
		// 		 ㄴ 		Set - (순서유지 X, 중복허용 X) HashSet 컬렉션 클래스가 대표적
		//							만약, Set 계열인데도 순서가 유지되길 바란다면 -> LinkedHashSet 컬렉션 클래스 사용
		//																						[순서 유지 O], [중복 허용 X]
		
		//HashSet hs = new HashSet(16, 0.75); //초기 용량 16, 75%씩 증가시킨다 HashSet hs = new HashSet(); 과 동일한 코딩
		HashSet hs = new HashSet();
		// hs.add(); hs.addAll(); 가능. Collection의 메서드이기 때문에
		hs.add(9);
		hs.add(1);
		hs.add(15);
		hs.add(10);
		
		System.out.println(hs); //1, 9, 10, 15. 순서 유지 X
		
		hs.add(1);
		
		System.out.println(hs); //중복된 데이터 1이 들어갔기 때문에 1, 9, 10, 15가 나옴. 중복허용 X
		
		
		
	}//main

}//class










