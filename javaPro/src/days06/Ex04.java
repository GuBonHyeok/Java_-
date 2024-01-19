package days06;

/**
 * @author BongGu
 * @date 2024. 1. 8. - 오후 2:43:35
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// [1]번 for문 1개 사용
		for (int i = 65; i < 123; i++) {

			if (((i>=65 && i<= 90)) || ((i>=97 && i<=122))) {
				System.out.printf("%c(%03d)",(char) i, i);
				if ((i < 100)) {
					if (i % 4 == 0) 	System.out.println();		
					}
				if ((i >= 100)) {
					if ((i % 10 == 0)) { 
						System.out.println();
					}	
				}
			} 
		}
		// [2번] for 문 2개 사용
		System.out.println();
		for (int i ='A'; i <= 'Z'; i++) {
			System.out.printf("%c(%03d)", (char)i, i);
			if (i% 10 == 4) System.out.println();
		}
		
			for (int i ='a'; i <= 'z'; i++) {
				System.out.printf("%c(%03d)", (char)i, i);
				if (i% 10 == 0) System.out.println();
		}

	} //main

} //class
