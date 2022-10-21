package test.list;

import java.util.ArrayList;
import java.util.HashSet;

public class TestArrayList {

	public static void main(String[] args) {
		// ArrayList test
		
		//1. 객체 생성
		ArrayList alist = new ArrayList();
		// List alist2 = new ArrayList();
		// Collection alist3 = new ArrayList();
		
		//2. 저장 처리 : Collection(set, list, map)들은 객체만 저장한다.
		// 저장 순서에 대한 index(순번) 부여된다.
		alist.add(new String("java"));
		alist.add("collection");	// 자동으로 auto boxing 즉 자동 string file이 된다. 
		alist.add(Integer.valueOf(123)); // 값 => 객체 : Boxing
		alist.add(45); //AutoBoxing 됨.
		alist.add(Double.valueOf(78.9)); //Boxing
		alist.add(45.6); // AutoBoxing
		
		//List 계열은 저장 순서가 유지됨. 
		System.out.println("저장된 객체수 : " + alist.size());
		System.out.println("저장된 내용 : " + alist);
		System.out.println("저장된 내용 : " + alist.toString());
		
		// 저장 순번(index)를 이용해서 객체들을 하나씩 처리할 수 있음.
		for(int i=0; i < alist.size(); i++) {
			System.out.println(i + " : " + alist.get(i));
		}
		
		// index를 이용하면, 원하는 위치에 객체를 저장할 수도 있음. 
		alist.add(2, "javascript");
		System.out.println(alist);
		// 하나씩 거냄
		for(int i=0; i < alist.size(); i++) {
			System.out.println(i + 1 + " : " + alist.get(i));
		}
		
		// index 이용 : 해당 위치의 객체 정보를 변경할 수 있음. 
		alist.set(2, new HashSet());	// 2번째 인덱스에 있는 데이터가 [] 빈 대괄호로 변경됨. 
		System.out.println(alist);
		
		
		// 같은 객체가 중복 저장됨. 
		alist.add("java");
		System.out.println(alist);
		
		// 저장된 객체의 위치 조회
		System.out.println(alist.indexOf("java"));  // 첫번째 인덱스
		System.out.println(alist.lastIndexOf("java"));	// 마지막 인덱스
		
		// 저장된 객체 제거
		alist.remove(2);
		System.out.println(alist);
		
		alist.remove("java");	// 앞의 것부터 제거된다. 
		System.out.println(alist);
		
		// Object[] 배열로 바꿈
		Object[] array = alist.toArray();
		for(Object obj : array) {
			System.out.println(obj);
		}
		
		
		
	}
}	// class end
