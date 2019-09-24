import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class NetworkScoreTableClient {
	private Socket client;
	private String serverIP;
	private int serverPort;
	
	private BufferedReader in;
	private PrintWriter out;
	
	public NetworkScoreTableClient( String serverIP, int serverPort ) {
		this.serverIP = serverIP;
		this.serverPort = serverPort;
		
		try {
			client = new Socket();
			System.out.println( "[ Client IP : " 
					+ client.getInetAddress().getLocalHost().getHostAddress()
					+ " : " + client.getLocalPort() +  " ]" );
			System.out.println( "Attempting to connect to server..." );
			client.connect( new InetSocketAddress( serverIP, serverPort ), 3000 );
			System.out.println( "Server connection successful...\n" );
			
			in = new BufferedReader( new InputStreamReader( client.getInputStream() ) );
			out = new PrintWriter( client.getOutputStream(), true );
		} catch ( IOException e ) {
			e.printStackTrace();
		}
	}
	
	public void disconnect() {
		try {
			in.close();
			out.close();
			client.close();
		} catch ( IOException e ) {}
	}
	
	public void send( StringBuffer message ) {
		out.println( message );			
	}
	
	public List<String> receive() {
		String message = null;
		List<String> retValue = new ArrayList<>(); 
		
		try {
			while ( !( message = in.readLine() ).equals( "quit" ) ) {
				retValue.add( message );
			}
		} catch ( IOException e ) {}
		
		return retValue;
	}
}
