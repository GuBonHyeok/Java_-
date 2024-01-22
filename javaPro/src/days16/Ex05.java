package days16;

/**
 * @author Bonggu
 * @date 2024. 1. 22.- 오전 11:38:05
 * @subject Object 클래스 (모든 클래스의 조상, 모든 클래스의 최상위 super class)
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		Point p1 = new Point(10,20);
		/*
		 *								Object
		 *				    ↑									↑
		 *				Point	클래스						Shape (도형) 클래스
		 *														↑
		 *										Circle(원), Triangle (삼각형)
		 * 
		 * 상속관계 == is~a 관계
		 * 					~은 ~이다.
		 * 					원은 도형이다.  ( O )
		 * 				삼각형은 도형이다.  ( O )
		 */
		
		/*
		Point center = new Point(50,50); // 원점 나타내는 코
		int radius = 10; // 반지름
		Circle c = new Circle(center, radius);
		*/
		
		/*
		Point [] p = new Point[3];
		p[0] = new Point(1,1); // 점 1
		p[1] = new Point(20,40); //점 2
		p[2] = new Point(10,5); //점 3
		
		*/
		//클래스 배열 초기화. 위의 코딩과 같음
		Point [] p = {
		new Point(1,1), // 점 1
		new Point(20,40), //점 2
		new Point(10,5) //점 3
		};
		Triangle t = new Triangle(p); //세 점을 가진 삼각형
		
	} //main

} //class

//자동으로 컴파일러가 Object 클래스를 상속받는다.
//
class Point { //필드 2개, 생성자 2개, 메서드 1개짜리 클래스
	//Object 필드,메서드 추가
	int x;
	int y;
	
	Point() {
		this(0,0);//생성자에서 또 다른 생성자 호출하는 this
	} //Point
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	} //Point(2)
	String getXY() {
		return String.format("(%d, %d)", this.x, this.y);
	} //getXY
	
} //Point

class Shape{
	String color = "black";
	
	void draw() {
		System.out.printf("[Color = %s] \n", this.color);
	}
	
} // Shape
class Circle extends Shape {
	// 원점 (x, y 좌표)
	//int x;
	//int y;
	Point center; //has - a 관계
	
	// 반지름 필요
	int r; //radius
	
	Circle() {
		//this(new Point (0,0), 0); // Circle(Point center, int r) 호출 코드.
		this(0,0,0); // Circle (int x, int y, int r) 호출 코드.
	}
	Circle(int x, int y, int r){
		//this.x = x;
		//this.y = y;
		this.center = new Point(x,y);
		this.r = r;
	}
	Circle(Point center, int r){
		//this.x = x;
		//this.y = y;
		this.center = center;
		this.r = r;
	}
	
	
	
} // Circle

//정의 ? 한 평면상에 있고 일직선상에 없는 3개의 점 a,b,c를
//			2개씩 쌍으로 하여.. 선문을 연결하여 이루어진 도형
class Triangle extends Shape {
	//Point p1;
	//Point p2;
	//Point p3;
	
	//클래스 배열 선언.
	//Point [] p = new Point [3];
	Point [] p = null;
	
	public Triangle(Point [] p) { // 생성자 DI (의존성 주입)
		this.p = p;
	}
} // Triangle












