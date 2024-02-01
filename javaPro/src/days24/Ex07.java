package days24;

/**
 * @author Bonggu
 * @date 2024. 2. 1.- 오후 3:55:10
 * @subject 열거형
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		/*
		 * [ enumeration 열거자 / iterator 반복자 ]
		 * 
		 * [ 열거형 (enums) 자료형. 열거자랑은 완전 다른 것임 ]
		 * 1. jdk 1.5에서 추가됨
		 * 2. 서로 관련된 상수를 편리하게 사용하기 위해서 만들어짐
		 * 		ex) 남자, 여자 - 성별
		 * 		ex) 1조 - 구본혁 등 8명
		 * 			남자/여자 체크해서 어쩌구 하는 코딩을 한다고 했을때?
		 * 			int gender = 1; // 1이면 남자
		 * 			boolean gender = true; //true면 남자 
		 * 			등등... 팀원마다 자료형이 다르게 표준화가 되어있지 않을 수 있다
		 * 
		 * 			표준화를 시키면 -> 유지, 보수 생산성이 좋아진다
		 * 								   가독성도 좋아진다 
		 * 3. 열거형 선언 형식
		 * 		접근지정자 enum [열]거형 이름 { //대문자로 시작한다.
		 * 			상수명, //대문자 사용
		 * 			상수명,
		 * 		public 
		 * 4. 열거형 사용하는 방법 : [열]거형이름.상수명
		 * 5. 열거형 -> 클래스로 컴파일되어지고
		 * 					-> 부모클래스 (extends java.lang.Enum) 클래스를 상속받는다
		 * 6. Enum 클래스
		 * 		1) ordinal() 	: 열거형 상수가 정의된 순서를 반환 ex) 남자 == 0, 여자 == 1
		 * 		2) name() 	: 열거형 상수명을 문자열로 반환
		 * 		3) valueOf() 	: name()과 일치하는 값을 반환하는데, 문자열이 아닌 "열거형 상수"를 반환  
		 */
		
		System.out.println(Gender.남자); 
		System.out.println(Gender.남자.ordinal()); //int값을 리턴  > 0 출력
		System.out.println(Gender.남자.name()); // 문자열 "남자"
		System.out.println(Gender.남자.valueOf("남자")); // 열거형 상수 0 출력. == Gedder.남자
		System.out.println(Gender.여자);
		System.out.println(Gender.여자.ordinal()); //int값을 리턴 > 1 출력
		
		Gender[] arr = Gender.values();
		for (Gender g : arr) {
			System.out.println(g+"/"+g.ordinal()+"/"+g.name());
			
		}


	}//main

}//class















