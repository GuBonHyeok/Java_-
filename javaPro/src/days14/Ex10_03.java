package days14;

/**
 * @author Bonggu
 * @date 2024. 1. 18.
 * @subject
 * @content
 */
public class Ex10_03 {

	public static void main(String[] args) {

		Point p1 = new Point();
		p1.x = 10; //point 클래스 멤버변수
		p1.y = 20; //point 클래스의 멤버변수 y

		Point p2 = new Point();
		p2.x = 1; //point 클래스 멤버변수
		p2.y = 2; //point 클래스의 멤버변수 y

		// p1 좌표 + p2 좌표
		p1.plusPount(p2); // p1에 p1+p2를 넣겠다는 것
		p1.dispXY();

		// p1 좌표 + [p2] 좌표
		p2.plusPount(p1); //p1의 매개변수들을 받아서 plusPount로 넘겨서 나온 리턴값을 p2에 넣는 것 
		p2.dispXY();


	} //main

} // class








