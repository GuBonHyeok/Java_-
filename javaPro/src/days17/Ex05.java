package days17;

/**
 * @author kenik
 * @date 2024. 1. 23. - 오전 10:52:23
 * @subject   싱글톤(Signleton) 패턴
 * @content   장점,단점
 *            오직 1개의 객체를 생성해서 사용하는 패턴
 */
public class Ex05 {

	public static void main(String[] args) {
		// 11:03 수업 시작
		// A 작업자  BoardDAO객체를 사용해서 DB처리(CRUD)
		// The constructor BoardDAO() is not visible
		BoardDAO dao1 =  BoardDAO.getInstance();  // new BoardDAO();
		//                     해시코드
		System.out.print( dao1.hashCode() + " ");
		dao1.insert();		
		// B 작업자                    "
		BoardDAO dao2 = BoardDAO.getInstance();  //new BoardDAO();
		System.out.print( dao2.hashCode() + " ");
		dao2.delete();
		// C 작업자                    "
		BoardDAO dao3 = BoardDAO.getInstance();  //new BoardDAO();
		System.out.print( dao3.hashCode() + " ");
		dao3.update();
		// D 작업자                    "
		BoardDAO dao4 = BoardDAO.getInstance();  //new BoardDAO();
		System.out.print( dao4.hashCode() + " ");
		dao3.select();

	} // main

} // class

// [Data Access Object]
// DataBase <-> data CRUD
// 싱글톤 패턴
class BoardDAO{
	
	// 생성자의 접근지정자 : private 수정
	// 해당 클래스 외부에서는 생성자를 호출할 수 없기에 
	// 객체 생성은 못한다. 
	private BoardDAO() {}
	
	private static BoardDAO boardDAO = null;
	
	// synchronized 동기화 처리된 메서드 
	public synchronized static BoardDAO getInstance() {
		if (boardDAO == null) {			
			boardDAO = new BoardDAO();
		}
		return boardDAO;
	}
	
	void insert() {
		System.out.println("추가");
	}
	void update() {
		System.out.println("수정");
	}
	void delete() {
		System.out.println("삭제");
	}
	void select() {
		System.out.println("조회");
	}
	
}



