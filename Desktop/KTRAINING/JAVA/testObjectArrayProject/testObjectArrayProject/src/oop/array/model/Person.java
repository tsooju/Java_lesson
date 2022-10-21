package oop.array.model;

public class Person {
	//Field
	private String name;
	private int age;
	private double height;
	
	
	//Constructor
	// 우마우스 + source + generate constructor
	public Person(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		
		
	}


	public Person() {}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	
	// Person 객체가 가진 값들을 하나의 문자열로 만들어서 리턴
	public String personInfo() {
		return this.name + ", " + this.age + "세, " + this.height;
	}
	
	
	
}
