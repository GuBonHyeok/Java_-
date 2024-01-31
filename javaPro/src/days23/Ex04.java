package days23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Bonggu
 * @date 2024. 1. 31.- 오전 11:21:54
 * @subject 교집합, 차집합, 합집합
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		
		// 1) a U b (합집합) [1, 2, 3, 4, 5, 6, 7, 8]
		/*
		ArrayList<Integer> hab = new ArrayList<Integer>(a); //괄호안의 a를 넣으면 아래에 hab.addAll(a);를 안 줘도 된다.
		//hab.addAll(a); // 현재 hab : [1,2,3,4,5]
		Iterator<Integer> ir =  b.iterator();
		while (ir.hasNext()) {
			Integer i = ir.next();
			if (!a.contains(i)) hab.add(i);		
		} System.out.println(hab); //[1, 2, 3, 4, 5, 4, 5, 6, 7, 8]
		*/
		
		// HashSet은 중복을 허용하지 않기 때문에 ArrayList가 아니라 Hashset을 쓰면 자동으로 합집합이 구해짐
		/*
		HashSet<Integer> hab = new HashSet<Integer>(a); 
		hab.addAll(b);
		System.out.println(hab);
		*/	
		
		// 2) a - b (차집합) [1, 2 ,3]
		/*
		[1]
		ArrayList<Integer> cha = new ArrayList<Integer>(a); 
		Iterator<Integer> ir =  b.iterator();
		while (ir.hasNext()) {
			Integer i = ir.next();
			if (a.contains(i))  cha.remove(i);		
		} System.out.println(cha); //[1, 2, 3, 4, 5, 4, 5, 6, 7, 8]
		
		[2]
		a.removeAll(b);
		System.out.println(a);
		*/
				
		// 3) a ∩ b (교집합) [4, 5]
		/*
		ArrayList<Integer> kyo = new ArrayList<Integer>(a); 
		Iterator<Integer> ir =  b.iterator();
		while (ir.hasNext()) {
			Integer i = ir.next();
			if (a.contains(i))  kyo.add(i);		
		} System.out.println(kyo); //[1, 2, 3, 4, 5, 4, 5, 6, 7, 8]
		*/
		
		

	}//main

}//class










