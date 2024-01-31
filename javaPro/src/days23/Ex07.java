package days23;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

/**
 * @author Bonggu
 * @date 2024. 1. 31.- 오후 3:08:33
 * @subject A~Z, a~z, 0~9 ##### 찍기
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {

		HashMap<Character, Integer> hm = new HashMap<>();
		/*
		for (int i = 'A'; i < 'Z'; i++) { //'A'~'Z'까지 넣기
			hm.put((char)i, 0);			
		}
		for (int i = 'a'; i < 'z'; i++) { //'a'~'z'까지 넣기
			hm.put((char)i, 0);			
		}
		for (int i = '0'; i < '9'; i++) { //'0'~'9'까지 넣기
			hm.put((char)i, 0);			
		}
		*/
		for (int i = '0'; i < 'z'; i++) {
			if (Character.isDigit(i) || Character.isAlphabetic(i)) { //알파벳이거나 숫자이면 입력하고 아니면 건너뛰게끔
				hm.put((char)i, 0);
			} 	
			
		}//for	
		
		String fileName = "\\src\\days19\\Ex01.java";      
		String dir = "user.dir";
		String userDir = System.getProperty(dir);      
		String path = String.format("%s%s", userDir, fileName);

		try (FileReader fr = new FileReader(path); ){
			int code ;
			char one ;			
			while( (code = fr.read() ) != -1 ) {
				one = (char)code;		
				if (hm.containsKey(one)) { //읽어온 문자 one이 key에 해당하는 것인지 확인
					int count = hm.get(one);
					hm.put(one, count+1); //one에 한개씩 증가시켜서 hm에 넣는다
				}
			} // while					
		} catch (Exception e) {
			e.printStackTrace();
		} // try-catch

		Set<Entry<Character, Integer>> es =  hm.entrySet();
		Iterator<Entry<Character, Integer>> ir = es.iterator();
		while (ir.hasNext()) {
			Entry<Character, Integer> entry = ir.next();
			char key = entry.getKey();
			int value = entry.getValue();
			System.out.printf("'%c' : %s(%d)\n", key, "#".repeat(value) , value);

		}//while

	} //main

} //class
