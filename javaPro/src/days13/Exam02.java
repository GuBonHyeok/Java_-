package days13;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Exam02 {



	public static void main(String[] args) throws IOException {
		String name;
		int kor, eng, mat, tot, rank;
		double avg;

		final int STUDENT_COUNT = 30;
		final int CLASS_COUNT = 3;
		
		String [][] names = new String[CLASS_COUNT][STUDENT_COUNT]; 
		int [][][] infos = new int[CLASS_COUNT][STUDENT_COUNT][6];
		double [][] avgs = new double[CLASS_COUNT][STUDENT_COUNT];

		char con = 'y';      
		int [] counts = new int [CLASS_COUNT];
				
		Scanner scanner = new Scanner(System.in);
		int ban = 0;
		int count = 0;

		do {
			System.out.printf(">%d번 이름, 국어, 영어,수학 입력 ? ",count + 1);
			name = getName();
			kor = getScore(); 
			eng = getScore();
			mat = getScore();

			tot = kor + eng + mat;
			avg = (double) tot/3;
			rank = 1;

			for (int i = 0; i <= ban; i++) {
				names[ban][i] = name;
				for (int j = 0; j <= ban; j++) {
					infos[ban][i][0] = kor;
					infos[ban][i][1] = eng;
					infos[ban][i][2] = mat;
					infos[ban][i][3] = tot;
					infos[ban][i][4] = rank;
				} //for j
				avgs[ban][i] = avg;
			} //for i
			ban++;
			count ++;

			System.out.print(">학생 입력 계속?");
			con = (char)System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con)=='Y');

		procRank(infos, ban);
		dispStudentInfo(names, avgs,infos, ban);

	} //main

	private static void dispStudentInfo(String[][] names, double[][] avgs, int[][][] infos, int ban) {
		System.out.printf("총 %d명 \n", ban);
		for (int i = 0; i < ban; i++) { 
			System.out.printf("%d반 %d번\t%s\t%s\t%s\t%s\t%s\t%.2f\t%d등\n"
					,ban+1,i+1, names[ban][i], infos[ban][i][0], infos[ban][i][1], infos[ban][i][2], infos[ban][i][3], avgs[ban][i], infos[ban][i][4]);                     
		} //for

	}//dispStudent

	private static void procRank(int[][][] infos, int ban) {
		for (int i = 0; i <= ban; i++) {
			infos[ban][i][4] = 1;
			for (int j = 0; j < ban; j++) { 
				if (infos[ban][i][3] > infos[ban][j][3]) infos[ban][i][4]++; 
				for (int k = 0; k < ban; k++) {
					if (infos[ban][i][3] > infos[j][k][3]) infos[ban][i][4]++;         
				}//if
			} //for j
		} //for i

	} //procRank

	private static int getScore() {
		return (int) (Math.random()*101); 
	} //getScore

	private static String getName() {
		String[] lastNames = {"김", "이", "박", "최", "권", "구"};
		Random rnd = new Random();
		int index = rnd.nextInt(lastNames.length);
		String lastName = lastNames[index];

		char [] firstNames = new char[2];
		for (int i = 0; i < firstNames.length; i++) {
			firstNames[i] = (char)(rnd.nextInt('힣' - '가'+ 1 ) + '가');

		} //for
		String name =lastName + firstNames[0] + firstNames[1];

		return name;
	} //getNames

} //class

