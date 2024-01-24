package days17;

/**
 * @author Bonggu
 * @date 2024. 1. 23.- 오전 11:05:01
 * @subject 싱글톤(Singleton) 패턴. 객체를 한 개만 생성하겠다는 패턴
 * @content 장점, 단점이 있다
 * 					오직 1개의 객체를 생성해서 사용하는 패턴
 * 
 * 					싱글톤 패턴 만드는 방법을 적으시오
 * 					1. 외부에서 객체 생성하지 못하도록 막는다 > 생성자 접근 지정자 private으로 바꾼다
 * 					2. 외부에서 접근할 수 있는(객체를 가져갈 수 있는)public static이 붙은 getInstance 메서드를 만들어준다.
 * 					3. 자기 자신 객체를 저장할 변수(필드)를 선언한다. > public static boardDAO
 * 					4. getInstance에서 만든 적이 있는지 없는지 if로 물어보고...없을 경우에만 자기 자신 객체 생성할 수 있도록 코딩
 */
public class Ex05 {

	public static void main(String[] args) {
		// 아래는 모두 새로운 객체를 만들어서 작업하고 있음.
		//A 작업자	BoardDAO 객체를 사용해서 DB처리 (CRUD)
		BoardDAO dao1 = BoardDAO.getInstance();//new BoardDAO(); //The constructor BoardDAO() is not visible. BoardDAO 가 private기 때문에
		//										해시코드
		System.out.println(dao1.hashCode()+" ");
		dao1.insert();
		//B 작업자
		BoardDAO dao2 = BoardDAO.getInstance();//new BoardDAO();
		System.out.println(dao2.hashCode()+" ");
		dao2.delete();
		//C 작업자
		BoardDAO dao3 = BoardDAO.getInstance();//new BoardDAO();
		System.out.println(dao3.hashCode()+" ");
		dao3.update();
		//D 작업자
		BoardDAO dao4 = BoardDAO.getInstance();//new BoardDAO();
		System.out.println(dao4.hashCode()+" ");
		dao4.select();

	} //main

} //class

// Data Acces Object : DAO
// DataBase <-> data CRUD (insert, update, delete, select)
// 싱글톤 패턴으로 객체는 하나만 만들어지도록
class BoardDAO{

	// 1. 생성자의 접근지정자 : private 수정
	// 		※ 해당 클래스 외에서는 생성자를 호출할 수 없기 때문에 객체 생성 못함.
	private BoardDAO() { } //디폴트 생성자
	
	private static BoardDAO boardDAO = null;
	//synchronized : 동기화 처리. 누군가 이 객체를 사용하고 있다면 잠기도록
	public synchronized static BoardDAO getInstance() { 
				if (boardDAO == null) {
			boardDAO = new BoardDAO(); //객체가 생성된 적이 없다면 자기 자신의 객체를 생성		
		}
		return boardDAO;
	}
	
	void insert() {
		System.out.println("추가");
	}
	void update() {
		System.out.println("업뎃");
	}
	void delete() {
		System.out.println("삭제");
	}
	void select() {
		System.out.println("조회");
	}
	
}











