package days14;

/**
 * @author Bonggu
 * @date 2024. 1. 18.
 * @subject 객체 복사 개념
 * @content
 */
public class Ex05_03 {

	public static void main(String[] args) {
		Point p1 = new Point(); //Point 라는 좌표 객체를 p1이라고 생성
		p1.x = 10;
		p1.y = 20;

		System.out.printf("x = %d, y = %d\n",p1.x,p1.y);

		swap(p1); //call by reference

		System.out.printf("x = %d, y = %d\n",p1.x,p1.y);

	}
	//									Point p1 = p2; 객체 복사( 같은 인스턴스를 참조하고 있다 )
	private static void swap(Point p1) {
		int temp = p1.x;
		p1.x = p1.y;
		p1.y = temp;

	}

}
