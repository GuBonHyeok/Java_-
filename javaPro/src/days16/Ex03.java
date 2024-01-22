package days16;



/**
 * @author Bonggu
 * @date 2024. 1. 22.- 오전 11:14:59
 * @subject 상속 (inheritance)
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [ is - a 관계 (상속 관계) ]
		/*
		 * 1. 상속 (inheritance) ?
		 *    - 기존의 클래스를 재사용하여 새로운 클래스로 작성하는 것
		 * 2. 상속의 장점 ?
		 *    - 코드의 재사용으로 생산성 향상, 유지보수가 용이함
		 * 3. 상속 형식
		 *    - [접근지정자] [기타제어자] class 클래스명 extends 슈퍼클래스{
		 *    }
		 * 4. class Point3D extends Point
		 *    - Point == 부모(조상)클래스, 기초클래스, Super 클래스, 상위클래스
		 *    - Point3D == 자식클래스, 파생클래스, Sub 클래스, 하위클래스
		 */


	} // main

} // class

class Point2D {
	int x;
	int y;

	Point2D(){ }
	Point2D(int x, int y){
		this.x = x;
		this.y = y;
	} //Point3D

/*
class Point3D {
	int x;
	int y;
	int z;

	Point3D(){ }
	Point3D(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	} //Point3D

}*/ 

class Point3D extends Point2D {
	int z;
	
	Point3D(){ }
	Point3D(int x, int y, int z){
		//생성자에서 부모의 생성자 호출
		super(x,y); // > 부모의 생성자
		this.z = z;
		
	}
	
}
//생성자
//메서드






