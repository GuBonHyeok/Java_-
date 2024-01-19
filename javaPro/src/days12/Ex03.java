package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 16. - 오전 11:01:32
 * @subject 1차원 배열 -> 2차원 배열 변경 후 코딩 수정 (days11_Ex05_03)
 * @content 내일 시험! 꼭 복습!
 */
public class Ex03 {

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
			
			//int [] kors = new int [STUDENT_COUNT];    0열
			//int [] engs = new int [STUDENT_COUNT];   1열
			//int [] mats = new int [STUDENT_COUNT];   2열
			//int [] tots = new int [STUDENT_COUNT];    3열
			//int [] ranks = new int [STUDENT_COUNT]; 4열
			
			int [] [] infos = new int [STUDENT_COUNT][5]; //각 점수들을 0~4열까지 저장
			
			
			double [] avgs = new double [STUDENT_COUNT];

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
				
				//[infos] 2차원 배열로 수정
				infos[count][0] = kor; //
				infos[count][1] = eng;
				infos[count][2] = mat;
				infos[count][3] = tot;
				infos[count][4] = rank;
				
				avgs[count] = avg;

				count++; //1명 입력했으니 +1씩 증가

				// 입력 계속하겠냐는 메세지 출력
				System.out.print(">학생 입력 계속?");
				con = (char)System.in.read();
				System.in.skip(System.in.available());
			} while (Character.toUpperCase(con)=='Y');
			
			// 등수 처리하는 작업 . 총점, 등수, 입력받은 학생수를 매개변수로 넘겨줌
			procRank(infos, count);
			//procRank(infos[3],infos[4], count); //infos[3] 는 tot, infos[4]는 ranks
			
			// 학생정보 출력 함수		
			dispStudentInfo(names, avgs,infos, count);



		} //main

		private static void procRank(int[] [] infos, int count) {
			//tots 배열에는 점수,  ranks는 1등들이 저장돼있음 일단 첫번째 1등주고 2중 for문으로 각각 비교
			
			for (int i = 0; i <= count; i++) { //열값. 점수들이 열값에 저장
				infos[i][4] = 1;
				for (int j = 0; j < count; j++) { //행값. 사람들이 행값에 저장
					if (infos[i][3] > infos[j][3]) infos[i][4]++; //다른 학생들이랑 비교하려면 행값을 바꿔야함!					
				} //for j
			} //for i


			
		} //procRank

		private static void dispStudentInfo(String[] names, double[] avgs,int[][] infos, int count) {
			System.out.printf("총 %d명 \n", count);
			for (int i = 0; i < count; i++) { //입력받은 학생까지만 정보 입력받도록
				System.out.printf("%d번\t%s\t%s\t%s\t%s\t%s\t%.2f\t%d등\n"
						,i+1, names[i], infos[i][0], infos[i][1], infos[i][2], infos[i][3], avgs[i], infos[i][4]);							
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
		} //getNames

	}//class
