package days17;

public class Car {
	// 필드
	String name; //모델명
	String gearType; //기어 타입
	int door; //문짝 수
	
	//인터페이스 (다형성) Engine 
	private Engine engine = null;
		
	public Engine getEngine() { //getter , setter를 만들면 private 객체에 접근 가능
		return engine;
	}
	//									현대, 삼성, 기아 엔진이 매개변수로 옴 (매개변수 다형성)
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	// 생성자
	public Car() {	
		
	} //디폴트 생성자
	
	//						(매개변수 다형성)
	public Car(Engine engine) {
		this.engine = engine;
	}

	// 메서드 
	void sppedUp(int fuel) {		
		this.engine.moreFuel(fuel);
	}
	void sppedDown(int fuel) {		
		this.engine.moreFuel(fuel); 		 
	}
	void stop() {
		this.engine.stop();
	}

} //Car
 