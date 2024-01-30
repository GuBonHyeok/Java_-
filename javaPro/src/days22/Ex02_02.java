package days22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Bonggu
 * @date 2024. 1. 30.- 오전 10:29:21
 * @subject 이름, 나이 필드를 가진 Person 클래스를 선언하고
   ArrayList 컬렉션 클래스에  Person 객체를 요소로 추가하고 
   이름으로 오름차순 정렬해서    출력하는 코딩을 하세요 ..  
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person2("호날두", 21)); //add 안에 Object를 줘야하기 때문에 new 연산자로 Person 클래스
		list.add(new Person2("메에시", 32));
		list.add(new Person2("손흥민", 23));
		list.add(new Person2("김민재", 64));
		list.add(new Person2("홀란드", 25));
		
		System.out.println(list);

		//오름차순 정렬 (이름)
		list.sort(null); //
		
		//반복자 출력
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Person2 p = (Person2) ir.next();
			System.out.println(p);			
		}


	} //main

} //class

@Data
@AllArgsConstructor
class Person2 implements Comparable{
	private String name;
	private int age;
	
	@Override
	public int compareTo(Object o) {
		Person2 p = (Person2)o;
		return this.age-p.age; //0 또는 양수 또는 음수
	}

}
