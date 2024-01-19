package days15;

/**
 * @author Bonggu
 * @date 2024. 1. 19.- 오후 4:32:51
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		Document doc1 = new Document(); //doc1 객체 생성
		// "Noname1 문서가 생성되었습니다."
		Document doc2 = new Document("Sample.txt");
		// Sample.txt 문서가 생성되었습니다."
		Document doc3 = new Document();
		// "Noname2 문서가 생성되었습니다."
		Document doc4 = new Document();
		// "Noname3 문서가 생성되었습니다."
		
		System.out.println();


	} //main

} //class

// 보통 문서 객체
class Document{
	
	String filename = "Noname";
	static int count = 1; //객체가 생성되어야 사용할 수 있는 count임. static은 프로그램 실행과 동시에 올라가기에 static 붙이면 아래에서 쓸수 있음
	/*
	{
		//인스턴스 초기화 블럭. 객체 생성시마다 생성자보다 먼저 호출됨
		count++;
	}
	*/
	
	public Document() { 
		//Cannot refer to an instance field count while explicitly invoking a constructor > 객체가 생성되지 않았기 때문에 참조할 수 없음
		this(String.format("%s%d.txt", "Noname",count++)); //다른 생성자 호출 this(); 
	}//생성자 Document
	public Document(String fileName) {
		this.filename = fileName; // 멤버변수 가리키는 this.
		System.out.printf(" \"%s\" 문서가 생성되었습니다.\n", this.filename);
		
	} //생성자 Document (2)
	
} //class-Document



