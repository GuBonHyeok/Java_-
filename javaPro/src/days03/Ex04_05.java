package days03;

/**
 * @author BongGu
 * @date 2024. 1. 3. - 오후 2:39:15
 * @subject 비트 논리 연산자
 * @content	& ^ | ~
 */
public class Ex04_05 {

	public static void main(String[] args) {
		/*2. 비트 논리 연산자
		 *    1) &	비트 논리 AND 연산자
		 *    2) |	비트 논리 OR 연산자
		 *    3) ^	XOR 연산자 (둘 중 하나만 참일 때만 참 -> 서로 다를때 참)
		 *    4) ~	틸드 연산자 (비트 부정 연산자)
		 *    
		 */
		
		/*
			System.out.println(  3  ); //1byte짜리 2진수로 출력하고싶다?
			System.out.println(Integer.toBinaryString(3));
			String binStr = Integer.toBinaryString(3);
			System.out.printf("%08d \n", Integer.parseInt(binStr));
		*/
			
			//함수?
			// 1. 기능, 2. 매개변수, 3. 리턴값
			// [flags] [width] ~~ 이거 복습 (printf 메서드)
		//						00000011
		System.out.println(  3  );
		//						00000001
		System.out.println(  1  );
		// & 비트 논리 & 연산자. 상응하는 비트값을 비교하는 연산
		
		//  	00000011
		//   &	00000001
		//	 =	00000001   -> 상응하는 비트가 둘 다 1이어야 1 출력.
		System.out.println(  3 & 1  ); //1
		
		//     	00000011
		//   &	00000001
		//	 =	00000011   -> 상응하는 비트가 둘 중 하나라도 1이면 1 출력.		
		System.out.println(  3 | 1  ); //3
		
		//     	00000011
		//   ^	00000001
		//	 =	00000010   -> 상응하는 비트가 서로 다르면 1 출력.	
		System.out.println(  3 ^ 1  ); //2
		
		// ~ 틸드 연산자 (비트 부정 연산자)
		
		// 		0000 0011
		// 	~	0000 0011
		// 	=	1111 1100
		System.out.println( ~3 ); 
		
		//	1111 1100
		// -            1
		// 	1111 0100
		//	0000	0100
		//				 4
		//			>	-4
		
	} //main

} //class