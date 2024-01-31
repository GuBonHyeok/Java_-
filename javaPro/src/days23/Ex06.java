package days23;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Bonggu
 * @date 2024. 1. 31.- 오후 3:08:12
 * @subject Map 인터페이스. HashTable
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// List, Set
		// [ Map 인터페이스를 구현한 컬렉션 클래스 ]
		/* 
		 * 1. 한쌍 (key, value) == 엔트리로 관리
		 * 2. Key 중복 X, Value 중복 O
		 * 3. HashMap (신버전)
		 * 		Hashtable (구버전)
		 * 4. 해싱(Hashing) ?
		 *    - 해시 함수를 이용해서 데이터를 해시 테이블에 저장하고 검핵하는 기법.
		 *    - 해시 함수? 데이터가 저장되는 곳을 알려주는 함수.
		 *    				  데이터를 빠르게 검색할 수 있다.
		 *    - 데이터 저장(key+value) 한 쌍으로 저장. 데이터를 저장할 키를 해시 함수에 넣으면
		 *       배열의 한 요소를 얻어오고 다시 그 곳에 연결된 링크드 리스트에 데이터를 저장하고 이후 읽어온다.
		 *    - 해싱을 사용하기 때문에 많은 양의 데이터를 검색하는데 뛰어난 성능이 있다.
		 *    
		 *    [해시 함수]
		 *    
		 *    데이터 저장 예시) 1999.1.1. 에 했던 일들을 찾고자 한다
		 *    
		 *    	[1998] - [] [] [] [] []
		 *   >[1999] - [1월] [2월] [3월] [] [] [] [] [] 
		 *    	[2000] - [] [] [] [] [] []
		 *    	[] - [] [] [] [] [] [] []
		 *  
		 */

		// <E> : Element. 요소
		// <K, V> : Key, Value
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("admin", "관리자");
		ht.put("hong", "홍길동");
		ht.put("root", "관리자");

		System.out.println(ht);

		System.out.println(ht.size()); //엔트리의 갯수 

		/*
		// 모든 Key 조회.
		Enumeration<String> en = ht.keys(); //열거형으로 조회
		while (en.hasMoreElements()) {
			String key = en.nextElement();
			System.out.println(key);
		}
		// 모든 key 조회 2
		Set<String> keys =ht.keySet(); //set계열 String으로
		Iterator<String> rs = keys.iterator();
		while (rs.hasNext()) {
			String key = (String) rs.next();
			System.out.println(key);
		}
		 */

		//key를 알 때 value 값을 얻어오는 방법.
		/*
		String value = ht.get("root");
		System.out.println(value); //"root" 라는 key를 가진 사람은 관리자

		//String value = ht.get("gogo"); 
		String value = ht.getOrDefault("gogo", "고고"); //있으면 gogo 의 value를 가져오고 없으면 "고고"를 가져와라 
		System.out.println(value); //"gogo" 라는 key를 가진 사람은 없기 때문에 null
		 */

		//모든 value 조회
		/*
		Collection<String> value = ht.values();
		Iterator<String> ir = value.iterator();
		while (ir.hasNext()) {
			String values = (String) ir.next();
			System.out.println(value);
		}

		//System.out.println(value);
		 */

		// [문제] park 키가 존재하는지 확인한 후에 존재한다면 park 박철로 엔트리를 추가하세요
		/*
		if (! ht.containsKey("park")) { //"park"이 없다면
			ht.put("park", "박철");		   //"park" 키, "박철" 벨류로 저장해라
		} System.out.println(ht);
		 */

		// 해시테이블 출력하는 메서드() 호출
		dispHT(ht);


	} //main

	/* [1]
	private static void dispHT(Hashtable<String, String> ht) {
		Enumeration<String> en = ht.keys(); //열거형으로 조회
		while (en.hasMoreElements()) {
			String key = en.nextElement();
			String value = ht.get(key);
			System.out.printf("%s : %s\n",key,value);
		}
	}
	 */ //[2]
	private static void dispHT(Hashtable<String, String> ht) {
		Set<Entry<String, String>> es =  ht.entrySet();
		Iterator<Entry<String, String>> ir = es.iterator();
		while (ir.hasNext()) {
			Entry<String, String> entry = ir.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.printf("%s : %s \n", key, value);

		}

	}


}//class












