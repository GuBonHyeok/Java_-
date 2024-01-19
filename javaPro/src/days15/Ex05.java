package days15;

/**
 * @author Bonggu
 * @date 2024. 1. 19.- 오후 12:26:41
 * @subject 2024.1.22. 시험 2번
 * @content private에 접근하는 방법
 */
public class Ex05 {

	public static void main(String[] args) {
		// 어떤 클래스(person)의 필드를 private로 선언
		// private 선언된 필드에 접근하는 방법
		// Person p1 = new Person("홍길동");
		//The field person.name is not visible 원인? 접근지정자 때문
		// private 클래스 내에서만 참조(접근) 가능
		// 같은 패키지 내부라도 참조(접근) 불가
		//p1.name = "홍길동"; 
		/*
		int age = 300;
		if (age >= 0 && age <= 300) {
			p1.age = age;         
		} else {
			System.out.println("나이의 범위가 벗어났다.");
		}
		*/
		//p1.setAge(25);
		//System.out.println(p1.getAge());

	} //main

} //class
