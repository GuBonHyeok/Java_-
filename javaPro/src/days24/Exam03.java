package days24;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Exam03 {

	
	public static void main(String[] args) { 
		String path = ".\\src\\days19\\Java 팀 구성.txt";
		Properties p =System.getProperties();
		Set<Entry<Object, Object>> es = p.entrySet();
		
		Iterator<Entry<Object, Object>> ir = es.iterator();
		while (ir.hasNext()) {
			Entry<java.lang.Object,Object> entry =ir.next();
			String key = (String) entry.getKey();
			String  value =(String) entry.getValue();
			System.out.printf("%s:%s \n",key,value);
		}
	}

}//class
