package days15;

//생성자 추가는 Alt + Shift + s
//저축관련 필드, 메서드가 구현된 클래스
public class Save {
	
	// 필드
	// 인스턴스변수
	private String name; //예금주
	private int money; //예금액
	
	// 클래스 변수 > 클래스당 하나만 만들어서 각 인스턴스가 공유하면서 쓰는 변수
	// 객체
	// 클래스명.필드명 or 클래스명.
	// = 공유 변수
	// = 스태틱 변수
	private static double rate = 0.04; //예금 이자율
	
	//생성자
	
	public Save() {}
	   public Save(String name, int money, double rate) {
	      this.name = name;
	      this.money = money;
	      this.rate = rate;
	   }  

	
	//getter, setter 자동 생성 (Alt + Shift + s)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public static double getRate() {
		return rate;
	}
	public static void setRate(double rate) {
		  int age = 20;
	      Save.rate = rate;

		//객체를 생성한 적이 없는데 호출하고 있음. this로 만들어지지 않은 이유는 static은 객체를 생성하지 않아도 메모리에 올라가기 때문에 this는 사용 못한다.
		//따라서 static 으로 
	}
	
	// 예금 정보 출력 메서드
	public void dispSave() {
		System.out.printf("> 예금주 : %s, 예금액 : %d, 이자율 : %.2f\n"
				, this.name, this.money, this.rate);
		
	} //dispSave

} //class
