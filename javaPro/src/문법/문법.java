package 문법;

public class 문법 {

	public static void main(String[] args) {
		
		// Ctrl + 클래스, 함수, 변수 등등 클릭하면 선언 위치로 이동함

		// [String.xxx]
		// String.charAt()					→ String의 ()번째 문자를 char 자료형으로 가져옴. charAt(0) 이면 첫번째, charAt(1)이면 두번째
		// String.valueOf()				→ ()안의 내용을 문자열로 만듦. true같은 boolean 형이든 1같은 정수든 상관 없음. 
		//											반환값은 String 
		// String.length()					→ String의 총 길이 구하기 String이 "ABCDEF"면 6이다.
		// String String.concat(); 		→ String과 ()안의 문자열 연결
		// String String.substring(beginIndex, endIndex) > beginIndex에서부터 endIndex-1까지 잘라서 출력
		//
		
		//
		// [Integer.xxx]
		// Integer.parseInt()				→ Stirng을 Int로 바꿔준다. 기본 자료형 int 로 반환된다
		// Integer.valueOf()				→ String을 Integer 객체로 바꿔준다. 참조 자료형 Integer 객체로 반환된다.
		// String.valueOf()					→ char[]를 String으로 바꿔준다
		//												ex) name = String.valueOf(nameCharArray); > nameCharArray를 name으로
		// String.toCharArray() 			→ String -> char[] . 스트링을 문자 배열로 변환하는 함수
		//
		//
		// [.isxxxx]
		// Character.isDigit( 8 ) 			→ 숫자인지 아닌지 체크하는 것 (래퍼 클래스)
		//	Character.isAlphabetic ( A ) → 한 문자인지 체크하는 것 (한글 '가' 등 1글자) (래퍼 클래스)
		//
		// [System.xxx
		// System.in.read() 				→ 	문자 하나만 입력받음. 1234를 입력하면 1만 입력됨. 주의할 점은 다음에 또 read()가 나오면 
		//												2가 입력되기 때문에 사용하지 않는 read()를 무시할 문자 갯수만큼 사이에 넣어주든지
		//												System.in.skip(System.in.available()); 를 써서 입력 스트림에 있는 바이트를 모조리 
		//												처리해줘야함
		//
		//
	}

}
