package days24;

/**
 * @author Bonggu
 * @date 2024. 2. 1.- 오후 2:16:59
 * @subject 제네릭의 장점 - 형변환 불필요
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		/*
		 * 1. 제네릭 타입은 클래스, 		메서드에 선언할 수 있다
		 * 						ㄴ 제네릭 클래스	ㄴ 제네릭 메서드
		 */
		
		/* 제네릭이 없으면 매번 형변환 필요(불편함)
		Box box1 = new Box();
		box1.setItem(100);
		box1.setItem(10.2);
		box1.setItem("김길동");
		box1.setItem(new MemberVO());
		System.out.println(box1.getItem());
		*/
		
		Box<MemberVO> box1 = new Box<>();//MemberVO를 타입으로 주겠다는 의미
		box1.setItem(new MemberVO()); //자동으로  MemberVO로 타입이 바뀜. 형변환 할 필요 없음
		box1.getItem(); //자동으로  MemberVO로 타입이 바뀜. 형변환 할 필요 없음
		/*
		 * 1. Box<T> - 제네릭 클래스, 읽을 때는 'T의 Box'
		 * 2. 			T	 - 타입 변수 또는 타입 매개변수
		 * 3. 타입변수 	 - T, E, K, V 등등
		 * 			T : Type
		 * 			E : Element
		 * 			K : Key
		 * 			V : Value
		 * 			등등 임의로 정해서 넣어주면 됨
		 * 4. Box - 원시 타입( RAW TAYP )
		 * 
		 * 
		 */


	}//main

}//class

//제네릭 클래스
class Box<T>{ 
	
	T item; 
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
	
}

/*
class Box{
	
	int item;

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
		
}
*/

/*
class Box{
	
	double item;

	public double getItem() {
		return item;
	}

	public void setItem(double item) {
		this.item = item;
	}
		
}
*/

/*
class Box{
	
	String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
		
}
*/

/*
*/









