package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {
	//Receiver ������ Sender ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DatagramSocket dsoc = new DatagramSocket( 9000 );
			byte[] data = new byte[ 66536 ];
			DatagramPacket dp = new DatagramPacket( data, data.length);
			System.out.println("������ ���� �غ� �Ϸ�....");
			while(true) {
				dsoc.receive(dp);	// ��ٸ�����...
				System.out.println(" �۽� IP : " + dp.getAddress());
				String msg = new String(dp.getData(), "UTF-8");
				System.out.println("���� �� ���� : " + msg);
			}
		} catch ( Exception e ) {
			System.out.println(e.getMessage());
		}
	}

}
