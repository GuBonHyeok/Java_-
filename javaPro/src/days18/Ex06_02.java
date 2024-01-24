package days18;

/**
 * @author Bonggu
 * @date 2024. 1. 24.- 오후 4:09:23
 * @subject StringBuffer	StringBuilder
 * @content Stringbuffer -> delete, insert, replace (이것도 다시 복습)
 */
public class Ex06_02 {

	public static void main(String[] args) {
		String s = "이름은 홍길동입니다.";
		//System.out.println(s); //이름은 홍길동입니다.
		s += "\n이름은 김길동입니다.";
		//System.out.println(s);
		
		//"홍길동"을 찾아서 -> "XYZ"로 바꾸기
		int foundIndex = s.indexOf("홍길동"); //홍길동의 index 찾기
		s = s.substring(0,foundIndex) + "XYZ" + s.substring(foundIndex + "홍길동".length());
		//System.out.println(s);
		
		// "XYZ" 문자열 삭제?
		foundIndex = s.indexOf("XYZ");
		s = s.substring(0,foundIndex) + s.substring(foundIndex + "XYZ".length());
		//System.out.println(s);
		
		// 홍길동 다시 삽입
		foundIndex = s.indexOf("입니다"); //홍길동의 index 찾기
		s = s.substring(0,foundIndex) + "홍길동" + s.substring(foundIndex);
		System.out.println(s);
		
		System.out.println("-".repeat(40));
				
		 //StringBuffer sb = new StringBuffer("이름은 홍길동입니다.");
		StringBuilder sb = new StringBuilder("이름은 홍길동입니다.");
	      //System.out.println(sb);
	      sb.append("\n이름은 김길동입니다.");
	      // System.out.println(sb);
	      foundIndex = sb.indexOf("홍길동");
	      // sb.substring(0, foundIndex) + "XYZ"+ sb.substring(foundIndex + "홍길동".length());
	      sb.delete(foundIndex, foundIndex + 3);
	      //System.out.println(sb);      
	      
	      // 홍길동 foundIndex 뒤로 (입니다 앞) 다시 삽입
	      foundIndex = sb.indexOf("입니다");
	      sb.insert(foundIndex, "홍길동");
	      System.out.println(sb);

	   } // main


} //class
