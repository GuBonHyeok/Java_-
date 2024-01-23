package days17;

import java.io.IOException;

import javax.management.RuntimeErrorException;

/**
 * @author Bonggu
 * @date 2024. 1. 23.- 오후 4:29:04
 * @subject 강제 예외 발생 
 * @content
 */
public class Ex15 {

	public static void main(String[] args) {
		//컴파일러가 예외처리를 확인하기도 하고 확인하지 않는 경우도 있음
		
		//컴파일 오류 발생
		//이유? "checked 예외" Exception의 자손들은 예외 확인해주는 클래스
		//throw new IOException("강제 IO 예외 발생");
		//throw new Exception("강제 예외 발생");

		//컴파일 오류 발생하지 않음
		//컴파일러가 예외 발생을 확인하지 않는다. 
		//이유 ? "unchecked 예외" RuntimeException의 자손들은 컴파일러가 예외를 확인하지 않음.
		throw new RuntimeException("강제 예외 발생");

 	} //main

} //class
