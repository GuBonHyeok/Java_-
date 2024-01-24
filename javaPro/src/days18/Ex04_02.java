package days18;

import java.util.Arrays;

/**
 * @author Bonggu
 * @date 2024. 1. 24.- 오후 2:05:55
 * @subject
 * @content  1. String					: 변경 불가능한 클래스 (주소값을 참조하는 것이기 때문이다)
 * 					 2. StringBuffer
 * 					 3. StringBuilder
 * 					 4. StringTokenizer
 */
public class Ex04_02 {
	public static void main(String[] args) {
		String todo = "TODO Auto-generated all method Alert stub";
		
		//System.out.println(todo.codePointAt(0)); //84 > T에 해당되는 아스키코드 값 출력
		//boolean < todo.equals(""); //문자열 비교해서 같다 / 다르다 true false 값 반환
		//int < todo.compareTo(""); //문자열 비교해서 같다 / 다르다 같으면 0, 다르면 양수 음수로 나타냄
		//int todo.compareToIgnoreCase(""); //문자열 비교해서 같다 / 다르다 같으면 0, 다르면 양수 음수로 나타냄 ※대소문자 구분하지 않음
		
		//System.out.println("ABC".compareTo("AcC")); // -33 . A-A, B-c, C-C 각각의 문자들을 빼서 비교한다. 같아야 0이 나옴! 
		//System.out.println("CBC".compareTo("AcC")); // 2  
		//System.out.println("ABC".compareToIgnoreCase("AbC")); // 0 . 대소문자 구분하지 않기 때문에.
		
		// todo.endsWith(suffix); //suffix : 접미사
		// todo.startsWith(prefix); //prefix : 접두사
		
		/*
		String url = "https://www.naver.com"; 
		System.out.println(url.startsWith("https://")); //https: 로 시작하는지 true / false 확인하는 메서드
		System.out.println(url.endsWith(".com")); //.com 로 끝나는지 true / false 확인하는 메서드
		*/
		
		// [문제]
		/*
		String directory = "C:\\spring\\src";
		String fileName = "Sample.java";
		if (directory.endsWith("\\")) {
			String path = directory + fileName;
			System.out.println(path);
		} else {
			String path = directory + "\\" +fileName;
			System.out.println(path);
		}
		*/
		
		//byte [] todoByteArr = todo.getBytes(); //문자열의 각 문자들의 바이트를 가져오는 것
		//System.out.println(Arrays.toString(todoByteArr));
		
		//todo.indexOf(0); //앞에서 부터 찾아서 찾은 인덱스 값을 반환
		//todo.lastIndexOf(0); //뒤에서 부터 찾아서 찾은 인덱스 값을 반환
		//System.out.println(todo.indexOf("Auto")); //앞에서부터 찾음.
		//System.out.println(todo.lastIndexOf("Auto")); //뒤에서부터 찾는데 Auto가 두개라면 뒤쪽에 있는거 먼저 반환함
		
		// todo.matches(todo); 정규표현식과 같은지
		
		//todo.repeat(30); //문자열.을 (n)번 만큼 반복
		//String todo = "TODO Auto-generated all method Alert stub";
		
		/*  												[ replace ]
		System.out.println(todo.replace('A', '*')); //'A'를 '*'로 바꾸기
		System.out.println(todo.replace("method", "방법")); //'A'를 '*'로 바꾸기
		System.out.println(todo.replaceAll("[Aa]\\.*", "캇")); //정규표현식 regex에 만족하는 모든 문자열을 String으로 바꾸겠다..
		System.out.println(todo.replaceFirst("[Aa]\\.*", "캇")); //정규표현식 regex에 만족하는 첫번째 문자를 String으로 바꾸겠다..
		*/
		
		/*													[ split ]
		String regex = " ";
		//String [] todoArr = todo.split(regex); //String을 regex를 기준으로 자르겠다.
		String [] todoArr = todo.split(regex, 3); //최대 3개만 잘라서 오고 나머지는 버린다.
		System.out.println(Arrays.toString(todoArr)); //공백을 기준으로 잘라서 배열에 넣음
		*/
		
		/*													[ strip ]
		todo.strip();				// trim() 과 같이 앞 뒤 공백 제거
		todo.stripLeading();	// 앞쪽 공백 제거
		todo.stripTrailing(); // 뒤쪽 공백 제거
		*/
						
		/*											[ substring, subSequence ]
		System.out.println(todo.substring(0, 2)); //리턴 자료형이 String
		System.out.println(todo.subSequence(0, 2)); //리턴 자료형이 CharSequence
		*/
		
		//문자열을 byte 배열로 바꾸는 함수   getBytes()
		//문자열을 char 배열로 바꾸는 함수   toCharArray()
		//char [] todoCharArray = todo.toCharArray();
		
		/*										[  toUpper,LowerCase  ]
		System.out.println(todo.toUpperCase()); //대문자로 바꾸는 함수
		System.out.println(todo.toLowerCase()); //소문자로 바꾸는 함수
		*/
		
		//todo.format(null, todo, args) //원하는 형태로 바꾸는 함수
		/*
		System.out.println(String.join("</li><li>" , "권맑음","구본혁","한재호")); //join(구분자, 문자열~~) 구분자로 문자열들을 나눔
		//권맑음</li><li>구본혁</li><li>한재호
		 */
		/*										[ valueOf	]  - 각 쟈료형의 값을 문자열(String)으로 변환하는 메서드
		char [] m = {'a', '2', 'x'};
		String s = String.valueOf(m);
		System.out.println(s);
		*/

	}

}










