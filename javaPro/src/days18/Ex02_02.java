package days18;

// import java.lang.*; << 따로 해당 구문을 적어주지 않아도 자동으로 컴파일러가 import 구문을 추가해줌
/**
 * @author Bonggu
 * @date 2024. 1. 24.- 오전 10:27:24
 * @subject  java.lang 패키지에 대해서 - 자바에서 가장 기본이 되는 클래스
 * @content  유용한 클래스들 뭐있나~ (java.util 패키지)
 * 					  Object.equals() + Overriding
 * 
 * 	-	FullName : 패키지.클래스 까지 
 * 		SimpleName : 클래스 이름만
 *     https://blog.naver.com/minhuck_02/223160555651 참고
 * -   공변 반환 타입
 *  
 *  1. 에러메세지 확인
 *  2. 에러 라인 확인
 *  3. 복사해서 구글링!!
 * 
 */
public class Ex02_02 {

	public static void main(String[] args) {
		//현실에서는 주민번호가 동일하면 같은 사람이다.
		Person p1 = new Person("222", "메에시");
		Person p2 = new Person("111", "호날두");
		//The method clone() from the type Object [ is not visible ]
		
		try {
			Person p1Clone =  (Person) p1.clone(); //p1Clone 객체에 p1을 복제해서 넣는다. 여기서 p1.clone()은 Object이기때문에 강제 형변환
			System.out.println(p1Clone); //p1을 그대로 복제. //만약 아래에서 공변 반환타입을 썼으면 30번 라인처럼 형변환을 할 필요 없음
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 

		//Object 클래스의 toString()
		//해당 객체의 풀네임 + @해쉬코드의 16진수 값 출력
		//System.out.println(p1.toString()); //days18.Person@73a28541
		//System.out.println(p2.toString()); //days18.Person@6f75e721
		//System.out.println(Integer.parseInt());

		//Object 클래스의 hashCode
		//System.out.println(p1.hashCode()); //1940030785 각 객체마다 고유의 해쉬코드가 있는데 같으면 같은 객체라고 인식하면 됨
		//System.out.println(p2.hashCode()); //1869997857
		// 제네릭 < >
		// Class<? extends Person> cls = p1.getClass(); //getClass : 이 객체의 클래스 타입을 얻어오겠다는 메서드
		//Object 클래스의 getClass
		/*
		Class cls = p1.getClass();

		String fullName = cls.getName(); //getName : 어떤 패키지의 어떤 클래스인지 알아올 수 있는 메서드 (fullName이라고 부름)
		System.out.println(fullName);
		String packageName = cls.getPackageName(); //getPackageName : 패키지 이름만 
		System.out.println(packageName + " < 패키지 네임");
		String className = cls.getSimpleName(); //getSimpleName : 클래스 이름만
		System.out.println(className + " < 클래스 네임");
		 */

	} //main

} //class

class Person implements Cloneable{ //복제를 하려면 class에 cloneable 인터페이스를 implements 해줘야함
	String rrn; //주민등록번호
	String name; //이름

	//매개변수 2 생성자
	public Person(String rrn, String name) {
		super(); //부모의 default 생성자를 불러오겠다는 것
		this.rrn = rrn;
		this.name = name;
	}

	// 정보를 출력하는 메서드를 dispPerson() 이런식으로 만들었었는데 이제 안해도 됨!
	// toString() 메서드를 오버라이딩해서 만들면 된다.
	// (그 객체의 정보를 출력하는 용도로 쓰려면)

	// Alt + Shift + S 해서 Generate toString()
	@Override
	public String toString() {
		//return "Person [rrn=" + rrn + ", name=" + name + "]";
		return String.format("> RRN : %s, NAME : %s", rrn, name);
	}

	// Person pClone = p1.clone(); << 복제를 하려면 이렇게. 리턴 타입은 복제하고 난 Point 타입임
	// 얕은 복제, 깊은 복제 중에 clone은 얕은 복제

	/*
	@Override
	protected Object clone() throws CloneNotSupportedException { //Object의 clone을 재정의. 접근지정자의 범위 외에는 전부 같아야함
		Person pClone = null;
		pClone = (Person) super.clone(); //부모의 메서드를 복제해서 pClone에 넣는다
		//클래스간의 형변환 중에서 Down Casting 이기 때문에 강제 형변환 해줌. (Person : 자식 클래스. Object : 부모 클래스)
		return pClone; 
	}
	 */

	// JDK 1.5에서 공변반환타입 추가?
	// Object 클래스의 clone() 메서드를 오버라이딩했기 때문에 리턴타입은 부모의 Object이어야 하지만
	// 재정의하는 자식 클래스의 타입으로 변경이 가능하도록 문법이 추가된 것
	/*
	@Override
	protected Person clone() throws CloneNotSupportedException { //Object > Person으로 바꿔서 리턴값도 자식틀래스 타입 
		Person pClone = null;
		pClone = (Person) super.clone(); //부모의 메서드를 복제해서 pClone에 넣는다
		//클래스간의 형변환 중에서 Down Casting 이기 때문에 강제 형변환 해줌. (Person : 자식 클래스. Object : 부모 클래스)
		return pClone; 
	}
	 */
	/* ???이건 뭔지 모르겠다
	protected Person clone() 
		Person pClone = null;
		pClone = (Person) super.clone(); //부모의 메서드를 복제해서 pClone에 넣는다
		//클래스간의 형변환 중에서 Down Casting 이기 때문에 강제 형변환 해줌. (Person : 자식 클래스. Object : 부모 클래스)
		return pClone; 
	}
	 */

	protected Person clone() throws CloneNotSupportedException { //Object > Person으로 바꿔서 리턴값도 자식틀래스 타입 
		Person pClone = null;
		pClone = (Person) super.clone(); //부모의 메서드를 복제해서 pClone에 넣는다
		//클래스간의 형변환 중에서 Down Casting 이기 때문에 강제 형변환 해줌. (Person : 자식 클래스. Object : 부모 클래스)
		return pClone; 
	}




}











