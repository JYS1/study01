import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5002);
			System.out.println("[ " +InetAddress.getLocalHost().getHostAddress() + "Ready server...]");
		} catch (IOException e ) {e.printStackTrace();}
		while(true) {
			try {
				System.out.println("[ client 연결 요청 대기... ]");
				Socket socket = serverSocket.accept();
				System.out.println("[ " + socket.getInetAddress()+ " connection ]");
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream( out );
				dos.writeUTF("Hi... [" + socket.getInetAddress() +" ] ");
				System.out.println("[ 메세지 전송 완료  ]");
				dos.close();
				socket.close();
			} catch (IOException e ) {e.printStackTrace();}
			
		}
	}

}
