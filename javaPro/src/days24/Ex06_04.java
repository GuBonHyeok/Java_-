package days24;

import java.util.ArrayList;

/**
 * @author Bonggu
 * @date 2024. 2. 1.- 오후 2:42:13
 * @subject [ 제네릭 클래스의 객체 생성과 사용]
 * @content 과일(Fruit)
 * 						ㄴ 사과(Apple)
 * 						ㄴ 포도(Grape)
 * 					장난감(Toy)
 * 			
 * 					위의 물건(상품)을 담을 수 있는 상자(Box3) 제네릭 클래스
 */
public class Ex06_04 {

	public static void main(String[] args) {
		// 제네릭 클래스의 객체 생성
		/*
		Box03<Fruit> fruitBox = new Box03<>();
		Box03<Apple> appleBox = new Box03<>();
		Box03<Grape> grapeBox = new Box03<>();
		Box03<Toy> toyBox = new Box03<>();
		 */

		// Type mismatch: cannot convert from Box03<Grape> to Box03<Apple>
		// Box03<Apple> box1 = new Box03<Grape>(); //생성한 박스는 포도박스인데 사과 박스에 담을 수 없다.
		// Box03<Apple> box1 = new Box03<Fruit>(); // X
		// Box03<Fruit> box1 = new Box03<Grape>(); // X

		/*
		Box03<Fruit> fruitBox = new Box03<>();
		fruitBox.add(new Fruit()); 
		fruitBox.add(new Apple()); //과일 박스에 사과 객체를 담는 것은 상관 없다.
		fruitBox.add(new Grape());
		//fruitBox.add(new Toy()); //장난감 객체는 담을 수 없다
		 */

	}//main

}//class

/*
class Fruit extends Object{
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
class Toy{
	public String toString() {
		return "Toy";
	}
}
// 상자 (Box) 제네릭 클래스 선언
class Box03<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { this.list.add(item);}
	int size( ) { return this.list.size();}
	T get(int i) { return this.list.get(i);}
	public String toString() { return this.list.toString(); }

}//Box03
 */





