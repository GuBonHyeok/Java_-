package days13;

/**
 * @author BongGu
 * @date 2024. 1. 17. - 오전 8:44:44
 * @subject 
 * @content
 */
public class Exam {

	public static void main(String[] args) {
		int [] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30, 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 
                86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142, 145, 146, 150, 151, 160, 161, 166, 168, 
             169, 172, 181, 184, 185, 191, 198 };
		
		int n = 99;
		int foundIndex = binarySearch(m, n);
		
		if (foundIndexx = -1) {
			System.out.println("찾는 값 없음");
		} else if{
			System.out.println(foundIndex);
		}


	} //main

	private static int binarySearch(int[] m, int n) {
		int top = m.length-1;
		int bottom = 0;
		int middle = 0;
		int count = 0;
		while (top <= bottom) {
			System.out.printf("횟수 : %d", count++);
			middle = (top + bottom) / 2;
			if (m[middle] == 0) { return middle;
			} else if (m[middle] > n)
			
		}
		return 0;
	}

} //class
