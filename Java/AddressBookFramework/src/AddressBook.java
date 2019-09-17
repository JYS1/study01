import java.util.*;
// 1개의 Class 에 1개의 실행만 넣는게 좋다. Why:유지 보수가 편하다. + 다른사람이 수정하기도 편하다.
public class AddressBook {
	private int countAddressInfo;
	
	public List<AddressInfo> addressbook;	// AddressBook 과 AddressInfo간의 관계 떄문에.
	
	public AddressBook() {
		addressbook = new ArrayList<>();	// List 를 상속받아 ArrayList 다시 정의
	}
	
	public void appendAddressInfo( AddressInfo addressInfo ) {	//방법은 2가지 AddressInfo로 받을지 아니면 각자 객체를 받을지
		addressbook.add(addressInfo);
		++countAddressInfo;
	}
	
	public void removeAddressInfo(String name, String tel) {
		int index = searchAddressInfo(name, tel);
		if (index > -1) {
			addressbook.remove(index);
			--countAddressInfo;
		}
	}
	
	public int searchAddressInfo(String name, String tel) {
		int index = -1;
		AddressInfo addressInfo ;
		for (int i = 0; i < addressbook.size(); ++i ) {
			addressInfo = addressbook.get(i);
			if (addressInfo.getName().equals( name ) &&
				addressInfo.getTel().equals( tel )) {
				index = i;
				AddressInfo s = addressbook.get(i);
				System.out.println(s);
				break;
				
			}
		}
		
		
		
		
		return index;
	}
	
	private Object addressBook(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public String toString() {
		StringBuffer str = new StringBuffer();;
		
		for( AddressInfo value : addressbook) {
			str.append(String.format("%5d ", value.getNo() ) );
			str.append(String.format("%-10s " , value.getName() ) );
			str.append(String.format("%13s ", value.getTel() ) );
			str.append(String.format("%-30s\n", value.getEmail() ) );
		}
		return str.toString();
	}
}






