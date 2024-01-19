package days14;

/**
 * @author Bonggu
 * @date 2024. 1. 18.
 * @subject 객체 선언과 생성
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		//int [] m = null; //null으로 초기화
		//System.out.println(m[3]); //null으로 초기화 했기 떄문에 nullPointerException 발생
		//int [] m = new int [3];  //인덱스 0,1,2까지 생성
		//System.out.println(m[3]); //인덱스 3이 없기 때문에 Out of bounds 발생
		
		// NullPointerException > 객체가 생성이 안됐는데 사용하려고 하는 것
		Tv tv1 = null;
		System.out.println(tv1.channel);

	} //main

} //class
