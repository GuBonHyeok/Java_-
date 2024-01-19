package days03;

/**
 * @author BongGu
 * @date 2024. 1. 3. - 오후 4:22:14
 * @subject 산술 연산자
 * @content 산술 연산자에 포함되는 시프트(Shift) 연산자  >> <<
 *                → 물건을 이동시키다, 옮기다, 바꾸다.
 */
public class Ex06_03 {

	public static void main(String[] args) {
		//						0000	1010
		System.out.println( 10 );
		System.out.println( 10 >> 2 );
		// 0000 1010에서 각 자리 비트를 오른쪽으로 2칸씩 이동
		// 제일 오른쪽 2자리는 사라지고, 3번째 자리가 1이면 1,2번째 자리도 1로 채우고 아니면 0으로 채운다
		// >>> 3개면 무조건 0으로 채운다
		System.out.println( 10 << 2 );
		// 0000 1010 에서 각 자리 비트를 왼쪽으로 2칸씩 이동 
		// 제일 왼쪽 2자리는 사라지고, 오른쪽에서 3번째 자리가 1이면 1,2번째 자리도 1로 채우고 아니면 0으로 채운다
		// <<< 3개면 무조건 0으로 채운다

	}

}
