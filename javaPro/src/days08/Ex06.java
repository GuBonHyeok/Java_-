package days08;

import java.util.Random;

/**
 * @author BongGu
 * @date 2024. 1. 10. - 오후 3:51:15
 * @subject 
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		String card = "4567-3456-2345-1235"; //신용카드 번호
		String regex = "-"; //regex에 "-" 저장
		String [] cardArr = card.split(regex); //"-"를 구분자로 문자열을 자름
		/*
		for (String c : cardArr) {  //foreach문으로 c에 card Arr을 넣음
			System.out.println(c);
		}
		*/
		
		Random rnd = new Random();
		int index = rnd.nextInt(4);  // 0 <= index < 3
		
		cardArr[index] = "****";
		/* [1]
		String printCard = String.format("%s-%s-%s-%s"
				,cardArr[0],cardArr[1],cardArr[2],cardArr[3]);
		*/
		
		// Stirng.join(문자열1, 문자열...) > 문자열1로 문자열...를 쪼갠다. 위 [1] 코딩과 동일  
		String printCard = String.join("-", cardArr);
		
		System.out.println(printCard);
		
		
		//카드결제 영수증
		/*
		4567-****-2345-1235
		****-3456-2345-1235
		4567-3456-****-1235
		4567-3456-2345-****
		 */


	} //main

} //class
