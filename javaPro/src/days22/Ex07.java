package days22;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Bonggu
 * @date 2024. 1. 30.- 오후 12:26:51
 * @subject 큐(Queue) 구조 (얘는 클래스가 아니라 인터페이스라 new 연산자로 생성할 수 없다)
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// 큐(Queue) 구조. FIFO : First in First Out 
		// 디큐 (Deque) 구조 == 더블 큐 구조. 양쪽이 서로 입력/출력이 될 수 있는 구조
		// FIFO 구조 : offer() 집어넣을 때, poll() 가져올 때(가져온 뒤 해당 데이터 삭제), peek() 가져올 때(가져온 뒤 해당 데이터 보존)
		// 인터페이스이기 때문에 new 연산자로 생성할 수 없다. 

		//LinkedList의 부모 -> List, Deque -> Queue -> Collection
		Deque q  = new LinkedList(); //LinkedList를 Queue 구조로 쓰겠다는 의미
		q.offer("권맑음");
		q.offer("이동찬");
		q.offer("김영진");
		q.offer("구본혁");
		
		//Deque 쓰면 아래처럼 첫번째, 마지막에 추가할 수도 있다.
		//q.offerFirst(q)
		//q.offerLast(q)
		//q.pollFirst()
		//q.pollLast()
		
		while (!q.isEmpty()) {
			System.out.println(q.poll());			
		}
		System.out.println(q);
		
	}//main

}//class






