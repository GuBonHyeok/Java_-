package days04;

/**
 * @author BongGu
 * @date 2024. 1. 4. - 오후 4:02:13
 * @subject for 문 사용 1~N(10) 까지의 합 구하는 방법
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10;  i++) {
			System.out.printf("%d+", i);
			sum += i; //sum = sum + i 와 같음
		} //for
		System.out.printf("\b=%d\n", sum); 
		// \b는 백스페이스 1번 입력하는 건데 eclipse 에서는 글꼴에 따라 실행된 것이 안 보일 수 있다

	} //main

	/*[1번 방법]
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10;  i++) {
			System.out.printf( i == 10 ? "%d" : "%d+", i);

			sum += i; //sum = sum + i 와 같음
		} //for
		System.out.printf("=%d\n", sum);

	} //main
	 */
	/* [2번 방법]
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10;  i++) {
			if (i == 10) {
				System.out.printf("%d", i);
			} else {
				System.out.printf("%d+", i);
			} //if

			sum += i; //sum = sum + i 와 같음
		} //for
		System.out.printf("=%d\n", sum);

	} //main
	 */

} //class
