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
			client = new Socket(); //���� IP�� ��Ʈ�� �𸣱⶧���� ���� ���� �� ����Ѵ�.
			System.out.println( "[ Client IP : " + client.getInetAddress().getLocalHost().getHostAddress()+ " : " + client.getLocalPort() +  " ]" );
			System.out.println( "Attempting to connect to server..." );
			client.connect( new InetSocketAddress( "localhost", 9000 ), 3000 );	//localhost : �ּ� / ���⼭ 3000�� ���� �ð� �õ� �ð� : 3�ʰ� ���� �ȵǸ� ��.
			System.out.println( "Server conneection successful..." );
			
			out = new PrintWriter( client.getOutputStream(), true ); 
			in = new BufferedReader( new InputStreamReader( client.getInputStream() ) );	//BufferedReader �Է� �޴� ���� ������ Scanner ���� ����.
			
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
