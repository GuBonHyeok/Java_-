package com.util;

public class MyCalendar {

	public static boolean isLeapYear(int year) { //boolean 형으로 만든 윤년

		boolean result = false;
		if (year %4 ==0 && year %100 != 0 || year %400 ==0) {
			result =  true;		
		}
		return result;
	} //if

	/*
	public static String isLeapYear(int year) {
		String result = "평년";
		if (year %4 ==0 && year %100 != 0 || year %400 ==0) {
			result =  "윤년";	
			}	
		return result;
		} //if
	 */


} //class

