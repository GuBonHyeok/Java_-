package days16;

/**
 * @author Bonggu
 * @date 2024. 1. 22.- 오후 3:07:23
 * @subject  사원
 * @content 
 */
public class Ex10 {

	public static void main(String[] args) {
		// 						[1] 사원 객체 생성
		/*
		Employee emp1 = new Employee("구본혁", "성남 수정구", "010-2041-0000", "2024-01-22");
		// ↑ 객체 생성될 때 생성자 자동 호출됨.
		emp1.dispEmpInfo();
		// ↓ Object.toString() : Object 클래스에서 나온 클래스
		//	↓ days16.Employee@2a18f23c : 패키지명.클래스명@16진수 값
		// ↓ toString()가 사원 정보를 출력하도록 오버라이딩 (재 정의 함수)
		System.out.println(emp1.toString());
		System.out.println(emp1);
		 */
		//						[2] 정규직 사원 객체 생성
		//Regular emp2 = new Regular("김김김", "서울 성동구", "010-4321-9999",
		//		"2024-01-22",3500000);
		//부모인 Employee로부터 상속받은 dispEmpInfo()에서 기본급이 출력되지 않고 있음
		//사원 정보를 출력하는데 basepay는 출력 X
		// emp2.dispEmpInfo();
		//System.out.println(emp2.toString());
		// ↑ 자식 객체를 호출하면 부모 객체가 먼저 만들어지기 때문에 Employee가 먼저 호출되고
		// Regular가 그 다음에 객체 생성된다.

		//↓ 자식 객체(new Regular) 를 생성해서 
		//  부모 클래스에 참조시킬 수 있다.
		//↓ 클래스의 자동 형변환 : up Casting (상속관계에 있으면 다른 자료형이지만 가능)
		/*
		Employee emp2 = new Regular("김김김", "서울 성동구", "010-4321-9999",
					"2024-01-22",3500000); //Regular 호출해서 부모 객체에 참조시켰다.
		System.out.println(emp2.toString());
		 */

		//문제점
		// emp2.getPay(); 사용 못함. 부모의 멤버에 getPay가 없기 때문

		// 					[3]  
		// ↓ Up Casting - 클래스간의 형변환. 조상의 조상도 가능하다.
		/*
		Employee emp3 = new SalesMan("이리리", "부산광역시", "010-1241-1666",
				"2011-11-22",500000
				,20 , 70000);
		System.out.println(emp3.getPay());
		 */

		//					[4] 임시직
		Employee emp4 = new Temp("코뿔소", "우간다", "010-1241-1666",
				"2011-11-22",20 , 70000);
		emp4.dispEmpInfo();
		//System.out.println(emp4.getPay());

		/*
		Regular emp1 = new Regular("주강민", "서울 양천구"
	             , "010-3123-2311", "2021.03.21", 4000000);
	      SalesMan emp2 = new SalesMan(
	            "임경재", "경기도 성남시"
	            , "010-9837-2342", "2021.03.12"
	            , 500000
	            , 20, 70000);
	      Temp emp3 =  new Temp("박정호", "서울 목동", "010-2319-3422"
	            , "2020.01.01", 20, 250000);

	      // 급여 계산
	      emp1.getPay();
	      emp2.getPay();
	      emp3.getPay();
	         :
	          :
		 */
		/*
		Employee emp1 = new Regular("주강민", "서울 양천구"
				, "010-3123-2311", "2021.03.21", 4000000);
		Employee emp2 = new SalesMan(
				"임경재", "경기도 성남시"
				, "010-9837-2342", "2021.03.12"
				, 500000
				, 20, 70000);
		Employee emp3 =  new Temp("박정호", "서울 목동", "010-2319-3422"
				, "2020.01.01", 20, 250000);
		 */

		//클래스 배열 선언. 위 코드와 같음
		/*
		Employee [] emps = new Employee[3];
		emps[0] = new Regular("주강민", "서울 양천구"
				, "010-3123-2311", "2021.03.21", 4000000);
		emps[1] = new SalesMan(
				"임경재", "경기도 성남시"
				, "010-9837-2342", "2021.03.12"
				, 500000
				, 20, 70000);
		emps[2] =  new Temp("박정호", "서울 목동", "010-2319-3422"
				, "2020.01.01", 20, 250000);
		 */
		Employee [] emps = {
				new Regular("주강민", "서울 양천구"
						, "010-3123-2311", "2021.03.21", 4000000),
				new SalesMan("임경재", "러시아"
						, "010-1173-2311", "2021.03.21", 500000, 20, 70000),
				new Temp("코끼리", "아프리카"
						, "010-3125-2311", "2151.03.21", 15, 4000000),
		};

		//클래스 배열 초기화로 
		for (int i = 0; i < emps.length; i++) {
			emps[i].getPay();
		} //for

	} //main

} // class
