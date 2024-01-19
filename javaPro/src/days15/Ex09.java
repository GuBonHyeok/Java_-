package days15;

/**
 * @author Bonggu
 * @date 2024. 1. 19.- 오후 4:12:11
 * @subject 변수의 초기화
 * @content 시험문제
 */
public class Ex09 {
	
	// [멤버변수 == 필드 ]
	// 1) 인스턴스 변수 
	String name = "홍길동"; // 클래스를 선언할 때 각 멤버변수에 값을 할당하는 것을 "명시적 초기화"라고 함
	int age;
	boolean gender = true;
	// 2) 클래스 변수
	static double rate = 0.09;
	
	static{
		//[클래스 초기화 블럭] : 블럭 앞에 static 붙이면 됨
		// 클래스 변수를 초기화하기 위한 블럭
		// 객체 생성과 상관없이 프로그램이 시작할 때
		// 한 번 static 초기화 블럭은 실행(호출)된다.
		rate = 0.07;
		System.out.println("클래스 초기화 블럭 호출됨");
		
		//인스턴스 변수는 클래스 초기화 블럭 내에서 초기화할 수 없다.
	}
	
	// [생성자]
	{
		// [인스턴스 초기화 블럭]
		// 오버로딩 된 생성자에서 중복되는 초기화 코딩이 있다면 그 중복된 초기화 코딩을 
		// 인스턴스 초기화 블럭으로 따로 선언할 때 사용하는 블럭
		this.name = "익명";
		System.out.println("인스턴스 초기화 블럭 호출됨");
	}
	Ex09(){
		//this.name = "익명"; //중복 선언
		System.out.println("디폴트 생성자 호출됨");
	}
	Ex09(int age){
		//this.name = "익명"; //중복 선언
		this.age = age;
	}
	Ex09(int age, boolean gender){
		//this.name = "익명"; //중복 선언
		this.age = age;
		this.gender = gender;
	}
	
	public static void main(String[] args) {
		
		Ex09 obj1 = new Ex09(); //객체 생성 > 인스턴스 초기화 블럭 호출
		Ex09 obj2 = new Ex09(20); //객체 생성 > 인스턴스 초기화 블럭 호출
		System.out.println(obj1.name); //Ex09에서 "익명"으로 값을 줬기 때문에 "익명"으로 찍힘. 생성자 파트가 나중에 초기화 된다는 것
		
		System.out.println(Ex09.rate);
		
		
		// [변수의 초기화]
		/*
		 * 1. 지역변수		: 반드시 초기화해야 사용 가능
		 * 
		 * 2. 인스턴스 변수	: 초기화하지 않아도 각 자료형의 기본형으로 초기화 되어있음 
		 * 3. 클래스(static) 변수	: 초기화하지 않아도 각 자료형의 기본형으로 초기화 되어있음
		 * 
		 *  [멤버 변수 초기화 방법]
		 *  1. 명시적 초기화 - 클래스를 선언할 때 각 멤버변수에 값을 할당하는 것
		 *  2. 생성자 초기화
		 *  3. 초기화 블럭
		 *     ㄴ 인스턴스 초기화 블럭
		 *     ㄴ 클래스(static) 초기화 블럭
		 */
	} //main

}//class
