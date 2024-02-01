package days17;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import days16.Employee;
import days16.Temp;

/**
 * @author kenik
 * @date 2024. 1. 23. - 오전 10:45:52
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// [ up casting ]
		// Employee emp = new Temp();
		
		List  list = new ArrayList();

		test(list);
		test(new ArrayList()); // new SalesMan(); 
		test(new Vector());    // new Regular();
	} // main
	//                    Employee emp
	public static void test(List list) {  // 매개변수 다형성
		
	}

} // class










