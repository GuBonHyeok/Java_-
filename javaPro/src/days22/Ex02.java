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
   이름으로   정렬해서    출력하는 코딩을 하세요 ..  
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person("호날두", 21)); //add 안에 Object를 줘야하기 때문에 new 연산자로 Person 클래스
		list.add(new Person("메에시", 22));
		list.add(new Person("손흥민", 23));
		list.add(new Person("김민재", 24));
		list.add(new Person("홀란드", 25));
		
		System.out.println(list);
		
		list.sort(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Person p1 = (Person)o1;
				Person p2 = (Person)o2;
				
				String p1Name = p1.getName();
				String p2Name = p2.getName();
				
				return p1Name.compareTo(p2Name);
			}
		});
		
		
		//오름차순 정렬 (나이)
		list.sort((o1,o2) -> {
			Person p1 = (Person)o1;
			Person p2 = (Person)o2;			
			int p1Age = p1.getAge();
			int p2Age = p2.getAge();
			
			return p1Age -p2Age; //p1이 크면 양수, p2가 크면 음수, 같으면 0이 나온다.
			
		});

		 Iterator ir = list.iterator();
		    while (ir.hasNext()) {
				Person p = (Person) ir.next();
				System.out.println( p );
			} //while


	} //main

} //class

@Data
@AllArgsConstructor
class Person {
	private String name;
	private int age;

}
