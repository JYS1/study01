import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkScoreTableServer {
	private static boolean cont = true;
	private Integer port;
	private ServerSocket serverSocket;
	private Socket clientSocket;
	
	private ScoreTable scoreTable;
	
	private BufferedReader in;
	private PrintWriter out;
	
	private String message;
	private String[] msgReceive;
	private String msgSend;
	
	public NetworkScoreTableServer( Integer port ) {
		this.port = port;	
		this.scoreTable = new ScoreTable();
		this.msgReceive = new String[ 10 ];
		
		this.createServerSocket();
	}
	
	private void createServerSocket() {
		try {
			serverSocket = new ServerSocket( this.port );
			System.out.println( "[ Server IP : " + serverSocket.getInetAddress().getLocalHost().getHostAddress()+ " : " + 
					   serverSocket.getLocalPort() +  " ]" );
			System.out.println( "Create server socket..." );
			System.out.println( "Pending connection..." );
		} catch ( IOException e ) {
			e.printStackTrace();
		}
	}
	
	public void loopServer() {
		while ( cont ) {
			try {
				clientSocket = serverSocket.accept();
				System.out.println( "[ Client connection : " + clientSocket.getInetAddress().getHostAddress() + " : "	+
						   clientSocket.getPort() +  " ]" );
				System.out.println( "Waiting for message..." );
				
				in = new BufferedReader( new InputStreamReader( clientSocket.getInputStream() ) );
				out = new PrintWriter( clientSocket.getOutputStream(), true );
				
				while ( ( message = in.readLine() ) != null ) {
					System.out.println( "Receive message : " + message );
					msgReceive = message.split( "/" );
					
					if ( msgReceive[ 0 ].equals( "1" ) ) {
						writeScore( msgReceive );
					} else if ( msgReceive[ 0 ].equals( "2" ) ) {
						readScoreTable();
					}
				}
				System.out.println( "[ disconnection client : " 
					+ clientSocket.getInetAddress().getHostAddress() 
					+ " : "	+ clientSocket.getPort() +  " ]" );
				in.close();
				clientSocket.close();
			} catch ( IOException e ) {
				e.printStackTrace();
			}
			try {
				in.close();
				out.close();
				clientSocket.close();
				System.out.println( "Pending connection..." );
			} catch ( IOException e ) {
				e.printStackTrace();
			}
		}
	}
	
	private void writeScore( String[] receive_data ) {
		final int MAX_MESSAGE = 5;
		String message;
		
		String name;
		int[] subjects = new int[Student.MAX_SUBJECT];
		int i = 1, j = 0;
		
		name = receive_data[i];
		for ( i = 2; i < MAX_MESSAGE; ++i ) {
			subjects[j++] = Integer.parseInt( receive_data[i] );
		}
		
		scoreTable.appendStudentInfo( name, subjects );
	}
	
	private void readScoreTable() {
		for ( Student student : scoreTable.getStudents() ) {
			out.println( student );
		}			
		out.println( "quit" );
		System.out.println( "Data send successful..." );
	}
	
}
