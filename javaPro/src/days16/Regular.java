package days16;

// 정규직 사원 클래스
public class Regular extends Employee {
	
	// [Object] 멤버들도 상속.
	// [Employee] 멤버들도 상속.
	// 필드 - name, addr, tel, hiredate
	// 생성자 - 상속되지 않음
	// 메서드 - dsipEmpInfo(), @toString()
	private int basePay; //기본급

	//생성자
	public Regular() {
		super(); //생성자에서 부모의 생성자를 호출할 때 super(); 사용
		System.out.println("> Regular 디폴트 생성자 호출됨");
	}

	// Generate Constructor using fields : 필드를 가지고 생성자 만들기
	public Regular(String name, String adrr, String tel, String hiredate, int basePay) {
		//this.name = name; //The field Employee.name is not visible
		//생성자에서 매개변수를 받는다? 부모의 필드를 초기화 하겠다는 것
		super(name, adrr, tel, hiredate); //부모의 변수들 초기화
		this.basePay = basePay; //Regular의 변수 basepay 초기화
		System.out.println("> Regular 5 생성자 호출됨");	
	}

	public int getBasePay() { //기본급을 가져오고
		return basePay;
	}

	public void setBasePay(int basePay) { //기본급을 설정하는 생성자
		this.basePay = basePay;
	}

	//dispEmpInfo 오버라이딩함
	@Override
	public void dispEmpInfo() {
		//super.dispEmpInfo(); //부모의 dispEmpInfo를 호출한다
		//System.out.printf(", 기본급 :  %d", this.basePay);
		
		System.out.printf("사원명 : %s , 주소 : %s, 연락처 : %s, 입사일자 : %s, 기본급 :%d\n"
				,this.getName(), this.getAdrr(), this.getTel(), this.getHiredate(), this.basePay);
		//부모 클래스에서 필드들이 private이기 때문에 Name~Hiredate까지는 get으로 가져오기
	}

	@Override
	public String toString() {
		return super. toString() + "Regular [basePay=" + basePay + "]";
	}
	
	// 급여 계산 메서드
	@Override
	public int getPay() {
		return this.basePay; //정규직 기본급이 있을 뿐
	}
	
	
	
	
	
	
	
	

} //class
