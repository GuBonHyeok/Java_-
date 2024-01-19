package days09;

/**
 * @author BongGu
 * @date 2024. 1. 11. - 오전 11:14:27
 * @subject 복습문제 4번 : 윤년/평년 체크하기 
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {

		String result = "평년";
		for (int i = 2010; i <= 2030; i++) {
			result = "평년";
			if ( com.util.MyCalendar.isLeapYear(i)) { result = "윤년";
			System.out.printf("%d년 : %s\n",i,result);
			} 
		} //if

	} //main

} //class


