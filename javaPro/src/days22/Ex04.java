package days22;

import java.util.List;
import java.util.Vector;

/**
 * @author Bonggu
 * @date 2024. 1. 30.- 오전 11:04:11
 * @subject Vector 컬렉션 클래스 - List 인터페이스 구현한 컬렉션 클래스
 * @content + 열거자 (enumeration)
 * 
 * 				반복자 열거자 차이? 
 * 		반복자	> 반복자를 통해서 하나씩 요소를 처리하는 중에 다른 스레드가 와서 벡터 안에서 변경, 삭제시키면 반복자는 예외 발생시킨다.
 *  	열거자 > 원래 것을 복사해서 쓰기 때문에 벡터 값이 변경, 삭제 되더라도 일처리를 끝까지 실행한다
 */
public class Ex04 {

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
		v.add("김영진");
		//v.add(null);	null도 중복으로 들어가짐. (중복 허용)
		//v.add(null);

		System.out.println(v);

		System.out.println(v.size()); //3 
		System.out.println(v.capacity()); // capacity : 용량. 초기 용량 10개.

		v.trimToSize(); //사이즈의 앞 뒤 공간을 제거한다. 요소가 3개 들어가있기 때문에 이후 capacity 출력하면 3이 나온다
		System.out.println(v.capacity());

		v.setSize(5); //벡터 크기 설정 가능
		System.out.println(v); //벡터 크기를 5로 설정했고 요소는 3개라 나머지 2자리는 null로 채워진다ㅣ

		//요소 얻어오는 메서드 : get(), elementAt() 사용
		String name = (String) v.get(0);
		name =(String) v.elementAt(0); // 요소를 가져와서 String name 에 저장
		// System.out.println(name);

		// v.clear() ; 모든 요소 삭제
		// v.remove(index) index 요소 삭제 == v.removeElementAt(0);
		//v.remove("홍길동"); == v.removeElement("홍길동"); 

		//v.isEmpty(); 요소가 있는지 없는지 유무 boolean

		//모든 요소 출력 : 반복자 (Iterator) 사용
		/*
		Iterator ir = v.iterator(); 
		while (ir.hasNext()) { 
			name = (String) ir.next(); 
			System.out.println(name);
		}//while
		 */

		//모든 요소 출력 : 열거자(enumeration)
		/*
		Enumeration en = v.elements();
		while (en.hasMoreElements()) { //Iterator hasNext와 같은 작업
			name = (String) en.nextElement();
			System.out.println(name);			

		}//while
		 */

		//반복자와 열거자의 차이점 알아둘 것
		// v 벡터 안에 null  2개 있는 상태임. null 요소 삭제하려면?
		v.removeIf(n -> n ==null); // n을 가져와서 n 이 null이라면 삭제. 동일한 것은 모두 삭제시킨다.

		v.forEach(n -> System.out.println(n));
		//메서드 참조?
		v.forEach(System.out :: println);
		
		// v.clear(); 모든 요소 삭제
		// v.clone(); 복제
		// v.get(0); 첫 번째 요소 얻어오기  == v.firstElement();
		// v.get(v.size()-1); 마지막 요소 얻어오기 ==	v.lastElement();
		
		v.add(1, "홍길동"); //v의 1 위치에 홍길동 삽입 == v.insertElementAt("홍길동", 1);
		
		// v.subList(n, m); n 부터 m번째 앞까지 잘라온다
		List subList = v.subList(0, 2); //v의 0~1번째 인덱스 값 잘라와서 subList에 저장
		System.out.println(subList);

	} //main

} //class








