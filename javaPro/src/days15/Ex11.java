package days15;

/**
 * @author Bonggu
 * @date 2024. 1. 19.- 오후 5:03:26
 * @subject 생성자 사용 객체 복제
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		
		//객체 복사(copy)
		//객체 복제(clone)
		
		Point p1 = new Point(1,2); //x=1, y=2를 가지고 있는 p1객체
		Point p2 = p1; //객체 복사(copy)
		pointCopy (p1);
		
		//객체 복제
		/*
		Point p3 = new Point();
		p3.x = p1.x;
		p3.y = p1.y;
		*/
		
		//생성자로 객체 복제
		//Point p3 = new Point(p1.x, p1.y); //새로 만들어지는 p3에 p1의 각 멤버를 넘겨주는 "객체 복제"
		
		//클래스 내부에 일부 멤버만 복제하려면?
		Point p3 = new Point(p1); //p1 자체를 매개변수로 넘겨준다.
		
		
	}//main
											//Point p = p1 객체 복사
	public static void pointCopy(Point p) { //p1
		
	}

}//class
