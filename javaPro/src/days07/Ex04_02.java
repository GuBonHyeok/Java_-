package days07;

/**
 * @author BongGu
 * @date 2024. 1. 9. - 오후 12:03:14
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		int [] kors = { 99, 1, 100, -10, 101 };
		String regex = "[1-9]?\\d|100"; //첫번째 자리 0 제외 1~9까지 숫자 온 다음 다른 숫자 받기. |100으로 100점도 가능   
		
		for (int i = 0; i < kors.length; i++) {
			int kor = kors[i];
			// if(kor >= 0 && kor <= 100) {      조건식 활용 체크
			//	 System.out.println(kor);
			// }
			if ((kor + "").matches(regex)) {  //졍규 표현식 활용 체크
				System.out.println(kor);
			}
			
		} //for


	} //main

} //class
