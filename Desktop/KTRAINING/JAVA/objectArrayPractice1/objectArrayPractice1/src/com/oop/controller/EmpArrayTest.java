package com.oop.controller;

import com.oop.model.dto.Employee;

public class EmpArrayTest {

	public static void main(String[] args) {
		// Employee test
//  1. 3개의 생성자를 사용하여 3개의 객체를 배열로 생성함
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(
				201503, "박길동", null, null, 29, 'M', 0, 0.0, 
				"010-1234-5678", "경기도 의정부시");
		
		Employee emp3 = new Employee(
				201004, "김철수", "개발부", "과장", 34, 'M', 4500000, 0.15, 
				"010-2143-9876", "서울시 노원구 노원동 123");
		
//  2. empInformation() 메소드를 사용하여, 3객체의 정보를 출력함
		System.out.println(emp1.empInformation());
		System.out.println(emp2.empInformation());
		System.out.println(emp3.empInformation());
		
		
		
		Employee[] a_emp = new Employee[] {
				new Employee(),
				new Employee(201503, "박길동", null, null, 29, 'M', 0, 0.0, 
									 "010-1234-5678", "경기도 의정부시"),
				new Employee(201004, "김철수", "개발부", "과장", 34, 'M', 4500000, 0.15, 
									 "010-2143-9876", "서울시 노원구 노원동 123"),
		};

		for(int i = 0; i < a_emp.length; i++) {
			 System.out.println(i + " : " + a_emp[i].hashCode());
			 System.out.println(i + " : " + a_emp[i].empInformation());
		 }
		
//  3. 3개의 객체중 값이 없는 필드에 각각 값을 입력해 넣음	
		
		// emp[0]
		a_emp[0].setEmpNo(201305);
		a_emp[0].setEmpName("이영희");
		a_emp[0].setDept("총무부");
		a_emp[0].setJob("대리");
		a_emp[0].setAge(28);
		a_emp[0].setGender('F');
		a_emp[0].setSalary(3750000);
		a_emp[0].setBonusPoint(0.1);
		a_emp[0].setPhone("010-9512-7534");
		a_emp[0].setAddress("경기도 동두천");
		
		// emp[1]
		a_emp[1].setEmpNo(201503);
		a_emp[1].setEmpName("박길동");
		a_emp[1].setDept("기획부");
		a_emp[1].setJob("사원");
		a_emp[1].setAge(29);
		a_emp[1].setGender('M');
		a_emp[1].setSalary(3200000);
		a_emp[1].setBonusPoint(0.05);
		a_emp[1].setPhone("010-1234-5678");
		a_emp[1].setAddress("경기도 의정부시");
		
		for(int i = 0; i < a_emp.length; i++) {
			 System.out.println(i + " : " + a_emp[i].hashCode());
			 System.out.println(i + " : " + a_emp[i].empInformation());
		 }
			
		
// 연봉 = (급여 + (급여 * 보너스포인트)) * 12 ;
//  5. 3직원의 1년 연봉의 평균을 구하여 출력함
		int[] pay = new int[a_emp.length];
		
		
		long sumPay = 0L;
		for(int i = 0; i < a_emp.length; i++) {
			pay[i] = (a_emp[i].getSalary() + (a_emp[i].getSalary() * (int)a_emp[i].getBonusPoint())) * 12;
			sumPay += pay[i];
		}
		
		for(int i =0; i < a_emp.length; i++) {
				System.out.println(a_emp[i].getEmpName() + "의 연봉 : " + pay[i]);}
		
		int avr1 = (int)(sumPay / pay.length);
		System.out.println("직원들의 연봉의 평균 : " + avr1);
		
		
		int result1 = (a_emp[0].getSalary() + (a_emp[0].getSalary() * (int)a_emp[0].getBonusPoint())) * 12;					
		int result2 = (a_emp[1].getSalary() + (a_emp[1].getSalary() * (int)a_emp[1].getBonusPoint())) * 12;;
		int result3 = (a_emp[2].getSalary() + (a_emp[2].getSalary() * (int)a_emp[2].getBonusPoint())) * 12;;
		int avr = (result1 + result2 + result3) / 3;
		System.out.println("이영희의 연봉 : " + result1);
		System.out.println("박길동의 연봉 : " + result2);
		System.out.println("김철수의 연봉 : " + result3);
		System.out.println("================ ");
		System.out.println("이영희의 연봉 : " + avr);
		
		

	}

}
