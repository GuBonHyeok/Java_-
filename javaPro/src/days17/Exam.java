package days17;

/**
 * @author Bonggu
 * @date 2024. 1. 23.- 오전 9:35:03
 * @subject 복습문제 final 풀이
 * @content
 */
public class Exam {

	public static void main(String[] args) {


	} //main

} //class
/*
class Parent{
	void test1() {}
	//상속된 후
	// 자식 클래스에서 재정의 할 수 없는 메서드에 final로 붙여준다
	final void test2() {}
}
class Child extends Parent{
	@Override
	void test1() { System.out.println("재정의 test1"); }
	//@Override
	//void test2() { System.out.println("재정의 test1"); } //test2가 final이기 때문에 자식 클래스에서 재정의할 수 없다.	
}
*/

class FinalTest{
	// 2. 인스턴스 변수 (final을 붙여서 상수로 만들 수 있다)
	// public final int MAX_SIZE = 10; //명시적 초기화
	public final int MAX_SIZE;
	
	// 3. 클래스 변수 + 상수
	public final static int MIN_SIZE = 1;
	
	public FinalTest(int maxSize) { //생성자를 이용하면 초기화할 수 있다. 여기서는 maxSize 값으로 초기화됐다.
		this.MAX_SIZE = maxSize;
		
	}
	
	void test1() {
		// 1. 지역변수 (상수)
		final double PI = 3.14;
	}
	//				매개변수, 지역변수
	void test2(final int size) { //size를 상수화 시키겠다는 의미
		// size= 200; size는 상수화 됐기때문에 값을 저장할 수 없다
		
	}
}








