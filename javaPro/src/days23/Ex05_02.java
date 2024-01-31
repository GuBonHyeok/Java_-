package days23;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Bonggu
 * @date 2024. 1. 31.- 오후 12:15:38
 * @subject
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();

		ts.add("abc");      ts.add("alien");      ts.add("bat");
		ts.add("car");      ts.add("Car");      ts.add("disc");
		ts.add("dance");      ts.add("dzzz");      ts.add("dzzzz");
		ts.add("elephant");      ts.add("elevator");      ts.add("fan");
		ts.add("flower");
		
		System.out.println(ts); // 오름차순 정렬
		
		// a ~ c로 끝나는 단어 범위 검색
		SortedSet<String> ss = ts.subSet("a", "d");
		System.out.println(ss);
	
		System.out.println(ts.subSet("c", "dzzz"));

	}//main

}//class









