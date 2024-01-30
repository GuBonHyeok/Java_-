package days22;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Bonggu
 * @date 2024. 1. 30.- 오후 4:44:21
 * @subject LinkedHashSet 이용 
 * @content
 */
public class Ex12 {

	public static void main(String[] args) {
		// 사람 -> HashSet X			순서유지 X, 중복허용X
		// 사람 -> LinkedHashSet	순서유지 O, 중복허용X            <<< 순서를 유지하되 중복을 허용하고싶지 않을 때

		Person3 p1 = new Person3("111111-1111111", "구본혁", 30);
		System.out.println(p1.hashCode());

		Set<Person3> s = new LinkedHashSet<Person3>(); //LinkedHashSet 에 E (요소)를 집어넣겠다. 
		//이 해쉬셋 안에 Person3 을 넣겠다는 뜻. (제네릭)

		s.add(p1);
		s.add(new Person3("222222-2222222","홍길동",20));
		s.add(new Person3("333333-3333332","김기동",21));

		// 주민등록번호가 같으면 HashSet에 추가하는 것을 막는 작업.  
		// 주민등록번호가 같으면 같은 Person 객체로 인식해서 LinkedHashSet에 추가되는 작업을 막고싶다.
		// 방법 ? hashcode(), equals() 오버라이딩하면 됨
		Person3 p4 = new Person3("111111-1111111","유진",25);
		System.out.println(p4.hashCode());
		
		s.add(p4);
		

		Iterator<Person3> ir = s.iterator();
		while (ir.hasNext()) {
			Person3 p = ir.next();
			System.out.println(p);			
		}


	}// main

}// class

@NoArgsConstructor
@AllArgsConstructor
@ToString

class Person3{
	String rrn;
	String name;
	int age;
	@Override
	public int hashCode() {

		return this.rrn.hashCode(); //같은 주민번호면 같은 해쉬코드를 갖겠다는 뜻.
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person3) {
			Person3 p = (Person3)obj;
			return this.rrn.equals(p.rrn); //비교할 주민등록번호와 같으면 true 아니면 false를 돌리도록
		}
		return false;
	}


}











