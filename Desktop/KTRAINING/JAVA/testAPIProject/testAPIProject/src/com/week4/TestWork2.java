package com.week4;

import java.util.StringTokenizer;

public class TestWork2 {
	public TestWork2() {}
	
	public void testWork2() {
		
		// "J a v a  P r o g r a m " 문자열 값을
		// - 토큰 처리전 글자 출력
		String str = "J a v a  P r o g r a m";
		System.out.println("토큰 처리전 글자 출력 : " + str);
		
		// - 전 글자갯수 출력
		System.out.println("전 글자갯수 출력 : " + str.length());
		
		// - 토큰 처리 후 글자갯수 출력 확인
		StringTokenizer stk = new StringTokenizer(str, " ");
		System.out.println("토큰 처리 후 글자갯수 : " + stk.countTokens());
		char s = 0;
		while(stk.hasMoreTokens()) {
			s = stk.nextToken().charAt(0);
			System.out.println(s);
		} 
		System.out.println(s);
		
	} // method end
} // class end
