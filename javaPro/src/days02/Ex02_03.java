package days02;

/**
 * @author BongGu
 * @date 2024. 1. 2. - 오전 10:06:50
 * @subject
 * @content 두 변수 값 바꾸기
 */
public class Ex02_03 {

	public static void main(String[] args) {
		
		/*
		 * int x = 10; 
		 * int y = 20;
		 */
		
		// 콤마(,) 연산자
		int x = 10, y = 20;
				
		System.out.printf("교환 전 > x=%d, y=%d\n", x, y);
		// 값 바꾸는 작업
		// 프로그램 상에서 두 기억공간의 값을 교환하려면
		// 반드시 동일한 자료형의 임시 기억공간이 필요하다
		{
		int temp = x;
		x = y;
		y = temp;
		} // 사용 후 임시 저장공간 temp는 불필요한 공간이기 때문에 삭제하는 것이 좋음
		   //그래서  { } 를 사용해서 지역변수로 사용
		
		System.out.printf("교환 후 > x=%d, y=%d\n", x, y);		
		
		
	} //main

} //class

/*
int a = 100;
int b = 100;
int c = 100;
*/
// int a = 100, b = 100, c = 100;
// int a, b, c;
// a=b=c=100; // 여기서 = 는 대입연산자이기 때문에 오른쪽에서 왼쪽으로 처리됨
