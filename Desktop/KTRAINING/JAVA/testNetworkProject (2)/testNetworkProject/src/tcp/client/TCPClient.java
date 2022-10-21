package tcp.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public TCPClient() {

	}

	public void start() {
		Scanner sc = new Scanner(System.in);

		try {
			// 1. 연결할 서버의 ip 주소와 포트번호 필요
			int port = 5012;
			// String serverIP = InetAddress.getLocalHost().getHostAddress();

			String serverIP = "192.168.0.38"; // ==>> 다른 컴퓨터의 IP주소를 연결할 경우

			// 2. 소켓 객체 생성 : 생성과 동시에 서버에 연결 요청됨
			// 연결이 실패하면 null 이 리턴됨.
			Socket socket = new Socket(serverIP, port);
			if (socket != null) { // 서버와 연결되었다면....
				// 3. 서버와 클라이언트 간의 입출력 스트림을 생성한다.
				// 추가로 보조스트림을 사용할 수도 있다.
				// 문자 스트림으로 바꿀 수도 있음.
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				PrintWriter pw = new PrintWriter(
						socket.getOutputStream());
				
				//4. 데이터 주고 받기 : 순서가 중요함. 
				System.out.print("서버로 보낼 메세지 : ");
				String message = sc.nextLine();
				pw.println(message);
				pw.flush();	//서버가 보내면 클라이언트가 다시 받는다. 
				
				String response = br.readLine();
				System.out.println("서버가 보낸 답 : " + response);
				
				br.close();
				pw.close();
				socket.close(); 
				
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
