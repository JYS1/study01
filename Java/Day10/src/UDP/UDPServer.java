package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPServer {
	// TCP �� Ʋ���� : ���� �̸��� Ʋ�� / 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress ip = InetAddress.getByName("127.0.0.1");	
			DatagramSocket socket = new DatagramSocket();	
			String msg = "send message : Hi~~~";
			byte[] buf = msg.getBytes();
			int port = 9000;
			DatagramPacket p = new DatagramPacket( buf, buf.length, ip, port);	// �񿬰� �����̶� IP�� PORT�� ���� �Ǿ�� �Ѵ�.
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
