package days02;

/**
 * @author BongGu
 * @date 2024. 1. 2. - 오전 10:06:50
 * @subject
 * @content 지역변수
 */
public class Ex02 {
	
	// String name; 지역변수 아님

	public static void main(String[] args) {
		// 지역변수(Local variable)는 반드시 초기화해야 사용할 수 있다.
		// [경고] The value of the local variable name is not used > 지역변수 초기화 안 해서 뜸
		String name=""; // 지역변수 O
		int age ;
		// [에러] The local variable name may not have been initialized
		System.out.println(name); // 초기화 안 한 변수 써서 오류
		

	}

}
