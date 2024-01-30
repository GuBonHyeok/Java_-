package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("유진");		
		list.add("원대안");		
		list.add("윤형준");
		System.out.println(list);
		
		//list.toArray가 Object 배열을 받기 때문에 String[] 으로 강제 형변환 시켜줘야함
		String [] names = (String[]) list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(names));
		
		// [2] String[] -> ArrayList 변환
		
		// 1) List 타입으로 String 배열 변환.
		List l = Arrays.asList(names); //asList 안에 자료형은 배열인 names로 넣어줘도 상관없다.		
		System.out.println(l);
		// 2) List탸입의 l을 새로운 ArrayList타입의 list2에 넣어준다.
		ArrayList list2 = new ArrayList(l); //컬렉션 타입이 들어가야 한다. 컬렉션의 자식인 List를 넣어도 상관없다
		System.out.println(list2);

	}//main
}
