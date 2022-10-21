package test.method;

public class TestMain {

	public static void main(String[] args) {
		NonStaticSample nss = new NonStaticSample();
		
		
		// 1. 
		nss.printLottoNumbers();
		
		// 2. 
		nss.outputChar(7, '*');
		
		// 3. 
		System.out.println("리턴된 알파벳 : " + nss.alphabette());
		
		// 4. 
		System.out.println("리턴된 문자열 : " + nss.mySubstring("yellow banana", 2, 7));

	}

}
