package days11;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author BongGu
 * @date 2024. 1. 15. - 오후 2:02:30
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };

		int count=1;
		int max, min, sum;
		double avg;
	
		max = min = sum = m[0];
					
		for (int i = 1; i < m.length; i++) {
			if(max < m[i]) max = m[i];
			else if (min > m[i]) min = m[i];
			sum += m[i];			
		} //for
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		avg = (double) sum / m.length;
		System.out.println(avg);
		
		System.out.println("-".repeat(30));
		
		//람다와 스트림 검색 필요
		max = IntStream.of(m).max().getAsInt(); //
		min = IntStream.of(m).min().getAsInt();
		sum = IntStream.of(m).sum(); //얘는 자동으로 .. getAsInt 안써도 된다. 검색 필요
		avg = IntStream.of(m).average().getAsDouble();
		
		//배열로 가져올땐 이렇게..?
		int [] score = new Random().ints(20, 0, 101).toArray();
		
	}//main

}//class
