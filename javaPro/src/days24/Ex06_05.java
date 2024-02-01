package days24;

import java.util.ArrayList;

/**
 * @author Bonggu
 * @date 2024. 2. 1.- 오후 3:09:43
 * @subject [제한된 제네릭 클래스]
 * @content Box<T> Type 모든 자료형 (Integer, Double, MemberVO 등등)
 * 
 * 							T 값으로 들어가는 자료형을 제한하겠다는 것
 * 					이 예제에선 T를 먹을 수 있는 과일타입으로 제한
 */
public class Ex06_05 {

	public static void main(String[] args) {
		/*
		Box04<Toy> toyBox = new Box04<>(); //모든 타입을 다 사용할 수 있다
		toyBox.add(new Toy());
		toyBox.add(new Toy());
		toyBox.add(new Toy());
		 */
		/*
		Box04<Apple> aBox = new Box04<>();
		Box04<Grape> gBox = new Box04<>();
		// Box04<Bread> bBox = new Box04<>(); bread는 fruit 을 상속받지 않았기 때문에.

		 */

	}//main

}//class
/*
interface Eatable{

}

class Fruit extends Object implements Eatable{
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
class bread implements Eatable{

}
// 먹을 수 있는 과일만 T 타입으로 사용할 수 있는 제네릭 클래스 선언
//class Box04<T>{
//class Box04<T extends Fruit>{ //과일을 상속받은 타입만 T로 제한하겠다는 것
class Box04<T extends Fruit & Eatable>{ //과일을 상속받은 타입과 Eatable을 구현한 빵(bread)만 T로 제한하겠다는 것
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { this.list.add(item);}
	int size( ) { return this.list.size();}
	T get(int i) { return this.list.get(i);}
	public String toString() { return this.list.toString(); }

}//Box03
 */