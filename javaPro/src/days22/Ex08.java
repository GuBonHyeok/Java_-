package days22;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Bonggu
 * @date 2024. 1. 30.- 오후 2:02:45
 * @subject 
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// List 계열 - ArrayList, Vector, LinkedList, Stack, Queue
		// Set 계열 - 
		// Map 계열 -

		// [ PriorityQueue ] 컬렉션 클래스
		//	 우선순위가 있는 + Queue
		//  우선순위가 높은 것 부터 꺼내오는 Queue
		Queue q = new PriorityQueue();
		q.offer(3);
		q.offer(5);
		q.offer(2);
		q.offer(4);
		q.offer(1);

		System.out.println(q);

		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}

		// 작은 숫자가 우선순위가 높다.
		// 

	}//main

} //class










