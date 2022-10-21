package tcp.server;

public class RunTCPServer {

	public static void main(String[] args) {
		// TCPServer start
		new TCPServer().start();
		System.out.println("서버가 종료되었습니다.");

	}

}
