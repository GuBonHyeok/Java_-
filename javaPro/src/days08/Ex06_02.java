package days08;

import java.util.Arrays;

/**
 * @author BongGu
 * @date 2024. 1. 10. - 오후 4:17:54
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		//String rrn = "950518-1800000";
		/*
		String regex = ""; //regex에 "-" 저장
		String [] rrnArr = rrn.split(regex); //"-"를 구분자로 문자열을 자름

		for (int i = 8; i < rrnArr.length; i++) {

			rrnArr[i] = "*";
		}

		String printrrn = String.join("", rrnArr);		
		System.out.println(printrrn);
		 */


		// 주민등록번호 출력
		// 950518-1800000

		String rrn = "950518-1800000";
		// String split()
		// "950518-1800000"
		// String -> char []
		char [] rrnArr = new char[ rrn.length() ];
		System.out.println( Arrays.toString(rrnArr) ); //> 배열 내용 확인
		// String Arrays.toString (배열 > 문자열)
		Arrays.fill(rrnArr, '*'); //배열에 특정 문자로 채워넣는 fill 작업

		for (int i = 0; i < 8; i++) {         
			//if(i >=8) {
			//   rrnArr[i]= '*';
			//}else {
			rrnArr[i]= rrn.charAt(i);
			//}          
		}      
		System.out.println( Arrays.toString(rrnArr) );
		// char[] -> String 
		String printRRN = String.valueOf(rrnArr);
		System.out.println( printRRN );


		// 주민등록번호를 출력
		// 950518-1******



	} //main

} //class
