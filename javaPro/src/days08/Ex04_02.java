package days08;

/**
 * @author BongGu
 * @date 2024. 1. 10. - 오전 11:50:55
 * @subject 재귀함수 활용
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// 1) 1~n 까지의 합을 반환하는 일반함수
		// 2) 1~n 까지의 합을 반환하는 재귀함수

		int n = 10;
		// int result = sum(n); 1) 일반함수 호출
		System.out.printf(" 1~%d=%d\n", n, result);


	}//main
	// 1) 일반함수
	private static int sum(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += i;			
		}
		return result;
	}

	// 2) 재귀함수 (가능하면 안 쓰는게 좋다). 그래도 암기해라!
	private static int recursiveSum(int n) { //같은 함수가 10번 반복됨
		if ( n == 1 ) return n;
		else return n + recursiveSum(n-1);
		/*
		 *  [재귀함수 처리 과정 설명]
		 * recursiveSum (1)
		 *    ㄴ return 10 + 9 + 8 + 7 .... + 2 + 1;
		 * 
		 *  [재귀함수를 써야하는 구조]
		 *  - 하위 폴더 계속 찾아야하는 트리구조 같은 경우 (windows 파일 탐색기) 
		 * */
	}

}//class
