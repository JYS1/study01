package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;


public class UDPSender {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner ( System.in );
		System.out.print("���� �޼��� �Է� : ");
		String msg = sc.nextLine();
		try {
			DatagramSocket dsoc = new DatagramSocket();
			InetAddress ia = InetAddress.getByName("127.0.0.1");
			DatagramPacket dp = new DatagramPacket (msg.getBytes(),
													msg.getBytes().length, ia, 9000);
			dsoc.send(dp);
			dsoc.close();
		} catch ( Exception e ) {
			 System.out.println(e.getMessage());
		}
	}

}
