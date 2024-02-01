package days24;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class Exam01 {
	
	/*
	 * 1. [ JSP/Servlet ] 
  days19 패키지 안에 있는 
  "1. Java 팀 구성.txt" 파일을 읽어와서
  
   Map 컬렉션 클래스 사용해서
      key : 1조, 2조 
      value :  직위( 팀장, 팀원)과 이름을 저장하는 클래스를 선언하고
               MemberVO
               그 클래스 객체를 저장하는 컬렉션 클래스 사용   
               저장하고 실행결과 형식으로 출력하는 코딩을 하세요.  
  [실행결과]
[1조(8명):구본혁]
  [1] 류영은
  [2] 윤형준
  [3] 김영진
  [4] 강명건
  [5] 김진성
  [6] 유진
  [7] 이동찬
[2조(7명):원대안]
  [1] 이동영
  [2] 한재호
  [3] 권맑음
  [4] 박우현
  [5] 이시은
  [6] 조연화  
	 */

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap();
		String path = ".\\src\\days19\\Java 팀 구성.txt";
		String read;

		Properties loadFile = new Properties();
		try(FileReader fr = new FileReader(path)) {
			loadFile.load(fr);
			System.out.println(loadFile);
		} catch (Exception e) {
			e.printStackTrace();
		} //try~catch
		
		try {
			loadFile.load(new FileInputStream(path));
	         for (String key : loadFile.stringPropertyNames()) {
	        	 hm.put(key, loadFile.getProperty(key));
	           }
	         
	    } catch (IOException e) {
	          e.printStackTrace();
	    } System.out.println(hm);

	} //main

} //class


