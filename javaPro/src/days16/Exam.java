package days16;

public class Exam {

	public static void main(String[] args) {

		/*5. [취업 문제] ego(자아)
  			String n = "keNik";   
  			String m= "kKnie";   

  위의 두 문자열 n, m 이 알파벳과 알파벳갯수가 똑같은지 비교하는 코딩 
  결과는 같을 경우 true/ 다를 경우 false 로 출력.
  조건) 대소문자는 구분하지 않는다.  */
		String n = "keNik";   
		String m= "kKnie";
		char nArr [] = new char[5];
		char mArr [] = new char[5];
	
		if (n.equals(m)) System.out.println("1. 두 문자열의 알파벳은 같습니다.(true)");
		else System.out.println("1. 두 문자열의 알파벳은 다릅니다.(false)");
		
		for (int i = 0; i < nArr.length; i++) {
			nArr[i] = n.charAt(i);
			mArr[i] = m.charAt(i);
		}		
		if (nArr.length == mArr.length) System.out.println("2. 두 문자열의 알파벳 갯수는 같습니다.(true)");
		else System.out.println("2. 두 문자열의 알파벳 갯수는 다릅니다.(false)");
	}

}
