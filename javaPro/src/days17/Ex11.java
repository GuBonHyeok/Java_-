package days17;

/**
 * @author Bonggu
 * @date 2024. 1. 23.- 오후 2:49:45
 * @subject html xml 구문분석. 
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		//parsing : 구분분석한다는 것
		String parsingFile = "hello.html";
		String docType = "html";
		
		Parseable parser = ParserManager.getParser(docType);
		parser.parse(parsingFile);
		
		System.out.println("end");

	} //main

} //class

interface Parseable{
	void parse(String fileName); //파일이름을 매개변수로 받아서 분석하는 함수
	default void print( ) {
		System.out.println("각각 parser 에서 인쇄기능 구현");
	}
}

//XML 파일을 구문분석하는 클래스
class XMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("XML 파일 구분 분석");
		
	}
	
}
//HTML 파일을 구문분석하는 클래스
class HTMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("HTML 파일 구분 분석");
	}
	
}

// Xml 파일 -> XmlParser
// Html 파일 -> HtmlParser
class ParserManager{
	//					리턴자료형			인터페이스 다형성 사용 함수
	public static Parseable getParser(String docType) { //Xml을 넘기냐, Html을 넘기냐에 따라 달라지게 하기 위해 
		if (docType.equals("xml")) {
			return new XMLParser();
		} else if  (docType.equals("html")) {
			return new HTMLParser();			
		} else {
			return null;
		} //else		
	} //getParser
} //ParserManager









