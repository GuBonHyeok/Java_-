package days20;

import java.text.MessageFormat;

/**
 * @author Bonggu
 * @date 2024. 1. 26.- 오후 4:12:11
 * @subject
 * @content 1. SimpleDateFormat ***
 * 					2. DecimalFormat ***
 * 					3. ChoiceFormat ***
 * 					4. MessageFormat <<<<<
 */
public class Ex09 {

	public static void main(String[] args) {
		// 		[  MessageFormat  ]
		// 데이터(값)  ->  특정 형식으로	 	출력
		// 특정형식	  ->  데이터(값) 		읽기
		String name = "권맑음";
		int age = 26;
		boolean gender = true;
		double height = 178.67;
		char grade = 'A';

		//  이름 : 권맑음, 나이 : 26살, 성별 : 남자, 키 : 178.67, 등급 : A
		/*
		String output = String.format("이름 : %s, 나이 : %d살, 성별 : %s, 키 : %.2f"
				+ ", 등급 : %c\n",name, age, gender?"남자":"여자", height,grade);
		 */
		String pattern = "이름 :{0}, 나이 : {1}살, 성별 : {2}, 키 : {3}, 등급 : {4}";
		//MessageFormat mf = new MessageFormat();
		String output = MessageFormat.format(pattern, name, age, gender?"남자":"여자", height,grade);
		System.out.println(output);


	}//main

} //class





