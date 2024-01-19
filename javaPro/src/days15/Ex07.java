package days15;

public class Ex07 {

	public static void main(String[] args) {
		// [static 키워드]
		// 필드 	앞에 사용 가능
		// 메서드 	앞에
		// 클래스 	앞에
		// ex) 우리반 학생 모두 -> 1층 기업은행 -> 보통 예금
		// 1. 저축 클래스 선언 : Save 클래스 선언
		// 인스턴스 변수 > 인스턴스가 생성될때마다 생성되는 변수
		
		// 클래스 배열을 사용하여 편리하게 관리
		/*
		Save [] sArr = new Save[5]; //Save sArr 배열 선언
		sArr[0] = new Save("강명건", 1000, 0.04);
		sArr[1] = new Save("구본혁", 10000, 0.04);
		sArr[2] = new Save("권맑음", 500, 0.04);
		sArr[3] = new Save("김영진", 15000, 0.04);
		sArr[4] = new Save("김진성", 100000, 0.04);
		*/
		
		// 클래스 배열 초기화 
		Save [] sArr = {
				new Save("강명건", 1000, 0.04),
				new Save("구본혁", 10000, 0.04),
				new Save("권맑음", 500, 0.04),
				new Save("김영진", 15000, 0.04),
				new Save("김진성", 100000, 0.04)
				
		};
		
		sArr[1].setRate(0.09); //객체 생성했으면 클래스명으로도, 객체 명으로도 접근할 수 있다
		
		for (int i = 0; i < sArr.length; i++) {
			sArr[i].dispSave();
		}
		
		// 클래스명.클래스변수
		// The field Save.rate is not visible . 접근지정자 문제로 접근하지 못함
		//Save.rate = 0.08;
		//Save.setRate(0.08);

	} //main

} //class
