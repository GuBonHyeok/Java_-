package days16;

/**
 * @author Bonggu
 * @date 2024. 1. 22.- 오전 10:21:37
 * @subject 클래스들 간의 관계
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// [클래스들 간의 관계]
		// 1. has-a 관계   
		//  → A클래스가 B라는 클래스를 가지는 관계 (Car - Engine 클래스 참조)
		//		  객체			    객체	  포함
		//  예) 자동차 			엔진
		//		  Car			  Engine
		// 2. is-a 관계 (상속관계)
		Engine engine = new Engine();
		//Car myCar = new Car();
		// DI (의존성 주입) 하는 방법 중 하나 : setter 활용
		//myCar.setEngine(engine);
		//생성자 활용하는 방법
		Car myCar = new Car(engine);
		
		// 20년간 타서 엔진이 고장났다고 치면
		engine = new Engine();
		myCar.setEngine(engine);
		
		myCar.sppedUp(100); //연료 100 주입하여 속도 올리기
		// 속도 출력
		int currentSpeed = myCar.getEngine().speed; //private로 되어있는 Car 클래스에서 
		System.out.println("현재 속도 : "+currentSpeed);
		
		myCar.sppedDown(50); //연료 50 빼서 속도 낮추기
		currentSpeed = myCar.getEngine().speed;
		System.out.println("현재 속도 : "+currentSpeed);
		

	}

}
