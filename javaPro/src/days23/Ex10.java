package days23;

import java.io.FileWriter;
import java.text.FieldPosition;
import java.util.Properties;

/**
 * @author Bonggu
 * @date 2024. 1. 31.- 오후 4:20:46
 * @subject [Properties 컬렉션 클래스] - 자주 사용 !
 * @content 내일 시험
 * 
 * setProperty
 * getProperty
 */
public class Ex10 {

	public static void main(String[] args) {
		// [Properties 컬렉션 클래스] - 자주 사용 !
		//	1) == HashTable 컬렉션 클래스
		// 2) Map = entry (key + value)
		//	3)						String, String 즉 키와 벨류가 모두 String인 Hashtable 이다.
		// 4) 환경 설정 값들을 읽기/쓰기할 때 많이 씀
		// 5) put(), get() 를 사용하지 않고 대신 setProperty(), getProperty() 사용
		// 6) 저장할 파일의 확장자는 .properties 확장자를 사용한다.
		// 7) store() 오버로딩. : 파일로 저장함
		//		storeToXML() 
		// 8) load() 파일 읽어올 때ㅑ

		// 예) DBMS(오라클) + Java 연동할 때 설정 정보 : DB 연결 설정 정보		
		String className = "oracle.jdbc.driver.OracleDriver";            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger"; 

		Properties dbConfig = new Properties();
		// dbConfig.put(key, value); 이것도 사용 가능하긴 함
		dbConfig.setProperty("className", className);
		dbConfig.setProperty("url", url);
		dbConfig.setProperty("user", user);
		dbConfig.setProperty("password", password);

		//String value = (String) dbConfig.get("className"); // 이렇게 가져와도 되긴 됨
		String value = dbConfig.getProperty("className");
		//System.out.println(value);

		// Properties dbConfig 객체 안에 DB 연결 정보가 저장되어있음.
		// -> 파일로 저장!

		// 앞으로 . 이나 .. 를 찍으면 ? "상대경로" (기준이 필요함)
		// .		현재 디렉토리   \javaPro
		// ..		상위 디렉토리	  \
		String path = ".\\src\\days23\\jdbc.properties";

		try(FileWriter fw = new FileWriter(path)) {

			dbConfig.store(fw, "db connection config.."); //()의 첫번째에는 fw를, 두번째는 주석처리할 설명을 써준다
			System.out.println("SAVE END");

		} catch (Exception e) {
			e.printStackTrace();
		}

	} //main

} //class










