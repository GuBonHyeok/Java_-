package days04;

/**
 * @author BongGu
 * @date 2024. 1. 4. - 오전 10:48:37
 * @subject []  :  인덱스(index) 연산자
 * @content
 */

public class Ex02 {

	public static void main(String[] args) {
		// String[] args   : [] 인덱스 연산자
		// 1. 한 학생의 국어 점수를 저장할 kor 변수 선언
		// int kor;
		// 2. 10명 학생의 국어 점수를 저장할 변수 선언
		// int kor01, kor02, kor03 ..., kor10;
		
		// 배열(Array)				: 동일한 자료형을 메모리 상에 연속적으로 놓이게 하는 것. 참조형 자료형 중 하나
		// 배열의 장점				: 관리가 용이
		// 배열 선언 및 생성 형식	: 자료형 [] 배열명(변수명/참조변수) = new 자료형[배열크기];
		// 배열 선언 : 자료형[] 배열명;
		// 배열 생성 : 배열명 =new 자료형[배열크기] -> Heap 공간에 저장
		int [] kor = new int[3]; 	//int kor []; 도 상관 없음
		// 배열의 크기 				: 배열명.length
		System.out.printf("> 배열 크기 : %d\n", kor.length);
		// 1번 학생의 국어점수 : 90
		// 첫번째 기억공간 : 0번째 요소   →  kor[0] 
		// 두번째 기억공간 : 1번째 요소   →  kor[1]
		// 세번째 기억공간 : 2번째 요소   →  kor[2]
		kor[0] = 90; //lower bound 아랫첨자값		0
		kor[1] = 78;
		kor[2] = 89; //upper bound 윗첨자값		2 = 배열크기-1 = 배열명.length - 1
		
		// kor[3] = 100; //ArrayIndexOutOfBoundsException 배열 사용시 가장 많이 발생하는 런타임 오류 
		// 없는 방에 물건 집어 넣으려 하는 것
		
		System.out.println( kor[0]);
		System.out.println( kor[1]);
		System.out.println( kor.length-1);
		
		
		
		
	}

}
