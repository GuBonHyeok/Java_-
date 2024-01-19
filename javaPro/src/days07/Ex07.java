package days07;

/**
 * @author BongGu
 * @date 2024. 1. 9. - 오후 2:35:14
 * @subject 피보나치 수열 풀이
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// [피보나치 수열]
		
		/* [1]번 방법
		// 항(term)
		// 1+1+2+3+5+8+13+21+34+55...+???=???
		int [] x =new int [100];
		x[1] = 1;
		x[2] = 1;
		int sum = x[1]+x[2];
		System.out.printf("%d+%d+", x[1], x[2]);
		for (int i = 3; i < 100; i++) {
			x[i] = x[i-1] + x[i-2];
			if (x[i] > 100) break;
			System.out.printf("%d+", x[i]);
			sum +=x[i];			
		}
		System.out.printf("=%d\n", sum);
		*/
		
		// [2]번 방법
		// 토끼 암컷 1 
		// 토끼 수컷 1
		
		
		int firstTerm = 1;
		int secondTerm = 1;
		int nextTerm;
		int sum = firstTerm + secondTerm;
		
		/*		
		System.out.printf("%d+%d+", firstTerm, secondTerm);
		
		while (true) {
			nextTerm = firstTerm + secondTerm;
			if(nextTerm > 100) break;
			
			sum += nextTerm;
			System.out.printf("%d+", nextTerm);
			
			firstTerm = secondTerm;
			secondTerm= nextTerm;			
		}
		System.out.printf("=%d\n",sum);
		*/
		
		// [3]번 방법으로 공부하고 풀자. (피보나치 수열)
		
		while ((nextTerm = firstTerm + secondTerm) <= 100) {
			// nextTerm = firstTerm + secondTerm;
			// if(nextTerm > 100) break;
			
			sum += nextTerm;			
			System.out.printf("%d+", nextTerm);
			
			firstTerm = secondTerm;
			secondTerm= nextTerm;			
		}
		System.out.printf("=%d\n", sum);
		
		
		
		
		
		
		
	} //main

} //class
