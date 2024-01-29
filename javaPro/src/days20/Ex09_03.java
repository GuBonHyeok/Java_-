package days20;

import java.text.MessageFormat;
import java.text.ParseException;

/**
 * @author Bonggu
 * @date 2024. 1. 26.- 오후 4:26:29
 * @subject MessageFormat 활용 이름, 나이 파싱해와서 출력하기
 * @content
 */
public class Ex09_03 {

	public static void main(String[] args) throws ParseException {
		String output = "이름:권맑음, 나이:26살, 성별:남자, 키:178.67입니다.";

		String pattern =  "이름:{0}, 나이:{1}살, 성별:{2}, 키:{3}입니다.";
		MessageFormat mf = new MessageFormat(pattern); //파싱해올거기 때문에 new 연산자로 객체 생성

		Object [] objs = mf.parse(output); //output에 있는 값
		for (Object o : objs) {
			System.out.println( o );
		}//for

	} // main

} // class