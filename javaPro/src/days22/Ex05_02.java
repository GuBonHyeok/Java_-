package days22;

import java.util.LinkedList;

/**
 * @author Bonggu
 * @date 2024. 1. 30.- 오후 12:05:22
 * @subject LinkedList 예제, ArrayList와 차이점
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add("김호영");
		list.add("이지현");
		list.add("김정주");
		System.out.println(list);
		
		list.addFirst("유희진");  //addFirst : 가장 처음 자리에 추가
		System.out.println(list);
		
		list.contains("김호영"); // "김호영"이 포함되어 있기 때문에 true
		list.indexOf("홍길동"); // "홍길동"이 없기 떄문에 -1
		list.lastIndexOf("홍길동"); // 뒤에서부터 찾아도 "홍길동"이 없기 떄문에 -1
		
		//"이지현"을 "고경림"으로 수정
		list.indexOf("이지현");
		//list.set(2, "고경림"); //이렇게 하면 "이지현"이 없으면 -1이기 때문에 문제가 생긴다.
		int index = -1;
		if ((index = list.indexOf("이지현")) != -1) {
			list.set(index, "고경림");			
		}
		System.out.println(list);
		//						읽기 속도		삽입/삭제					비고
		// ArrayList		  빠르다		 느리다		  순차적으로 추가, 삭제 빠르다.
		// LinkedList		  느리다		 빠르다		  데이터(요소)가 많으면 많을 수록 접근성은 떨어진다.

	} //main

}//class
