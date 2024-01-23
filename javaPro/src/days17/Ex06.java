package days17;

/**
 * @author Bonggu
 * @date 2024. 1. 23.- 오전 11:37:32
 * @subject 인터페이스에 대해서. (자바에서 제일 중요한 것이 다형성인데 다형성에서도 중요한 것)
 * @content [내일 시험]
 */
public class Ex06 {

	public static void main(String[] args) {
		// [인터페이스(interface)]
		/*
		 * 1. 자바의 자료형
		 *    1) 기본형
		 *    2) 참조형 - 배열, 클래스, '인터페이스'
		 *       예) 인터페이스명 변수명;
		 * 2. 일종의 추상클래스이다. (추상클래스 ? 모든 객체의 공통적인 부분을 구현한 부분)
		 *     필드는 선언 X				ex)  
		 *     일반 메서드 선언 X		ex)  
		 *     상수만 선언 O				ex)   
		 *     추상메서드만 선언 O		ex)  
		 *     				+
		 *     [jdk 1.8부터] 1) static 메서드 선언 O
		 *     					   2) default 메서드 선언 O 
		 * 3. 인터페이스끼리 상속 가능
		 * 		(extends 키워드 사용)
		 * 4. 인터페이스를 사용하면 다중 상속이 가능하다.
		 * 5. 클래스가 인터페이스를 구현할 때는 implements 키워드를 사용해서 클래스 선언
		 * 6. 인터페이스 안의 필드는 상수만 선언가능
		 * 		ex) double PI = 3.14; 이렇게만 해도
		 * 			> [public final static] double PI = 3.14; 괄호가 생략된 것이다
		 * 		인터페이스 안의 메서드는 모두 추상메서드이기 때문에
		 * 		void test();
		 *  > [public abstract] void test(); 인 것이다.
		 * 
		 */

	} //main

} //class

// 자바에서 인터페이스 명 : ~~~able
interface Moveable{
	//상수
	//추상메서드
	void move(int x, int y); //public abstract 생략되어 있음
	//static
	//default 메서드
}

abstract class Unit{ //바로 객체를 생성하지 말라는 추상클래스 
	int currentHP; //현재 유닛의 체력
	int x; //현재 유닛의 위치(x좌표)
	int y; //현재 유닛의 위치(y좌표)
}

interface Attackable {
	void attack(Unit unit);
}

// 인터페이스끼리 다중 상속(extends) 가능
interface Fightable extends Moveable, Attackable{ //Moveable, Attackable 인터페이스 상속. 인터페이스는 다중상속 가능
	//추상메서드
}

// 하늘 유닛
class AirUnit extends Unit {

}
// 땅 유닛
class GroundUnit extends Unit {

}
//마린, 탱크 등등 수송하는 수송선
class DropShip extends AirUnit implements Fightable, Repairable{
	@Override
	public void move(int x, int y) {

	}
	@Override
	public void attack(Unit unit) {

	}

}

// 군인
//클래스가 인터페이스를 구현할 때는 implements 키워드 사용
//class Fighter implements Moveable, Attackable{
class Fighter implements Fightable{ //인터페이스도 implements 가능

	@Override
	public void attack(Unit unit) {
		//총, 칼 공격

	}
	@Override
	public void move(int x, int y) {
		//도보 이동

	} 

}

// 탱크
class Tank extends GroundUnit implements Fightable, Repairable { //탱크는 땅에서 사용하는 유닛이라 GroundUnit

	@Override
	public void move(int x, int y) {
		// 궤도 이동

	}
	@Override
	public void attack(Unit unit) {
		// 포 쏘는 공격

	}	
}

// 수리가 가능한 유닛
// 멤버 없음
interface Repairable{ }

// SCV
// 수리 가능		: Tank, SCV
// 수리 불가능 	: Fighter

class SCV extends GroundUnit implements Repairable {
	SCV(){	}

	//void repair(Unit unit) { //수리하는 기능 메서드
	void repair(Repairable unit) { //매개변수 다형성에 의해 가능	
		if (unit instanceof Tank) {
			//탱크 수리 코딩			
		} else if (unit instanceof DropShip) {
			//드랍쉽 수리 코딩
		} else if (unit instanceof SCV) {
			//SCV 수리 코딩
		} //else-if
	} //repair
}

//바다에서 사용할 수 있는 유닛
class Marine extends Unit implements Fightable{
	@Override
	public void move(int x, int y) {
			
	}

	@Override
	public void attack(Unit unit) {
		
	}
	
} //Marine

