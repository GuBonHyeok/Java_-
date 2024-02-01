package days17;

/**
 * @author kenik
 * @date 2024. 1. 23. - 오전 7:47:02
 * @subject  [final 키워드 설명]
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		

	} // main

} // class

/*
class Parent{
	void test1() {}
	// 상속된 후 
	// 자식클래스에서 재정의 할 수 없는 메서드
	final void test2() {}
}

class Child extends Parent{
	@Override
	void test1() { System.out.println("재정의 test1");}
	
	// Cannot override the final method from Parent
	//@Override
	//void test2() { System.out.println("재정의 test2");}
}
*/

// 최종(마지막) 클래스
final class FinalTest{
	// 2. 인스턴스변수(상수)
    // public final int MAX_SIZE = 10; // 명시적 초기화
	public final int MAX_SIZE;
	
	// 3. 클래스 + 상수 변수
	public final static int MIN_SIZE = 1;
	
	public FinalTest( int maxSize) {    // 생성자 초기화
		this.MAX_SIZE = maxSize;
	}
	
	void test1() {
		// 1. 지역변수(상수)
		final double PI = 3.14;
		
		test2(100);
	}
	
	//          매개변수, 지역변수
	void test2(final int size ) {
		// size = 200; X
	}
		
}

/*
class Child extends FinalTest{
	
}
*/





