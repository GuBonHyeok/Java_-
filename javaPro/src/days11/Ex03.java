package days11;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author BongGu
 * @date 2024. 1. 15. - 오전 10:31:23
 * @subject 정수 4가 있는 위치에 100을 삽입하는 코딩을 하세요. 
 * @content int [] m =  {3,5,2,4,1};
 */
public class Ex03 {

	public static void main(String[] args) {

		int [] m = {3,5,2,4,1};
		int foundIndex = indexOf(m , 4); //indexOf > 배열 안에서 찾고자하는 값의 index를 찾아서 돌려주는 함수
															//m 배열에서 4를 찾을 때 까지 index0 부터 length 까지 실행
		System.out.println(foundIndex);
		int [] temp = new int [m.length +5 ]; //방이 5칸 커진 10개짜리 만듦
		//Arrays.copyOf(null, foundIndex. foundIndex); //검색 필요
		System.arraycopy(m, 0, temp, 0, m.length); //m의 1번째 값을 temp의 2번째 위치에서부터 길이 3만큼 복사 
		System.out.println(Arrays.toString(temp));
		//3,5,2,4,1,0,0,0,0,0 에서 4부터 한칸씩 뒤로 미루고 100을 집어넣는 코딩
		for (int i = m.length-1; i >= foundIndex ; i--) {
			temp [i+1] = temp[i];	
		}
		temp [foundIndex] = 100;
		System.out.println(Arrays.toString(temp));		
		for (int i = 4; i <= m.length; i++) {
			temp[i-1] = temp[i];			
		}
		temp[5] = 0;
		System.out.println(Arrays.toString(temp));

	} //main
	//순차 검색 (Sequence Search)
	private static int indexOf(int[] m, int n) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] == n) return i;			
		}

		return -1; //-1을 가지고 돌아가면 찾는 정수는 없다는 의미
	}

} //class
