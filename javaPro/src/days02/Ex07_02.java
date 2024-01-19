package days02;

import java.util.Calendar;

/**
 * @author BongGu
 * @date 2024. 1. 2. - 오후 3:04:36
 * @subject
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		int i = 10;
		System.out.printf("%d\t%o\t%x\t%X\n",i, i, i, i); // \t : Tap 키의 공백만큼 띄어써짐
		System.out.printf("%1$d\t%1$o\t%1$x\t%1$X\n",i);
		System.out.printf("%1$d\t%1$#o\t%1$#x\t%1$#X\n",i);

		// 날짜 클래스
		Calendar c = Calendar.getInstance();
		System.out.printf("%1$t"
				+ "Y - %1$tm - %1te", c);
		// 출력 서식 사용할 때 형식(문법)
		//%[argument_index$][flags][width][.precision]conversion . [] 안은 생략이 가능함
		//flags : 

		boolean gender = true;
		System.out.printf("%b \n", gender);

		int tot = 277;
		double avg = 92.33333333333;

		System.out.printf("총점 : [%10d]  \n", tot);		//%10d 	: 전체 10자리 확보하고 우측 정렬
		System.out.printf("총점 : [%-10d]  \n", tot);		//%-10d	: 전체 10자리 확보하고 주고 좌측 정렬

		System.out.printf("평균 : [%10.2f]  \n", avg);		//%10f	: 전체 10자리 확보하고 소숫점 둘째자리까지, 우측 정렬 	
		System.out.printf("평균 : [%-10.2f]  \n", avg);	//%-10f	: 전체 10자리 확보하고 소숫점 둘째자리까지, 좌측 정렬

		int money = 123456;
		System.out.printf("머니 : %,d  \n", money); 		//%,		: 1000자리마다 ,로 자리수 표시
		
		int no = 15; //0015로 출력하려면?
		System.out.printf("No : [%04d] \n", no);			//%4d	: 전체 4자리로 표현, 0015로 표현됨  

		//%[argument_index$][flags][width][.precision]conversion . [] 안은 생략이 가능함
		//                                        너비(공백)

	} //main

} //class
