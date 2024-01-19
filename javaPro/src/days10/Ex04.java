package days10;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author BongGu
 * @date 2024. 1. 12. - 오후 2:42:16
 * @subject [배열 단점 파악] => 단점을 개선하기 위해 컬렉션(Collection)이 있음
 * @content 
 */
public class Ex04 {

	public static int index = 0; //모든 함수에서 쓸 수 있도록 클래스 단위에 선언
	public static char con = 'y'; //모든 함수에서 쓸 수 있도록 클래스 단위에 선언 / 계속할지 말지 묻는 con
	public static Scanner scanner = new Scanner(System.in); //모든 함수에서 쓸 수 있도록 클래스 단위에 선언
	public static int [] m = new int [3]; //모든 함수에서 쓸 수 있도록 클래스 단위에 배열 m 선언

	public static void main(String[] args) throws IOException {
		

		String [] menus = {"추가","수정","삭제","검색","조회","종료"};

		int selectedNumber; //선택된 메뉴를 저장하는 변수 선언
		while (true) {
			dispMenus(menus); //화면상에 배열을 출력하는 용도. 출력하면 끝이기 때문에 리턴값은 안 받음
			selectedNumber = selectMenun();
			processMenus(selectedNumber); //processMenus 에서 selected 함수로 배열 m을 매개변수로 넘긴다.
		}//while

	}//main

	private static void processMenus(int selectedNumber) throws IOException {
		switch (selectedNumber) {
		case 1:			//추가 == 배열에 값(정수) 입력
			add();
			break;
		case 2:			//수정
			edit();
			break;
		case 3:			//삭제
			remove();
			break;
		case 4:			//검색
			search();
			break;
		case 5:			//조회	 == 배열의 모든 요소(목록) 출력
			list();
			break;
		case 6:			//종료	 == 프로그램 종료
			exit();
			break;
		}//switch

		//바로 메뉴 출력으로 가지 못하게 일시정지하는 작업
		일시정지();

	}
	private static void 일시정지() {
		System.out.print("> Enter 키나 누르면 계속합니다.");

		try { //System.
			System.in.read(); //엔터의 13 제거
			System.in.skip(System.in.available()); // 엔터의 10 제거
		} catch (IOException e) {
			e.printStackTrace();
		} //엔터는 13, 10 값이 들어가기 때문에 제거시켜줘야한다

	}

	private static void list() {
		System.out.println("[5. 조회]");

		if (index == 0) {
			System.out.println("\t 추가된 요소가 없습니다.");
			return;
		}

		// 출력
		for (int i = 0; i < index; i++) {
			System.out.printf("m[%d]=%d ",i , m[i]);
		}
		System.out.println();

	}

	private static void search() {
		System.out.println("[4. 검색]");


	}

	private static void remove() {
		System.out.println("[3. 삭제]");


	}

	private static void edit() {
		System.out.println("[2. 수정]");


	}

	private static void add() throws IOException { //int[] m을 매개변수로 받아서 함수 내부에서 사용하도록
		System.out.println("[1. 추가]");

		do {
			if (m.length == index) {
				increaseArrayM();	// main 함수의 m을 넘겨받음
			}			
			System.out.print("> 정수 입력 ? ");
			int n = scanner.nextInt();
			m[index++] = n;

			System.out.print("> 계속 입력하시겠습니까 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available()); //13,10

		} while (Character.toUpperCase(con) == 'Y');		

	}

	private static void increaseArrayM() { //메인 함수에 있는 m을 참조하기 위해 배열로 선언
		int [] temp = new int[m.length + 3];

		for (int i = 0; i < m.length; i++) {
			temp[i] = m[i]; //m[i] 보다 공간이 3칸 더 넓은 temp[i] 배열에 m[i]값 할당.  값 대입 
		}//for
		m = temp; //메인 함수에 참조시킬 수 있도록 리턴값을 돌려주는 작업
	}

	// 6.종료 - 프로그램을 종료하는 함수
	private static void exit() {
		System.out.print("\n\n프로그램을 종료합니다.");
		System.exit(0); //프로그램 자체 종료하는 함수
	}

	// 1~6 메뉴를 선택해서 반환하는 함수
	private static int selectMenun() {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		do {
			System.out.print("> 메뉴를 선택하세요 ? "); // 1~6
			inputData = scanner.next();
		} while (!inputData.matches("[1-6]"));

		return Integer.parseInt(inputData);
	}

	private static void dispMenus(String[] menus) {

		System.out.println("\t\t\t\t\t[메뉴]");
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("[%d]. %s\t", i+1, menus[i]);
		} //for		 
		System.out.println();

	} //disp

}//class
