package days22;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/**
 * @author Bonggu
 * @date 2024. 1. 30.- 오전 11:04:11
 * @subject ListIterator 	listIterator() <<< 설명
 * @content 
 * 
 * 				
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// [Vector 컬렉션 클래스 ] : List 인터페이스 구현한 컬렉션 클래스
		//				ㄴ		순서 유지 가능, 중복 허용. (List를 implements 했기 때문에)
		//				ㄴ		ArrayList와 동일
		//							차이점 : 멀티 스레드에 안전함(동기화 처리가 되어있다) 

		// StringBuffer 클래스 : 멀티 스레드에 안전함 (동기화 처리 되어있음)
		// StringBuilder 클래스 : 멀티 스레드에 안전하지 않음 (동기화 처리 안되어있음)

		// Vector v = new Vector(10, 0); 과 아래 같음..?
		Vector v = new Vector();
		v.addElement("강명건");
		v.add("박우현");
		v.add("김영진");
		v.add("홍길동");
		
		// ArrayList 와 동일, 멀티스레드 안전(동기화 처리 되어있음)
		
		// Iterator 		iterator() - 반복자
		// ListIterator 	listIterator() <<< 설명
		//			ㄴ Iterator에 양방향으로 조회 기능이 추가된 반복자
		// Iterator는 단방향으로밖에 읽어들이지 못한다.
		
		ListIterator ir =  v.listIterator();
		
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);			
		}
		
		System.out.println( "-".repeat(30));
		
		while (ir.hasPrevious()) { //앞에 있는지 확인 후 읽어들이는 작업에 사용 
			String name = (String) ir.previous(); //앞으로 순차적으로 하나씩 읽어들이기
			System.out.println(name);			
		}

	} //main

} //class








