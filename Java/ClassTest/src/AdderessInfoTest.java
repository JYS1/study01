
public class AdderessInfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressInfo addressInfo = new AddressInfo("Lee", "010-22468-1357", "Lee@korea.com");
		// �� �μ��� �ִ� �Ϲ� ������
		// AddressInfo addressInfo2 = new AddressInfo(); default������ : �����ڰ� �ƿ� �������� default������ �� ������.
		AddressInfo addressInfo2 = new AddressInfo();
		AddressInfo addressInfo3 = new AddressInfo("KIM");
		
		
		System.out.println( addressInfo );
		System.out.println( addressInfo2 );
		System.out.println( addressInfo3 );
		
		AddressInfo[] addressBook = new AddressInfo[ 10 ];
		
		addressBook[0] = new AddressInfo("Hong", "010-1234-5678", "Hong@korea");
		addressBook[1] = new AddressInfo("Kim", "010-2345-4523", "Kim@korea");
		addressBook[2] = new AddressInfo("Park", "010-5678-2314", "Park@korea");
		
		for(int i = 0 ; i < 3; i++) {
			System.out.println(addressBook[i]);
		}
		
		
		/*
		System.out.println( addressInfo ); // ����ϸ� @ �ڿ� �����°� reference
		System.out.println("name : " + addressInfo.getName());
		System.out.println("Tel : " + addressInfo.getTel());
		System.out.println("e-mail : " + addressInfo.getEmail());
		
		addressInfo.setName("Hong");
		addressInfo.setTel("010-1234-5678");
		addressInfo.setEmail("Hong@korea.com");
		
		System.out.println("name : " + addressInfo.getName());
		System.out.println("Tel : " + addressInfo.getTel());
		System.out.println("e-mail : " + addressInfo.getEmail());
		
		addressInfo.writeAddress("Kim", "010-3456-9789", "Kim@korea.com");
		addressInfo.searchAddress("Kim");
		*/
	}

}
