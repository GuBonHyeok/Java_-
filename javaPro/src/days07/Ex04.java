package days07;

/**
 * @author BongGu
 * @date 2024. 1. 9. - 오후 4:05:24
 * @subject 정규 표현식
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// 정규 표현식에 대해
		// 회원가입 - 주소, 우편번호 : 00000
		String [] zipCodess = {
				"123-456",
				"12345",
				"123-4a6",
				"123-4567",
				"123456"
		};

		String regex = "\\d{5}|\\d{3}-\\d{3}"; // \\d{3}(-\\d)?\\d{2} 와 같음
		//																  공백 오면 안됨!!!!
		// 정규표현식				 {n}			반복횟수 n
		//							 {n,m}		반복횟수 n~m
		//							 {n,}			반복횟수 n 이상
		//							  \\s			공백
		//							  *				반복횟수 0~여러번
		//							  ?				반복횟수 0 혹은 1
		//							  +			반복횟수 1~여러번
		// boolean String.matches(regex) > 일치하는지 알려줘서 참, 거짓으로 반환하는 것
		for (int i = 0; i < zipCodess.length; i++) {
			// System.out.println(zipCodess[i]);
			String zipCode = zipCodess[i];
			if (zipCodess[i].matches(regex)) {
				System.out.printf("올바른 %s 우편번호\n", zipCode);				
			} else {
				System.out.printf("잘못된 %s 우편번호\n", zipCode);				
			}

		} //for

	} //main

} //class
