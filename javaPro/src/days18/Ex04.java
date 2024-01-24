package days18;

/**
 * @author Bonggu
 * @date 2024. 1. 24.- 오후 12:16:15
 * @subject 문자열을 다루는 클래스
 * @content 1. String					: 변경 불가능한 클래스 (주소값을 참조하는 것이기 때문이다)
 * 					 2. StringBuffer
 * 					 3. StringBuilder
 * 					 4. StringTokenizer
 */
public class Ex04 {

	public static void main(String[] args) {
		// 1. String

		String name = "홍길동";
		name += "님";  //"홍길동"과 새로운 "님"을 합쳐서 새로운 주소값을 참조한다
		name += "안녕!!"; //"홍길동님"과 새로운 "Hi"를 합쳐서 새로운 주소값을 참조한다
		//System.out.println(name);

		
		//name = "구본혁";
		// String은 참조타입. 클래스임. 그래서 name은 "홍길동"을 가진 것이 아니라 "홍길동"이 저장되어있는 곳의 주소를 저장한다.
		//String name = new String("홍길동");
		
		// [ String 클래스의  들은 이해, 암기 필요 ]
		// 1. charAt(int index) → 리턴값 : char  / 기능 :
		// 2. int length() → 리턴값 : int / 기능 :
		/*
		int len = name.length();
		for (int i = 0; i < len; i++) {
			System.out.printf("name[%d] = %c\n", i , name.charAt(i));
		}
		*/
		// 3. substring() → beginIndex에서부터 endIndex-1까지 잘라서 출력
		// name 문자열 속에서 안녕이라는 문자열이 있는지 여부 확인 후 안녕을 "Hi" 문자열로 변경하자
		
		boolean isExist = name.contains("안녕"); // String.contains → 찾고자 하는 문자열이 있으면 true (boolean형)으로 반환함
		if (isExist) {
			System.out.println("안녕은 문자열 속에 있다");
		} else System.out.println("안녕은 문자열 속에 없다"); 
		
		int foundIndex = -1;
		if ((foundIndex= name.indexOf("안녕")) == -1) { //찾고자하는 문자열이 몇번째에 있는지 index로 알려줌. 찾고자 하는게 없으면 -1을 반환함
			System.out.println("안녕은 문자열 속에 없다");
		} else System.out.printf("안녕은 %d 위치에 있다.\n", foundIndex);
		
		String s = name.substring(0, foundIndex);
		//String.concat(String) > 문자열 뒤에 문자열 연결시켜줌
		System.out.println(s.concat("hi").concat(name.substring(foundIndex + "안녕".length())));
		
	} //main

} //class
