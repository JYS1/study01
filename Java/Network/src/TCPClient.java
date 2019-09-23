import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.channels.ConnectionPendingException;

public class TCPClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String serverIP = "127.0.0.1";
			System.out.println(" ready connection server : " + serverIP);
			Socket socket = new Socket( serverIP,5002);
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream( in );
			System.out.println("receive message : " + dis.readUTF());
			System.out.println("close connection");
			dis.close();
			socket.close();
		} catch (ConnectionPendingException ce) { ce.printStackTrace();
		} catch (IOException ie) {ie.printStackTrace();
		} catch (Exception e ) {e.printStackTrace(); }
	}
}

