package days19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author Bonggu
 * @date 2024. 1. 25.- 오후 2:30:24
 * @subject 막대그래프 그리기
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		//days18.Ex01.java 가 있음.
		//위 파일에서 알파벳을 대소문자 구분하지 않고 배열에 저장 후
		//배열에 저장 후 ###막대그래프를 그리는 작업
		//counts[0] = A(65) 문자의 갯수 저장
		//counts[1] = B(66) 문자의 갯수 저장
		//    ...
		//counts[25] = Z(90) 문자의 갯수 저장
		// A ~ Z 26문자
		int [] counts = new int ['Z' - 'A' + 1]; //알파벳 26개 저장할 배열 생성
		String fileName = "\\src\\days18\\Ex01.java"; //SS20_Team 경로를 fileName에 저장
		String [] teamMember = null; // 팀원들 저장할 배열

		String key = "user.dir";
		String userDir = System.getProperty(key); //user.dir의 경로 확인
		//System.out.println(userDir);

		String path = String.format("%s%s",userDir, fileName); //파일의 전체 경로 불러와서 path에 저장

		System.out.println(path);

		try (FileReader fr = new FileReader(path)) {
			int code;
			char one;
			//read() : EOF(End Of File)을 만나면 -1 반환
			while ( ( code = fr.read() )!= -1) { // int 값인 code로 받아주고 파일의 끝인 -1을 만나기 전까지 계속 돌려준다
				 one = (char)code;
				 one = Character.toUpperCase(one); //원래 대문자는 대문자로, 소문자는 대문자로, 숫자는 그대로 숫자로
				 if (Character.isUpperCase(one)) { //다른 문자에는 반응하지 않고 알파벳 대,소문자만 걸러짐
					 System.out.println(one);
					 counts[one - 'A'] ++; //one 이 B면 2, C면 3이 들어간다
					 
				 }
			} //while
			System.out.println(Arrays.toString(counts));
			
			for (int i = 0; i < counts.length; i++) {
				 System.out.printf("'%c': %s(%d)\n"
		                  , 'A'+i  ,  "#".repeat( counts[i] ) , counts[i]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} //try

	} //main

}//class
