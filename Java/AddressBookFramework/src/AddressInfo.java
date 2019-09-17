
public class AddressInfo {
	private static int count = 0;	
	static { 						// static block �������� �ʿ��ҽ� ����Ѵ�.
		count = 0;
	}
	private int no; 				//�ǵ��� 1�ٿ� 1�� �����ϴ°� ����.
	private String name;
	private String tel;
	private String email;
	

	private static int countingNo() {
		++count;
		return count;
	}
	
	public AddressInfo( String name, String tel, String email ) {
		this.no  = AddressInfo.countingNo();
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	public AddressInfo(String name, String tel) {
		this(name, tel, "");
	}
	//��ó�� �����ڰ� ������ ���� but ������ �ҽ� ����ũ�� Ŀ����.
	
	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String getEmail() {
		return email;
	}
	public int getNo() {
		return no;
	}

}
