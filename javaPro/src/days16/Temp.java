package days16;

//임시직 사원 클래스
public class Temp extends Employee {
	// 필드 - name, addr, tel, hiredate
	// 생성자 - X
	// 메서드 - dispEmpInfo(), @toString(), getter, setter
	private int days;			//근무 일수
	private int payOfday;	//하루 일당. 임시직은 하루 일당으로 받기 때문에 Regular와 차이점이 있어서 따로 변수 생성했다
	
	// 생성자
	public Temp() {
		super();
		System.out.println("> Temp 디폴트 생성자 호출됨.");
	} //Temp 디폴트 생성자
	
	public Temp(String name, String adrr, String tel, String hiredate, int days, int payOfday) {
		super(name, adrr, tel, hiredate);
		this.days = days;
		this.payOfday = payOfday;
		System.out.println("> Temp 6 생성자 호출됨.");
	} //Temp 6 생성자
	
	@Override
	public int getPay() { 
		return this.days * this.payOfday;
	} //부모 dispEmpInfo 오버라이딩

	@Override
	public void dispEmpInfo() {
		System.out.printf("사원명 : %s , 주소 : %s, 연락처 : %s, 입사일자 : %s\n"
				+ "근무일수 :%d, 하루일당 : %d"
				,this.getName(), this.getAdrr(), this.getTel(), this.getHiredate()
				,this.days, this.payOfday);

	} //부모 dispEmpInfo 오버라이딩
	
	
	
	
	
	

}
