package days25;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author Bonggu
 * @date 2024. 2. 2.- 오후 3:37:16
 * @subject 	Sequence [InputStream] 
 * @content		순차적 + 입력용 바이트 스트림
 * 							ㄴ 하나의 파일 용량이 너무 커서 여러 개의 파일로 분리했다고 가정하면 
 * 								그 분리된 파일을 여러개의 입력 스트림으로 만들고 연속적으로 그 입력 스트림을 연결해서
 * 								하나의 스트림처럼 데이터를 처리할 수 있는 바이트 스트림
 * 
 * 								a.dat 가 용량이 너무 커서
 * 									ㄴ a_1.dat
 * 									ㄴ a_2.dat
 * 									ㄴ a_3.dat
 * 									ㄴ a_4.dat 로 하려고 한다
 */
public class Ex11 {

	public static void main(String[] args) throws IOException {
		//byte [] x = {1,2,3,4,5,6,7,8,9};
		byte [] a = {1,2,3};
		byte [] b = {4,5,6};
		byte [] c = {7,8,9};
		
		// byte [] -> ByteArrayInputStream 메모리 스트림
		ByteArrayInputStream a_bis = new ByteArrayInputStream(a); //a 배열을 처리하는 ByteArrayInputStream
		ByteArrayInputStream b_bis = new ByteArrayInputStream(b); //b 배열을 처리하는 ByteArrayInputStream
		ByteArrayInputStream c_bis = new ByteArrayInputStream(c); //c 배열을 처리하는 ByteArrayInputStream
		
		/* [1] 번 처리 방법
		//Sequence [ InputStream ] 사용 : a_bis, b_bis, c_bis 순차적 처리		
		SequenceInputStream sis1 = new SequenceInputStream(a_bis, b_bis);
		SequenceInputStream sis2 = new SequenceInputStream(sis1, b_bis);
		*/
		
		// [2] 번 처리 방법. 처리하는 순서 : a_bis, b_bis, c_bis
		// List를 구현한 클래스 Vector를 사용
		
		Vector<ByteArrayInputStream> v = new Vector<>();
		v.add(a_bis);
		v.add(b_bis);
		v.add(c_bis);
		
		Enumeration<ByteArrayInputStream> en = v.elements(); //Enumeration을 리턴 		
		SequenceInputStream sis = new SequenceInputStream(en); //열거
		
		//출력
		int code;
		while ( (code = sis.read()) != -1 ) {
			System.out.println(code);
		}//while

	} //main

} //class














