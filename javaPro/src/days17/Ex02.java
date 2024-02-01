package days17;

/**
 * @author kenik
 * @date 2024. 1. 23. - 오전 9:48:19
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// 10:01 수업 시작~ 
		// 추상클래스 - 공통적인 멤버를 가진 클래스 설계
		//              Employee
		// 객체를 생성할 수 없는 일종의 클래스
		/*
		 * Child c = new Descendant(); c.dispA(); c.dispB();
		 */
		

		// [업캐스팅]
		// 자식 객체 생성 후 부모 클래스에 참조
		Parent  p = new Descendant();
		p.dispA();
		p.dispB();

	} // main

} // class

abstract class Parent{
	// 필드
	// 생성자
	// 메서드
	// 추상메서드 : // body 몸체 {}  가 구현이 안된 메서드
	//               불완전한 메서드
	//               abstract 키워드
	abstract void dispA(); 
	abstract void dispB(); 
}

// The type Child must implement the inherited 
//         abstract method Parent.dispA()
abstract class Child extends Parent{

	@Override
	void dispA() {
		System.out.println("> dispA()..");
	}

	// 필드
	// 생성자
	// 메서드 
}

class Descendant extends Child{

	@Override
	void dispB() {
		System.out.println("> dispB()..");
	}
	// 필드
	// 생성자
	// 메서드  
}






 





