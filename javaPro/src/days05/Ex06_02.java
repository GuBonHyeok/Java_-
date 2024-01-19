package days05;

/**
 * @author BongGu
 * @date 2024. 1. 5. - 오후 2:26:22
 * @subject
 * @content
 */
public class Ex06_02 {
	public static void main(String[] args) {
		// 한 라인에 ASCII 10개 출력
		for(int i = 0, lineNumber =1 ; i <256 ; i++) {
			if (i % 10 == 0) System.out.printf("%d :", lineNumber++);
			System.out.printf("[%c]\n", i);
			if (i % 10 == 9)
			System.out.println();

//10개 입력받을 때 마다 엔터 쳐서 다음 줄 보여주기  
		}

	}//main

}//class