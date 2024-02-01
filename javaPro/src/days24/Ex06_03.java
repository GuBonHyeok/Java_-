package days24;

/**
 * @author Bonggu
 * @date 2024. 2. 1.- 오후 2:33:52
 * @subject 제네릭의 제약사항
 * @content
 */
public class Ex06_03 {
	
	public static void main(String[] args) {
		// [ 제네릭의 제한 ]
		 
		
		
	}//main
	
}//class

class Box2<T> {
	//제한 1) 제네릭 클래스에서는 클래스 변수(정적 변수)를 사용할 수 없다. 
	//스태틱은 컴파일 전에 타입이 결정되기 때문에 제네릭 적용 전에 수행되어 논리상 맞지 않다
	//Cannot make a static reference to the non-static type T
	//static T item2;
	
	// 제한 2) 클래스 메서드 선언 + 매개변수 T 타입 사용할 수 없다  
	// Cannot make a static reference to the non-static type T
	//static int compare(T a, T b) {
	//	return 0;
	//}
	
	// T 타입의 배열은 선언할 수 있다.
	T [] itemArr;
	

}









