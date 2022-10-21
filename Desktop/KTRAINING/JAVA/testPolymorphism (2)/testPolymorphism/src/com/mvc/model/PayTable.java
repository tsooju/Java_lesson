package com.mvc.model;

// - sub클래스명 : PayTable
public class PayTable extends Salary implements Calculate, Output{
	// default 생성자 작성
	public PayTable() {}
	
	// 매개변수 있는 생성자 작성 : 받은 초기값을 모두 부모 생성자 쪽으로 넘김
	public PayTable(String name, long pay, int family, int overtime) {
		super(name, pay, family, overtime);
	}
	
	@Override
	public void calc() {
		// calc() 메소드 처리조건
		if(getFamily() < 3) {
			setFamilyP(getFamily() * 20000);
		}	
		else if(getFamily() >= 3) {
			setFamilyP(60000);
		}
		setOvertimeP(getOvertime() *  5000);
		setTax((long)(getPay() * 0.1));
		setIncenP((long)(getIncentive() * getPay()));
		setTotalPay(getPay() + getFamilyP() + getIncenP() + getOvertimeP() - getTax());

	}
	
	@Override
	public void out() {
		// out() 메소드 처리내용
		System.out.println(getName() +"\t"+ getPay() +"\t"
								+ getFamily() +"\t"+ getFamilyP() +"\t"
								+ getOvertime() +"\t"+ getOvertimeP() +"\t"
								+ getTax() +"\t"+ getIncentive() +"\t"
								+ getIncenP() +"\t"+ getTotalPay());
	}


}
