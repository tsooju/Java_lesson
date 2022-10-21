package test.list;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestBookList {

	public static void main(String[] args) {
		// ArrayList 이용 Book 객체 처리 테스트
		TestBookList test = new TestBookList();

		ArrayList list = new ArrayList();

		test.addBook(list); // list에 Book 객체 저장
		test.displayList(list); // 출력 확인

		test.fileSave(list); // 파일에 저장
		ArrayList flist = test.fileRead("books.dat");
		test.displayList(flist); // 출력 확인

		// 리스트에 저장된 객체들을 도서제목(title) 기준으로 오름차순 정렬
		// 매개변수 Comparator : 정렬기준이 설정된
		list.sort(new BookTitleAscending());
		System.out.println("title asc =================");
		test.displayList(list);

		// 리스트에 저장된 객체들을 도서제목(title) 기준으로 내림차순 정렬
		list.sort(new BookTitleDescending());
		System.out.println("title desc =================");
		test.displayList(list);

		
		// 리스트에 저장된 객체들을 도서가격(price) 기준으로 오름차순 정렬
		list.sort(new BookPriceAscending());
		System.out.println("title asc =================");
		test.displayList(list);
		
		// 리스트에 저장된 객체들을 도서가격(price) 기준으로 내림차순 정렬
		list.sort(new BookPriceDescending());
		System.out.println("title desc =================");
		test.displayList(list);
		
		
		
	}

	public void displayList(ArrayList list) {
		// 전달받은 list에 저장된 객체 출력 처리
		System.out.println("저장된 객체수 : " + list.size());

		for (Object obj : list) { // list에서 꺼내면 기본으로 Object이다.
			System.out.println(obj.toString());
			// Book overriding toString() 실행됨 : 동적 바인딩

		}
	}

	public void addBook(ArrayList list) {
		// 전달된 리스트에 Book 객체 생성해서 추가 처리
		list.add(new Book("자바 정석", 35000));
		list.add(new Book("오라클 모델링", 48000));
		list.add(new Book("JDBC 디자인패턴", 45000));

		// 키보드로 객체 필드값들을 입력받아 객체 저장후 리스트에 저장

	}

	public void fileSave(ArrayList list) {
		// 전달받은 리스트 Book 객체를 하나씩 꺼내서
		// 객체들을 파일에 저장 처리
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("books.dat"));) {
			for (Object obj : list) {
				objOut.writeObject(obj);
			}
			System.out.println("books.dat 에 저장 완료!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ArrayList fileRead(String fileName) {
		ArrayList alist = new ArrayList();

		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(fileName));) {
			while (true) {
				alist.add(objIn.readObject());
			}

		} catch (EOFException e) {
			e.printStackTrace();
			System.out.println(fileName + "읽기 완료!");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return alist;
	}

} // class end
