package days03;

/**
 * @author BongGu
 * @date 2024. 1. 3. - 오후 4:40:51
 * @subject 삼항(조건) 연산자
 * @content  ?:  
 */
public class Ex07 {

	public static void main(String[] args) {

		// 항1 ? 항2 : 항3
		// 항1이 참이면 		연산자 결과는 항2이 되고
		// 항1이 거짓이면 	연산자 결과는 항3이 된다
		int x = 10;
		//int y = ( x > 20 ? 100 : 200 );
		
		int y =  x > 20 ? 100 : x > 5 ? 1 : x > 100 ? 100 : 200 ; //이런 식으로도 되지만, 괄호로 묶어주는게 가독성이 높아서 좋음
		System.out.printf("> x=%d, y =%d \n",x ,y);
		// 하나씩 처리될 때 마다 나머지를 지우면 보기 쉬워짐

	} //main

} //class