package days07;

/**
 * @author BongGu
 * @date 2024. 1. 9. - 오후 4:42:44
 * @subject 함수 만들기 (2)
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c;

		// 두 정수 a,b의 합을 구해서 출력.
		// 두 정수의 합을 구해서 반환하는 메서드(함수) 선언 + 호출

		c = sum(a,b); // 함수 호출. 함수 선언보다 호출을 먼저 하고 아랫쪽 빨간줄에서 메서드 추가해줘도 된다

		System.out.printf("%d + %d = %d\n",a,b,c);
		System.out.printf("%d\n",sum(a,b,c));
		
		int d = 100;
		System.out.printf("%d", sum(a,b,c,d));

	} //main

	//함수는 메인함수 밖에, 클래스 안에 만들어야 한다
	//함수(메서드) 선언
	public static int sum(int a, int b) {
		// int c = a+b;
		// return c;
		return a+b; //위 두줄을 한 줄로 만들 수 있다.
	}
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	public static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}

} //class
