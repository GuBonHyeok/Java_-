package days14;

/**
 * @author Bonggu
 * @date 2024. 1. 18.
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// [클래스 배열 초기화]
		// 클래스 배열은 초기화를 꼭 시켜줘야한다.
		/* [1]번
		Tv [] tvArr = new Tv[3];
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		*/
		// [2]번 위 코딩들과 동일한 내용
		Tv [] tvArr = {new Tv(),new Tv(),new Tv()};

	} //main

} //class
