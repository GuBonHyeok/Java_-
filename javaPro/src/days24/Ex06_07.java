package days24;

import java.util.ArrayList;

/**
 * @author Bonggu
 * @date 2024. 2. 1.- 오후 3:50:42
 * @subject 제네릭 클래스 추가 설명
 * @content
 */
public class Ex06_07 {

	public static void main(String[] args) {
		// 알고보니? ArrayList는 제네릭 클래스였다.
		ArrayList<Integer> list = new ArrayList<Integer>(); //이게 원래 원칙인데
		ArrayList list2 = new ArrayList(); //제네릭 클래스이기 때문에 일반 클래스처럼 사용해도 가능하다
		
		Box05<String> box1 = new Box05(); //제네릭 클래스 사용하여 생성
		
		//Box05<Object> box1 = new Box05<>(); 이거랑 아래가 동일한 것.. 사실 알고보니 Object를 준 것이다.
		Box05 box2 = new Box05(); //제네릭 클래스 사용하여 생성
		
		//원시타입과 제네릭 타입 간의 형변환
		// - 경고만 발생시키고 자동으로 사용가능하다.
		//	- <T>가 없으면 Object 타입으로 컴파일러가 컴파일 시킨다.

	} //main

} //class
