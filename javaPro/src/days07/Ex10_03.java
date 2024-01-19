package days07;

import java.util.stream.IntStream;

/**
 * @author BongGu
 * @date 2024. 1. 9. - 오후 5:14:21
 * @subject 가변인자 (int... args)
 * @content
 */
public class Ex10_03 {

	public static void main(String[] args) {
		
		System.out.printf("%c  %f  %s  %b\n"
				, 'a',3.14, "홍길동", true);
		
		// [가변 인자]
	    int result = 0;
	    result = sum(1,2);
	    System.out.println(result);
	    
	    result = sum(1,2,3,4,5);
	    System.out.println(result); 
	    
	    int [] m = { 5,6,7,8,9 };
	    result = sum( m );
	    System.out.println(result);

	} // main
	
	public static int sum(int... arg ) { //자료형... 변수명 으로 가변인자를 사용할 수 있다.
														   //가변인자를 사용하면 매개변수를 n개 사용하지 않아도 된다.
														   //가변인자는 내부적으로 배열을 생성해서 사용한다.
		return  IntStream.of(arg).sum(); 
	} //sum 메서드

} //class
