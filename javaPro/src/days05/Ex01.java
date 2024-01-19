package days05;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 5. - 오전 9:47:15
 * @subject
 * @content
 */
public class Ex01 {
	// 함수를 빠져나갈 때는 return 문을 사용하면 된다
	// 배열은 초기화하지 않아도 해당 자료형의 초기값으로 초기화 되어있다.
	//  int : 0
	//  double : 0.0
	//  char : '\n'
	//  boolean : false
	//  String : Null (참조형은 Null)
	public static void main(String[] args) {

		int [] kor = new int[3];
		int i;

		System.out.printf("> 배열 크기 : %d\n", kor.length);

		kor[0] = 90; 
		kor[1] = 38;
		kor[2] = 88; 

		for (i = 0; i< kor.length ; i++) {
			System.out.printf("> kors[%d] = %d\n", i,kor[i]);
		} //for. 배열 이용 for문



	} //class
}//main