
public class AddressInfo {
	private static int count = 0;	
	static { 						// static block 여러개가 필요할시 사용한다.
		count = 0;
	}
	private int no; 				//되도록 1줄에 1개 정의하는게 좋다.
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
	//▲처럼 생성자가 여러개 가능 but 여러개 할시 리스크가 커진다.
	
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
