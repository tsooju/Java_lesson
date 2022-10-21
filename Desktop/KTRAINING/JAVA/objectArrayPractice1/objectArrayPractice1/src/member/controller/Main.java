package member.controller;

import java.lang.reflect.Member;

import member.view.MemberMenu;

public class Main {

	public static void main(String[] args) {
		// Main 클래스의 main() 메소드에서

		MemberMenu mMenu = new MemberMenu();

		mMenu.mainMenu();

		System.out.println("회원관리 프로그램을 종료합니다.");

	}

}
