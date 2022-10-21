package test.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// TreeSet
		// 자동 오름차순정렬 기능이 내장된 set 계열 클래스임
		// 주의사항 : 같은 종류의 객체만 저장해야 한다.
		
		TreeSet tset = new TreeSet();
		
		tset.add("grape");
		tset.add("banana");
		/* tset.add(123); */ // 저장 타입이 다르면 실행시 에러 발생함.
		tset.add("apple");
		tset.add("melon");
		tset.add("orange");
		
		System.out.println(tset);
		
		System.out.println("오름차순정렬 목록 =============");
		Iterator iter = tset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("내림차순정렬 목록 =============");
		Iterator diter = tset.descendingIterator();
		while(diter.hasNext()) {
			System.out.println(diter.next());
		}
		
	}

} // class end
