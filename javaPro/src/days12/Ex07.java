package days12;

import java.util.Arrays;
import java.util.function.BinaryOperator;

/**
 * @author BongGu
 * @date 2024. 1. 16. - 오후 2:05:52
 * @subject 검색(search)
 * @content     ㄴ순차검색(Sequence Search)
 *                      ㄴ 이진검색(BinarySearch) > 확인 필요
 *                          - 필수조건 (정렬 되어있어야 함) 
 */
public class Ex07 {

	public static void main(String[] args) {
		int [] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30, 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 
                86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142, 145, 146, 150, 151, 160, 161, 166, 168, 
             169, 172, 181, 184, 185, 191, 198 };
		//오름차순 정렬
		//System.out.println(m.length); -> 50
		// Arrays.sort(m); -> 자동 정렬
		// Arrays.toString(m); -> 배열 내용 쭉 출력
		// int 찾은위치 = Arrays.binarySearch(m, 150)
		
		int n = 116; //찾으려는 숫자
		int foundIndex = binarySaerch(m,n);
		
		if (foundIndex == -1) { // 배열 인덱스 값은 0보다 크기 때문에 찾는게 없으면 인덱스를 -1로 줘서 if문이 돌게끔
			System.out.println("배열 속에 찾는 숫자는 없다");
		} else {
			System.out.println(foundIndex);
		}

	} //main

	private static int binarySaerch(int[] m, int n) {
		int bottom = 0;
		int top = m.length - 1; //예를들어 인덱스가 7까지 있으면 0 1 2 3 4 5 6이기 때문에 6은 7-1
		int middle;
		int count = 0;
		while (top>=bottom) {
			System.out.printf("%d 횟수 \n", ++count);
			middle = (bottom + top) / 2;
			if (m[middle]==n) return middle;
			else if (m[middle] > n) {
				top=middle-1;
			} else if (m[middle]<n) {
				bottom = middle+1;
			}
		}
		return -1;

	}

} //class
