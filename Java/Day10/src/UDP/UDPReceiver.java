package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {
	//Receiver 실행후 Sender 실행
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DatagramSocket dsoc = new DatagramSocket( 9000 );
			byte[] data = new byte[ 66536 ];
			DatagramPacket dp = new DatagramPacket( data, data.length);
			System.out.println("데이터 수신 준비 완료....");
			while(true) {
				dsoc.receive(dp);	// 기다리는중...
				System.out.println(" 송신 IP : " + dp.getAddress());
				String msg = new String(dp.getData(), "UTF-8");
				System.out.println("보내 온 내용 : " + msg);
			}
		} catch ( Exception e ) {
			System.out.println(e.getMessage());
		}
	}

}
