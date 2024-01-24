package days18;

// import java.lang.*; << 따로 해당 구문을 적어주지 않아도 자동으로 컴파일러가 import 구문을 추가해줌
/**
 * @author Bonggu
 * @date 2024. 1. 24.- 오전 10:27:24
 * @subject  java.lang 패키지에 대해서 - 자바에서 가장 기본이 되는 클래스
 * @content  유용한 클래스들 뭐있나~ (java.util 패키지)
 * 					  Object.equals() + Overriding
 * 
 * 
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
		//  [java.lang.Object 클래스]
		// 1. 모든 클래스의 최상위 Super(부모,조상) 클래스
		Item item1 = new Item(10); //Item 클래스의 객체 생성
		Item item2 = new Item(10); //Item 클래스의 객체 생성
		//								객체 	==	객체 비교
		System.out.println(item1 == item2); //item1, item2 객체이기 때문에 참조한 주소값을 비교한다. 결과는 false
		System.out.println(item1.equals(item2)); //Object 클래스의 equals 함수를 보겠다는 뜻
		//Object.equals() => 참조 주소값을 비교한다.
		
		item2 = item1; // 객체(클래스)복사. item2는 item1의 주소값을 넘겨줬기 때문에 인스턴스를 참조한다
		System.out.println(item1 == item2); //item1, item2 객체이기 때문에 참조한 주소값을 비교한다. 결과는 true
		System.out.println(item1.equals(item2)); //true
		
		System.out.println(item1.equals(item2)); //true
		
	} //main

} //class

//Object의 equals 를 오버라이딩하기
class Item extends Object { //물려받지 않더라도 extends Object 즉 Object를 상속 받는다
	//필드
	int value;
	//생성자(1)
	Item (int value) { // 매개변수 1개짜리 생성자
		this.value = value;	// 멤버변수 value 에 지역변수 value를 입력
	}
	//다른 객체들을 비교할 때 value 값만 같으면 같다라고 처리하고 싶다. item1.equals(item2)
	@Override
	public boolean equals(Object obj) { // Upcasting으로 obj를 가져옴
		//this.value //item1의 value값..
		if (obj instanceof Item) {
			Item item2 = (Item) obj; //down casting
			if (this.value == item2.value) return true;
		}
	
		return false;
	}
	
	
	
}











