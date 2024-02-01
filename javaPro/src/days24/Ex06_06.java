package days24;

import java.net.JarURLConnection;
import java.util.ArrayList;

/**
 * @author Bonggu
 * @date 2024. 2. 1.- 오후 3:22:08
 * @subject 와 일 드 카 드 
 * @content   
	// 메서드 오버로딩 조건 확인
	// 제네릭 타입의 매개변수는 오버로딩이 성립되지 않는다.
	// 그래서 해결책으로 고안된 것이 와일드카드(기호는 ? 를 쓴다)
	 * 
	 * 
	 * [제네릭 메서드]
	//				ㄴ 메서드의 선언부에 제네릭 타입이 선언된 메서드를 제네릭 메서드라고 한다.
	//				ㄴ 선언 형식 public static <T> 리턴자료형 제네릭메서드명( 매개변수 ) { }
 */
public class Ex06_06 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();
		
		// 일반 메서드 호출
		Juice juice = Juicer.makeJuice(fruitBox); //
		juice = Juicer.makeJuice(appleBox);
		//juice = Juicer.makeJuice(grapeBox);		
		
		//makeJuice()를 제네릭 메서드로 선언(수정) -> 호출하는 방법이 다르다.
		juice = Juicer.<Grape>makeJuice(grapeBox);
		juice = Juicer.makeJuice(grapeBox); //<Grape> 생략 가능

	} //main

} //class

class Fruit extends Object {
	public String toString() {
		return "Fruit";
	}
}
class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}
}
class Grape extends Fruit{
	public String toString() {
		return "Grape";
	}
}

// 먹을 수 있는 과일만 T 타입으로 사용할 수 있는 제네릭 클래스 선언
//class Box04<T>{
//class Box04<T extends Fruit>{ //과일을 상속받은 타입만 T로 제한하겠다는 것
class Box05<T> { //과일을 상속받은 타입과 Eatable을 구현한 빵(bread)만 T로 제한하겠다는 것
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { this.list.add(item);}
	int size( ) { return this.list.size();}
	T get(int i) { return this.list.get(i);}
	public String toString() { return this.list.toString(); }

}//Box05

class FruitBox<T extends Fruit > extends Box05<T>{	
	
}

//[ 쥬스 클래스 ] (제네릭 클래스 아님)
class Juice {
	
}

// [ 쥬스 만드는 기계 ]
// 사과, 포도 등등 과일을 재료로 줘서 쥬스를 만들 수 있음
class Juicer{
	/*
	static Juice makeJuice(FruitBox<? extends Fruit > box) { // 과일박스에서 포도 꺼내서 주스 만드는 놈.
		return new Juice();
	}
	*/
	//위의 일반 static 메서드를 제네릭 메서드로 변경
	// [제네릭 메서드]
	//				ㄴ 메서드의 선언부에 제네릭 타입이 선언된 메서드를 제네릭 메서드라고 한다.
	//				ㄴ 선언 형식 public static <T> 리턴자료형 제네릭메서드명( 매개변수 ) { }
	static <T extends Fruit > Juice makeJuice(FruitBox<T> box) { // 과일박스에서 포도 꺼내서 주스 만드는 놈.
		return new Juice();
	} //제네릭 메서드
	
	
	/*
	static Juice makeJuice(FruitBox<Fruit> box) { // 과일박스에서 포도 꺼내서 주스 만드는 놈
		return new Juice();
	}
	static Juice makeJuice(FruitBox<Apple> box) { // 사과박스에서 포도 꺼내서 주스 만드는 놈
		return new Juice();
	}
	static Juice makeJuice(FruitBox<Grape> box) { // 포도박스에서 포도 꺼내서 주스 만드는 놈
		return new Juice();
	}
	*/
	
	// 메서드 오버로딩 조건 확인
	// 제네릭 타입의 매개변수는 오버로딩이 성립되지 않는다.
	// 그래서 해결책으로 고안된 것이 와일드카드(기호는 ? 를 쓴다)
	//
	//															? 						모든 타입. == Object와 같은 의미
	//															<?> 					모든 타입. 타입 제한 없음
	//															<? extends T> 	T와 그 자손들만 가능 
	//															<? super T>		T와 그 조상들만 가능

	
}









