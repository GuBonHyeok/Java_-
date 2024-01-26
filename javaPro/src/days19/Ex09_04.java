package days19;

import java.io.FileReader;
import java.util.Arrays;

/**
 * @author Bonggu
 * @date 2024. 1. 25.- 오후 3:32:32
 * @subject 알파벳 갯수 (대소문자 구분), 숫자 갯수 그래프로 출력 (선생님 코드)
 * @content 10분만에 짤 수 있게 ! 연습!
 */
public class Ex09_04 {

	public static void main(String[] args) {		
		int [][] counts = new int[3][];      
		counts[0] = new int[26];
		counts[1] = new int[26];
		counts[2] = new int[10];


		String fileName = "\\src\\days19\\Ex01.java";      
		String key = "user.dir";
		String userDir = System.getProperty(key);      
		String path = String.format("%s%s", userDir, fileName);

		try (FileReader fr = new FileReader(path); ){
			int code ;
			char one ;
			
			while( (code = fr.read() ) != -1 ) {
				one = (char)code;				    
				if( Character.isUpperCase(one) ) { 
					counts[0][one - 'A']++;
				}else if( Character.isLowerCase(one) ) {
					counts[1][one - 'a']++;
				}else if (Character.isDigit(one)) {
					counts[2][one - '0']++;
				}//else if
			} // while		
			System.out.print(" < 대문자 갯수 그래프 >");
			for (int i = 0; i < counts.length; i++) {				
				System.out.println();
				if (i == 1) System.out.println(" < 소문자 갯수 그래프 >");
				else if (i == 2) System.out.println(" < 숫자 갯수 그래프 >");
				for (int j = 0; j < counts[i].length; j++) {
					System.out.printf("'%c': %s(%d)\n"
							, i==0?'A'+j:i==1? 'a'+j : '0' +j
									,  "#".repeat( counts[i][j] ) , counts[i][j]);               
				}//for j
			}//for i
		} catch (Exception e) {
			e.printStackTrace();
		} // try-catch

	} // main

} // class