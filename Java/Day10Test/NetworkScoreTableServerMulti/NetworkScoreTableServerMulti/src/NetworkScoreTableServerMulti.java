import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkScoreTableServerMulti {
	private static boolean cont = true;
	private Integer port;
	private ServerSocket serverSocket;
	
	private ScoreTable scoreTable;
	
	public NetworkScoreTableServerMulti( Integer port ) {
		this.port = port;	
		this.scoreTable = new ScoreTable();
		
		this.createServerSocket();
	}
	
	private void createServerSocket() {
		try {
			serverSocket = new ServerSocket( this.port );
			System.out.println( "[ Server IP : " + serverSocket.getInetAddress().getLocalHost().getHostAddress()+ " : " + 
					   serverSocket.getLocalPort() +  " ]" );
			System.out.println( "Create server socket..." );
		} catch ( IOException e ) {
			e.printStackTrace();
		}
	}
	
	public void loopServer() {
		try { 
			while ( cont ) {
				System.out.println( "Pending connection..." );
				new ClientThread( serverSocket.accept() );
			}
			serverSocket.close();
		} catch ( IOException e ) {
			e.printStackTrace();
		}
	}
	
	class ClientThread extends Thread {
		private Socket clientSocket;
		private BufferedReader in;
		private PrintWriter out;
		
		public ClientThread() {}
		
		public ClientThread( Socket clientSocket ) {
			this.clientSocket = clientSocket;
			start();
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
			System.out.println( "[ Client connection : " + clientSocket.getInetAddress().getHostAddress() + " : "	+
					   clientSocket.getPort() + " ] - Data send successful..." );
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			String message;
			String[] msgReceive;
			String msgSend;
			
			try {
				System.out.println( "[ Client connection : " + clientSocket.getInetAddress().getHostAddress() + " : "	+
						   clientSocket.getPort() +  " ]" );
				System.out.println( "[ Client connection : " + clientSocket.getInetAddress().getHostAddress() + " : "	+
						   clientSocket.getPort() + " ] - Waiting for message..." );
				
				in = new BufferedReader( new InputStreamReader( clientSocket.getInputStream() ) );
				out = new PrintWriter( clientSocket.getOutputStream(), true );
				
				while ( ( message = in.readLine() ) != null ) {
					System.out.println( "[ " + clientSocket.getInetAddress().getHostAddress() + " : "	+
							   clientSocket.getPort() +  " ] - " + "Receive message : " + message );
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
			} catch ( IOException e ) {}
			
			try {
				in.close();
				out.close();
				clientSocket.close();
			} catch ( IOException e ) {}
		}	
	}	
}

