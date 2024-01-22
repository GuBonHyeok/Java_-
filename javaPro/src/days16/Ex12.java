package days16;

/**
 * @author Bonggu
 * @date 2024. 1. 22.- 오후 5:16:02
 * @subject 클래스 간의 형 변환
 * @content
 */
public class Ex12 {

	public static void main(String[] args) {
		// [클래스 간의 형 변환]
		/*
		//  1. 반드시 상속 관계가 있어야 된다.
		// Regular emp = new Temp(); ( X ) 상속관계 아님
		// ↓ 자동으로 업캐스팅 (up casting) 자식 객체를 부모 객체에 참조시키는 것
		Regular emp = new SalesMan(); // ( O ) 상속관계
		// ↓ 형변환이 필요한 다운캐스팅 (down casting) 부모 객체를 자식 객체에 참조시키는 것
		SalesMan sm =  (SalesMan)emp; // cast 연산자로 강제 형변환 필요 . cast 연산자 ? ( ) 로 묶는 것
		*/
		
		// 아래 X. up Casting 한 경우에만 down Casting 할 수 있음...
		Regular emp = new Regular();
		SalesMan sm = (SalesMan) emp;
		sm.dispEmpInfo();

	} //main

} //class
