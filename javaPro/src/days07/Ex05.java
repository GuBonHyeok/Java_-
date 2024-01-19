package days07;

/**
 * @author BongGu
 * @date 2024. 1. 9. - 오후 12:38:13
 * @subject 스위칭 변수
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// [순서도]
		// 짝수는 SUM -
		// 홀수는 SUM +
		int sum=0;
		boolean sw = false;
		
		for (int i = 1; i <= 10; i++) {
			
			// [4]
			System.out.printf(sw ?"%d+" : "%d-", i);
			sum += sw ? -i : +i; //sw가 true면 -i, false면 +i가 출력 
			sw = !sw; //홀,짝 번갈아가며 출력하기 위해 sw를 !로 부정해줌( true < - > false)
			
			// 기억할 것 !! [3] 스위칭 변수를 사용하는 방법. (내일 시험 나오면 이걸로 풀기)
			/*
			if ( sw ) { //sw는 지금 false로 선언되어 있기 때문에 else가 실행된다.
				sum -= i;
				System.out.printf("%d+", i);
				sw = !sw; // true인 sw를 false로 만들어줌
			}else {
				System.out.printf("%d+", i);
				sum +=i;
				sw = !sw; // false 인 sw 를 true로 만들어줌
			} //if
			*/

			
			/* [2]
			System.out.printf(i%2==0 ?"%d+" : "%d-", i);
			sum += i%2==0 ? -i : +i;
			*/
			
			
			/* [1]
			if (i % 2 == 0) {
				sum -= i;
				System.out.printf("%d+", i);
			}else if ( i% 2 ==1){
				sum +=i;
			} //if
			*/
 
		} //for	// 1-2+3-4+5-6+7-8+9-10 = -5

		System.out.printf("= %d",sum);

	} //main

} //class
