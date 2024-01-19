package days02;

/**
 * @author BongGu
 * @date 2024. 1. 2. - 오전 9:12:47
 * @subject 
 * @content 1일차 복습
 */

public class Ex01{


	public static void main (String[] args) {
		// 홍길동 cannot be resolved to a variable
		String name = "홍길동"; //변수 초기화 (문자열)
		float tall = 185.22f; //변수 초기화 (실수값) 선언 + 값 할당
		//Type mismatch: cannot convert from double to String
		double height = 185.22; 
		System.out.println("\"이름 : \"" + name + "\", 키 : " + tall + "cm\"");
		System.out.printf("이름 : \"%s\", 키 : %scm", name, height);
	}
	// 식별자 (identifier) - 변수명, 클래스명, 매서드명 등등
	// 식별자를 부여하는 방법(검색)
	// 문자열과 문자의 차이? > 문자열은 'n' + '\0' 이 합쳐진게 "n"임
	// 출력서식 : String : %s , int : %d , double : %d
	// 자바 컴파일러 버그시 > 프로젝트 우클릭 > Properties => Complier compliance level을 1.4 > 11로 수정
}
