package days04;

/**
 * @author BongGu
 * @date 2024. 1. 4. - 오후 4:44:45
 * @subject
 * @content
 */
public class Ex06_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.printf("%d+", i);	
		}// for
		System.out.printf("\b=%d\n", sum);

	} //main

} //class
