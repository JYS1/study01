import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetworkMultipleServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket server = null;
		Socket connection = null;	//���� ���� : client�� �����ϱ� ���� ����
		
		BufferedReader in = null;
		PrintWriter out = null;

		String message;
		String messageSend;
		Integer multiple;
		final int MAX = 9;
		
		try {
			server = new ServerSocket( 9000 );
		} catch ( IOException e ) {}
		
		try {
			System.out.println( "[ Server IP : " + server.getInetAddress().getLocalHost().getHostAddress()+ " : " + 
												   server.getLocalPort() +  " ]" );
		} catch ( UnknownHostException e ) {}
		
		System.out.println( "Pending connection..." );

		try {
			connection = server.accept();
			System.out.println( "[ Client connection : " + connection.getInetAddress().getHostAddress() + " : "	+
					   connection.getPort() +  " ]" );
			System.out.println( "Waiting for message..." );
			
			in = new BufferedReader( new InputStreamReader( connection.getInputStream() ) );	//����
			out = new PrintWriter( connection.getOutputStream(), true );						//�۽�
			
			while ( ( message = in.readLine() ) != null ) {
				System.out.println( "Receive message : " + message );

				multiple = Integer.parseInt( message );	// ���ڸ� ���ڷ� ��ȯ		
				if ( multiple != 0 ) {
					for ( int i = 1; i <= MAX; ++i ) {	// format�� �ț��� ������ �������� X
						messageSend = String.valueOf( multiple );
						messageSend += " X ";
						messageSend += String.valueOf( i );
						messageSend += " = ";
						messageSend += String.valueOf( multiple * i );
						out.println( messageSend );
					}
					out.println( "quit" );	//�� ���´ٰ� �˷��ִ� ��ȣ.
				}  else {
					out.println( "not multiple number\n" );
				}
				
				System.out.println( "Stop message sending..." );
			}
			
			System.out.println( "closed server..." );	//���� ���� ���� ������ �������� �ʴ´�.
			in.close();
			connection.close();
			server.close();
		} catch ( IOException e ) {}

	}

}
