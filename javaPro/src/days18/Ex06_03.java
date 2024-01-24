package days18;

/**
 * @author Bonggu
 * @date 2024. 1. 24.- 오후 4:31:46
 * @subject 문자열을 변경(수정)할 때는 String 클래스보다 StringBuffer 혹은 StringBuilder를 사용해야하는지?
 * @content
 */
public class Ex06_03 {

	public static void main(String[] args) {
		//testString(); //3774356300 ns
		testStringBuilder(); //3816300 ns
		testStringBuffer(); //4597200 ns
	} //main

	private static void testStringBuffer() {
		long start = System.nanoTime();
		StringBuffer sb = new StringBuffer("a");
		for (int i = 0; i < 200000; i++) {
			sb.append("a");			
		}//for
		long end = System.nanoTime();
		System.out.printf("> StringBuffer 처리시간 : %d ns\n", (end-start));
		
	}

	private static void testStringBuilder() {
		long start = System.nanoTime();
		StringBuilder sb = new StringBuilder("a");
		for (int i = 0; i < 200000; i++) {
			sb.append("a");			
		}//for
		long end = System.nanoTime();
		System.out.printf("> StringBuilder 처리시간 : %d ns\n", (end-start));
	}

	private static void testString() {
		long start = System.nanoTime();
		String s = "a";
		for (int i = 0; i < 200000; i++) {
			s += "a";			
		}
		long end = System.nanoTime();
		System.out.printf("> String 처리시간 : %d ns\n", (end-start));
	}

} //class
