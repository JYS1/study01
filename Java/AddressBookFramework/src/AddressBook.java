import java.util.*;
// 1���� Class �� 1���� ���ุ �ִ°� ����. Why:���� ������ ���ϴ�. + �ٸ������ �����ϱ⵵ ���ϴ�.
public class AddressBook {
	private int countAddressInfo;
	
	public List<AddressInfo> addressbook;	// AddressBook �� AddressInfo���� ���� ������.
	
	public AddressBook() {
		addressbook = new ArrayList<>();	// List �� ��ӹ޾� ArrayList �ٽ� ����
	}
	
	public void appendAddressInfo( AddressInfo addressInfo ) {	//����� 2���� AddressInfo�� ������ �ƴϸ� ���� ��ü�� ������
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






