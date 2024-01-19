package days14;

/**
 * @author Bonggu
 * @date 2024. 1. 18.
 * @subject 좌표를 다루는 클래스 배열
 * @content
 */
public class Ex07_03 {

	public static void main(String[] args) {
		// 좌표를 다루는 클래스 선언해서 처리하면 용이하다 : Point 클래스
		Point [] points = new Point[5];
		for (int i = 0; i < points.length; i++) {
			points[i] = new Point(); //points 객체를 생성해주고
			points[i].x = 1; //points의 x 필드에 1
			points[i].y = 2; //points의 y 필드에 2를 저장
			points[i].dispXY();
		} // for		

	} // main

} // class

