package days16;

// 영업직 사원 최종(마지막) 클래스
// final class - 자식클래스를 가질 수 없는 최종 클래스
public final class SalesMan extends Regular {

	// 필드 - name, addr, tel, hiredate, basepay
	// 생성자 - 상속 X
	// 메서드 - @(재정의)dispEmpInfo(), @(재정의)toString(), getPay()
	// 영업직은 수당 포함
	private int sales;	  //물건 판매 갯수
	private int comm; //하나 팔때마다 받는 커미션

	//생성자
	public SalesMan() {
		super(); //부모(Regular) 클래스의 디폴트 생성자 호출
		System.out.println("> SalesMan 디폴트 생성자 호출됨.");
	} //SalesMan

	public SalesMan(String name, String adrr, String tel, String hiredate
			, int basePay, int sales, int comm) {
		super(name, adrr, tel, hiredate, basePay); //부모의 생성자 호출해서 초기화
		this.sales = sales;
		this.comm = comm;
		System.out.println("> SalesMan (7)  생성자 호출됨.");
	}

	@Override
	public void dispEmpInfo() {
		System.out.printf("사원명 : %s , 주소 : %s, 연락처 : %s, 입사일자 : %s, 기본급 :%d\n"
				,this.getName(), this.getAdrr(), this.getTel()
				, this.getHiredate(), this.getBasePay()
				, this.sales, this.comm);		
	}

	@Override
	public int getPay() { //영업직 사원의 급여 계산.
		return super.getPay() + this.sales * this.comm;
	}	

} //class
