package days23;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/**
 * @author Bonggu
 * @date 2024. 1. 31.- 오후 5:05:20
 * @subject 이게 뭔지는 모르겠는데
 * @content 내일 시험!
 */
public class Ex11 {

	public static void main(String[] args) {
		//String userDir = System.getProperty("user.dir");
		
		Properties p =System.getProperties();
		Set<Entry<Object, Object>> es = p.entrySet();
		
		Iterator<Entry<Object, Object>> ir = es.iterator();
		while (ir.hasNext()) {
			Entry<java.lang.Object,Object> entry =ir.next();
			String key = (String) entry.getKey();
			String  value =(String) entry.getValue();
			System.out.printf("%s:%s \n",key,value);
		}

	} //main

} //class
