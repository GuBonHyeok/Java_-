package days17;

/**
 * @author Bonggu
 * @date 2024. 1. 23.- 오후 12:42:42
 * @subject Car + Engine 인터페이스 사용 구현
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// 클래스들 간의 관계
		// 1) has ~ a 관계 (포함관계)
		// Car 클래스 + Engine 클래스
		// 2) is ~ a 관계 (상속관계)
		
		// 어떤 장점이 있을까?
		// Car 클래스 + Engine 클래스 + 인터페이스 사용 
		
		Engine engine = new H_Engine();
		Car myCar = new Car(engine);
		myCar.sppedUp(10);
		
		//엔진 고장으로 교체.
		myCar.setEngine(new K_Engine());
		myCar.sppedUp(10);
		
		//2024년도 기준 > H_Engine, K_Engine 2개 엔진밖에 없음
		//2029년도 기준 > S_Engine 업체 생김
		
		myCar.setEngine(new S_Engine());
		myCar.sppedUp(10);
		

	}

}
