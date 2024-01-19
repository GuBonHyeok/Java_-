package days07;

import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 9. - 오후 12:11:41
 * @subject 정규 표현식 (3) - 이메일 사용가능한 정규 표현식
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) {
		String email;
		Scanner scanner = new Scanner(System.in);
		System.out.print("이메일 입력 ? ");
		email = scanner.next();

		// e메일 주소는 최소한 1개 이상의 문자 + @naver.com
		// a											 @sist.co.kr
		// 1											 @yahoo.kr

		String regex = "^[0-9a-zA-Z]([-_\\.]?[0-9a-zA-Z])*"
				+ "@[0-9a-zA-Z]([-_\\.]?[0-9a-zA-Z])*\\.[a-zA-Z]{2,3}$";

		if ((email.matches(regex))) {
			System.out.println("이메일 사용 가능");
		} else {
			System.out.println("이메일 사용 불가능");
		}

		// 회원가입 정규표현식 찾아보기
		// 비밀번호 입력 - 8~15자리
		//					  특수문자 반드시 1개 이상
		//					  숫자 반드시 1개 이상
		//					  알파벳
		//^(?=.*[A-Za-z])(?=.*\d)(?=.*[$@$!%*#?&])[A-Za-z\d$@$!%*#?&]{8,15}
		
	} //main

} //class
