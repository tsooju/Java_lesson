package member.model.dao;

import java.util.Scanner;

import member.model.dto.Member;

public class MemberManager {

	public static final int SIZE = 10;
	private int memberCount;

	private Member[] mar = new Member[SIZE];
	Scanner sc = new Scanner(System.in);

	public int getMemberCount() {
		return memberCount;
	}

	public void memberInput() {

		mar[memberCount] = new Member();

		System.out.println(memberCount + "번째 직원 정보를 입력하세요");
		System.out.println("아이디 : ");
		mar[memberCount].setId(sc.next());
		System.out.println("이름 : ");
		mar[memberCount].setName(sc.next());
		System.out.println("패스워드 : ");
		mar[memberCount].setPassword(sc.next());
		System.out.println("이메일주소 : ");
		mar[memberCount].setEmail(sc.next());
		System.out.println("성별 : ");
		mar[memberCount].setGender(sc.next().charAt(0));
		System.out.println("나이 : ");
		mar[memberCount].setAge(sc.nextInt());
		memberCount++;

	}

	public void deleteMember() {
		mar = null;
	}

	public void printAllMember() {

		for (Member ref : mar) {
			System.out.println(ref.memberInfo());
		}

	}

	public int searchMemberId() {
		System.out.println("아이디어를 입력하세요 : ");
		String searchId = sc.next();
		int index = 0;
		for (int i = 0; i < memberCount; i++) {
			if (mar[i].getId().equals(searchId)) {
				System.out.println(mar[i].getId());
				index = i;
			} else {
				index = -1;
			}
		}
		return index;
	}

	public int searchMemberName() {
		System.out.println("이름을 입력하세요 : ");
		String searchName = sc.next();
		int index = 0;
		for (int i = 0; i < memberCount; i++) {
			if (mar[i].getName().equals(searchName)) {
				System.out.println(mar[i].getName());
				index = i;
			} else {
				index = -1;
			}
		}
		return index;
	}

	public int searchMemberEmail() {
		System.out.println("이메일을 입력하세요 : ");
		String searchEmail = sc.next();
		int index = 0;
		for (int i = 0; i < memberCount; i++) {
			if (mar[i].getEmail().equals(searchEmail)) {
				System.out.println(mar[i].getEmail());
				index = i;
			} else {

				index = -1;
			}
		}
		return index;
	}

	public void printMember() {
		System.out.println("번호를 입력하세요 : ");
		int search = sc.nextInt();
		for (int i = 0; i < memberCount; i++) {
			if (mar[i].equals(search)) {
				System.out.println(mar[i].memberInfo());
			} else {
				System.out.println("-1");
			}
		}
	}

	// 오름차순
	public void sortIDAsc() {
		// if(앞 > 뒤) 오름차순
		// if(앞 < 뒤) 내림차순
		Member[] copy = new Member[memberCount];
		System.arraycopy(mar, 0, copy, 0, memberCount);

		for (int i = 0; i < memberCount - 1; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (copy[i].getId().compareTo(copy[j].getId()) > 0) {
					// 앞의 문자열이 크냐 ? 란 의미
					Member temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}

		for (Member ref : copy) {
			System.out.println(ref.memberInfo());
		}

	}

	// 내림차순
	public void sortIDDes() {
		Member[] copy = new Member[memberCount];
		System.arraycopy(mar, 0, copy, 0, memberCount);

		for (int i = 0; i < memberCount - 1; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (copy[i].getId().compareTo(copy[j].getId()) < 0) {
					// 앞의 문자열이 작으냐 ? 란 의미
					Member temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		for (Member ref : copy) {
			System.out.println(ref.memberInfo());
		}

	}

	public void sortAgeAsc() {
		Member[] copy = new Member[memberCount];
		System.arraycopy(mar, 0, copy, 0, memberCount);

		for (int i = 0; i < memberCount - 1; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (copy[i].getAge() > copy[j].getAge()) {
					Member temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		for (Member ref : copy) {
			System.out.println(ref.memberInfo());
		}
	}

	public void sortAgeDes() {
		// 내림차순
		Member[] copy = new Member[memberCount];
		System.arraycopy(mar, 0, copy, 0, memberCount);

		for (int i = 0; i < memberCount - 1; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (copy[i].getAge() < copy[j].getAge()) {
					Member temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		for (Member ref : copy) {
			System.out.println(ref.memberInfo());
		}
	}

	public void sortGenderDes() {
		Member[] copy = new Member[memberCount];
		System.arraycopy(mar, 0, copy, 0, memberCount);

		for (int i = 0; i < memberCount - 1; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (copy[i].getGender() < copy[j].getGender()) {
					Member temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		for (Member ref : copy) {
			System.out.println(ref.memberInfo());
		}
	}


	public Member findMember(int index) {
		return mar[index];

	}

}
