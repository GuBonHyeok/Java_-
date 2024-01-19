package days07;

public class Ex01 {

	public static void main(String[] args) {
		/* 구구단을 세로로 2~5단까지 1열에, 6~9단까지 2열에 출력
		for (int i = 1; i <=9 ; i++) {
			for (int j = 2; j <= 5; j++) {
				System.out.printf("%d*%d=%02d ", j,i,j*i);					
			} //for j
			System.out.println();			
		} //for i
		
		System.out.println();
		
		for (int i= 1; i <=9 ; i++) { // i,j는 어차피 지역변수라 추가로 변수 선언할 필요 없음
			for (int j = 6; j<=9 ; j++) {
				System.out.printf("%d*%d=%02d ", j,i,j*i);
			}
			System.out.println();
		}
		*/
		for (int k = 1; k <= 2; k++) {
			// System.out.println("k=" + k);
			for (int i = 1; i <= 9; i++) {
				for (int j = 4*k-2; j <= 4*k-2+3 ; j++) { // 단
					System.out.printf("%d*%d=%02d ", j, i, j*i);
				} // for j
				System.out.println();
			} // for i 
			System.out.println();
		} // for k
		
		//[2] [3] [4]
		//[5] [6] [7]
		//[8] [9] 출력하기 실습

	}

}
