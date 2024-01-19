package days03;
import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 3. - 오전 11:44:24
 * @subject
 * @content Scanner 클래스
 */
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "1 fish 2 fish red fish blue fish";
		// \\s*fish\\s*
		// \s == space == 공백
		// * == 반복 횟수. 공백이 0~여러개 와도 좋다
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*"); //-> 정규 표현식 공부해야함
		System.out.println(s.nextInt()); // Int 로 가져오니까 1은 가져와짐
		System.out.println(s.nextInt()); //next만 쓰면 String도 가져오기 가능
		System.out.println(s.next()); // Int 로 가져와야 하는데 fish는 숫자타입이 아니라 가져오지 못함
		System.out.println(s.next());

		s.close();

	}

}
