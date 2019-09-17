import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_ADDRESS_INFO = 3;
		
		AddressInfo[] addressInfos = new AddressInfo[ MAX_ADDRESS_INFO ]; //Address 타입의 배열을 만든것.(그릇만 만든것)
	
		inputAddressInfo( addressInfos, MAX_ADDRESS_INFO );
		printAddressInfo( addressInfos );
	}
	
	public static void inputAddressInfo( AddressInfo[] addressInfos, final int MAX_ADDRESS_INFO ) {
		Scanner sc = new Scanner( System.in );
		
		String name, tel, email;
		
		for ( int i = 0; i < MAX_ADDRESS_INFO; ++i ) {
			System.out.printf( "[%2d]번째 주소 정보중 이름 입력 : ", i + 1 );
			name = sc.nextLine();
			System.out.printf( "[%2d]번째 주소 정보중 전화번호 입력 : ", i + 1 );
			tel = sc.nextLine();
			System.out.printf( "[%2d]번째 주소 정보중 e-mail 입력 : ", i + 1 );
			email = sc.nextLine();			
			
			addressInfos[ i ] = new AddressInfo( name, tel, email );
			System.out.println();
		}
	}
	
	public static void printAddressInfo( AddressInfo[] addressInfos ) {
		System.out.println();
		for ( AddressInfo addressInfo : addressInfos ) {
			System.out.println( addressInfo );
		}
	}

}
