package com.uni;

public class Human {
	// Field
	protected String name;
	protected int age;
	protected int height;
	protected int weight;
	
	// Constructor
	public Human() {
		super();
	}
	
	// +Human(name:String,age:int,height:int, weight:int)
	public Human(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// +printInformation():String
	public String printInformation() {
		return "이름 : " + name + ", 나이 : " + age + ", 키 : " + height + ", 몸무게 : " + weight;
	}

	// getter, setter 작성
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

	public int getHeight() {
		return height;
	}

	public void setHeigth(int heigth) {
		this.height = heigth;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	
	
	
	
	
}
