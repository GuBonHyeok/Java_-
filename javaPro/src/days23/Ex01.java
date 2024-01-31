package days23;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * @author Bonggu
 * @date 2024. 1. 31.- 오전 10:09:43
 * @subject 연습문제 2번 풀이
 * @content
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		int n= 5;
		//Syntax error, insert "Dimensions" to complete ReferenceType
		//제네릭 < > 안에는 참조형 자료형을 넣어줘야한다
		LinkedHashSet<Integer> lotto = new LinkedHashSet<>(6);
		ArrayList<LinkedHashSet<Integer>> lottos = new ArrayList<>(n); //Integer 타입을 요소로 쓰고있는 HashSet 타입을 쓰겠다

		//입력
		int ln = 0;//랜덤 발생 로또번호 저장
		for (int i = 0; i < n; i++) {
			lotto = new LinkedHashSet<>(6);
			while (lotto.size() < 6) {
				ln = (int)(Math.random()*45 + 1);
				lotto.add(ln);
			} //while
			lottos.add(lotto);

		} //for		

		//출력
		int cnt = 1;
		Iterator<LinkedHashSet<Integer>> ir = lottos.iterator();
		//Collections.sort(); 정렬하는 작업. 하지만 Collections.sort() 안에는 List형이 들어가야하기 때문에 LinkedHashSet 형의 lotto를 List 형으로 바꿔줘야 한다
		ArrayList<Integer> list = null;
		while (ir.hasNext()) {
			System.out.printf("%d번째 게임", cnt++);
			lotto = ir.next(); //LinkedHashSet 자료형
			
			list = new ArrayList<Integer>(lotto); //LinkedList 형의 list를 생성해주고
			//Collections.sort(list); //LinkedList 형의 list를 sort 해준다
			list.sort((o1, o2) -> ((Integer) o2).compareTo((Integer) o1));
			Iterator<Integer> ir2= list.iterator();
			while (ir2.hasNext()) {
				ln = ir2.next();
				System.out.printf("[%02d]", ln);				
			}
			System.out.println();
		}
	}//main



}//class
