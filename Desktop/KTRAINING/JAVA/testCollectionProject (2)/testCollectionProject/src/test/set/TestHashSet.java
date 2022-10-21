package test.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		// Set 계열 HashSet 클래스 사용테스트
		
		//1. 객체 생성하고 사용한다. 
		HashSet hset = new HashSet();
		// Set hset2 = new HashSet();
		// Collection hset3 = new HashSet();
		
		//2. 객체 저장 작업 : add(), addAll()	일반적으로 add() 사용한다.
		//객체만 저장하고, 저장순서가 없다. 중복허용 안한다. 
		hset.add(new String("apple"));
		hset.add("apple"); // auto boxing
		hset.add(Integer.valueOf(120));
		hset.add(450); // auto boxing
		hset.add(Double.valueOf(32.5));
		hset.add(43.5); // auto boxing
		hset.add(new User("u1234", "p1234", "홍길동"));
		
		//저장된 객체 정보 확인 :  toString()
		System.out.println(hset/* .toString() */);
		//저장 순서가 유지 안 됨 확인
		
		//중복저장 안함 확인
		hset.add(450);
		System.out.println(hset);
		
		// set에 저장된 갯수 확인 
		System.out.println("저장된 객체 수 : " + hset.size());
		
		//제거 하기 : remove()
		hset.remove("apple");
		System.out.println(hset);
		System.out.println("저장된 객체 수 : " + hset.size());
		
		// 검색 : contains()
		System.out.println(hset.contains(450)); // 객체 대신 값 사용해도 auto boxing 되다.
		
		//set 저장 공간 비움 : clear()
		//빈 set 인지 확인 : isEmpty()
		// hset.clear();	// 내용 비우고
		// System.out.println(hset.isEmpty());	//확인
		// System.out.println("저장된 객체 수 : " + hset.size());
		
		
		//=====================================================
		// Set 계열은 저장 객체를 하나씩 꺼내는 기능 없음
		// 2까지 방법으로 해결한다. 
		//방법 1 : 객체배열로 바꾸기		-toArray()
		
		Object[] arr = hset.toArray();
		System.out.println("객체배열로 바꾸어 연속 처리=============");
		for(Object obj : arr) {
			System.out.println(obj);
		}
		
		// 방법 2 : 저장된 객체 목록을 만들어서 목록을 이용함. 
		// iterator() 사용
		Iterator iter = hset.iterator();	// java.util.Iterator
		System.out.println("목록으로 만들어서 연속 처리===========");
		while(iter.hasNext()) {	// 다음 항목이 있느냐?
			System.out.println(iter.next());	// 있으면 꺼내라
			
		}
		
	}

}// class end

// 자바 클래스 파일안에 여러 개의 클래스 작성할 수도 있다.
// 주의사항 : 파일명이 되는 클래스만 public class 이고, 
// 					나머지 추가 클래는 는 public 사용못 한다. (default class)으로 사용해야 한다.

class User {
	private String userid;
	private String userpwd;
	private String username;
	
	public User() {}

	public User(String userid, String userpwd, String username) {
		super();
		this.userid = userid;
		this.userpwd = userpwd;
		this.username = username;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", userpwd=" + userpwd + ", username=" + username + "]";
	}
	
	
}






