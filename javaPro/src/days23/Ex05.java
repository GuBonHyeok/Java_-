package days23;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Bonggu
 * @date 2024. 1. 31.- 오전 11:39:42
 * @subject [TreeSet] 컬렉션 클래스
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		/*
		 * Set 계열 : HashSet, LinkedHashSet
		 * 				  [TreeSet] 컬렉션 클래스
		 * 검색때 유용하다.
		 * 
		 * 1. 중복 허용 X, 순서 유지 X
		 * 2. 이진 검색 트리라는 자료 구조로 데이터를 저장하는 컬렉션 클래스.
		 * 3. 이진 검색 트리 - 검색, 정렬, 범위 검색하는 데 성능이 우수하다.
		 * 4. LinkedList 처럼 노드(Node)가 서로 연결된 구조
		 * 5. 최상위 노드 : 루트(root) 노드
		 * 6. 노드들 간의 관계 : 부모노드, 자식노드, 형제노드 관계
		 * 7. 트리 노드의 주소값은 양쪽 자식 노드의 주소값을 저장한다 (2개)
		 *    class TreeNode{
		 *        Object element;
		 *        
		 *        TreeNode left; 	// 왼쪽 자식 노드 참조
		 *        TreeNode right;	// 오른쪽 자식 노드 참조
		 */

		/*
		 * 	 이진				     			ㅇ        < 루트 노드
		 * 		검색						   /  \
		 * 			트리			     	  ㅇ   ㅇ	  < 부모 노드
		 * 								     / \  / \
		 * 								   ㅇ  ㅇㅇ  ㅇ  < 자식 노드, 같은 라인끼리는 형제 노드
		 */
		
		TreeSet<Integer> ts = new TreeSet<>(); // 부분검색이 빠르다
		ts.add(7);  // null 7 null
		ts.add(4);  // 7보다 작은 값이 들어갔기 때문에 7의 자식 노드 중에 왼쪽 자식노드 자리에 4가 들어간다. 그리고 7의 왼쪽자리에서 4 노드의 주소값을 참조한다 
		ts.add(9);  // 7보다 큰 값이 들어갔기 때문에 7의 자식 노드 중에 오른쪽 자식노드 자리에 9가 들어간다. 그리고 7의 오른쪽자리에서 9 노드의 주소값을 참조한다
		ts.add(1);  // 7보다 작고 4보다 작기 때문에 4의 왼쪽 자식노드 자리에 들어감. 이후는 위와 동일
		ts.add(5);  // 7보다 작고 4보다 작기 때문에 4의 왼쪽 자식노드 자리에 들어감. 이후는 위와 동일
		ts.add(6);  // 7보다 작고 4보다 작기 때문에 4의 왼쪽 자식노드 자리에 들어감. 이후는 위와 동일
		
		System.out.println(ts); // [1, 4, 5, 6, 7, 9]
		System.out.println(ts.first()); // 1. 정렬된 순서에서 첫 번째
		System.out.println(ts.last()); // 9. 정렬된 순서에서 마지막
		
		// 범위 검색. 자동으로 정렬해서 검색
		SortedSet<Integer> ss = ts.subSet(4, 7); //4보다 크거나 작고, 7보다 작은 것
		System.out.println(ss);
		
		// 지정된 1 보다 큰 값을 가진 가장 가까운 노드를 가져온다
		System.out.println(ts.higher(1));
		// 지정된 4 보다 작은 값을 가진 가장 가까운 노드를 가져온다
		System.out.println(ts.lower(4));
		// 지정된 값 (3)과 같은 객체를 반환
		// 트리 구조에 3 값이 없으면 작은 값을 가진 객체 중에 가장 가까운 값을 반환
		System.out.println(ts.floor(3));
		System.out.println(ts.ceiling(3)); // 트리 구조에 3 값이 없으면 큰 값을 가진 객체 중에 가장 가까운 값을 반환

		
		} //main

} //class













