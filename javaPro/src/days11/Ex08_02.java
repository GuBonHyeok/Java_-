package days11;

/**
 * @author BongGu
 * @date 2024. 1. 15. - 오후 2:50:21
 * @subject 
 * @content 내일 시험!
 */
public class Ex08_02 {

	public static void main(String[] args) {
		
		//순차 검색 함수 선언
		int n = 71;
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		
		int beginIndex = 0, foundIndex;  
		while ((foundIndex = indexOf(m, n, beginIndex)) != -1){ //자주나오는 코딩이니까 외워두자!!
			System.out.println(foundIndex);
			beginIndex = foundIndex + 1;
			
		}
		
		
	} //main
	public static int indexOf(int [] m , int n,int beginIndex) { //배열을 찾아가는 위치를 설정해줄 beginindex 선언
		for (int i = beginIndex; i < m.length; i++) {
			if (m[i] ==n) { 
				return i;				
			}
		}
		return -1;	

	} //indexOf
	
	public static int indexOf(int [] m , int n) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] ==n) { 
				return i;				
			}
		}
		return -1;	

	} //indexOf

} //class
