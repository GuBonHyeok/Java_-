package days14;

/**
 * @author Bonggu
 * @date 2024. 1. 18.
 * @subject
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		
		int x = 10, y = 20;
		int [] m = {10,20};
		System.out.printf("> x=%d, y=%d\n",m[0] ,m[1]);
		
		
		//swap(x,y);
		swap(m);

		System.out.printf("> x=%d, y=%d\n",m[0] ,m[1]);

	}//main
										// Call by Reference
	private static void swap(int [] m) {
				
		{
			int temp = m[0];
			 m[0] =  m[1];
			 m[1] = temp;
		} 
		
	}

	private static void swap(int x, int y) {
		// TODO Auto-generated method stub
		
		{
			int temp = x;
			x = y;
			y = temp;
		} 
		
	}

}//class
