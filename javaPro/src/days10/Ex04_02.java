package days10;

/**
 * @author BongGu
 * @date 2024. 1. 12. - 오후 4:17:13
 * @subject 배열 크기 자동 추가 테스트
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// (테스트)배열이 가득 차면 배열 크기를 늘려서 추가하는 작업
		int [] m = new int [3];
		int index =0;

		m[index++] = 1;
		m[index++] = 2;
		m[index++] = 3;

		// 배열의 방이 다 차면 
		if (m.length == index) {
			int [] temp = new int[m.length + 3];

			for (int i = 0; i < temp.length; i++) {
				temp[i] = m[i]; //m[i] 보다 공간이 3칸 더 넓은 temp[i] 배열에 m[i]값 할당.  값 대입 
			}//for
			m = temp; // temp가 가리키고 있는 주소값을 m이 가리키겠다고 할당하는 것. 주소 대입
							// 이후 m이 가리키고 있던 Heap 영역의 값은 가비지가 되어 처리된다.
		} //if

	} //main

} //class