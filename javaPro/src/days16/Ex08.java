package days16;

//static import문 > 
import static java.lang.Math.random;
import static java.lang.Math.PI;

/**
 * @author Bonggu
 * @date 2024. 1. 22.- 오후 2:00:44
 * @subject 패키지(package)
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		/*
		 * 1. 패키지 (package)
		 *    - 서로 관련있는 클래스, 인터페이스들의 묶음
		 *    - 클래스를 효율적으로 관리하기 위해서
		 *      예) java.io 패키지
		 *				>input, output 패키지
		 *	   - 동일한 클래스일지라도 충돌을 막기위해서 패키지를 사용.
		 *		예) 다른 개발자가 구현한 클래스명과 또 다른 개발자가 구현한 클래스명이 동일할지라도 
		 *			패키지명으로 충돌을 막고 구분해서 사용할 수 있다. 
		 *	   - 도메인명 == 패키지명 쓰면 충돌할 일 없음
		 *			naver.com sist.org...
		 *	   - 패키지는 물리적으로는 디렉토리(폴더) 생성
		 *		예) java.lang.System 클래스 
		 *		    >	java 폴더
		 *				ㄴ lang 폴더
		 *					ㄴ System.class 클래스파일
		 *    - 클래스를 선언할 때 소스파일의 첫 번째 라인(문장)에
		 *    	 package를 선언한다.
		 *    - 패키지명은 소문자로 작명한다.
		 *    - 소스파일에 다른 패키지의 클래스를 사용하려면 import문을 사용해서 클래스가 포함된 패키지 명을 기재해야한다
		 *    - [클래스의 풀네임] 을 적으세요. : 패키지명.클래스명
		 *    - import 문이 없는 경우 Ctrl + Shift + O 누르면 자동으로 import문 추가
		 *    - import java.io.*;
		 *    				java.io 패키지 안의 모든 것(클래스)을 import 하겠다
		 * 
		 */
		
		System.out.println(random());
		System.out.println(Math.PI);

	} //main

} //class
