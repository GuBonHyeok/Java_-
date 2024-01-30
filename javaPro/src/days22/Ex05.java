package days22;

/**
 * @author Bonggu
 * @date 2024. 1. 30.- 오전 11:31:52
 * @subject [LinkedList 컬렉션 클래스]
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// [LinkedList 컬렉션 클래스]
		// 사슬(고리) 연결된 + List
		// 단방향 링크드 리스트 (중간에 끊어지면 다음 주소를 찾아오지 못한다) + 끝 참조변수가 제일 앞의 주소 가지고 있으면 : 환형
		// [  ]-[  ]-[  ]-[  ]-[  ] 이런 식으로 한쪽 주소만 참조하게 연결되어있는 것. 
		// 양방향 링크드 리스트 (중간에 끊어져도 다음 주소를 찾아올 수 있다.) + ㄱ
		// [  ]<->[  ]<->[  ]<->[  ]<->[  ] 
		//		배열(Array) <-> LinkedList 비교
		//	1. 배열의 장단점
		//	 	1) 장점 = 읽기 성능이 가장 빠르다.  읽기 용도로만 쓸거면 배열 써라~!
		//		2) 단점 = 배열의 크기를 마음대로 증/감 시키기 힘들다.
		//					  삽입, 삭제시 속도가 많이 느리다.
		//	2. LinkedList의 장단점
		//		0) 특징 = 비연속적. 삽입, 삭제시 속도가 많이 빠르다.
		
		Node node1 = new Node();
		node1.value = 10;
		Node node2 = new Node();
		node2.value = 20;
		Node node3 = new Node();
		node3.value = 30;
		Node node4 = new Node();
		node4.value = 40;
		Node node5 = new Node();
		node5.value = 50;
		
		node1.next = node2; //node2의 주소를 node1이 가지고 있도록
		node2.next = node3; //node3의 주소를 node2이 가지고 있도록
		node3.next = node4; //node4의 주소를 node3이 가지고 있도록
		node4.next = node5; //node5의 주소를 node4이 가지고 있도록
		node5.next = null;	 //기본이 null이기 때문에 기재하지 않아도 똑같다.
		
		//모든 노드들의 value 출력?
		Node node = node1; //현재 node1이 node에 들어가 dlTdma
		while (node != null) { // 총 5회 돌면서 node5까지 값 출력됨
			System.out.println(node.value);
			node = node.next;
		}

	} //main

} //class

class Node {
	
	int value; //값을 저장할 필드 
	Node next; // 다음 노드를 참조할 수 있는 참조변수. 값을 할당하지 않으면 null 이 들어가있다
	
	
}










