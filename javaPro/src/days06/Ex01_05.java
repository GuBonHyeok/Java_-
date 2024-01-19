package days06;

import java.util.Scanner;

public class Ex01_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("정수 a_b_c 입력 ?");
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			
			// [3]
			// max = Math.max(a,b); > a,b중 큰 숫자 찾는 것
			// min = Math.min(a,b); > a,b중 큰 숫자 찾는 것
			// Math.pow(a,b); > a의 b승 구하는 메서드 
			
			int max = Math.max(a, b); // a,b 중 더 큰 값을 max에 저장
			max = Math.max(max, c); // max와 c를 비교해서 더 큰 값을 max에 저장
			
			int min = Math.max(Math.max(a, b), c); //위 두 줄을 한 줄로 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
