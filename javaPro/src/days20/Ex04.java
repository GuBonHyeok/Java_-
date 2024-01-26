package days20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Bonggu
 * @date 2024. 1. 26.- 오전 11:31:29
 * @subject 수료일이 무슨 요일일까
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		//Date endedDay  = new Date(2024-1900, 1-1, 26, 0, 0, 0); > Date 클래스로 만든 수료일
		Calendar c = Calendar.getInstance();
		//c.get(fidle)
		// 새로운 날짜로 설정 : set(field, value); > field를 value로 바꿔준다
		c.set(Calendar.YEAR, 2024);
		c.set(Calendar.MONTH, 6-1); //5가 6월이라서 6-1해줘야 함 
		c.set(Calendar.DATE, 14);
		c.set(Calendar.HOUR_OF_DAY, 18);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 123);

		/*
		// [시험] 형식화 클래스 Date, Calendar 원하는 형식으로 출력하는 함수
		// "2015. 5 .1 오전 9:11:12" 로 나타내고 싶다면?
		String pattern = "YYYY.MM.(E) dd a hh:mm:ss.SS"; //패턴 기호를 알아야함. SimpleDateFormat 설명란 참고
		//"yyyy.MM.dd AM hh:mm:ss"
		SimpleDateFormat sdf = new SimpleDateFormat(pattern); //간단하게 내가 원하는 양식으로 날짜를 바꿔주는 기능의 클래스
		// Calendar -> Date 객체로 변환할 줄 알아야하고
		// Date -> Calendar 객체로 변환할 줄 알아야하함
		Date date = c.getTime();


		String strDataForm = sdf.format(date); // SimpleDateFormat  의 매개변수는 Date date로 달라고 함
		System.out.println(strDataForm);
		 */

	} //main

	/*
	public static String getFormatDate(Date d, String pattern) {
		return null;

	}
	public static String getFormatDate(Calendar c, String pattern) {

	}
	 */
	public static String getFormatDate(Object o, String pattern) {

		SimpleDateFormat sdf = new SimpleDateFormat(pattern); 

		if (o instanceof Date ) { //Date객체일 때는 (Date)로 다운캐스팅
			Date d = (Date)o;
			return sdf.format(d);
		}else if (o instanceof Date ) {
			Calendar c = (Calendar)o;
			Date d = c.getTime();
			return sdf.format(d); // SimpleDateFormat  의 매개변수는 Date date로 달라고 함
		}		
		return null;

	}



} //class
