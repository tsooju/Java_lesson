package test.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;

public class TestURL2 {

	public static void main(String[] args) {
		// TestURL 실습
		usingURLtoInetAddress();

	}

	private static void usingURLtoInetAddress() {
		//키보드로  URL 입력 복사 받아 
		// 프로토콜, 포트번호, 호스트번호, 파일경로, 쿼리스트링 분리 출력
		//Ip주소 조회 출력 처리
		//  url은 한줄로 입력받고, 입력값에 공백을 없애고 처리함.
		// none 입력 되면 종료
		//키보드 입력을 BufferedReader 와 System.in 은 이용하기
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		
			
			String str = null;
			String str2 = null;
			try {
				while(true) {
					System.out.print("URL 입력 : ");
					str = bf.readLine();

				InetAddress ip = InetAddress.getByName(str);
				
				if(!(str.equals("none")) || !(str2.equals("none"))) {
					URL url = new URL(str);
					System.out.println("호스트명 : " + url.getHost());
					System.out.println("파일경로 : " + url.getFile());
					System.out.println("프로토콜 : " + url.getProtocol());
					System.out.println("포트번호 : " + url.getPort());
					System.out.println("전체경로 : " + url.toExternalForm());
					System.out.println("url 전체 : " + url.toExternalForm());
					System.out.println("쿼리스트링 : " + url.getQuery());
					
					System.out.println("================");
					System.out.println("ip 주소 : " + ip.getHostName());

				}else {
					System.out.println("the end");
					break;
				}}
			}catch (MalformedURLException e) {
				e.printStackTrace();
			} 
			catch(IOException e) {
				e.printStackTrace();
			}
			
				
		
		
		
		
	}

}
