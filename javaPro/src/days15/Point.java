package days15;

/**
 * @author Bonggu
 * @date 2024. 1. 19.- 오후 2:33:40
 * @subject
 * @content
 */
public class Point {
	
	public int x = 0; //x 좌표
	public int y = 0; //y 좌표
	
	public Point() {
		this(1);
		System.out.println("> Point 디폴트 생성자 호출됨..."); 
	}
	
	public Point(int i) {
		this(i,i); //매개변수 1개가 넘어오면 2개로 해서 매개변수 2개짜리 생성자 호출
		System.out.println("> Point (매개변수 1개짜리) 생성자 호출됨...");
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y; 
		System.out.println("> Point (매개변수 2개짜리) 생성자 호출됨..."); 
	}

	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}

	// method 출력
	public void dispPoint() {
		System.out.printf("> x = %d, y = %d\n",this.x,this.y); //여기에서 x,y는 호출한 객체의 x,y
	}
	
	//p1.movePoint() 가 호출했기 때문에p.x말고 x로 쓴다
	public void movePoint(int pos) {  //이동할 만큼 pos를
		this.x += pos;
		this.y += pos;
		
	}
	
	// p1.moveNewPoint(50); 50만큼 이동시켜라
	// 이 메서드는 리턴 자료형이 Point 인 참조타입
	public Point moveNewPoint(int pos) {  //새로 만들어질 Point라는 리턴타입(참조형)을 만든다
		int newx = this.x + pos; //현재 newx는 p1의 x좌표
		int newy = this.y + pos; //현재 newy는 p1의 y좌표
		
		//return p; //새로 만들어진 p 객체를 리턴
		return this; // p1 자기 자신을 리턴
		
	}

	public void plusPoint(Point p2) {
	      x += p2.x;
	      y += p2.y;
		
	}

}
