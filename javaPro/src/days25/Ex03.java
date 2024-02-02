package days25;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

/**
 * @author Bonggu
 * @date 2024. 2. 2.- 오전 10:29:50
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [ Properties 컬렉션 클래스를 설명한 적 있음 ]
		/*
		 * 1. Map의 한 종류이며 Key와 Value가 String 타입이다.
		 * 2. 환경 설정 값들을 읽어올 때 /쓸 때 유용하다.
		 * 3. 메서드
		 *    - store() : 파일 저장할 때
		 *    - load() : 파일 읽어올 때
		 *    - setProperty(), getProperty() 사용
		 */	

		String className = "oracle.jdbc.driver.OracleDriver";            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger"; 

		Properties dbConfig = new Properties();
		dbConfig.setProperty("className", className);
		dbConfig.setProperty("url", url);
		dbConfig.setProperty("user", user);
		dbConfig.setProperty("password", password);
		
		String path = ".\\src\\days25\\jdbc.xml";

		try(FileOutputStream fos = new FileOutputStream(path)) {
			// XML 파일 형식으로 환경설정 값 들을 저장.
			dbConfig.storeToXML(fos, "db connection config.."); //storeToXML은 문자가 아닌 
			System.out.println("SAVE END");

		} catch (Exception e) {
			e.printStackTrace();
		} //try~catch

	} //main

} //class
