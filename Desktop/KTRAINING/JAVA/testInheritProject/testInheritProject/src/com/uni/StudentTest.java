package com.uni;

public class StudentTest {

	public static void main(String[] args) {
		Student[] student = new Student[3];
		
		student[0] = new Student("홍길동", 15, 171, 81, "201101", "영문");
		student[1] = new Student("한사람", 13, 183, 72, "201102", "건축");
		student[2] = new Student("임걱정", 16, 175, 65, "201103", "건축");
		
		for(int i = 0; i <=2; i++) {
			System.out.println("학생 정보 : " + student[i].printInformation());
		}
		
	}

}
