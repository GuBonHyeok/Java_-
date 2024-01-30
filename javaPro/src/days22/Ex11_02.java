package days22;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import days14.Student;

/**
 * @author Bonggu
 * @date 2024. 1. 30.- 오후 3:38:12
 * @subject
 * @content 내일 시험....
 */
public class Ex11_02 {

	public static void main(String[] args) throws IOException {
		// 1반 30명  x3 반
		// Student [][] students = new Student[3][30]; >> 3개 반 days15.Ex01.java 참고
		ArrayList class1List = new ArrayList(); //sistList.get(0)
		ArrayList class2List = new ArrayList();//sistList.get(1)
		ArrayList class3List = new ArrayList();//sistList.get(2)

		ArrayList sistList = new ArrayList();

		sistList.add(class1List);
		sistList.add(class2List);
		sistList.add(class3List);

		// 입력
		String name;
		int kor, eng, mat, tot;
		double avg;
		int rank, wrank;

		Scanner scanner = new Scanner(System.in);
		char con = 'y';

		int ban;

		do {
			System.out.print("> 반 입력?");
			ban = scanner.nextInt();

			ArrayList classList = (ArrayList) sistList.get(ban-1); //sistList는 Object를 반환하기 때문에 ArrayList로 다운캐스팅			

			System.out.printf(">%d반 %d번 이름, 국어, 영어,수학 입력 ? ",ban,classList.size()+1); //첫번째 학생 정보 입력

			name = scanner.next();
			kor = scanner.nextInt();
			eng = scanner.nextInt();
			mat = scanner.nextInt();			
			tot = kor + eng + mat;
			avg = (double) tot/3;
			rank = 1;
			wrank = 1;


			Student s = new Student(name, kor, eng, mat, tot, avg, rank, wrank); 
			s.name = name;
			s.kor = kor;
			s.eng = eng;
			s.mat = mat;
			s.tot = tot;
			s.avg = avg;
			s.rank = rank;
			s.wrank = 1;

			classList.add(s);

			// 입력 계속하겠냐는 메세지 출력
			System.out.print(">학생 입력 계속?");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');	 


		// 출력
		dispStudentInfo(sistList);



	} //main

	private static void dispStudentInfo(ArrayList sistList) {
		//int totalStudents = sistList.stream().mapToInt(ArrayList::size).sum(); //IntStream 객체 만들어짐
		//System.out.printf("\t\t 학생 정보 출력 (총 %d명)\n",totalStudents);
		
		int totalStudents = 0;
		
		int ban = 1;
		Iterator ir = sistList.iterator();
		while (ir.hasNext()) {
			ArrayList classList = (ArrayList) ir.next(); 
			totalStudents += classList.size();
			System.out.println("=".repeat(40));
			System.out.printf("%d반 학생 총 %d명 \n", ban++, classList.size());
			
			Iterator ir2 =classList.iterator();
			while (ir2.hasNext()) {
				Student s = (Student) ir2.next();
				s.dispInfo();
				
			}
			
		}
		 System.out.printf("\t\t학생 정보 출력( %d명 )\n", totalStudents );

	}// dispStudentInfo

} //class
