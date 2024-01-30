package days22;

import java.util.Stack;

/**
 * @author Bonggu
 * @date 2024. 1. 30.- 오후 12:16:09
 * @subject 스택(Stack) 구조와 큐(Queue) 구조
 * @content 
 */
public class Ex06 {

	public static void main(String[] args) {
		// [스택(Stack) 구조]
		// 가장 먼저 들어간 것을 가장 나중에 꺼냄 LIFO : Last in First out
		// LIFO 구조 : push() 데이터를 넣을때 , pop() 데이터를 가져올때(안에서는 제거하고), 
		//					peek() 데이터를 가져올 때(안에서 제거하지 않고), empty() 비었는지 확인, search() 검색
		
		Stack s = new Stack(); //Stack의 부모 -> Vector의 부모 -> List
		s.push("권맑음"); //가장 먼저 들어온 데이터
		s.push("이동찬"); 
		s.push("김영진"); //가장 나중에 들어온 데이터
		
		// s.iterator() => X. 스택 구조를 활용하기 위해 iterator는 쓰지 않는다.
		/*
		System.out.println(s.pop()); //김영진
		System.out.println(s.pop());
		System.out.println(s.pop());
		*/
		
		/*
		// s가 다 빌때까지 pop하는 작업
		while (s.empty()) { //s.isEmpty() : 이것도 사용 가능. vector 한테 물려받은 함수
			System.out.println(s.pop());			
		} 
		*/
		
		System.out.println(s.search("홍길동")); // 홍길동이 없기 때문에 -1

	}

}
