package oop.array.run;

import java.util.Scanner;

import oop.array.model.Person;

public class TestPersonArray2 {
	
	public static void inputPerson(Person[] ar) {
		Scanner sc = new Scanner(System.in);
		
		// 객체 생성과 키보드 값 입력 처리
		for(int i = 0; i < ar.length; i++) {
			ar[i] = new Person();
			
			System.out.println(i + "번째 person 정보를 입력하세요");
			System.out.print("이름 : ");
			ar[i].setName(sc.next());
			System.out.print("나이 : ");
			ar[i].setAge(sc.nextInt());
			System.out.print("키 : ");
			ar[i].setHeight(sc.nextDouble());
		}
		return;
	}
	
	public static void main(String[] args) {
		// Person 객체배열 실행 테스트
	Person[] par = new Person[3]; // 객체업슨 주소 3개만 배열 됨 	
		inputPerson(par);
		
		//객체 정보 출력 확인
		//for each 문 사용 : 객체 배열이나, 컬랙션에만 사용.
		/**
		 * for(클래스명 레퍼런스벼수 : 배열명){
		 * 		레퍼런스.메소드(...);
		 * 
		 * }
		 * */
		
		for(Person ref : par) {
			System.out.println(ref.personInfo());
		}

	}

}
