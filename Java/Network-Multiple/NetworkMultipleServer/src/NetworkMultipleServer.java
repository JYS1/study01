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
		Socket connection = null;	//연결 소켓 : client랑 연결하기 위한 소켓
		
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
			
			in = new BufferedReader( new InputStreamReader( connection.getInputStream() ) );	//수신
			out = new PrintWriter( connection.getOutputStream(), true );						//송신
			
			while ( ( message = in.readLine() ) != null ) {
				System.out.println( "Receive message : " + message );

				multiple = Integer.parseInt( message );	// 문자를 숫자로 변환		
				if ( multiple != 0 ) {
					for ( int i = 1; i <= MAX; ++i ) {	// format을 안썻기 떄문에 고정길이 X
						messageSend = String.valueOf( multiple );
						messageSend += " X ";
						messageSend += String.valueOf( i );
						messageSend += " = ";
						messageSend += String.valueOf( multiple * i );
						out.println( messageSend );
					}
					out.println( "quit" );	//다 보냈다고 알려주는 신호.
				}  else {
					out.println( "not multiple number\n" );
				}
				
				System.out.println( "Stop message sending..." );
			}
			
			System.out.println( "closed server..." );	//서버 종료 보통 서버를 종료하지 않는다.
			in.close();
			connection.close();
			server.close();
		} catch ( IOException e ) {}

	}

}
