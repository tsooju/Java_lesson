package test.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TestInetAddress2 {

	public static void main(String[] args) {
		// 키보드로 호스트명을 입력 받아, 
		// 해당 호스트의 ip 주소를 조회해서 출력 처리
		// 반복 실행 => "none" 이 입력되면 반복 종료함
		// 예외처리 
		displayHostIP();
		
	}
	
	public static void displayHostIP() {
		Scanner sc = new Scanner(System.in);
		
		String ipname = null;
		
		while(true) {
			System.out.print("호스트name 입력 : ");
			ipname = sc.next();
			if(!(ipname.equals("none"))) {
				try {
					InetAddress ip = InetAddress.getByName(ipname);
					System.out.println("주소 : " + ip.getHostAddress());
					InetAddress[] ip1 = InetAddress.getAllByName(ipname);
					System.out.println(ip1.length);
					for(InetAddress p : ip1) {
						System.out.println(p.getHostAddress());
					}
					
				} catch (UnknownHostException e) {
					e.printStackTrace();
				}
			}else {
				System.out.println("the end");
				break;
			}
			
			
		}
	}
	
}
