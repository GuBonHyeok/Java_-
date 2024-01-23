package days17;
/**
 * @author Bonggu
 * @date 2024. 1. 23.- 오전 9:48:35
 * @subject 추상 클래스에 대해서
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// 추상 클래스 - 모든 클래스들 마다 공통적인 멤버를 가진 클래스를 설계할 때
		//					(days16의 Employee)
		// 객체를 생성할 수 없는 일종의 클래스이다.

		// 자식 객체 생성 후 부모 클래스에 참조시킴. Up casting.
		/*
		Child c = new Descendant();
		c.dispA();
		c.dispB();
		 */

		// 자식 객체 생성 후 부모 클래스에 참조시킴. Up casting. 부모 객체 생성 후 자식클래스에 참조시키면 안된다
		Parent p = new Descendant();
		p.dispA();
		p.dispB();


	} //main

} //class

abstract class Parent{
	// 필드
	// 생성자
	// 메서드
	// 추상메서드(불완전한 메서드, 몸체가 구현이 안된 메서드. abstract 키워드)
	abstract void dispA(); //추상 메서드는 { } 블록(body)이 없다
	abstract void dispB(); //추상 메서드는 { } 블록(body)이 없다
}

//The type Child must implement the inherited abstract method Parent.dispA().
abstract class Child extends Parent{
	@Override
	void dispA() {
		System.out.println("> dispA 호출");		
	}
	// 필드
	// 생성자
	// 메서드
}

class Descendant extends Child{
	@Override
	void dispB() {
		System.out.println("> dispB 호출");		
	}
	// 필드
	// 생성자
	// 메서드
}














