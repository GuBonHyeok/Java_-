package days08;

/**
 * @author BongGu
 * @date 2024. 1. 10. - 오후 3:44:19
 * @subject 로또 번호 또 출력하네
 * @content
 */
public class Ex05_05 {

	public static void main(String[] args) {

		new Random()
		.ints(1,46)
		.distinct()
		.limit(6)
		.sorted()
		.forEach(System.out::println);
		//.forEach(n->System.out::println);
		// -> 람다연산자


	} //main

} //class
