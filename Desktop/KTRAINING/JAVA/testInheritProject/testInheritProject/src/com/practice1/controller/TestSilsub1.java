package com.practice1.controller;

import com.practice1.model.vo.Book;

public class TestSilsub1 {

	public static void main(String[] args) {
		// 테스트 클래스 : com.practice1.controller.TestSilsub1.java
		//main() 포함
		
		// 초기값을 부여한 두 개의 객체를 생성함
		Book ref1 = new Book();
		Book ref2 = new Book("홍길동", "홍길동", 10000);
		
		// 두 객체의 정보 출력 처리함  :  toString() 사용
		System.out.println("ref1 : " + ref1.toString());
		System.out.println("ref2 : " + ref2.toString());
		
		// 두 객체의 값이 일치하는지 결과 출력 : equals() 사용
		System.out.println("비교 : " + ref1.equals(ref2));
		
		// 첫번째 객체를 복제한 객체 생성함 : clone() 사용
		Book ref3 = (Book)ref1.clone();
		
		// 첫번째 객체와 복제 객체의 주소가 같은지 출력
		System.out.println("비교 : " + (ref1 == ref3));
		
		// 첫번째 객체와 복제 객체의 내용이 같은지 출력
		System.out.println("내용 비교 : " + ref1.equals(ref3));
		
		
	}

}
