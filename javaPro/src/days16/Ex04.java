package days16;

import days14.Tv;

/**
 * @author Bonggu
 * @date 2024. 1. 22.- 오전 11:29:30
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		
		// 기존 Tv 클래스에서
		// 자막이 달리는 Tv가 필요해짐
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 11;
		ctv.channelDown();
		System.out.println(ctv.channel);
		ctv.dispCaption("Hello world");
		ctv.caption = true; //자막 on
		ctv.dispCaption("Hi");


	} //main

} //class

class CaptionTv extends Tv{
	
	boolean caption; //자막 기능 on / off
	
	void dispCaption(String text) {
		if (this.caption) {
			System.out.println(text);
		} //if
	} //dispCaption
	
}//CaptionTv
