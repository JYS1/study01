package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPServer {
	// TCP 랑 틀린점 : 소켓 이름이 틀림 / 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress ip = InetAddress.getByName("127.0.0.1");	
			DatagramSocket socket = new DatagramSocket();	
			String msg = "send message : Hi~~~";
			byte[] buf = msg.getBytes();
			int port = 9000;
			DatagramPacket p = new DatagramPacket( buf, buf.length, ip, port);	// 비연결 지향이라 IP랑 PORT가 결정 되어야 한다.
			socket.send(p);
		} catch ( UnknownHostException e ) {
			e.printStackTrace();
		} catch ( SocketException e ) {
			e.printStackTrace();
		} catch ( IOException e ) {
			e.printStackTrace();
		}
	}

}
