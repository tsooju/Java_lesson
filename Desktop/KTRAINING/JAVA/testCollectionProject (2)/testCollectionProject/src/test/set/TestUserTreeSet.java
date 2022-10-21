package test.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestUserTreeSet {

	public static void main(String[] args) {
		// test.set.User 를 저장처리하는 TreeSet  사용
		// username 오름차순정렬되는 comparator class 작성
		// TreeSet 생성자에 comparator 사용 초기화함.
		
		
		//1. 객체 생성
		TreeSet users = new TreeSet(new AscUserName());
		
		//2. 객체 저장
		users.add(new User("user003", "pass001", "홍길동"));
		users.add(new User("user005", "pass002", "홍길순"));
		users.add(new User("user004", "pass003", "황길순"));

		//3. 저장정보 출력 확인
		System.out.println(users);
		
		//4. 오름차순정렬 목록 하나씩 출력
		Iterator iter = users.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("user asc==========");
		


		//5 내림차순정렬 목록 하나씩 출력
		Iterator diter = users.descendingIterator();
		while(diter.hasNext()) {
			System.out.println(diter.next());
		}

	}

}
