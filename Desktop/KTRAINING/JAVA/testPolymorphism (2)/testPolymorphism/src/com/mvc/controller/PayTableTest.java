package com.mvc.controller;

import com.mvc.model.PayTable;
import com.mvc.model.Salary;

public class PayTableTest {

	public static void main(String[] args) {
		//  main() 메소드에서 객체배열 초기화하고 구동 시킴
		Salary[] pt = new Salary[3];
		pt[0] = new PayTable("소서노",750000,2,3);
		pt[1] = new PayTable("고주몽",800000,1,4);
		pt[2] = new PayTable("모팔모",650000,6,2);
		
		

		// for each
		for(Salary sly : pt) {
			((PayTable)sly).calc();
			((PayTable)sly).out();
		}
		
		Salary.setIncentive(0.7f);
		for(Salary sly : pt) {
			((PayTable)sly).calc();
			((PayTable)sly).out();
		}
	}
}
