package days05;

/**
 * @author BongGu
 * @date 2024. 1. 5. - 오전 11:26:38
 * @subject
 * @content
 */
public class Ex02_03 {

	public static void main(String[] args) {
		
		// 함수(메서드)를 빠져나갈 땐 return 문
		// 제어문을 빠져나갈 땐		   break 문
		
		int kor = 100;
		String [] rps = { "", "가위", "바위", "보" };
		
		switch ( kor / 10 ) { //실행결과 9
		
		//jdk 14부터는 case 10, 9: 처럼 ,로 나열할 수 있다. 
		case 10:   
		case 9: //case 10과 case 9가 같은 일을 수행할 때는 구문 없이 연속으로 써주면 된다
			System.out.println("수");
			break;		
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		case 6:
			System.out.println("양");
			break;
		default:
			System.out.println("가");
			break;
		} //switch		

	} //main

} //class
