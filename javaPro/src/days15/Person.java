package days15;

public class Person {
	//field
	private String name;
	private int age;
	private boolean gender;
	
	//constructor
	public Person() {	}	
	public Person(String name) {
		this.name = name; //여기서 50개 필드 초기화하는 작업이라고 치면 아래 16번 라인에서 this(name)으로 호출
	}
	public Person(String name, int age) {
		this(name); //생성자에서 또 다른 생성자를 호출한다는 뜻임. 위의 11~13번 라인 작업을 호출하는 것
		//this();는 첫번째 줄에서만 호출 가능. 여러번 호출은 불가능?
		//this.name = name;
		//The assignment to variable age has no effect. 할당된 것이 효과가 없다
		this.age = age; //여기서 this.age는 멤버변수(필드) age, 그냥 age는 매개변수 age
		
	}

	//getter, setter > private 멤버에 접근하기 위한 메서드. getter : 얻어오는 메서드 / setter : 설정하는 메서드
	//은닉화 : private로 막아두고 특정 메서드로만 접근하게 해서 유효한 값을 입력하도록 
	public void setAge(int age) {
		if ( age >= 0 && age <= 125) {
			this.age = age; 
		} else {
			System.out.print("나이의 범위가 잘못됐습니다.");
		}
	}
	
	public int getAge() {
		return this.age;
	}
	
	//Ex06에서 호출 p1.dispPerson();
	public void dispPerson() {
		System.out.printf("이름 : %s 나이 : %d\n",this.name,this.age);
	}
	
} //person
