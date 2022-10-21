package udp.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPServer {
	public UDPServer() {}
	
	public void sendMessage() {
		//1. 포트번호 지정 (1024번 이후 정수값 임의대로 사용)
		int port = 6000;
		
		try {
			//2. 데이터그매소켓 객체 생성
			DatagramSocket udpServer = new DatagramSocket();
			
			//3. 데이터를 받을 클라이언트 ip 주소 지정
			//localhost  인 경우 : 192.168.0.57,   192.168.0.8
	
				InetAddress client = InetAddress.getByName("127.0.0.1");
				
				//4. 전송할 메세지 준비 : byte[]로 준비 해야 한다. 
				String message = "스팸성 광고 메세지!";
				byte[] msg = message.getBytes();	// byte 배열로 저장하는 작업
				
				// 5. 전송 메세지 담을 데이터그램패킷 객체 생성함. 
				DatagramPacket packet = new DatagramPacket(msg, 0, msg.length, client, port);
				
				//6. packet 전송함
				udpServer.send(packet);
				System.out.println("메세지 전송 완료.");
				
				//7. 소켓 닫기
				udpServer.close();
				
			} catch (SocketException e) {
					e.printStackTrace(); 	
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
	}
	
	public static void main(String[] args) {
		new UDPServer().sendMessage();
		
	}

}
