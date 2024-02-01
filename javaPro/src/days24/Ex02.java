package days24;

//static , 끝에 .* 아래에서 Collections. 생략할 수 있음
import static java.util.Collections.addAll;
import static java.util.Collections.shuffle;
import static java.util.Collections.sort;

import java.util.ArrayList;

import javax.swing.Box.Filler;

/**
 * @author Bonggu
 * @date 2024. 2. 1.- 오전 11:23:56
 * @subject Collections 클래스
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// Arrays 클래스 : 배열을 사용하기 쉽도록 구현된 메서드가 구현된 클래스
		// [ Collections 클래스 ]
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		// list.add(1); ArrayList에 저장하기 위해서 add를 사용
		// <? super T> 이게 뭔지 아직 모름. 매개변수 다형성 덕에 쓸 수 있음
		addAll(list, 1,2,3,4,5); //1,2,3,4,5를 모조리 넣는다
		System.out.println(list);
		
		// retate(2) 2칸씩 오른쪽으로 이동
		// retate(-2) 2칸씩 왼쪽으로 이동
		/*
		
		// rotate() : 좌/우로 값 밀어내기
		int distance = 2;
		rotate(list, distance); //자동으로 distance 칸씩 우로 밀기 
		System.out.println(list);
		*/
		
		// swap() : 자리바꿈
		/*
		swap(list, 1, 4); // 인덱스 1번과 4번째 서로 자리바꿈
		System.out.println(list);
		*/
		
		// shuffle() : 랜덤으로 인덱스들 자리바꿈
		/*
		shuffle(list);
		System.out.println(list);
		*/
		
		shuffle(list);
		System.out.println(list);
		
		sort(list, (o1,o2)->o2-o1); //내림차순 방법 1
		System.out.println(list);
		
		// fill() : 하나의 값으로 초기화. fill(list, 1) 하면 1로 전부 초기화

		System.out.println(list);
		
	}//main

}//class
