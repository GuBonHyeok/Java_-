package days14;

public class Point {
	
	public int x = 0; //x 좌표
	public int y = 0; //y 좌표
	
	public Point(int i, int j) {
		x = i;
		y = j; 
	}

	// method 출력
	public void dispXY() {
		System.out.printf("> x = %d, y = %d\n",x,y); //여기에서 x,y는 호출한 객체의 x,y
	}
	
	//p1.movePoint() 가 호출했기 때문에p.x말고 x로 쓴다
	public void movePoint(int pos) {  //이동할 만큼 pos를
		x += pos;
		y += pos;
		
	}
	
	// p1.moveNewPoint(50); 50만큼 이동시켜라
	public Point moveNewPoint(int pos) {  //새로 만들어질 Point라는 리턴타입(참조형)을 만든다
		int newx = x + pos; //현재 newx는 p1의 x좌표
		int newy = y + pos; //현재 newy는 p1의 y좌표
		
		Point p = new Point();
		p.x = newx;
		p.y = newy;
		
		return p; //새로 만들어진 p 객체를 리턴
		
	}

	public void plusPount(Point p2) {
	      x += p2.x;
	      y += p2.y;

		
	}

}
