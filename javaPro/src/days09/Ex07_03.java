package days09;

import java.util.Calendar;
import java.util.Iterator;

/**
 * @author BongGu
 * @date 2024. 1. 11. - 오후 12:09:42
 * @subject 주민등록번호 (3) 검증작업
 * @content
 */
public class Ex07_03 {

	public static void main(String[] args) {

		// [주민등록번호]
		// 住民登錄番號 / Resident registration number, RRN
		// *** 	1.생년월일
		// *** 	2. 성별,출생시기(century)
		// *** 	3. 내국인/외국인
		// X		4. 출신지역
		// *** 	5. 나이
		// 6. 검증 == check, verify + RRN
		String rrn = "950518-1812345";

		Calendar c = Calendar.getInstance();
		int thisYear = c.get(Calendar.DATE);
	} //main

	//   A B C D E F   G H I J K L     X
	// " 9 5 0 5 1 8 - 1 8 1 2 3 4     5"
	// X=(11−(2A+3B+4C+5D+6E+7F+8G+9H+2I+3J+4K+5L)mod11)mod10 : 검증 식
	// mod : 나머지 구한다는 식. java에서는 : %
	public static boolean checkRRN(String rrn){ //올바른 것 주면 true, 아니면 false
		int [] m = {2,3,4,5,6,7,   0   ,8,9,8,9,2,3,4,5}; 
							//중간에 0을 넣어주는 이유는 000000 - 0000000 에서 하이픈(-)을 없애주는 작업.
							//m[i]번 만큼 돌다가 -를 만났을 때 0을 곱해서 없애주는 것 
		int tot = 0;
		for (int i = 0; i <= 12; i++) {
			tot += (rrn.charAt(i)- 48)* m[i];
		} //for
		int X = (11-tot%11)%10;
		int LAST = rrn.charAt(13) -48;
		return X == LAST;

		/* [1]
		int A = rrn.charAt(0) - 48;
		int B = rrn.charAt(1) - 48;
		int C = rrn.charAt(2) - 48;
		int D = rrn.charAt(3) - 48;
		int E = rrn.charAt(4) - 48;
		int F = rrn.charAt(5) - 48;
		// rrn.charAt(6); // -
		int G = rrn.charAt(7) - 48;
		int H = rrn.charAt(8) - 48;
		int I = rrn.charAt(9) - 48;
		int J = rrn.charAt(10) - 48;
		int K = rrn.charAt(11) - 48;
		int L = rrn.charAt(12) - 48;

		int X =(11-(2*A+3*B+4*C+5*D+6*E+7*F+8*G+9*H+2*I+3*J+4*K+5*L)%11)%10;
		int LAST = rrn.charAt(13) - 48;

		return X==LAST;
		 */
	} //checkRRN

}//class
