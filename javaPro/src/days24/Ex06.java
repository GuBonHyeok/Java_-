package days24;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Bonggu
 * @date 2024. 2. 1.- 오후 1:42:38
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		/*
		 * [ 제네릭(Generics) ]
		 * 
		 * 1. jdk1.5 - 제네릭
		 *     jdk1.8 - 람다식
		 * 	2. 제네릭? 
		 *    [ 다양한 타입 ] 의 객체를 다루는 메서드 , 컬렉션 클래스에서 [ 컴파일 시 ] 타입을 체크해주는 기능
		 * 3. 왜 객체의 타입을 굳이 컴파일 시 체크하는 걸까?
		 *    1) 객체의 타입 안정성을 높인다.
		 *    2) 형 변환의 번거러움이 줄어든다 -> 코드가 간결해진다.
		 *       (제네릭의 장점)
		 *    3) 
		 */

		/*
		ArrayList list = new ArrayList(); //기본으로 주면 자료형이 Object이기 때문에 모든 타입을 요소로 사용할 수 있다.
		list.add(100);
		list.add(1.0);
		list.add('a');
		list.add("홍길동");
		list.add(true);
		
		//이렇게 했을 때 문제점? 다른 변수에 넣거나 할 때 매번 형변환 해야함
		int i = (int)list.get(0); // 형 변환 필요
		double d = (double) list.get(0); // 형 변환 필요
		char c = (char)list.get(0); // 형 변환 필요
		String s = (String)list.get(0); // 형 변환 필요
		*/
		
		// 제네릭 + 클래스 = 제네릭 클래스
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김길동");
		list.add("이길동");
		
		// 장점 1) 타입 안정성 
		//  - 컴파일러가 타입 체크. list.add(100); > list에 String으로 제네릭을 줬는데 정수를 입력하려고 했기 때문
		// 장점 2) 형변환 필요 없다 (코드 간결성)
		//  - 
		String name = list.get(0);
		name = list.get(1);
		
		Iterator<String> ir = list.iterator();
		while (ir.hasNext()) {
			name = (String) ir.next(); //형변환 필요 없음			
		}//while
		
	}//main

} //class
