package days06;

/**
 * @author BongGu
 * @date 2024. 1. 8. - 오후 5:17:03
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// LG 공채 문제
		// [이름 (lagel) 붙은 반복문]
		// break 라벨명;
		// continue 라벨명;
		
		
		OUT:for (int i = 2; i <= 9; i++) {
			IN:for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d=%02d ",i,j,i*j);
				if ( i*j == 24) break OUT;
			} //for j
			System.out.println();			
		} //for i		
		
	} //main

} //class
