package days14;

/**
 * @author Bonggu
 * @date 2024. 1. 18.
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		Ex10 obj = new Ex10();
		//원래 멤버함수는 객체를 생성해주고 객체명. 으로 써야한다.
		
		// 메서드(기본형 매개변수, 참조형 매개변수)
		// 리턴 자료형이 참조형인 경우
		int [] m = new int [3];
		m = obj.increaseArray(m); //m에 increaseArray에서 리턴된 temp를 받는다
		
		System.out.println(m.length); //배열 m의 크기 확인
		

	} //main

	private int[] increaseArray(int[] m) {
		int [] temp = new int [m.length + 3];
		return temp; // temp를 리턴시킴으로써 메인함수의 m이 이 temp를 참조할 수 있도록
		
		
	}

} //class
