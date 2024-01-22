package days16;

// [사원클래스]
// 모든 사원들이 공통적으로 가져야할 멤버(필드,메서드)를 구현한 클래스
// ↓
public abstract class Employee { //Object로부터 상속받은 클래스
	//필드
	private String name; //사원명
	private String adrr; //사원 주소
	private String tel; //사원 연락처
	private String hiredate; //입사 일자
	
	//생성자
	public Employee() {
		System.out.println(">Employee 디폴트 생성자 호출됨.");
	}

	public Employee(String name, String adrr, String tel, String hiredate) {
		this.name = name;
		this.adrr = adrr;
		this.tel = tel;
		this.hiredate = hiredate;
		System.out.println("> Employee 4 생성자 호출됨.");
	}

	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdrr() {
		return adrr;
	}

	public void setAdrr(String adrr) {
		this.adrr = adrr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	//사원들의 정보를 출력하는 메서드
	public void dispEmpInfo() {
		System.out.printf("사원명 : %s , 주소 : %s, 연락처 : %s, 입사일자 : %s\n"
				,this.name, this.adrr, this.tel, this.hiredate);
	} //dispEmpInfo


	/*
	//Alt + Shift + S 후 override el met 누르기
	@Override
	public String toString() {
		return String.format("> 사원명 : %s , 주소 : %s, 연락처 : %s, 입사일자 : %s\n"
				,this.name, this.adrr, this.tel, this.hiredate); //( ) 형식의 문자열 반환
	}
	*/
	
	//Alt + Shift + S 후  Generate toString 누르기
	@Override
	public String toString() {
		return "Employee [name=" + name + ", adrr=" + adrr + ", tel=" + tel + ", hiredate=" + hiredate + "]";
	}
	
	// 모든 사원의 급여 계산. 자식 클래스들이 상속받아서 오버라이딩해서 써먹으라고 비어있는 필요없는 함수 만듦 
	// 언어에 따라서는 가상 (Virtual) 메서드 라고도 함.
	/*
	public int getPay() {
		return 0;
	}	
	*/
	// ↓ { } 몸체는 상속받는 클래스에서 재정의해서 사용하면 되기에 { } 몸체를 아예 구현하지 않겠다..
	public abstract int getPay();
	// ↑ { } 몸체가 없는 메서드. '구현이 안된 추상 메서드' . 객체를 생성할 수 없는 불완전한 클래스 
	// 메서드에 abstract를 붙일 거면 클래스도 abstract를 붙여야한다. 
	

}
