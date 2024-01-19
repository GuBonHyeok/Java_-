package days09;

import java.util.Calendar;
import java.util.Date;

/**
 * @author BongGu
 * @date 2024. 1. 11. - 오후 12:09:42
 * @subject 주민등록번호
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {

		// [주민등록번호]
		// 住民登錄番號 / Resident registration number, RRN
		// 1.생년월일
		// 2. 성별
		// 3. 내국인/외국인
		// 4. 출신지역
		// 5. 나이
		// 6. 검증
		Calendar c = Calendar.getInstance();
		int thisYear = c.get(Calendar.DATE);

		String rrn = "950518-1812345";


		String birthday = getBirth(rrn);
		//System.out.print(birthday + " / ");

		int yearAge = getYearAge(rrn);
		int koreaAge = getKoreaAge(rrn);
		int americanAge = getAmericanAge(rrn);
		//System.out.println(getYearAge(rrn));
		System.out.printf("%s - 연나이:%d살, 한국식 나이 : %d살\n" 
				,rrn,yearAge,koreaAge);
		System.out.printf("아메리칸 : %d살 ",americanAge);
		System.out.printf(" 캘린더 : %d", thisYear);

	}//main


	private static int getKoreaAge(String rrn) { // 한국식 나이 계산 = 연나이 + 1
		return getYearAge(rrn) + 1;		
	}
	private static int getYearAge(String rrn) { // 연 나이 계산 = 올해년도 - 출생년도
		int birthYear = Integer.parseInt(rrn.substring(2,6));; //출생 년도
		int thisYear = 2024;
		/* [1] Date 클래스 사용 : 날짜, 시간 출력해주는 클래스
		Date dt = new Date();
		thisYear = dt.getYear() + 1900; //올해 년도
		return thisYear;
		 */		
		//[2] Calendar 클래스 사용 : 날짜, 시간 출력해주는 클래스
		Calendar c = Calendar.getInstance();
		thisYear = c.get(Calendar.YEAR);

		int gender = getGender(rrn);
		switch (gender) {
		case 9: case 0:{
			birthYear += 1800;
		}
		case 1: case 2: case 5: case 6:{
			birthYear += 1900;			
			break;
		}
		case 3: case 4: case 7: case 8:{
			birthYear += 2000;
			break;
		}

		// System.out.println(thisYear);
		}
		return thisYear-birthYear;

	}
	private static int getAmericanAge(String rrn) { // 만 나이 계산
		//출생일 		: 2023.10.09.
		//오늘날짜 	: 2024.01.11.
		//만나이		: 0살
		//				  = 올해년도(2024) - 출생년도(2023)
		//				  = 1-1 생일이 지나지 않으면 1살을 뺀다
		//				  = 0
		
		//코드 확인 필요
		Calendar c = Calendar.getInstance();
		int americanAge = getYearAge(rrn);
		int thisMM = c.get(Calendar.MONTH) +1;
		int thisDD = c.get(Calendar.DATE);
		int birthMM = Integer.parseInt(rrn.substring(2,4));
		int birthDD = Integer.parseInt(rrn.substring(4,6));
		
		if (!(thisMM >= birthMM && thisDD >= birthDD)) {
			americanAge--;			
		}
		return americanAge;
		
		/* 내가 한 코딩
		int age;
		int today = c.compareTo(c);
		int todayAge = Integer.parseInt(rrn.substring(0,5));
		if (today - todayAge > 0) {
			age = getYearAge(rrn);			
		} else {
			age = getYearAge(rrn) - 1;			
		}		
		return age;		
		*/
	}
	private static int getGender(String rrn) {
		// char rrn.charAt(7);			   '1' - 48	int
		// String rrn.substring(7,8);	   '
		return rrn.charAt(7) - 48;	//1		
	}
	private static String getBirth(String rrn) {
		// "880518-1812345" - YYMMDD
		int year = Integer.parseInt(rrn.substring(0,2));  // "95"
		int month = Integer.parseInt(rrn.substring(2,4));  // "95"
		int day = Integer.parseInt(rrn.substring(4,6));  // "95"
		int g = Integer.parseInt(rrn.substring(7,8)); 

		int gender = getGender(rrn);

		switch (gender) {
		case 9: case 0:{
			year += 1800;
		}
		case 1: case 2: case 5: case 6:{
			year += 1900;			
			break;
		}
		case 3: case 4: case 7: case 8:{
			year += 2000;
			break;
		}

		} //getBirth
		String birthday = String.format("%d년 %d월 %d일",year, month, day);
		return birthday;

	}

}//class
