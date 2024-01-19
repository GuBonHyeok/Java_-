package days11;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author BongGu
 * @date 2024. 1. 15. - 오전 10:31:23
 * @subject 정수 4가 있는 위치에 100을 삽입하는 코딩을 하세요. 
 * @content int [] m =  {3,5,2,4,1};
 */
public class Ex03_02 {

	public static void main(String[] args) {

		int [] m = {3,5,2,4,1};
		int foundIndex = indexOf(m , 4); //m의 4번째 자리
		int [] temp = new int [m.length +5 ]; 
		System.out.println(Arrays.toString(temp));
		/*
		for (int i = 0; i < m.length; i++) {
			if (i < foundIndex)  temp[i] = m[i]; 
			else if( i >= foundIndex) temp[i+1] = m[i];			
		}
		temp[foundIndex] = 100;
		 */

		System.arraycopy(m, 0, temp, 0, foundIndex); //위의 if와 같은 작업
		System.arraycopy(m, foundIndex, temp, foundIndex+1, m.length - foundIndex); // 위의 else if 와 같은 작업
		temp[foundIndex] = 100;

		System.out.println(Arrays.toString(temp));

	} //main

	private static int indexOf(int[] m, int i) {

		return 0;
	}

} //class
