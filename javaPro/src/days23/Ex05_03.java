package days23;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @author Bonggu
 * @date 2024. 1. 31.- 오후 12:22:08
 * @subject
 * @content
 */
public class Ex05_03 {

	public static void main(String[] args) {
		int [] score = {80, 95, 50, 85, 45, 65, 10, 100};
		// 1) 80보다 큰 점수를 얻어와서 출력
		/*
		for (int i = 0; i < score.length; i++) {
			if (score[i] > 80) { System.out.println(score[i]);
			}
		}
		 */

		//TreeSet<Integer> ts = new TreeSet<Integer>();
		//int [] -> TreeSet<Integer> 변환
		/*
		for (int i = 0; i < score.length; i++) {
			ts.add(score[i]);				
		}
		*/
		
		//ts.headSet(80); //지정된 값보다 작은 값의 객체를 반환하는 메서드. 80보다 작은 값 반환
		System.out.println(ts.tailSet(80));  //지정된 값보다 큰 값의 객체를 반환하는 메서드 80보다 큰 값 반환. 80도 포함. 
																//() 안에 두번째 인자로 true / false를 주면 80을 포함시킬지 말지를 정할 수 있다.
		
		/*
		 * TreeSet<Integer> treeSet = Arrays.stream(intArray)
                                  .boxed()
                                  .collect(TreeSet::new, TreeSet::add, TreeSet::addAll);	
		 */
		
		

	} //main

} //class
