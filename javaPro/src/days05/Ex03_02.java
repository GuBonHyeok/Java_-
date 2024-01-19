package days05;

import java.util.Iterator;
import java.util.Random;

/**
 * @author BongGu
 * @date 2024. 1. 5. - 오전 11:33:09
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		 // [2] 가위(1),바위(2),보(3)
	      int com = (int)(Math.random() * 3) + 1;
	      // String comStr = null;
	      
	      /*
	      String [] rps = new String[4];
	      rps[0] = "";
	      rps[1] = "가위";
	      rps[2] = "바위";
	      rps[3] = "보";
	      */
	      // 배열 초기화
	      String [] rps = { "", "가위", "바위", "보" };

	      System.out.printf("%d(%s)\n", com, rps[com] );
	      
	      /*
	      comStr = com==1?"가위": com==2?"바위": "보";
	      */
	      
	      /*
	      if (com == 1) {
	         comStr = "가위";
	      }else if (com ==2) {
	         comStr = "바위";
	      }else if (com == 3) {
	         comStr = "보";
	      }
	      */
	      
	      /*
	      switch (com) {
	      case 1:
	         comStr = "가위";
	         break;
	      case 2:
	         comStr = "바위";
	         break;
	      case 3:
	         comStr = "보";
	         break; 
	      }
	      */
	      
	      // System.out.printf("%d(%s)\n", com, comStr);
	      
	      
	      /* [1]
	      // 임의의 수를 발생시키는 방법
	      // 0.0 <=   double     < 1.0
	      for (int i = 0; i < 1000; i++) {
	         System.out.println((int)(Math.random() * 3) + 1);
	      }
	      
	      // 1~3 임의의 정수 필요
	      // 1 <=   int   (int)(Math.random() * 3) + 1  < 4  
	      */

	   } // main

	} // class
