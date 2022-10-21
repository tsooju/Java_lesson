package test.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestHashMap {

	public static void main(String[] args) {
		// HashMap test
		//1. 객체 생성
		HashMap hmap = new HashMap();
		// Map hmap2 = new HashMap();
		
		//2. 객체 저장 :  키객체와 값객체 쌍으로 저장함. put(k, v)
		hmap.put(new String("one"), Integer.valueOf(12345));
		hmap.put(2, "java"); // auto boxing

		// 출력 확인
		System.out.println(hmap);
		
		//key : set 사용, value : list 사용
		// 키는 중복저장 안됨. 값객체는 중복 허용
		hmap.put("one", "java collection test");
		//키가 중복되면, 참조하는 값객체를 바꿈
		//map에서는 키의 중복저장은 값객체 변경을 의미함.
		System.out.println(hmap);  // {2=java, one=java collection test} :  value 값은 2번째 값으로 변경된다. 
		
		hmap.put("two", "java"); // 값 객체는 중복 저장 됨.
		System.out.println(hmap);
		
		//map에 저장된 객체 하나 조회시 : get(key) : Object() == return type
		System.out.println(hmap.get("one"));
		
		// map의 저장된 객체들을 연속 처리할 경우, 기본 제공기능은 없음.
		// 연속으로 처리하는 4까지 방법 있다. 
		
		//방법 1 : 저장된 키(key)들을 Set으로 바꿈. 다음에 iterator() 이용;
		System.out.println("keySet() 이용===================");
		Set keys = hmap.keySet();
		Iterator keyIter = keys.iterator();	// map의 key 목록이 만들어졌다.
		while(keyIter.hasNext()) {
			Object key = keyIter.next(); // 하나씩 꺼내고 get으로 조회하면 된다.
			System.out.println(key + "=" + hmap.get(key));
		}
		
		//=============================================
		
		// 방법 2 : 값객체들을 values() 사용해서 > collection으로 바꿈.
		Collection values = hmap.values();

		// 2-1 : toArray() 사용해 > Object[] 로 만들어서 연속 처리
		System.out.println("Object[] 이용===================");
		Object[] varray = values.toArray();
		for(Object obj : varray) {
			System.out.println(obj);
		}
		// 2-2 :  iterator() 사용 > 값객체 목록을 사용
		System.out.println("value iterator()==================");
		Iterator valueIter = values.iterator();
		while(valueIter.hasNext()) {
			// Object value = valueIter.next();
			System.out.println(valueIter.next());
			
		}
		
		// 방법 3 : 키와 값 한쌍을 엔트리(Entry)라고 한다. 
		// entrySet() 사용 >>> 엔트리들을 Set으로 바꿈. >> iterator()
		// 엔트리 목록 만들기함.
		// Map.Entry (Map 안의 내부인터페이스 Entry 임)로 표기함.
		// 내부(Nested)클래스 사용 : 외부클래스명.내부클리스명
		Set entries = hmap.entrySet();	// entry를 set으로 바꿈
		Iterator entryIter = entries.iterator(); // 엔트리 목록
		System.out.println("Map.Entry=================");
		while(entryIter.hasNext()) {
			//Object obj = entryIter.next();
			//Map.Entry entry = (Map.Entry)obj;
			Map.Entry entry = (Map.Entry)entryIter.next();
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		//==========================================================
		//TreeMap 사용//
		//키에 대한 오름차순정렬 처리를 자동으로 해 주는 클래스임
		//주의사항 : 키의 자료형들이 같아야 함
		hmap.remove(2); //숫자 2 키의 엔트리 삭제함.
		hmap.put("three", "정렬테스트");
		System.out.println(hmap);
		
		TreeMap tmap = new TreeMap(hmap);
		System.out.println(hmap);
		
		//키에 대한 내림차순정렬 처리
		Map descMap = tmap.descendingMap();
		System.out.println(descMap); // 키의 대한 내림차순

	} // method end

} // class end
