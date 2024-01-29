package days21;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Bonggu
 * @date 2024. 1. 29.- 오후 2:33:06
 * @subject Ex12번 ArrayList 컬렉션 클래스 사용해서 구현
 * @content
 */
public class Ex12_02 {

	public static void main(String[] args) {
		// [ ArrayList 컬렉션 클래스]
		// 배열보다 좋은 점? 배열에 데이터를 추가해주면 배열 크기가 자동으로 늘어남 
		// <E> : 제네릭.. 아직 안배움
		ArrayList list = new ArrayList(3); //방 3개짜리 생성
		list.add("구본혁");
		list.add("코끼리");
		list.add("혁본구");
		
		System.out.println(list);
		System.out.println(list.size());
		
		list.add("주강민");
		System.out.println(list);
		
		System.out.println(list.contains("구본혁")); //"구본혁"이 list 안에 있는지 없는지 확인해서 boolean으로 출력
		System.out.println(list.indexOf("구본혁")); //"구본혁"이 list 안에 몇번째에 있는지. 있으면 해당 인덱스 리턴, 없으면 -1 리턴
		
		// [구본혁, 코끼리, 혁본구, 홍길동] 에서 [구본혁, 코끼리, 배수지, 혁본구, 홍길동] 이렇게 중간에 입력하기?
		list.add(2, "배수지"); //list의 2번 인덱스에 "배수지"를 입력하고 뒷쪽 데이터의 인덱스는 +1씩 뒤로 민다.
		System.out.println(list);
		// [구본혁, 코끼리, 배수지, 혁본구, 홍길동] 에서 [구본혁, 코끼리, 배수지, 홍길동] 이렇게 중간에 삭제하기?
		int index = -1;
		if ((index = list.indexOf("혁본구")) != -1 ) { // 인덱스에서 -1이 아니라면. 즉 혁본구를 찾았다면..
			list.remove(index);			 					 // 삭제 시키겠다.
		}
		System.out.println(list);
		
		//주강민 > 주강미로 수정
		if((index = list.indexOf("주강민"))!= -1) {
			//list.remove(index);
			//list.add(index, "주강미");
			list.set(index, "주강미"); //위 두 줄 코딩 합쳐진 것
		}
		/*
		System.out.println(list);
		System.out.println(list.isEmpty()); //false, 목록이 비어있는지 확인하는 작업
		list.clear(); //목록 싹 비우는 작업
		System.out.println(list.isEmpty()); //true
		
		//get(index) 인덱스에 해당하는 값을 가져오는 것
		for (int i = 0; i < list.size(); i++) { //ArrayList는 length가 아니라 size로 크기 줘야함
			System.out.println(list.get(i));			
		}
		*/
		//iterator : 반복자. 요소를 출력(가져올 때)할 때 사용.
		//요소를 순차적으로 처리할 수 있는 반복자
		Iterator ir = list.iterator(); //여기서 Iterator는 인터페이스. iterator는 메서드. 헷갈리면 안됨
		while (ir.hasNext()) { // hasNext() : 요소를 가지고 있는지 확인하고 가지고 있으면 true, 없으면 false 리턴
			String name = (String) ir.next(); //요소가 있으면 while문 안으로 들어와서 .next()로 요소를 가져온다.
			System.out.println(name);
			
		}
		
		// ArrayList 메서드
		// 1) add()
		// 2) set()
		// 3) contaions()
		// 4) indexOf()
		// 5) hasNext() : Iterator의 메서드로서 목록 안에서 순차적으로 하나씩 가져와서 있는지 없는지 확인하는 작업 실행됨. ArrayList 아님!
		// 6) next() : 순차적 하나씩 값 입력해주는 메서드.
		// 7) size()
		// 8) get() : 
		// 9) clear()
		// 10) isempty

	}//main

}//class









