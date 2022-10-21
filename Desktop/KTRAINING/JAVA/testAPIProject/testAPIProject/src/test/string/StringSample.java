package test.string;

import java.util.StringTokenizer;

public class StringSample {
	public StringSample() {}
	
	public void immutableString() {
		// 문자열 값은 java VM에 의해 문자열 저장소(Literal Pool)에서 
		// 따로 저장 관리됨 =>> 즉 문자열 값은 문자열저장소에 기록됨. 
		// 문자열 저장소에 기록된 문자열값은 한번만 기록되며 수정 불가능!!
		// 이것이 : immutable 기능이다. 
		
		String s1 = "java";  // 문자열 저장소에 "java" 기록됨
		// s1 에는 문자열저장소에 기록된 문자열의 주소가 저장됨. 
		
		String s2 = "java"; //한번 기록된 문자열을 두번 기록되지 않음
		// s2에는 이전에 기록된 문자열의 주소가 저장됨. 
		
		String s3 = "java2";		 // 주소 다름
		
		String s4 = s1.toUpperCase();	// 주소 다름(변경해서 새로 만든 주소에 할당됨.)
		
		System.out.println("s1 주소 : " + s1.hashCode());
		System.out.println("s2 주소 : " + s2.hashCode()); 
		System.out.println("s3 주소 : " + s3.hashCode()); 	// 주소 다름
		System.out.println("s4 주소 : " + s4.hashCode());	// 주소 다름
		// 기록된 문자열값 조작을 하면,  처리결과값이 새로 할당됨.
		// 기록된 문자열을 수정 안됨. :  immutable
		
		String s5 = s1.replace('a', 'u');	 // 주소 다름
		
		System.out.println("s5 주소 : " + s5.hashCode());	// 주소 다름
		
		
		// concat : string 값을 합치기
		String s6 = s1.concat(" programming");
		
		System.out.println(s1);
		System.out.println(s6);
		System.out.println("s6 주소 : " + s6.hashCode());
		// String 의 문자열 값 조작할때마다, 조작결과문자열이 새 메모리에
		// 할당되고, 새 주소가 리턴됨. => 메모리 사용량이 늘어남. 
		//공간 적합도, 시간 적합도란 두까지로 프로그램의 성능을 확인한다. 

	}
	public void usingStringBuilder() {
		/**
		 * 문자열 조작작업이 필요하면, String => StringBuilder or StringBuffer 
		 * 로 바꿈 >> 조작작업 => String 바꿈.
		 * */
		String s = "oracle";		// immutable
		StringBuilder sb = new StringBuilder(s);		// mutable
		
		System.out.println("s 주소 : " + s.hashCode());
		System.out.println("sb 주소 : " + sb.hashCode());
		System.out.println("sb : " + sb);
		
		StringBuilder sb2 = sb.append(", java");
		System.out.println(sb2);
		System.out.println("sb2 : " + sb2.hashCode());  // 주소 같음
		
		System.out.println("sb capacity : " + sb.capacity());	// 글자 수(용량)
		System.out.println("sb2 capacity : " + sb2.capacity());	  // 글자 수(용량)
		
		String sb3 = s.concat(" programming");
		System.out.println(sb3);
		System.out.println("sb3 주소 : " + sb3.hashCode());
		
		sb.delete(6, 8);
		System.out.println("sb 주소 : " + sb.hashCode());
		System.out.println("sb : " + sb/* .toString() */);
		
		
		//StringBuilder 에 기록된 문자열을 char[]에 복사할 경우 : 
		char[] ar = new char[10];
		sb.getChars(0, 3, ar, 0);	//0번 인덱스부터 3번 인덱스까지 복사  해서 입력
		// (값 없는 것은 기본 값 그대로 입력) 
		
		for(int i =0; i<ar.length; i++) {
			System.out.println(i + " : " + ar[i]);
		}
		System.out.println("oracle 에서 a 문자의 위치 : " + sb.indexOf("a"));
		System.out.println("oracle 에서 cle 문자열의 시작위치 : " + sb.indexOf("cle", 2)); 
																	// 2번 인덱스(문자열의 시작 위치 설정)
		
		sb.insert(0, "power "); // 0번 위치에 power란 string 값을 입력함
		System.out.println("sb : " + sb + "[" + sb.hashCode() + "]");
		
		sb.replace(6, sb.length(), ", Servlet"); // 문자열 일부를 변경함. **바꿀 시작 위치, 끝 위치, 바꿀 값**
		System.out.println("sb : " + sb + "[" + sb.hashCode() + "]");
		
		sb.reverse(); // 문자열 순서 반대로 값 변경
		System.out.println("sb : " + sb + "[" + sb.hashCode() + "]"); // sb : telvreS , rewop[305808283]
		
		sb.setCharAt(6, 's'); // 글자 하나 변경
		System.out.println("sb : " + sb + "[" + sb.hashCode() + "]");  // sb : telvres , rewop[305808283]
		
		String str = sb.substring(6);  // 시작 인덱스에서 끝 글자 까지 추출
		System.out.println("추출 결과 : " + str);
		
		str = sb.substring(0, 5); // 시작부터 지정 위치까지 추출
		System.out.println("추출 결과 : " + str);
		
		// StringBuilder >> String 바꿀 때
		String result = sb.toString(); 
		System.out.println("result : " + result);
		
	}
	
	public void usingSplit() {
		/**공백 있는 문자열 경우 : */
//		String s = "java oracle html5 css3 javascript";
//		String[] sar = s.split(" ");
		
		/**공백 없는 문자열 경우 : */
		String s = "java,oracle,html5,css3,javascript";
		String[] sar = s.split(",");		// 쉼표 단위로 분리한다. 
		
		System.out.println("분리된 문자열 갯수 : " + sar.length);
		for(String ref : sar) {
			System.out.println(ref);
		}
	}
	
	
	public void usingTokenizer() {
		// StringTokenizer st = new StringTokenizer("python crawling django java jdbc spring");
		// st 안에 토큰 조각들이 들어있다는 의미;
		
		StringTokenizer st = new StringTokenizer("java,jdbc,jquery,ajax,mybatis,spring,opencv", ","); 
		// 쉼표로 구분해라 란 의미
		
		System.out.println("분리된 문자열 갯수 : " + st.countTokens());
		while(st.hasMoreTokens()) {	// 조각난 문자열을 가지고 있는냐? 있으면 꺼내라 =>>
			String s = st.nextToken();
			System.out.println(s);
		} 
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
