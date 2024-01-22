package days16;

/**
 * @author Bonggu
 * @date 2024. 1. 22.- 오후 4:29:38
 * @subject 다형성 
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		// [다형성]
		//  - 여러가지 형태를 가질 수 있는 능력
		//  - Up Casting
		// Employee e1 = new Regular();		> " 
		// Employee e1 = new SalesMan();	> "
		// Employee e1 = new Temp();			> "
		// Up Casting 문제점! : Employee에선 getPay()가 없다보니 함수 호출 자체를 못했음.
		
		/*
		Employee emp4 = new Temp("코뿔소", "우간다", "010-1241-1666",
				"2011-11-22",20 , 70000);
		System.out.println(emp4.getPay());
		// ↑ 실제 참조된 객체 Temp의 getPay메서드가 호출된다. (기억!)(중요!)  
		 */
		
	} //main

} //class
