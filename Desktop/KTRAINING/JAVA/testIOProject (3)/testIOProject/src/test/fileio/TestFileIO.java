package test.fileio;

import java.io.File;

public class TestFileIO {

	public static void main(String[] args) {
		// 파일 입출력 테스트
		FileIOSample ref = new FileIOSample();
		// ref.byteFileOutput();
		//ref.byteFileInput();
		//ref.charFileOutput();
		ref.charFileInput();
		
		// System.out.println("파일 크기 : " + new File("file.dat").length()); // 파일 크기 알기
	}

}
