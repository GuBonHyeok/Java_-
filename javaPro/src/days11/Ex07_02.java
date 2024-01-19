package days11;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author BongGu
 * @date 2024. 1. 15. - 오후 2:02:30
 * @subject 배열 내에서 가장 큰 값(max)이 있는 인덱스 값 찾기 (2)
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		//max 가장 큰 값을 찾아서 그 위치(index)를 배열에 담아서 출력하려면?
		int [] maxIndexArray;
		
		// 1) max + 2) max 갯수 구하기
		int max = m[0], maxCount = 1;
		for (int i = 1; i < m.length; i++) {
			if (m[i] == max) maxCount++; //같은 값이 나오면 +1
			else if(m[i]>max) { //여태껏 계산한 최고값보다 더 큰게 나오면
				max = m[i]; //더 큰걸 다시 최고값에 넣고
				maxCount = 1; //최고값에 +1
			}
			
		}
		

	
		}//main
	// 배열에서 가장 큰값(max)과 max갯수를 int[] 배열 로 반환하는 함수
	private static int[] getArrayMaxAndCount(int[] m) {
	      int max = m[0] , maxCount = 1;
	      for (int i = 1; i < m.length; i++) {
	         if( max == m[i]) maxCount++;
	         else if( max < m[i]) {
	            max = m[i];
	            maxCount = 1;
	         }
	      } // for
	      
	      // return new int[] { max, maxCount };
	      int [] mc = new int[2];
	      mc[0]=max;
	      mc[1]=maxCount;
	      return mc;
	   }

	}//class
