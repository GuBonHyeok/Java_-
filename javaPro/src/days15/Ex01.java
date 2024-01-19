package days15;

import java.io.IOException;
import java.util.Scanner;

import days11.Ex05_03;
import days14.Student;

/**
 * @author Bonggu
 * @date 2024. 1. 19.- 오전 10:06:00
 * @subject 2차원 배열 및 클래스를 활용하여 3반 30명 성적 입력받는 코딩
 * @content
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		// 3반 30명 성적 입력 코딩
		final int STUDENT_COUNT = 30;
		final int CLASS_COUNT = 3;

		//2차원 클래스 배열 선언.
		Student [][] students = new Student[CLASS_COUNT][STUDENT_COUNT];

		char con = 'y';
		// counts[0] = 1반 학생수
		// counts[1] = 2반 학생수
		// counts[2] = 3반 학생수
		int [] counts = new int[CLASS_COUNT];

		String name;
		int kor, eng, mat, tot, rank, wrank; //rank : 반등수, wrank : 전체등수
		double avg;

		Scanner scanner = new Scanner(System.in);

		int ban; //몇 반인지 저장하는 변수 ban 선언

		do {
			System.out.print("> 반 입력?");
			ban = scanner.nextInt();

			System.out.printf("> %d반의 [%d]번 학생의 이름,국어,영어,수학 입력 ?"
					, ban, counts[ban-1]+1);   //입력받은 반의 숫자를 1 증가시키기 위해서 counts 의 ban-1에 1증가된 값 저장

			// 이름,국어,영어,수학 입력
			// days11.Ex05_03의 getName() 메서드와 getScore() 메서드를 호출
			name = Ex05_03.getName();
			kor = Ex05_03.getScore();
			eng = Ex05_03.getScore();
			mat = Ex05_03.getScore();
			// 총,평,등, 전교등수 계산
			tot = kor + eng + mat;
			avg = (double) tot/3;
			wrank = rank = 1;	    

			/*
		    Student s = new Student(); //days14의 Student 클래스를 참조하는 참조변수 s를 선언
		    s.name = name; //Student를 참조하고 있는 s에서 Student의 name에 지역변수 name을 저장
		    s.kor = kor;
		    s.eng = eng;
		    s.mat = mat;
		    s.tot = tot;
		    s.avg = avg;
		    s.rank = rank;
		    s.wrank = wrank;
			 */
			//Student 클래스에 생성자를 만들어서 매개변수로 넘긴다.
			Student s = new Student(name, kor, eng, mat, tot, avg, rank, wrank);

			//클래스 복사!!
			students[ban-1][counts[ban-1]] = s; //[ban-1]은 몇반에 넣을건지. [counts[ban-1]]은 몇반 몇번째 학생에 넣을건지
			//ban[0] == 1반

			counts[ban-1] ++; //입력받은 학생의 숫자를 1 증가시키기 위해서 counts 의 ban-1에 1증가된 값 저장. 몇반 몇번째 학생이 올라가는건지			
			//counts[ban-1]+1 준 이유? 2반에 김길동 입력하려면 counts[1] 에 입력해야하기 때문에 

			System.out.print("입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());			
		} while (Character.toUpperCase(con)=='Y');

		for (int i = 0; i < counts.length; i++) {
			System.out.printf("[%d반 학생 : %d명] \n", i+1, counts[i]); //counts의 길이가 학생 명수이기 때문에 counts.length로 준다
			//i+1인 이유는 i가 0부터 시작되기 때문에 0+1해야 1반 출력
			for (int j = 0; j < counts[i]; j++) { //counts[i] 는 i+1 반의 갯수. i가 0~counts.length이기 때문에 i가 0~3까지면  
				students[i][j].dispInfo(); //students[i][j]는 i+1반 j번째 학생이라는 뜻. ex) 3반 2번째 학생 출력

			}
		}

	} //main

} //class



