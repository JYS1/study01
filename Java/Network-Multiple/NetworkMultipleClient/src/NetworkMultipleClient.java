import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class NetworkMultipleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in );
		
		Socket client = null;
		BufferedReader in = null;
		PrintWriter out = null;
		
		String message;
		String messageReceive;
		
		
		try {
			client = new Socket(); //서버 IP랑 포트를 모르기때문에 새로 생성 해 줘야한다.
			System.out.println( "[ Client IP : " + client.getInetAddress().getLocalHost().getHostAddress()+ " : " + client.getLocalPort() +  " ]" );
			System.out.println( "Attempting to connect to server..." );
			client.connect( new InetSocketAddress( "localhost", 9000 ), 3000 );	//localhost : 주소 / 여기서 3000은 연결 시간 시도 시간 : 3초간 연결 안되면 끝.
			System.out.println( "Server conneection successful..." );
			
			out = new PrintWriter( client.getOutputStream(), true ); 
			in = new BufferedReader( new InputStreamReader( client.getInputStream() ) );	//BufferedReader 입력 받는 양이 많을때 Scanner 보다 좋다.
			
			System.out.print( "Input multiple number (quit : 0) : " );
			while ( ( message = sc.next() ) != null ) {
				if ( message.equals( "0" ) ) {
					break;
				}
				out.println( message );
				
				while ( !( messageReceive = in.readLine() ).equals( "quit" ) ) {
					System.out.println( messageReceive );
				}
				
				System.out.print( "\nInput multiple number (quit : 0) : " );
			}
			
			System.out.println( "closed server..." );
			
			out.close();
			sc.close();
			client.close();
		} catch ( IOException e ) {}

	}

}
