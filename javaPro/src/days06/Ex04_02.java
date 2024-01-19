package days06;

import java.util.Iterator;

/**
 * @author BongGu
 * @date 2024. 1. 8. - 오후 2:43:35
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// [1]번 for문 1개 사용


		for (int i = 'A', count = 1, lineNumber = 1; i <= 'z' ; i++) { 

			// if( i > 'Z' && i < 'a' ) continue;
			if( Character.isAlphabetic(i) ) {

				if( count % 10 == 1) System.out.printf("%d : ", lineNumber++);

				System.out.printf("%c(%03d)", (char)i, i ); 

				/*
	             if ( Character.isUpperCase(i)  ) { // 대문자
	                //대문자   %10 == 4 개행
	                if( i % 10 == 4) System.out.println();
	             } else { // 소문자
	                //소문자   %10 == 0 개행
	                if( i % 10 == 0) System.out.println();
	             }
				 */
				if( count % 10 == 0) System.out.println();

				count++;

			} // if

		} // 


	} //main

} //class
