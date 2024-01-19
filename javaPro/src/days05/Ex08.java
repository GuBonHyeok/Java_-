package days05;

/**
 * @author BongGu
 * @date 2024. 1. 5. - 오후 4:25:59
 * @subject if, switch, for, while, do~while
 * @content break
 * 
 * 					[foreach문 == 확장 for문]
 */
public class Ex08 {

	public static void main(String[] args) {

		int [] m = new int[10];

		// m 배열의 각 요소에 0~100 사이의
		// 임의의 정수를 채워넣자


		for (int i = 0; i < m.length; i++ ) {
			m[i] = (int) (Math.random() * 101); //m 배열에 랜덤한 0~100까지의 정수를 입력하는 코딩
			System.out.printf("m[%d] = %d\n", i, m[i]);	// m 배열을 출력하는 코딩
		}
		
		//		for (자료형 변수명 : 배열 또는 컬렉션) { 배열 또는 컬렉션에 반복적으로 사용하는 반복문
		//	
		//							}
		int sum = 0;
		for (int n : m) { //m배열의 값을 하나씩 꺼내 n에 대입하는 작업
			System.out.println(n);
			sum += n;
			
		}






	} //main

} //class
