package days14;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Bonggu
 * @date 2024. 1. 18.
 * @subject 내일 1번 시험. Student 클래스까지 확인해서 복습
 * @content
 */
public class Ex08 {

	public static void main(String[] args) throws IOException {

		String name;
		int kor, eng, mat, tot;
		double avg;
		int rank;

		final int STUDENT_COUNT = 23; //학생 수 23명 상수 선언
		// Student 클래스 배열을 생성해서 해당 자료들을 배열로 생성해서 간략하게 만들었다.
		Student [] students = new Student[STUDENT_COUNT];

		Scanner scanner = new Scanner(System.in);
		int count = 0; //실제 입력받은 학생 수를 저장할 변수
		char con = 'y';

		do {
			System.out.printf(">%d번 이름, 국어, 영어,수학 입력 ? ",count + 1); //첫번째 학생 정보 입력
			
			name = scanner.next();
			kor = scanner.nextInt();
			eng = scanner.nextInt();
			mat = scanner.nextInt();
			
			tot = kor + eng + mat;
			avg = (double) tot/3;
			rank = 1;
			
			students[count] = new Student(); //객체 생성.. 이거 중요함x10000000
			
			students[count].name = name;
			students[count].kor = kor;
			students[count].eng = eng;
			students[count].mat = mat;
			students[count].tot = tot;
			students[count].avg = avg;
			students[count].rank = rank;

			count++; //1명 입력했으니 +1씩 증가

			// 입력 계속하겠냐는 메세지 출력
			System.out.print(">학생 입력 계속?");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');
		
		StudentManagement.procRank(students, count);
		//procRank(students, count);

		dispStudentInfo(students, count);

	} //main
	
	public static void procRank(Student[] students, int count){
		for (int i = 0; i < count; i++) {
			//students[i].tot; 점수 매길 학생의 총점
			students[i].rank=1;
			for (int j = 0; j < count; j++) {
				if(students[i].tot < students[j].tot) {
					students[i].rank++;
				}
			}
			
		}
	}

	private static void dispStudentInfo(Student[] students, int count) {

		System.out.printf("총 %d명 \n", count);
		for (int i = 0; i < count; i++) { //입력받은 학생까지만 정보 입력받도록
			System.out.printf("%d번\t" ,i+1);
			students[i].dispInfo(); //students 클래스의 disInfo를 가져와서 출력. 단순 출력이기 때문에 매개변수는 필요없다.
			/*System.out.printf("%d번\t%s\t%s\t%s\t%s\t%s\t%.2f\t%d등\n"
					,i+1
					, students[i].name
					, students[i].kor
					, students[i].eng
					, students[i].mat
					, students[i].tot
					, students[i].avg
					, students[i].rank);
			*/
		}
	}

} //class
