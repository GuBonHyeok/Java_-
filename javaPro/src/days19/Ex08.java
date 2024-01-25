package days19;

import java.io.IOException;
import java.util.Objects;
import java.util.Random;

import days15.Point;

/**
 * @author Bonggu
 * @date 2024. 1. 25.- 오후 2:17:03
 * @subject Arrays 클래스, Objects 클래스 
 * @content
 */
public class Ex08 {
	
	public static void main(String[] args) {
		//Arrays 클래스 : toString(), sort(), binarySearch()
		//Object 클래스 : 모든 메서드가  static이다.
		// 						즉 객체 생성 없이 Object.메서드() 로 바로 사용할 수 있다.
		//						객체의 비교 또는 Null 체크에 유용하다
		/*
		Point p1 = null;
		//
		//
		//
		// -> p1 객체 생성 유무 체크
		//if (p1 ==null) {
		if (Object.inNull(p1)) { //p1이 널인지 물어보는 것									->  p1이 Null일때 true 반환
			//
		}
		//if (p1 != null) {
		if (Object.nonNull(p1)) { //p1이 널이 아닌지 물어보는 것							->  p1이 Null이 아닐때 true 반환
		}	if ( !Object.isNull(p1)) { //p1이 널이 아닌지 물어보는 것 (부정연산자 활용)			
		}
		
		// p1이 널이면 예외 발생시킴
		if (p1 == null) {
			new IOException("예외 메세지"))			
		}
		Point pCopy = p1; 널이 아니면  반환시킴
		
		Point pCopy = Objects.requireNonNull(p1,  "예외메세지");
		
		//if ( p1 != null && p1.equals(pCopy)) {
		if(Objects.equals(p1, pCopy)) { //p1이 null 이 아니면서 pCopy와 같냐고 물어보는 코드
		}
		*/
		
		System.out.println("-".repeat(30));
		
		// 											[ Random() ]
		Random rnd = new Random();
		System.out.println(rnd.nextInt()); //int 값 중 하나를 랜덤하게 띄운다 -21억 ~ 21억
		System.out.println(rnd.nextInt(10)); //int 값 중 0<= n <10 하나를 랜덤하게 띄운다
		System.out.println(rnd.nextBoolean()); //true / false 랜덤 발생
		//rnd.nextXXX  :   XXX자료형의 값을 랜덤으로 반환
		
		
	}//main
	
}//class













