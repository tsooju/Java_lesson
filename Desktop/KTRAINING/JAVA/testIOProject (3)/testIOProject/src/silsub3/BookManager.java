package silsub3;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import test.objectio.Member;

public class BookManager {
	Scanner sc = new Scanner(System.in);
	// default constructor
	public BookManager() {}
	
	// method
	public void fileSave() {
		Book[] book = new Book[5];
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("books.dat"));) {
			for (Book b : book) {
				objOut.writeObject(b);
			}
			System.out.println("books.dat 에 저장 완료!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void fileRead() {
		Book[] book = new Book[10]; // 몇개가 들어오는지 모르기때문에 넉넉하게 할당함

		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("books.dat"));) {
			for (int i = 0; i < book.length; i++) {
				book[i] = (Book) objIn.readObject();
				System.out.println(book[i]);
			}
		} catch (EOFException e) { // file 에 더 이상 읽을 데이터 없을 때 발생
			System.out.println("books.dat 읽기 완료");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
} // class end
