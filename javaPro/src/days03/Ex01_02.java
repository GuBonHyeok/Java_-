package days03;

/**
 * @author BongGu
 * @date 2024. 1. 3. - 오전 10:38:21
 * @subject 형 변환 설명
 * @content
 */
public class Ex01_02 {
	public static void main(String[] args) {
		
		/*
		 * [형변환]
		 * 1. 정의? : 변수 또는 상수의 자료형(타입)을
		 * 다른 자료형(타입)으로 변환하는 것.
		 * 2. 예
		 *    int -> byte
		 *    byte -> int
		 *    int -> float
		 *    double -> int
		 *    String -> int
		 *    String -> double
		 *    int -> String
		 *    char -> String
		 *    String -> char
		 *    등등 다른 자료형으로 바뀌는 모든 것을 형변환이라고 한다
		 * 3. 형 변환하는 방법
		 *   1) 자동 형변환 - 2가지
		 *      가. 좌측 변의 자료형의 크기가 우측 변의 자료형보다 크기가 클 경우
		 *          ex) int i =10;  long l = i; 
		 *      나. 작은 자료형 + 큰 자료형 = 큰 자료형으로 자동 형변환
		 *          작은 자료형
		 *    
		 *   2) 강제 형변환 - 
		 *      가. 해야하는 경우
		 *          - 우측이 좌측보다 자료형의 크기가 더 클 때  
		 *      
		 *      나. 방법
		 *          - (변환하고자 하는 자료형)(변수 + 변수 + 변수);
		 *           > cast 강제 형변환 ()     최우선 연산자 ()
		 *          
		 *[연산자 우선순위]
		 *3+5*
		 *() : 최우선 연산자
		 *   
		 *   
		 *   
		 *   
		 * 
		 * */
		
		byte b = 100; // [0] [1] [1] [0] [0] [1] [0] [0] 총 8bit
		//자동 형변환 첫번째 경우. 대입 연산자에 의해 좌측 자료형의 크기가 우측 자료형의 크기보다 크면 자동 형변환 됨
		long l = b; // [] [] [] [] [] [] [] [] * 8 총 64bit
		System.out.println(l);
		
		double d = l;  // [부호비트] [11비트 - 지수(E)] [52개 - 가수] [] [] [] [] [] * 8 총 64bit
		// 실수계열이 정수계열보다 더 크다고 인식됨. double > long 
		System.out.println(d);
		
		float f = l; //float도 long 보다 더 크다.
		System.out.println(f);
		
		// int i = 100L; //우측이 좌측보다 더 커서 자동 형변환이 안됨
		// float f2 = 3.14; //Type mismatch: cannot convert from double to float. double형을 float에 넣으려고 하기 때문
		float f2 = 3.14f; //접미사 f 사용해서 우측변을 float형으로 변경해줌
		
		int x = 100;
		long y = 100;
		// int z = x + y; //Type mismatch: cannot convert from long to int. x+y는 long, z는 int기 때문
		//작은 자료형 연산 큰 자료형 -> 큰 자료형이 됨 따라서
		// long z = x + y; //혹은
		long z = (long)x + y; //가 되어야 함
	} //main

} //class
