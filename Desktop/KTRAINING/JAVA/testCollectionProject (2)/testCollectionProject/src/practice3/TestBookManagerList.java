package practice3;

import java.util.Scanner;

import practice2.Book;

public class TestBookManagerList {

	public static void main(String[] args) {
		menu();

	}

	public static void menu() {
		BookManagerList bmlist = new BookManagerList();
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("*** 도서 관리 프로그램 ***\n");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			System.out.print("번호 입력 : ");
			num= sc.nextInt();
			switch(num) {
			case 1: bmlist.addBook(inputBook()); break;
			case 2: bmlist.printBookList(bmlist.sortedBookList()); break;
			case 3: bmlist.removeBook(bmlist.searchBook(inputBookTitle()));  break;
			case 4: bmlist.printBook(bmlist.searchBook(inputBookTitle())); break;
			case 5: bmlist.displayAll(); break;
			case 6: System.out.println("프로그램 종료"); return;
			default: System.out.println("잘못입력");
			}

		}while(num != 6);
	}
	
	private static String inputBookTitle() {
		System.out.print("도서 제목 : ");
		return new Scanner(System.in).nextLine();
	}
	
	private static Book inputBook() {
		Scanner sc = new Scanner(System.in);
		System.out.print("도서번호 : ");
		 String no = sc.next();
		 System.out.print("도서분류코드(1.인문/2.자연과학/3.의료/4.기타)");
		 int category = sc.nextInt();
		 System.out.print("도서 제목 : ");
		 sc.nextLine();
		 String title = sc.nextLine();
		 System.out.print("저자 : ");
		 String author = sc.next();
		 
		 return new Book(no, category, title, author);
	}
	
}
