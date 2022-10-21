package com.week4;

import java.util.StringTokenizer;

public class TestWork2 {

	public static void main(String[] args) {
		// "J a v a  P r o g r a m " 문자열 값을
		
		// 전 글자갯수 출력
		String str = "J a v a  P r o g r a m";
		System.out.println("토큰 처리전 글자 출력 : " + str.length());
		StringTokenizer st = new StringTokenizer(str, " "); 
		
		// 토큰 처리 후 글자갯수 출력 확인
		System.out.println("분리된 문자열 갯수 : " + st.countTokens());
		// - 토큰 처리 글자 출력
		char[] s = new char[st.countTokens()];
		
		int i = 0;
		while(st.hasMoreTokens()) {
			s[i] = st.nextToken().charAt(0);
			System.out.println();
		} 
		
		
		
		
	}

}
