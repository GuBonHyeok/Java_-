package days25;

/**
 * @author Bonggu
 * @date 2024. 2. 2.- 오전 10:08:19
 * @subject 자바의 IO (Input + Output)
 * @content 중요!
 */
public class Ex02 {

	public static void main(String[] args) {
		/*
		 *  [ 자바의 IO (Input + Output) ]
		 *  				  입력		   출력
		 *  1. [ 컴퓨터(프로그램)]				---송신--->			[외부장치(다른 프로그램)]
		 *  									   <---수신---
		 *  	프로그램 간에 데이터를 주고 받는 것 : 입/출력 (IO)
		 *  2. 두 장치를 연결해 주는 객체(길)이 필요하다 : 스트림(Stream)
		 *  3. 스트림 : 데이터를 운반하는 통로. (빨대와 비슷한 개념)
		 *  	1) 흐르는 물
		 *  	2) 단방향(2가지 스트림)
		 *  		ㄱ. 읽기(입력용) 스트림
		 *  		ㄴ. 쓰기(출력용) 스트림
		 *  	3) 연속적인 데이터의 흐름
		 *  4. 자바의 모든 입출력은 스트림(Stream)이라는 개념으로 이루어져있다		 *  
		 *  예)
		 *  
		 *  키보드 장치			-> 수신 -> 			[프로그램]	->		송신	->		모니터
		 *  (표준 입력장치)																	(표준 출력장치)
		 *  						스트림 객체								스트림 객체
		 *  						System.in								System.out
		 *  5. 자바의 스트림은 2가지 종류로 구분(분류)
		 *  	1) 문자(텍스트)	스트림
		 *  		최상위 부모 클래스 : Reader (입력용)
		 *  		최상위 부모 클래스 : Writer (출력용)
		 *  
		 *   	1문자 == 유니코드 2바이트 == char
		 *   	1문자, 문자열, 문자 배열을 다룬다
		 *  
		 *  	예) FileReader / FileWriter
		 *  		 BufferedReader / BufferedWriter
		 *  					ㄴ readLine()
		 *  		~~~Reader / ~~~Writer : 이런 형태면 문자 스트림이다.
		 *  
		 *  	2) 바이트(이진) 스트림
		 *  		최상위 부모 클래스 : InputStream (입력용)
		 *    		최상위 부모 클래스 :	OutputStream (출력용) 
		 *    
		 *    		System.in / System.out
		 *    	
		 *    		~~~InputStream / ~~~OutputStream
		 *    	예) FileInputStream / FileOutputStream
		 *  		 BufferedInputStream / BufferedOutputStream
		 *  					ㄴ readLine()
		 *  		~~~InputStream / ~~~OutputStream : 이런 형태면 바이트 스트림이다.
		 *  6. 보조스트림 : 어떤 스트림의 IO를 더 쉽도록 보조 역할을 하는 스트림
		 *  	예) FileReader fr = new FileReader(fileName);
		 *  		fr.read() 한 문자, 문자배열
		 *  		BufferedReader br = new  BufferedReader(fr);
		 *  		br.readLine() 한 라인 문자열을 읽도록 원래 스트림을 가공해서 쓴다. 
		 */

	} //main

} //class










