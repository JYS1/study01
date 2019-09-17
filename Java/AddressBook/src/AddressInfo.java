
public class AddressInfo {
	private String name;
	private String tel;
	private String email;
	
	public AddressInfo( String name, String tel, String email ) {
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

	public String toString() {
		return String.format( "%-10s %13s %-30s", name, tel, email );
	}
}
