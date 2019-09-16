
public class AdderessInfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressInfo addressInfo = new AddressInfo("Lee", "010-22468-1357", "Lee@korea.com");
		// ▲ 인수가 있는 일반 생성자
		// AddressInfo addressInfo2 = new AddressInfo(); default생성자 : 생성자가 아에 없을떄만 default생성자 가 생성됨.
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
		System.out.println( addressInfo ); // 출력하면 @ 뒤에 나오는게 reference
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
