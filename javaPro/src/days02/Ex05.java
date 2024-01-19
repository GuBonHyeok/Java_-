package days02;

/**
 * @author BongGu
 * @date 2024. 1. 2. - 오후 12:15:53
 * @subject 변수(variable), 상수(constant), 리터럴(literal) 설명
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		/*
		 * 변수 : 
		 * 상수 : final 키워드 선언
		 * 
		 * 리터럴(literal) : 그 자체가 값을 의미하는 것
		 * 				true, false, 100, 'A', 3.14 등등
		 * 
		 * 				int        i      =    100;
		 *            자료형   변수명          리터럴
		 */

		/* 리터럴과 접미사 */
		// int 		형 0  [00000000] [00000000] [00000000] [00000000] == 4 byte 
		// long 		형 0  [00000000] [] [] [] [] [] [] [00000000] == 8 byte
		// double  형 0  	== 8 byte
		// float 		형 0 	== 4 byte
		int a = 0; // [][][][]
		long l = 0L; // [][][][][][][][]
		// long k = 0D;  	Type mismatch: cannot convert from double to long
		// float f = 3.14;  	Type mismatch: cannot convert from double to float
		// long z = 10.; 	Type mismatch: cannot convert from double to long
		
	}

}
