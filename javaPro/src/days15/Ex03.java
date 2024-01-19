package days15;

/**
 * @author Bonggu
 * @date 2024. 1. 19.- 오전 11:08:31
 * @subject 생성자에 대해서 (constructor)
 * @content
 */
public class Ex03 {
	String name;
	int age;
	
	//생성자(Constructor)
	public Ex03() {
		System.out.println("> Ex03의 Default Constructor...");
		name = "익명";
		age = 20;		
	}
	public Ex03(String n, int a) { //매개변수로 넘겨받은 n과 a로 name, age를 각각 초기화한다.
		System.out.println("> Ex03 2 Default Constructor...");
		name = n;
		age = a;		
	}
	public Ex03(String n) { //매개변수로 넘겨받은 n을 name으로 초기화하고 age는 20으로 초기과한다.
		System.out.println("> Ex03 1 Default Constructor...");
		name = n;
		age = 20;		
	}
	//main함수는 실행할때 호출된다.
	public static void main(String[] args) {
		/*
		 * [2024.1.22.(월) 시험 1번] 생성자 (constructor)
		 * 1. 일종의 메서드이다.
		 * 2. 생성자명(메서드명)==클래스명
		 * 3. 리턴자료형을 사용하지 않는다. return문 필요 X
		 * 4. 매개변수 없는 생성자를 디폴트(default) 생성자라고 한다.
		 *    (Default Constructor)
		 * 5. 접근지정자를 사용할 수 있다 (일종의 메서드이기 때문에)
		 *     ※ 하지만 기타제어자는 사용할 수 없다.
		 * 6. 호출 시점 : 인위적으로 호출할 수 없다. 객체가 생성될 때 자동으로 호출된다. new Ex03();
		 * 7. 생성자의 역할 : 객체 생성 > 자동으로 생성자 호출 > 필드 초기화 역할
		 * 8. 생성자는 오버로딩(Overloading) 할 수 있다. 
		 *     : 오버로딩? 중복함수. 매개변수가 다르면 중복 선언할 수 있다. 리턴 자료형은 다르더라도 중복 선언할 수 없다
		 * 9. 클래스 선언 시 생성자를 1개라도 선언하지 않으면 자동으로 컴파일러가 자동으로 default 생성자를 추가해서 컴파일한다.
		 * 10. 생성자는 상속되지 않는다
		 *  
		 */
		
		
		//The method Ex03() is undefined for the type Ex03
		//Ex03(); //함수 호출했으나 인식 못하는 중
		//Ex03 obj = new Ex03("구본혁", 20); //객체 생성하면서 Ex03(String n, int a) 가 호출됨. 매개변수에 따라서 호출되는 생성자가 달라짐
		//Ex03 obj2 = new Ex03("구본혁"); //객체 생성하면서 Ex03(String n)가 호출됨
		
		//The constructor Ex03(String, int, String) is undefined.
		//Ex03 obj3 = new Ex03("구본혁", 20, "부장"); 
		
		//System.out.println(obj.name);
		//System.out.println(obj.age);
		
		//Sample sample = new Sample(); //The constructor Sample() is undefined
		
		System.out.println("end");
		

	}//main

}//class

class Sample{
	String name;
	public Sample(String s) { //생성자 추가
		name = s;
	}
}//Sample






