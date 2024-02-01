package days24;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Ex {

	public static void main(String[] args) {
		Map map = new HashMap();
		System.out.println("==============get properties==============");
		map = getMyProperties(".\\src\\days19\\Java 팀 구성.txt");
		System.out.println(map);
	}//main

	public static Map getMyProperties(String propertiesFile){
		Properties properties = new Properties();
		Map map = new HashMap();

		try {
			properties.load(new FileInputStream(propertiesFile));
			for (String key : properties.stringPropertyNames()) {
				map.put(key, properties.getProperty(key));
			}//for

		} catch (IOException e) {
			e.printStackTrace();
		}//try~catch
		return map;
	}//Map
}//class