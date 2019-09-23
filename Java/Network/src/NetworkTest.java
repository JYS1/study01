import java.net.*;
import java.util.Scanner;

public class NetworkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		InetAddress addr1 = null, addr2 = null;
		String url = null;
		
		System.out.println("Input host name : ");
		url = sc.nextLine();
		try {
			addr1 = InetAddress.getByName(url);	// 입력한 해당 사이트 IP주소
			addr2 = InetAddress.getLocalHost();	// 
		} catch (UnknownHostException e ) {}
			System.out.print("\n" + url + " IP Address : ");
			System.out.println( addr1.getHostAddress());
			System.out.print("Local IP Address : ");
			System.out.println( addr2.getHostAddress());
	}

}
