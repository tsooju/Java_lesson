package test.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		// LinkedHashSet
		// 저장순서가 유지되는 보완된 HashSet의 후손클래스임
		LinkedHashSet set = new LinkedHashSet();
		
		set.add(new User("user001", "pass001", "홍길순"));
		set.add("java");
		set.add(12345);
		set.add(45.6);
		
		System.out.println(set);

		// iterator
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	
	
}	// class end
