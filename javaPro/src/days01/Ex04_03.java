package days01;

/**
 * @author Bon
 * @date 2023. 12. 29. - 오후 4:27:02
 * @subject
 * @content 문자열 개행 방법 나열
 * 				
 */
public class Ex04_03 {
	
	public static void main(String[] args) {
		
		// 표준 출력 
		System.out.println("구본혁");
		System.out.println("권맑음");
		System.out.println("류영은");
		// Alt + Shift + A : 여러 줄 수정
		System.out.print("구본혁");
		System.out.println(""); // 줄바꿈(개행) 함수
		System.out.print("권맑음" + '\n');  //문자 '\n'으로 
		System.out.print("류영은");
		
		//                     아래 f는 format (형식) 줄임말. 출력형식을 뜻함.
		//                               args == arguments (인자, 매개변수,파라미터)
		// System.out.printf(null, args);
		// 자바 함수(메서드) 제대로 사용하려면 반드시 3가지 파악
		// 1. 함수 역할(기능)
		// 2. 매개변수
		// 3. 반환값 (반환(리턴) 자료형)
				
	}
}
