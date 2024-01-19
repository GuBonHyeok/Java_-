package days12;

/**
 * @author BongGu
 * @date 2024. 1. 16. - 오후 12:23:35
 * @subject 가변 배열
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		//가변배열?
		// 1반 학생수 : 10명
		// 2반 학생수 : 8명
		// 3반 학생수 : 20명
		// int [] m = new int [10+8+20]
		// int [] [] m = new int [3][20]
		
		int [][] m = new int [3][];
		m[0] = new int [10]; //m[0] 행에는 10개 열을 생성
		m[1] = new int [8]; //m[1] 행에는 8개 열을 생성
		m[2] = new int [20]; //m[2] 행에는 20개 열을 생성
		
			
		

	} //main

}//class
