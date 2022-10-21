package test.wrapper;

public class TestWrapperClass {

	public static void main(String[] args) {
		// Wrapper class test
		/** 기본자료형(Primitive Type) : 8개 =>> 데이터 값
		 * java.lang package에 기본자료형에 대한 클래스들이 제공됨. 
		 * boolean >> Boolean class, char >> Character, byte >> Byte
		 * short >> Short, int >> Integer, float >> Float, 
		 * long >> Long, double >> Double
		 * 기본자료형의 클래스들을 wrapper class 라 한다. 
		 * 이거를 바로 Boxing (기본자료형 값을 == >> 객체로 바꾸는 작업임.)
		 * Boxing 처리에 사용하려고 Wrapper가 제공된다. 
		 * 
		 * 생성자나 valueOf() 메소드 사용해서 Boxing 한다.
		 * */
		
		// **Boxing** 처리
		int num = 123; // 값
		Integer intObj = new Integer(num); // deprecated // 사용을 권장하지 않음
		Integer ref = Integer.valueOf(num);	// 사용 권장함. 객체로 바꿈
		System.out.println(intObj + ", " + ref);
		
		// **UnBoxing** 처리 (객체 => 기본자료형 값으로 바꾸는 것)
		// 각 레퍼클래스 메소드로 제공됨 : 자료형Value() 사용
		int num2 = ref.intValue();	// int 값으로 바꿈
		System.out.println(num2);
		
		// ** Parsing ** 문자열형태 값 =>> 각 자료형 값으로 바꾸는 것
		// 각 자료형 레퍼런스 메소드로 제공됨 : parse 자료형() 사용
		String str = "34.5";
		double value = Double.parseDouble(str);	// double 자료형 값으로 변경
		System.out.println(value);
		

	}

}
