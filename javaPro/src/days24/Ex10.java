	package days24;
	
	import java.util.Scanner;
	
	/**
	 * @author Bonggu
	 * @date 2024. 2. 1.- 오후 4:48:54
	 * @subject 어노테이션 (annotation)
	 * @content
	 */
	public class Ex10 {
	
		public static void main(String[] args) {
			/*
			 *  [ 어노테이션 (annotation) ]
			 *  1. 사전적 의미  : 주석	
			 *  2. 프로그램 소스 코드 안에 다른 프로그램을 위해 미리 약속된 형식을 포함시킨 것.
			 *  3. 표준 어노테이션 : jdk에서 기본적으로 제공하는 어노테이션
			 *  4. 표준 어노테이션 - > 컴파일러에게 알려주는 것(다른 프로그램)
			 *  5. 표준 어노테이션
			 *  	1) @Override : 컴파일러에게 오버라이딩한 메서드임을 알려주는 어노테이션.
			 *  	2) @SuppressWarnings : 컴파일러의 특정 경고 메시지가 나타나지 않게 사용하는 어노테이션.
			 *  	3) @Deprecated : 앞으로 없어지는 생성자, 필드, 메서드를 알려주는 뜻. ex) Date - getDate
			 *  	4) @FucntionInterface : 함수형 인터페이스를 알려줌
			 *  	5) @SafeVarargs : 제네릭 타입의 가변 인자에 사용되는 어노테이션
			 *  	6) @Native : C언어 메서드 -> 자바 코딩으로 사용 "native 메서드" 에서 참조되는 상수 앞에 붙이는 어노테이션
			 *  
			 *  [ 메타 어노테이션 ] : 또 다른 어노테이션에 사용되는 어노테이션. 어노테이션이 어노테이션에 사용됨
			 *     7) @Target
			 *     8) @Documented
			 *     9) @Inherited
			 *     10) @Retention
			 *     11) @Repeatable
			 */
	
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			scanner.next();
	
		} //
	
	} //
