package days16;

public class Car {
	// 필드
	String name; //모델명
	String gearType; //기어 타입
	int door; //문짝 수
	// 현재 이 예제는 결합력이 높은 코딩 -> 좋은 코딩이 아님!
	// 엔진 객체 생성 필요
	//아래는 명시적 초기화
	//private Engine engine = new Engine(); // Car 클래스가 Engine 클래스를 가졌다 (has - a) 관계
	private Engine engine = null; //객체 선언만. 생성하지 않음
	
	
	
	public Engine getEngine() { //getter , setter를 만들면 private 객체에 접근 가능
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	// 생성자
	public Car() {	
		engine = new Engine(); //결합력이 높은 코딩. 
	} //디폴트 생성자
	
	
	public Car(Engine engine) {
		this.engine = engine;
	}

	// 메서드 
	void sppedUp(int fuel) {		
		this.engine.moreFuel(fuel); //Car가 가지고있는 engine 클래스의 moreFuel 메서드를 가져와서 fuel을 입력해준다
	}
	void sppedDown(int fuel) {		
		this.engine.moreFuel(fuel); //Car가 가지고있는 engine 클래스의 moreFuel 메서드를 가져와서 fuel을 입력해준다
		 
	}
	void stop() {
		this.engine.stop();
	}

} //Car
 