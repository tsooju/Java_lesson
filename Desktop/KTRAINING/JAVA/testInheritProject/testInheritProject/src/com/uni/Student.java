package com.uni;

public class Student extends Human {
	//Field
	private String number;
	private String major;
	
	//Constructor
	public Student() {
		super();
	}
	
	// + Student(name:String,age:int,height:int, weight:int,String number,String major)
	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}
	
	// getter, setter
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	// +printInformation():String
	@Override
	public String printInformation() {
		return super.printInformation() + ", 학변 : " +  this.number + ", 전공 : "+ this.major;
	}
	
	
	
	
	
}
