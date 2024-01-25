package days19;

import days15.Person;
import days15.Point;

/**
 * @author Bonggu
 * @date 2024. 1. 25.- 오후 2:04:44
 * @subject boxing / unboxing
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// [  자동(auto) boxing / unboxing ]
		// 기본형 사용하기 쉽게 만든 것이 래퍼 클래스
		// 기본형이 자동으로 객체로 => auto boxing
		// 객체가 자동으로 기본형으로 =>auto unboxing
		int i = 100; 
		Integer j = i; // 여기서 j는 객체, i는 기본형. 기본형 i가 자동으로 객체로 변함. 이것이 auto boxing
		// JDK 1.5 Integer j = new Integer(i);
		
		int k = j; //Integer 객체를 기본형인 k에 변환됐다. 이것이 auto unboxing
		
		test(new Person()); //Object는 모든 클래스의 부모 클래스이기 때문에 가능. up casting
		test(new Point()); //Object는 모든 클래스의 부모 클래스이기 때문에 가능. up casting
		
		test(1);					// autoboxing 이후 자동으로 upcasting까지 된다
		test(true);			// autoboxing 이후 자동으로 upcasting까지 된다
		test(3.14);			// autoboxing 이후 자동으로 upcasting까지 된다
		test('a');				// autoboxing 이후 자동으로 upcasting까지 된다
		test("string");		// autoboxing 이후 자동으로 upcasting까지 된다

	}//main

	public static Object test(Object o) { //매개변수를 Object로 받으면? 모든 자바 자료형을 사용할 수 있도록 할 수 있다
		return null;
	}
}//class


