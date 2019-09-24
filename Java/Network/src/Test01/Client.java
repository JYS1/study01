package Test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Socket client = null;
		BufferedReader in = null;
		PrintWriter out = null;
		
		String message;
		String messageReceive;
		String name;
		String score1;
		String score2;
		String score3;
		
		final int MAX_SUBJECT = 3;
		
		try {
			client = new Socket(); 
			System.out.println( "[ Client IP : " + client.getInetAddress().getLocalHost().getHostAddress()+ " : " + client.getLocalPort() +  " ]" );
			System.out.println( "Attempting to connect to server..." );
			client.connect( new InetSocketAddress( "localhost", 9000 ), 3000 );	
			System.out.println( "Server conneection successful..." );
			
			out = new PrintWriter( client.getOutputStream(), true ); 
			in = new BufferedReader( new InputStreamReader( client.getInputStream() ) );
			
			
			System.out.print("1. �л� ���� ���� ���\n2.���� �϶�ǥ ���\n0.����\n");
			while ((message = sc.next()) != null ) {
				if(message.equals("0")) {
					break;
				} else if(message.equals("1")) {
						System.out.println("�̸��� �Է� �ϼ��� : ");
						name = sc.next();
						System.out.println("1 ��° ������ �Է��� �ּ���.");
						score1 = sc.next();
						System.out.println("2 ��° ������ �Է��� �ּ���.");
						score2 = sc.next();
						System.out.println("3 ��° ������ �Է��� �ּ���.");
						score3 = sc.next();
				}else if(message.equals("2")) {
					
				}
				out.println(message);
			}
		}catch ( IOException e ) {}
	}

}
