package member.model.dto;

import java.util.Scanner;

public class Member {
	private Scanner sc = new Scanner(System.in);

	// Field 구성
	private String id;
	private String name;
	private String password;
	private String email;
	private char gender;
	private int age;


// 디폴트 생성자와 매개변수있는 생성자 2개 작성함
	public Member() {
		super();
	}

	public Member(String id, String name, String password, String email, char gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

//각 필드에 대한 setter, getter 메소드 작성함
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

// 메소드 추가 : 필드값 확인용 메소드
	public String memberInfo() {
		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name);
		System.out.println("패스워드 : " + password);
		System.out.println("이메일주소 : " + email);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);

// (문자열 합치기한 결과 리턴함)
		System.out.print("합칠 문자 입력 : ");
		String keyword = sc.next();
		return id.concat(keyword);
	}

} // class end
