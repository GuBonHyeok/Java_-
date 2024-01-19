package days03;

/**
 * @author BongGu
 * @date 2024. 1. 3. - 오후 12:39:22
 * @subject 비교 연산자 크다, 작다, 같거나 크다, 같거나 작다, 같다, 다르다
 * @content 1. 비교 연산자는 결과값이 항상 boolean (true or false) 값이다.
 * 					[☆☆☆ instanceof 라는 비교 연산자도 있다.] -> 클래스 배우면서 배울 예정 
 */
public class Ex04_03 {

	public static void main(String[] args) {
		int i = 10, j = 3;
		System.out.println(i > j); // true
		System.out.println(i < j); // false 
		System.out.println(i >= j); // true
		System.out.println(i <= j); // false

		// = 는 "같다" 라는 의미의 비교 연산자가 아니라 대입연산자임. ==로 써야함
		System.out.println(i = j); // (주의) 3출력. j를 i로 대입시켰기 때문에
		System.out.println(i == j); // true
		System.out.println(i != j); // true
		// System.out.println(i =! j); // !는 논리 연산자 중에 부정하는 연산자임 



	} //main

} //class
