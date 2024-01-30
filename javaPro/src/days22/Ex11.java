package days22;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import days14.Student;

/**
 * @author Bonggu
 * @date 2024. 1. 30.- 오후 3:07:07
 * @subject 1개반 30명 학생 성적 처리 (ArrayList 활용)
 * @content 내일 시험 문제
 */
public class Ex11 {

	public static void main(String[] args) throws IOException {
		// 3번 30명 학생의 성적 처리
		// Student 클래스 배열 선언으로 했었음
		// Student [] students = new Student[30]; >> 1개 반 days14.Ex08.java <<<<<
		// Student [][] students = new Student[3][30]; >> 3개 반 days15.Ex01.java

		// 1) Student 클래스 사용
		// 2) 입력 받는 순서대로 1,2,3 .... 순서가 유지되어야 하기 때문에 List 계열
		//		>> ArrayList

		ArrayList list = new ArrayList();

		String name;
		int kor, eng, mat, tot;
		double avg;
		int rank;

		Scanner scanner = new Scanner(System.in);
		char con = 'y';

		do {
			System.out.printf(">%d번 이름, 국어, 영어,수학 입력 ? ",list.size()+1); //첫번째 학생 정보 입력

			name = scanner.next();
			kor = scanner.nextInt();
			eng = scanner.nextInt();
			mat = scanner.nextInt();			
			tot = kor + eng + mat;
			avg = (double) tot/3;
			rank = 1;

			Student s = new Student(); 

			s.name = name;
			s.kor = kor;
			s.eng = eng;
			s.mat = mat;
			s.tot = tot;
			s.avg = avg;
			s.rank = rank;

			list.add(s); //1명 입력했으니 +1씩 증가

			// 입력 계속하겠냐는 메세지 출력
			System.out.print(">학생 입력 계속?");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');	 

		procRank(list);

		dispStudentInfo(list);


	} //main

	private static void procRank(ArrayList list) {
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next(); //학생 1명 가져오는 걸로 이해하면 됨
			s.rank =1; //일단 첫번째 학생 1등 줘놓고
			Iterator ir2 = list.iterator();
			while (ir2.hasNext()) {
				Student s2 = (Student) ir2.next(); //두 번째 학생 가져오는 걸로 이해하면 됨		
				if (s.tot < s2.tot)	s.rank++; //만약 두번째 학생이 더 높으면 등수 올리기
			}//while
		}//while
	}//procRank

	private static void dispStudentInfo(ArrayList list) {
		System.out.printf("총 %d명 \n", list.size());
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next(); //list에는 Student 자료형의 s가 들어있기 때문에
			s.dispInfo(); //days14의 Student 클래스의 dispInfo 메서드			

		}//while		
	}//dispStudentInfo

}//class
