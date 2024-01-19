package days14;

/**
 * @author Bonggu
 * @date 2024. 1. 18.
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// [ 객체(클래스) 배열 ]
		// *** 여기서 points는 배열명이다. 객체명 아님!
		// Point [] points = new Point[10];

		/* 삼각형의 꼭지점처럼 여러개의 객체가 필요하다면
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
		 */
		
		// 클래스 (객체) 배열
		// 클래스 (Point)를 자료형으로 선언된 배열을 "클래스 배열"
		Point [] points = new Point[3]; //여기 points는 배열명임!

		for (int i = 0; i < points.length; i++) {
			points[i] = new Point(); 
			points[i].dispXY(); //NullPointerException 발생
										 //여기 points는 객체명
		}

	} //main

} //class
