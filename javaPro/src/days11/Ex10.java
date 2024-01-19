package days11;

import java.util.Arrays;

/**
 * @author BongGu
 * @date 2024. 1. 15. - 오후 3:43:52
 * @subject 정렬 (sort)
 * @content 내일 시험!ㄴㄴ
 */
public class Ex10 {

	public static void main(String[] args) {
		// 정렬 (sort) - 일정한 순서대로 다시 배열하는 것.
		// 		오름차순 정렬
		// ex) 0 1 2 3 4 5 6
		//		  a b c d e f g
		// 내림차순 정렬
		// ex) 6 5 4 3 2 1 0
		//		  g f e d c b a

		// [정렬 방법]
		// 1) 버블 정렬 (bubble sort) - 시험!
		int [] m = {3,5,2,4,1};
		System.out.println(Arrays.toString(m));
		//bubbleSort(m);
		//System.out.println(Arrays.toString(m));
		// 2) 선택 정렬
		//selectionSort(m);
		selectionSort2(m);
		//System.out.println(Arrays.toString(m));
		// 3) 삽입 정렬
		// 4) 병합 정렬
	} //main
	//가장 작은 값 찾아서 넣기. 내일 시험!
	private static void selectionSort2(int[] m) { //i가 0일때 1회전해서 결과값, 가작 작은 1이 처음으로 오고 1번째가 선택되어져서 가장 작은값을 넣을 거다. 1번째 값을 민 값으로 잡아두고 두번쨰 값부터 비교한다. 2번째 방값이 민에 처음 들어가지고 3,4번째 비교
		
		for (int i = 0; i < m.length-1; i++) { //선택된 위치 
			int minIndex = i;
			for (int j = i+1; j < m.length; j++) { //0번이 아닌 1번째부터 찾기 시작하기 때문에
				if (m[minIndex] > m[j]) minIndex = j;			
			}			
			if (minIndex == i) continue;
			int temp = m[i];
			m[i] = m[minIndex];
			m[minIndex] = temp;
			
			System.out.println(Arrays.toString(m));
			
		}
		System.out.println();
		

		
	}
	//선택정렬 1번 방법. 가장 작은 값 찾아서 넣기
	private static void selectionSort(int[] m) {
		// 			3, 5, 2, 4, 1
		// 1회전  0-1 0-2 0-3 0-4 비교 > 작은 값 1번쨰 방에 넣음. 1회전 끝 [1] 5,3,4,2
		// 2회전  1-2 1-3 1-4 		 비교 > 작은 값 2번째 방에 넣음. 2회전 끝 [1] [2] 5,4,3
		// 3회전  2-3 2-4				 비교 > 작은 값 3번째 방에 넣음. 3회전 끝 [1] [2] [3] 5, 4
		// 4회전  3-4					 비교 > 작은 값 4번째 방에 넣음. 4회전 끝 [1] [2] [3] [4], 5

		//         i=0 j=1 2 3 4
		//			i=1 j=2 3 4
		//			i=2 j=3 4
		//			i=3 j=4
		for (int i = 0; i < m.length-1; i++) {
			for (int j = i+1; j <= 4; j++) {
				System.out.printf("%d-%d ", i, j);
				if (m[i] > m[j]) { //등호 반대로 바꾸면 내림차순
					System.out.print("***"); //자리바꿈 일어난 곳은 ***로 표시
					int temp = m[i]; //공간 3개로 자리 바꾸기
					m[i] = m[j];
					m[j] = temp;
				}
				System.out.println(Arrays.toString(m));
				/*
				if (m[j-1] > m[j]) { //등호 반대로 바꾸면 내림차순
					System.out.print("***"); //자리바꿈 일어난 곳은 ***로 표시
					int temp = m[j-1]; //공간 3개로 자리 바꾸기
					m[j-1] = m[j];
					m[j] = temp;				
				}
				 */
				//System.out.println(Arrays.toString(m));
			}
			//System.out.println();
		}
	}


	// 오름차순 정렬 (등호만 바꾸면 내림차순 정렬) : a > b 면 자리 바꾸기
	private static void bubbleSort(int[] m) { //버블 정렬
		// 3,5,2,4,1
		// 0,1 번째 비교 > 3 (앞자리)가 작음 > 그대로 3,5,2,4,1
		// 1,2 번째 비교 > 5 (앞자리)가 큼 > 자리 바꿈 3,2,5,4,1
		// 5,4 비교 > 5 (앞자리)가 큼 > 자리 바꿈 3,2,4,5,1
		// 5,1 비교 > 5 (앞자리)가 큼 > 자리 바꿈 3,2,4,1,[5] : 1회전 종료
		// 3,2 비교 > 3 (앞자리)가 큼 > 자리 바꿈 2,3,4,1,[5]
		// 3,4 비교 > 3 (앞자리)가 작음 > 그대로 2,3,4,1,[5]
		// 4,1 비교 > 4 (앞자리)가 큼 > 자리 바꿈 2,3,1,[4],[5] : 2회전 종료
		// ...
		// 2,1,[3],[4],[5] > 1,[2],[3],[4],[5] : 4회전 종료

		// > 별찍기와 비슷. 예제 복습

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.printf("%d-%d", j-1, j);
				if (m[j-1] > m[j]) { //등호 반대로 바꾸면 내림차순
					System.out.print("***"); //자리바꿈 일어난 곳은 ***로 표시
					int temp = m[j-1]; //공간 3개로 자리 바꾸기
					m[j-1] = m[j];
					m[j] = temp;
				}
				System.out.println(Arrays.toString(m));
			} 
			System.out.println();			
		}


	}

} //class
