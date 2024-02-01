package days24;

/**
 * @author Bonggu
 * @date 2024. 2. 1.- 오후 4:29:00
 * @subject
 * @content
 */
public class Ex08 {
	enum Direction {EAST, SOUTH, WEST, NORTH} //이런 식으로 클래스 내부에서 선언해도 상관없다. 이 클래스 안에서만 쓸 생각이면

	public static void main(String[] args) {

		switch (Card.valueOf("HEART")) {
		case CLOVER:
			break;
		case HEART:
			break;
		case DIAMOND:
			break;
		case SPADE:
			break;
		}
		
		switch (Gender.남자) {
		case 남자:			
			//남자일 경우에 처리할 코딩 ~~ 이런 식으로..
			break;
		case 여자: 
			break;
		}//switch

	}//main

}//class

// enum Direction {EAST, SOUTH, WEST, NORTH} //이런 식으로 클래스 안에 선언해도 상관없다
