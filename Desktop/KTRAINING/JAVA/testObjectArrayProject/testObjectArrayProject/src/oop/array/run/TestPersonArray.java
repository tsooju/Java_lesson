package oop.array.run;

import oop.array.model.Person;

public class TestPersonArray {

	public static void main(String[] args) {
		// 객체배열 테스트
		// Person 객체가 여러 개 필요한 경우
		Person p1 = new Person("홍길동", 27, 178.5); // 한명 정보
		Person p2 = new Person("김유신", 33, 188.5);
		Person p3 = new Person("황지니", 24, 165.3);
		
		System.out.println(p1.personInfo());
		System.out.println(p2.personInfo());
		System.out.println(p3.personInfo());
		
		
		// 위의 작업을 객체 배열로 바꾼다면 : 
		// 배열선언과 할당 : 
		// 자료형[] 배열레퍼런스 = new 자료형[갯수];      
		// ===>>> memory heap에 갯수만큰 만든다는 의미
		 Person[] par = new Person[3];
		 // Person 객체의 주소를 기록할 참조변수 3개를 배열로 할당함. 
		 // 객체는 할당되지 않았음. => 주소 없음 (null 인 상태)
		 
		 for(int i = 0; i < par.length; i++) {
			 System.out.println(i + " : " + par[i]);
		 }
		
		 
		 // 객체배열 
		par[0] = new Person("홍길동", 27, 178.5); // 한명 정보
		par[1] = new Person("김유신", 33, 188.5);
		par[2] = new Person("황지니", 24, 165.3);
		
		 for(int i = 0; i < par.length; i++) {
			 System.out.println(i + " : " + par[i].personInfo());
		 }
		 
		 // 객체배열 초기화 
		 // 배열 초기화 : 
		 // 자료형[] 배열레퍼런스 = {초기값, 초기값, .....};
		// 자료형[] 배열레퍼런스 = new 자료형[]{초기값, 초기값, .....};
		 
		 //*** 객체 배열은 주소 배열이다. *** 즉 초기 값은 주소란 의미
		 Person[] parr = new Person[]{
				 new Person("홍길동2", 27, 178.5),
				 new Person("김유신2", 33, 188.5),
				 new Person("황지니2", 24, 165.3)
		 };
		 
		 for(int i = 0; i < parr.length; i++) {
			 System.out.println(i + " : " + parr[i].hashCode());
			 System.out.println(i + " : " + parr[i].personInfo());
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
