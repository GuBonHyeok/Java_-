package days12;

/**
 * @author BongGu
 * @date 2024. 1. 16. - 오전 11:20:03
 * @subject 3개 반. 각 반은 23명. 학생들의 이름, 국,영,수,총,반 등수, 전교 등수 처리 코딩
 * @content 수업 끝나고 풀 수 있으면 풀어서 제출
 */
public class Ex03_02 {

	public static void main(String[] args) {
		final int STUDENT_COUNT = 23;
		final int CLASS_COUNT = 3;
		
		String [][] names = new String[CLASS_COUNT][STUDENT_COUNT]; // i반, j번째 학생 이름 입력받을 배열
		double [][] avgs = new double[CLASS_COUNT][STUDENT_COUNT]; // i반, j번째 학생 평균 입력받을 배열
		int [][][] infos = new int[CLASS_COUNT][STUDENT_COUNT][6]; // i반, j번째 학생의 k등수가 저장되기 때문에 6등. (전교등수도 저장)
		
		//반 입력 ? 몇번째 학생(자동입력)? 
		
		int [] counts = new int [CLASS_COUNT]; //count 의 0은 1반학생, 1은 2반학생, 2는 3반학생
		
		char con = 'y';
		
	} //main

} //class
