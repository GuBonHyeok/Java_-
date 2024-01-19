package days04;

import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 4. - 오전 10:23:38
 * @subject 문자열 비교
 * @content  ==를 쓰지 않고 이름을 입력 받아서 비교하는 예제
 */
public class Ex01 {

	public static void main(String[] args) {
		// [각종 비교 연산자]
		// 숫자 타입 (정수, 실수) 	==
		// 문자						==
		// 불린						==
		// 문자열?
		// 일단 암기
		
		/*
		String name1 = "홍길동";
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 이름 입력 : ");
		String name2 = scanner.next(); //nextByte(), 등등 nextXXX(). 하지만 한 문자를 입력 받는 nextChar()은 없음
		//name = scanner.next();로 하지 않는 이유는 입력 받으면 "홍길동"이 사라지기 때문
		//Duplicate local variable name > 지역 변수 중복 선언
		
		// System.out.println(name1 == name2); // false. 이유는 나중에 나옴
		
		// 문자열 비교 : String.equals() 메서드 사용 [그냥 암기할 것]
		
		System.out.println(name1.equals(name2));
		*/
		
		/*
		String msg1 = "kenik", msg2 ="KENIK";
		System.out.println(msg1.equals(msg2)); //대소문자 구분 O
		// 대소문자를 구분하지 않고 문자열 같은지 어떻게?
		System.out.println(msg1.equalsIgnoreCase(msg2)); //대소문자 구분 X
		*/
		
		/*
		String name1 = "홍길동";
		String name2 = "홍길동";
		System.out.println(name1 == name2); //true. 이유는 클래스 배울 때 알게 됨.
		*/
		
				
		
		

	}

}
