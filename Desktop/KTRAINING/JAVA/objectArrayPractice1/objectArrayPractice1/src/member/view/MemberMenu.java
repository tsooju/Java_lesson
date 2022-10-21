
package member.view;

import java.util.Scanner;

import member.model.dao.MemberManager;
import member.model.dto.Member;

public class MemberMenu {
	// 키보드 입력용 객체 생성 초기화함
	private Scanner sc = new Scanner(System.in);

	// 회원관리 클래스 객체 생성 초기화함
	private MemberManager mManager = new MemberManager();

	// 디폴트 생성자 작성
	public MemberMenu() {
	}

	// 메소드 작성
	public void mainMenu() {
		// 메뉴는 반복 출력되게 함
		// <실행 화면> ----------------------------------------------------------

		// MemberManager 클래스의 public static final SIZE(상수필드)값 출력시킴
		// 최대 등록 가능한 회원 수는 10 명입니다.

		// MemberManager mManager[] = new MemberManager[10];
		// System.out.println("최대 등록 가능한 회원 수는" + new MemberManager[10].length +
		// "명입니다.");

		// MemberManager 클래스의 memberCount 필드의 값을 리턴받아 출력
		// 현재 등록된 회원수는 5명 입니다.
		// System.out.println("현재 등록된 회원수는 : " + new MemberManager[10].length);

		do {

			System.out.println("최대 등록 가능한 회원 수는 " + mManager.SIZE + "명입니다");
			System.out.println("현재 등록된 회원수는 " + mManager.getMemberCount() + "명 입니다");

			System.out.println("***** 회원 관리 프로그램 *****\n");
			System.out.println("1. 새 회원 등록 / 객체배열사용");
			System.out.println("2. 회원 조회 / equals 사용");
			System.out.println("3. 회원 정보 수정 / setter사용");
			System.out.println("4. 회원 정보 정렬 / compareto 사용");
			System.out.println("5. 회원 삭제");
			System.out.println("6. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 선택 : ");
			int no = sc.nextInt();

			switch (no) {

			case 1:
				mManager.memberInput();
				break;
			case 2:
				searchMenu();
				break;
			case 3:
				modifyMenu();
				break;
			case 4:
				sortMenu();
				break;
			case 5:
				mManager.deleteMember();
				break;
			case 6:
				mManager.printAllMember();
				break;
			case 9:
				System.out.print("종료 하시겠습니까?[y|n] : ");
				char answer = sc.next().toUpperCase().charAt(0);
				if (answer == 'Y') {
					return;
				} else {
					break;
				}
			default:
				System.out.println("잘못 입력했습니다.");
				System.out.println("다시 입력하세요.\n");
				break;

			}
		} while (true);

	} // mainMenu() end

	public void searchMenu() {

		do {
			System.out.println("***** 회원 정보 검색 메뉴 *****\n");
			System.out.println("1. 아이디로 검색");
			System.out.println("2. 이름으로 검색");
			System.out.println("3. 이메일로 검색");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			int no = sc.nextInt();

			switch (no) {
			case 1:
				mManager.searchMemberId();
				break;
			case 2:
				mManager.searchMemberName();
				break;
			case 3:
				mManager.searchMemberEmail();
				break;
			case 9: {
				System.out.println("메인 메뉴로 돌아갑니다.");
				return;
			}
			default:
				System.out.println("잘못 입력했습니다.");
				System.out.println("다시 입력하세요.\n");
				break;

			}
		} while (true);

	} // searchMenu() end

	public void sortMenu() {
		do {
			System.out.println("***** 회원 정보 정렬 출력 메뉴 *****\n");
			System.out.println("1. 아이디 오름차순 정렬 출력");
			System.out.println("2. 아이디 내림차순 정렬 출력");
			System.out.println("3. 나이 오름차순 정렬 출력");
			System.out.println("4. 나이 내림차순 정렬 출력");
			System.out.println("5. 성별 내림차순 정렬 출력(남여순)");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			int no = sc.nextInt();

			switch (no) {
			case 1:
				mManager.sortIDAsc();
				break;
			case 2:
				mManager.sortIDDes();
				break;
			case 3:
				mManager.sortAgeAsc();
				break;
			case 4:
				mManager.sortAgeDes();
				break;
			case 5:
				mManager.sortGenderDes();
				break;
			case 9:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력했습니다.");
				System.out.println("다시 입력하세요.\n");
				break;

			}
		} while (true);

	} // sortMenu() end

	public void modifyMenu() {

		do {
			System.out.println("***** 회원 정보 수정 메뉴 *****\n");
			System.out.println("1. 암호 변경");
			System.out.println("2. 이메일 변경");
			System.out.println("3. 나이 변경");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			int no = sc.nextInt();

			switch (no) {
			case 1:
//				System.out.print("ID 입력하세요 : ");
//				String str = sc.next();
				int index = mManager.searchMemberId();
				if (index == -1) {
					System.out.println("다시 입력");
				} else {
					System.out.print("변경할 암호를 입력하세요 : ");
					String nPass = sc.next();
					mManager.findMember(index).setPassword(nPass);
					//mManager.setPassword(index);
				}
				break;
			case 2:
//				System.out.print("ID 입력하세요 : ");
//				str = sc.next();
				index = mManager.searchMemberId();
				if (index == -1) {
					System.out.println("다시 입력");
				} else {
					System.out.print("변경할 이메일을 입력하세요 : ");
					String nMail = sc.next();
					mManager.findMember(index).setEmail(nMail);
				}
				break;
			case 3:
//				System.out.print("ID 입력하세요 : ");
//				str = sc.next();
				index = mManager.searchMemberId();
				if (index == -1) {
					System.out.println("다시 입력");
				} else {
					System.out.print("변경할 나이를 입력하세요 : ");
					String nAge = sc.next();
					mManager.findMember(index).setAge(index);
				}
				break;
			case 9:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력했습니다.");
				System.out.println("다시 입력하세요.\n");
				break;

			}
		} while (true);

	} // modifyMenu() end

} // class end
