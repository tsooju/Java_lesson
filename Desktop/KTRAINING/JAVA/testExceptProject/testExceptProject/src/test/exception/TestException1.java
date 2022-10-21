package test.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException1 {

	public static void main(String[] args) {
		// 예외처리(Exception Handling) test
		TestException1 test = new TestException1();
		test.testMethod1();

	}

	public void testMethod1() {
		// FileInputStream fin;
		FileReader fin;
		// Unhandled exception type FileNotFoundException
		try {
			// 예외 발생 가능성이 있는 문장 또는
			// 반드시 예외처리를 해야 되는 구문을
			// try 블럭 안에 작성하면 됨.
			// fin = new FileInputStream("sample.txt");
			fin = new FileReader("sample.txt");
			int data = -1;
			fin = null;  // null : 주소없다(비어있다)
			while((data = fin.read()) != -1 ) {
				System.out.print((char)data);
			}
			System.out.println();
			System.out.println("파일 읽기 완료!");
		} catch (FileNotFoundException e) {
			// 제시된 예외 상황이 발생하면 처리할 내용을 작성함.
			// e.printStackTrace(); // 에러 메세지를 단계별로 출력하라는 의미
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// read() method 에 대한 예외처리
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("나머지 에러 상황 발생...");
			e.printStackTrace();
		}finally {
			// 예외가 발생하든 안 하든 반드시 실행할 구문을 작성함.
			System.out.println("finally....");
		}
	} // method
} // class
