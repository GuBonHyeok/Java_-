package days20;

import java.text.ChoiceFormat;

/**
 * @author Bonggu
 * @date 2024. 1. 26.- 오후 3:49:17
 * @subject 
 * @content 1. SimpleDateFormat ***
 * 					2. DecimalFormat ***
 * 					3. ChoiceFormat <<<<
 * 					4. MessageFormat
 */
public class Ex08 {

	public static void main(String[] args) {
		// 			[	ChoiceFormat? ]
		// 1. 특정 범위에 속하는 값을 문자열로 변환해준다.
		// 2. 불연속적인 범위의 값을 차리하는 데
		//		if문, switch문을 대신해서 사용할 수 있다
		//		-> 복잡한 처리를 간단한 코딩으로 처리할 수 있다.
		//[2]
		String newPattern = "0#가|60#양|70#미|80#우|90#수"; //아래 [1]번의 limits, formats를 합쳐서 기입한 형식임
		ChoiceFormat cf = new ChoiceFormat(newPattern);
		
		/*
		double [] limits = {0,60,70,80,90}; //특정 범위를 나타내는 배열 
		String [] formats = {"가","양","미","우","수"}; //그 범위 문자열 매칭.
		// >> 0~60 : 가, 60~69 : 양, 70~79 : 미, 80~89 : 우, 90~ : 수 
		ChoiceFormat cf = new ChoiceFormat(limits, formats);
		*/
		int [] kors = {100, 78, 98, 65};
		for (int i = 0; i < kors.length; i++) {
			System.out.printf("%d - > %s 등급\n", kors[i], cf.format(kors[i]));
		}//for


	}

}
