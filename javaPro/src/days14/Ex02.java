package days14;

/**
 * @author Bonggu
 * @date 2024. 1. 18.
 * @subject Tv 클래스 선언 -> 객체 생성 후 사용.
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		//지역변수
		// int i = 100;
		
		// 지역변수, 참조변수, 배열명. 배열은 주소값을 가지기 때문에 참조변수이기도 하다
		// int [] m; 메모리상에 int 배열의 크기만큼 선언
		
		// 객체 tv1 선언
		Tv tv1 = null;
		
		// 객체를 생성하는 코딩, 인스턴스화
		tv1 = new Tv();
		
		//필드(멤버변수) 초기화 안되어있는 상태
		/*
		System.out.println(tv1.color); //null
		System.out.println(tv1.channel); //0
		System.out.println(tv1.power); //false
		
		객체명.필드명    로 접근
		배열명[index] 로 접근
		*/
		tv1.power(); //power 메서드 (멤버함수) 호출. 티비 
		System.out.println("Tv : "+ (tv1.power ? "ON" : "OFF"));
		tv1.channelUp(); //channelUp 메서드 호출
		tv1.channelUp(); //channelUp 메서드 호출
		tv1.channelUp(); //channelUp 메서드 호출
		System.out.println("현재 채널 : " + tv1.channel);
		
		tv1.power(); //티비 다시 끄기
		System.out.println("Tv : "+ (tv1.power ? "ON" : "OFF"));
		System.out.println("End");
		
		
	} //main

} //class
