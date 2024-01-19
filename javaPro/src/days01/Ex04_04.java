package days01;

public class Ex04_04 {
	public static void main(String[] args) {
		
		String name = "구본혁";
		int age = 29-5;
		
		// 원하는 출력형식 = 이름은 "구본혁"이고, 나이는 31 살 입니다.
		// System.out.printf("출력형식", 매개변수값...);
		// String  %s
		// int  %d
		// printf가 println보다 유지보수하기 용이하다
		System
		.out
		.printf("이름은 \"%s\"이고, 나이는 %d 살 입니다.", name , age)
		.println("종료");
		//printf 에 PrintStream의 리턴값이 있어서 뒤에 .println을 추가로 기입해도 출력이 된다.
		//System.out.println();은 불가능
	}

}
