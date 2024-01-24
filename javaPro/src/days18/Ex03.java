package days18;

/**
 * @author Bonggu
 * @date 2024. 1. 24.- 오후 12:06:33
 * @subject 객체로부터 Class 객체를 얻어오는 방법 3가지 (내일 시험!)
 * @content 1. getClass()
 * 					2. 클래스명.class
 * 					3. Class.forName
 */
public class Ex03 {
	
	public static void main(String[] args) {
		//1. Object.getClass()
		/*
		Person p = new Person("111", "김길동");
		Class cls = p.getClass(); //여기서 Class는 java.lang의 클래스
		*/
		
		//2. 클래스명.class : 모든 클래스 마다 class 클래스 변수가 제공된다.
		/*
		Class cls = Person.class; //클래스명.class > 그 클래스의 정보를 얻어오겠다는 것 
		System.out.println(cls); //class days18.Person > 풀네임으로 찍힘
		*/
		/* (참고)
		try {
			Person p1 = Person.class.newInstance(); //Person 클래스를 가지고 객체 p1을 생성
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/ 
		
		//3. Class.forName
		String fullName = "days18.Person";
		try {
			Class cls = Class.forName(fullName);  //풀네임으로 매개변수를 준다 
			System.out.println(cls);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}//main

}//class
