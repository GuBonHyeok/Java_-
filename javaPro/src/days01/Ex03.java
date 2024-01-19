package days01;

/**
 * @author Bon
 * @date 2023. 12. 29. - 오후 3:15:45
 * @subject 변수와 상수
 * @content 
 */

public class Ex03 {
	
	public static void main(String[] args) {
		/* 
		 *  1. 변수 (variable, var)
		 *     - 수학적 의미는 : 변하는 수
		 *     - 프로그래밍 : 어떤 값을 저장하기 위해 메모리에 "저장할 공간"
		 *        * 값을 한 번 저장한 후에 변경할 수 있음
		 *  2. 상수 (const)
		 *  	- 수학적 의미는 : 변하지 않는 수 (== 고정된 수)
		 *  	- 프로그래밍 : 어떤 값을 저장하기 위해 메모리에 "저장할 공간"
		 *        * 값을 한 번 저장하면 변경할 수 없음
		 *  3. 자바에서 변수/상수를 선언하는 형식    
		 *     가. 변수 형식
		 *        - 자료형 변수명[=초기값];
		 *        - 자료형 == 데이터 형식(data type)
		 *        
		 *  4. 자바에서 사용하는 자료형의 종류
		 *     
		 *  		 *  
		 *  	ex) 담배심부름하다()
		 * 
		 *      리터럴은 일단 지금은 제외 (논외)
		 */
		//이름을 저장할 변수 선언
		//식별자(아래에서 name)를 명명하는 규칙
	    String name = "구본혁"; //선언과 초기화를 같이 진행
	   //  name = "구본혁"; // = 대입(할당) 연산자
	    
	    // The local variable name may not have been initialized
	    // [local variable == 지역변수]
	    // {} == 블럭, 범위(지역)을 나타내는 연산자
	    System.out.println(name);
	    
	    name = "권맑음";
		System.out.println(name);
	}

}
