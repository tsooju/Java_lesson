package test.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

	public static void main(String[] args) {
		// java.net.InetAddress class test
		// ip 주소 : 컴퓨터마다 부여된 네트워크상에서의 식별번호
		
		// 내 컴퓨터(localhost)의 ip 주소 조회
		InetAddress ip1;
		try {
			ip1 = InetAddress.getLocalHost();
			System.out.println("MyPC ip address : " + ip1.getHostAddress());
			System.out.println("MyPC name : " + ip1.getHostName());
		
		// host 이름(도메인명도 대항됨)을 가지고 ip주소 조회
//			InetAddress naverIP = InetAddress.getByName("www.naver.com");
//			System.out.println("naver : "+naverIP.getHostAddress());
//			InetAddress[] googleIP = InetAddress.getAllByName("www.google.com");
//			
//			System.out.println("google  서버 IP 갯수 : " + googleIP.length);
//			for(InetAddress ip : googleIP) {
//				System.out.println(ip.getHostAddress());
//			}
//			
//			// naver 서버의 ip 주소를 전부 조회 한다면 : 
//			InetAddress[] naverIP2 = InetAddress.getAllByName("www.naver.com");
//			System.out.println("naver IP 갯수 : " + naverIP2.length);
//			for(InetAddress ip : naverIP2) {
//				System.out.println(ip.getHostAddress());
//			}
		
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		

	}

} // class end
