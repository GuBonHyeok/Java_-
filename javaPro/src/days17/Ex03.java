package days17;

import days16.Employee;
import days16.Regular;
import days16.SalesMan;
import days16.Temp;

/**
 * @author Bonggu
 * @date 2024. 1. 23.- 오전 10:18:23
 * @subject 매개변수 다형성에 대해서 - 여러가지 형태를 가질 수 있는 성질
 * @content 직원의 형태가 또 생기면 나중에 함수를 또 만들어야한다.
 */
public class Ex03 {

	public static void main(String[] args) {
		// [매개변수 다형성]
		Regular emp1 = new Regular("김김김", "서울 성동구", "010-4321-9999","2024-01-22",3500000);		
		dispGetPay(emp1);
		
		SalesMan emp2 = new SalesMan("주강민", "서울 양천구", "010-3123-2311", "2021.03.21",500000, 20, 4000000);		
		dispGetPay(emp2);
		
		Temp emp3 =  new Temp("박정호", "서울 목동", "010-2319-3422", "2020.01.01", 20, 250000);
		dispGetPay(emp3);
		
		System.out.println("테스트".replace('스', 'x')); // 테스트에서 '스' 를 찾아서 'X'로 바꾼다
		System.out.println("테스트".replace("테스","XY")); // 테스트에서 "테스" 를 찾아서 "XY"로 바꾼다
		// replace에 CharSequence를 넣으라고 했는데 String을 넣어도 되는 이유는 ?
		// String이 CharSequence의 자식 클래스이기 때문에 매개변수의 다형성에 의해 가능하다.

	} //main
	//오버로딩. 매개변수의 타입이 다름 (Regular <-> SalesMan <-> Temp)
	/*
	private static void dispGetPay(Regular emp) {
		System.out.printf("> 정규직 사원 급여 : %d원\n", emp.getPay());		
	}
	private static void dispGetPay(SalesMan emp) {
		System.out.printf("> 영업직 사원 급여 : %d원\n", emp.getPay());		
	}
	private static void dispGetPay(Temp emp) {
		System.out.printf("> 임시직 사원 급여 : %d원\n", emp.getPay());		
	}
	*/
	
	//Regular도 SalesMan도 Temp도 Up Casting해서 들어가진다. 
	// 												이게 매개변수 다형성!
	// 					Regular가 넘어올 수도 있고 SalesMan이 넘어올 수도 있고 Temp 가 넘어올 수도 있다
	private static void dispGetPay(Employee emp) { 
		
		// instaneof 연산자. 객체가 클래스의 인스턴스인지 물어보고 true false 반환한다
		// (주의사항) 자식 클래스 먼저 체크한다. 여기서 Regular를 if에 두고 SalesMan 를 else if에 두면 
		//												Regular에 걸려서 Regular만 체크된다
		String type = null;
		if (emp instanceof SalesMan) {
			type = "엉업직";	
			SalesMan sm = (SalesMan) emp;
		} else if (emp instanceof Regular) {
			type = "정규직";
			Regular rg = (Regular) emp;
		} else if (emp instanceof Temp) {
			type = "임시직";
			Temp tm = (Temp) emp; //다시 부모 객체를 자식 객체로 변환시키는 작업
		} 
		
		System.out.printf("> %s 사원 급여 : %d원\n", type, emp.getPay());		
	}
	
	
	// 사원의 급여를 출력하는 메서드

} //class

class TempTwo extends Temp {
	
	
}






