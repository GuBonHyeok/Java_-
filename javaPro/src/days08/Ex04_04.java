package days08;

/**
 * @author BongGu
 * @date 2024. 1. 10. - 오후 12:42:23
 * @subject 재귀함수 예제
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) {

		// [문제]
		// [거듭제곱] == 누승 == 멱 == pow
		// 밑수(2)를 지수(3)만큼 반복해서 곱하는 것.
		// > 2^3 = 2*2*2=8
		// > 2^-1 = 1/(2^3) = 1/8

		//int result = pow(2,3);
		double result = recursivePow(2,-3); 
		//	System.out.println(result);


	} //main
	//일반함수 만들어보기
	private static double pow(int num1, int num2) {
		int i=1;
		double num3 = 1;
		if (num2 > 0) {
			for (i = 0; i < num2; i++) {
				num3 *= num1;
			}

		} else {
			num2 = -1*num2;
			for (i = 0; i < num2; i++) {
				num3 /=num1;
			}
		}
		System.out.printf("%d^%d = %f",num1, num2, num3);
		return num3;
	}

	//재귀함수. j값이 0,1,1보다 큰 경우, 1보다 작은 경우로 생각
	private static int recursivePow(int i, int j) {
		if ( j > 1)  return i * recursivePow(i, j-1);
		else if (j ==0 )  return i;
		else if (j == 1) return  i; 
		else return 1 / (recursivePow(i, -1*j));

	}

} //main
