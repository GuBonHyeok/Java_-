package days17;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import days16.Employee;

/**
 * @author Bonggu
 * @date 2024. 1. 23.- 오전 10:45:46
 * @subject 매개변수 다형성 (2) - Ex03의 부연설명
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// Employee emp = new Temp(); // Up casting
		//		자식 객체 만들어서 부모 객체에 참조시키는 것
		
		List list = new ArrayList(); //List가 ArrayList의 부모 클래스이기 때문에 Up casting
		
		test(list);
		test(new ArrayList()); // 자식 객체를 만들어서 부모 클래스의 매개변수로 사용할 수 있음 : new SalesMan();
		test(new Vector()); //자식 객체를 만들어서 부모 클래스의 매개변수로 사용할 수 있음 : new Regular();

	} //main
	//							: Employee emp
	public static void test(List list) {
		
		
	}

} //class
