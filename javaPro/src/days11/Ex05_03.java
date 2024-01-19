package days11;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 15. - 오전 11:42:20
 * @subject 한 반에 최대 23명 학생의 성적 처리를 배열을 사용해서 해보자.
 * @content 내일 시험 1번 문제!
 */
public class Ex05_03 {

	public static void main(String[] args) throws IOException {
		// 한 반에 최대 23명 학생의 성적 처리를 배열을 사용해서 해보자.
		// 성적 처리 (국,영,수,총,평,등수)
		// 1. 입력 - 이름,국,영,수
		// 2. 처리 - 총점, 평균, 등수
		// 3. 파일 입출력, DB 입출력 X
		String name;
		int kor, eng, mat, tot;
		double avg;
		int rank;

		final int STUDENT_COUNT = 23; //이렇게 해야 학생 수가 달라졌을 때 수정이 용이하다.

		String [] names= new String[STUDENT_COUNT]; 
		int [] kors = new int [STUDENT_COUNT];
		int [] engs = new int [STUDENT_COUNT];
		int [] mats = new int [STUDENT_COUNT];
		int [] tots = new int [STUDENT_COUNT];
		double [] avgs = new double [STUDENT_COUNT];
		int [] ranks = new int [STUDENT_COUNT];

		Scanner scanner = new Scanner(System.in);
		int count = 0; //실제 입력받은 학생 수를 저장할 변수
		char con = 'y';

		do {
			System.out.printf(">%d번 이름, 국어, 영어,수학 입력 ? ",count + 1); //첫번째 학생 정보 입력
			name = getName();
			kor = getScore(); 
			eng = getScore();
			mat = getScore();

			tot = kor + eng + mat;
			avg = (double) tot/3;
			rank = 1;

			//첫번째 학생의 성적 정보
			names[count] = name; //학생 순서를 의미하는 count 를 인덱스로 사용
			kors[count] = kor;
			engs[count] = eng;
			mats[count] = mat;
			tots[count] = mat;
			tots[count] = tot; 
			avgs[count] = avg;
			ranks[count] = rank;

			count++; //1명 입력했으니 +1씩 증가

			// 입력 계속하겠냐는 메세지 출력
			System.out.print(">학생 입력 계속?");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');
		
		// 등수 처리하는 작업 . 총점, 등수, 입력받은 학생수를 매개변수로 넘겨줌
		procRank(tots, ranks, count);
		
		// 학생정보 출력 함수		
		dispStudentInfo(names, kors, engs, mats, tots, avgs, ranks, count);



	} //main

	private static void procRank(int[] tots, int[] ranks, int count) {
		//tots 배열에는 점수,  ranks는 1등들이 저장돼있음 일단 첫번째 1등주고 2중 for문으로 각각 비교
		
		for (int i = 0; i <= count; i++) {
			ranks[i] = 1;
			for (int j = 0; j < count; j++) {
				if (tots[i] > tots[j]) ranks[i]++;					
			} //for j
		} //for i


		
	} //procRank

	private static void dispStudentInfo(String[] names, int[] kors, int[] engs, int[] mats, int[] tots, double[] avgs,
			int[] ranks, int count) {
		System.out.printf("총 %d명 \n", count);
		for (int i = 0; i < count; i++) { //입력받은 학생까지만 정보 입력받도록
			System.out.printf("%d번\t%s\t%s\t%s\t%s\t%s\t%.2f\t%d등\n"
					,i+1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);
			
			
		}
		
	}//main
	
	//랜덤하게 점수를 발생시키는 함수 생성 (0~100점)
	public static int getScore() {
		return (int) (Math.random()*101); 		
	}
	public static String getName() {
		String[] lastNames = {"김", "이", "박", "최", "권", "구"};
		Random rnd = new Random();
		int index = rnd.nextInt(lastNames.length); // 0<= int < 6 값을 가져오니까 김~홍까지 랜덤으로 가져온다.
		String lastName = lastNames[index]; //성 가져오는 작업
		
		//이름
		char [] firstNames = new char[2];
		for (int i = 0; i < firstNames.length; i++) {
			firstNames[i] = (char)(rnd.nextInt('힣' - '가'+ 1 ) + '가'); //힣 ~ 가 사이에 정수를 발생시켜서 '가'를 더하면 얻어온다
					
		}
		String name =lastName + firstNames[0] + firstNames[1];
		
		return name;
	}

}//class
