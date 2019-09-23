package Test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket server = null;
		Socket connection = null;
		
		BufferedReader in = null;
		PrintWriter out = null;
		
		String message;
		String name;
		int[] score;
		double average;
		int rank;
		String garde;
		
		try {
			server = new ServerSocket(9000);
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
			
			while (( message = in.readLine()) !=null ) {
				System.out.println(message + "번을 선택 하였습니다.");
				
			}
		}catch ( IOException e ) {}
	}

}
