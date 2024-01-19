package days08;

import java.util.Arrays;

/**
 * @author BongGu
 * @date 2024. 1. 10. - 오전 10:46:10
 * @subject 배열을 통해 함수 활용 (Call By Reference)
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		int [] m = {10,20};
		
		System.out.println(Arrays.toString(m));
		//swap(x,y); // 안됨. Call By Value기 때문에 주소를 참조할 수 없음
		swap(m); // 됨. Call By Reference로 주소를 참조하여 값을 바꿀 수 있음. 참조타입의 매개변수로 호출하는 것
		System.out.println(Arrays.toString(m));

	} //main
	
	// Call By Reference : 내부적으로 배열을 만들기 때문에 주소를 참조하기 위한 참조변수를 활용하는 걸로 이해
	private static void swap(int[] m) {
		int temp = m[0];
		m[0] = m[1];
		m[1] = temp;
	}

	// Call By Value : 메인함수의 변수와 이름이 동일해도 가능하나, 메인함수의 변수에 저장된 값에 직접 영향을 주지 않음
	//							( 주소만 참조하기 때문에 )
	public static void swap(int x, int y) { // 
		int temp = x;
		x = y;
		y = temp;
		System.out.printf("2. swap > x=%d, y=%d\n",x,y);

	}//main
} //class 