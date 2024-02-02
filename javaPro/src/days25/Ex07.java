package days25;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * @author Bonggu
 * @date 2024. 2. 2.- 오후 2:17:44
 * @subject 메모리 스트림
 * @content - 주로 다른 곳에 입/출력하기 전에 메모리 상에 데이터를 임시로 저장할 목적으로 사용하는 스트림
 * 
 * 	바이트 스트림					ByteArrayInputStream / ByteArrayOutputStream	: 이건 잘 안씀
 * 	문자 스트림					CharArrayReader / CharArrayWriter						: 이건 잘 안씀
 * 	문자 스트림					StringReader / StringWriter									: 이건 종종 씀
 * 
 */
public class Ex07 {

	public static void main(String[] args) {
		byte[] buf = {0,1,2,3,4,5,6,7,8,9};
		
		try(ByteArrayInputStream bis = new ByteArrayInputStream(buf);
				ByteArrayOutputStream bos = new ByteArrayOutputStream();) {
			int code;			
			while ( ( code = bis.read() ) != -1 ) {
				//System.out.println(code);
				bos.write(code);
			} //while
			
			// buf [] -> bis 메모리 스트림 -> bos 스트림 - 출력 -> outbuf [] => Sysout 으로 출력 확인 
			byte[] outbuf = bos.toByteArray();
			
			System.out.println(Arrays.toString(outbuf));
			
			System.out.println("end");			
		} catch (Exception e) {
			e.printStackTrace();
		} //try~catch
		
	} //main

} //class





