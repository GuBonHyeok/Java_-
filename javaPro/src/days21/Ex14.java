package days21;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import days14.Student;
import days14.StudentManagement;

/**
 * @author Bonggu
 * @date 2024. 1. 29.- 오후 3:52:38
 * @subject [학생 등수 처리] Student 클래스 사용 + ArrayList 컬렉션 클래스 사용 . days14.ex08
 * @content 
 */
public class Ex14 {

	public static void main(String[] args) throws IOException {
		String name;
		int kor, eng, mat, tot;
		double avg;
		int rank;
		
		ArrayList list = new ArrayList(); //클래스 배열이 아닌 ArrayList로 컬렉션 클래스 선언	

		Scanner scanner = new Scanner(System.in);
		char con = 'y';
		
		do {
			System.out.printf(">%d번 이름, 국어, 영어,수학 입력 ? ",list.size() + 1); //첫번째 학생 정보 입력. 제일 처음 list.size는 0

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
			list.add(s); //list에 학생 리스트를 입력
			
			System.out.print(">학생 입력 계속?");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');
		
		procRank(list);
		dispStudent(list); //학생 정보 출력
		

	} //main

	private static void procRank(ArrayList list) {
	
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next();			
			// s.tot, s.rank 등수를 매길 학생의 총점, 등수가 필요함
			s.rank = 1;
			for (int i = 0; i < list.size(); i++) {
				int targetTot = ((Student)list.get(i)).tot; //get 함수는 object 형이라 targetTot에 넣으려면 Student로 다운캐스팅을 해야 넣을 수 있음 
				if (s.tot < targetTot) {
					s.rank++;					
				}				
			}
			
		} //while

		
	}

	private static void dispStudent(ArrayList list) {
		
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next();			
			s.dispInfo(); //Student 클래스 안에 있는 함수 호출
		} //while

	}//dispStudent

} //class
