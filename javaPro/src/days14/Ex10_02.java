package days14;

/**
 * @author Bonggu
 * @date 2024. 1. 18.
 * @subject 리턴 자료형이 클래스
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) {
		// [리턴자료형 참조형(클래스)인 경우]
		//Point p1 = new Point(); //객체 생성
		//p1.x = 10;
		//p1.y = 20;
		Point p1 = new Point(10,20); //객체 생성
		
		// p1.x += 100; //100만큼 이동시킴
		// p1.y += 100; //100만큼 이동시킴
		
		p1.movePoint(100);
		p1.dispXY();
		
		// 현재 p1 좌표에서 x,y거리가 50만큼 이동된
		// 새로운 Point 좌표가 필요하다고 한다.
		/*
		Point p2 = new Point(); //새로운 좌표 생성
		p2.x = p1.x + 50; //p1.x에서 50만큼 이동한 p2.x 생성
		p2.y = p1.y + 50; //p1.y에서 50만큼 이동한 p2.y 생성
		p2.dispXY();
		*/
		
		Point p2 = p1.moveNewPoint(50); // p2객체 생성
		p2.dispXY(); //새로운 Point를 생성해주는 것. 리턴 자료형이 class 
							

	} //main

} //class
