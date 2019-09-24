package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPClient {
	// UDP는 클라이언트 먼저 실행후 서버 실행
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int port = 9000;
			DatagramSocket socket = new DatagramSocket( port );
			byte[] msg = new byte[512];
			DatagramPacket p = new DatagramPacket( msg, msg.length);	//서버에 데이터를 보내는중..
			System.out.println("수신 대기중 ....");
			socket.receive(p);
			System.out.println("수신 완료");
			System.out.println("수신 내용 : " + new String(msg));
		} catch (SocketException e ) {
			e.printStackTrace();
		} catch ( IOException e ) {
			e.printStackTrace();
		}
	}

}
