package oop.method.practice;

public class NonStaticSample2 {
	
	public NonStaticSample2() {}
	
	
	
	
		
		//int 한개의 전달값을 받아서, 배열의 주소를 리턴하는 메소드
		//처리할 내용 : 전달받은 정수 갯수만큼의 배열공간을 할당하여, 
		//임의의 1부터 100사이의 값으로 값 기록하고 주소 리턴함
	
	
		//메소드 명 : intArrayAllocation
		//매개변수도 있고 반환값도 있는 메소드
	
	public int intArrayAllocation() {
		for(int i = 1; i <= 100; i++) {
			int num = (int)(Math.random()*100)+1;
			System.out.println("");
		}
		
		
		return 0;
	}
		

		//메소드 명 : display
		//매개변수 있고 반환값 없는 메소드
		//처리할 내용 : 배열을 전달받아 화면에 출력함
			
		//메소드명 : swap
		//매개변수 있고 반환값 없는 메소드
		//처리할 내용 : 배열과, 두 정수의 인덱스를 전달받아
		//두 인덱스의 값을 교환함
		
		//메소드명 : sortDescending
		//매개변수 있고 반환값 없는 메소드
		//처리할 내용 : 위에서 작성한 swap 메소드를 이용하여
		//배열의 값 들을 내림차순 정렬 처리함
		
		//메소드명 : sortAscending
		//매개변수 있고 반환값 없는 메소드
		//처리할 내용 : swap 메소드를 이용하여 배열의 값들을 오름차순 정렬함
		
		
		//1. 문자열과 문자 하나를 전달받아, 문자열에 포함된 문자의 갯수를 리턴하는 메소드
		//포함된 문자가 없으면 0 리턴함
		//메소드명 : countChar
		
		
		//2. 정수 두 개를 전달받아, 두 수중 작은 값에서 큰 값사이의 정수들의 합계를 구해서
		//리턴하는 메소드
		//메소드명 : totalValue
		
		
		//문자열과 인덱스를 전달받아, 그 위치의 문자를 리턴하는 메소드
		//메소명명 : pCharAt
		
		//두 개의 문자열을 전달받아, 하나의 문자열로 합쳐서 리턴하는 메소드
		//메소드명 : pConcat

}
