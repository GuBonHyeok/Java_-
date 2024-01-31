package days23;

import java.util.LinkedHashSet;

import days15.Person;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class Ex03 {

	public static void main(String[] args) {
		LinkedHashSet<Person> lhs = new LinkedHashSet<Person>();
		lhs.add(new Person("admin", "관리자", 45));

	}//main

}//class

class Person{

	public Person(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}
	
}

@Setter
@Getter
@Data
@NoArgsConstructor
@Builder
@ToString
