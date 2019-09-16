// getter 는 넣되 setter는 가능한한 넣지말자.
public class AddressInfo {
	private String name; // private : 접근제어, public : 접근가능 , 인수 Name이다.
	private String tel;
	private String email;
	//▼ Method Overloading : 중복 정의 -> polymorphism(다형성)
	public AddressInfo() {
		//this.name = "";
		//this.tel = "";
		//this.email = "";
		this("","","");
	}
	
	public AddressInfo( String name ) {
		this(name,"","");
	}
	public AddressInfo( String name, String tel, String email) { // 생성자는 return 값이 없다. / 생성자는 public만쓴다.
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	
	public String toString() {
		String str;
		
		str = name;
		str += "   " + tel;
		str += "   " + email;
		
		return str;
	}
	
	
	
	public void setName( String name ) {		// setter, set 연산
		this.name = name; // this 는 객체가 가지고 있는 (자신이 가지고 있는) = Field Name이다.
	}
	public String getName() {				// getter, get 연산
		return name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void writeAddress( String name, String tel, String email ) {
		System.out.println( this + " writeAddress()");
	}
	public void searchAddress( String name ) {
		System.out.println( this + " seachAddress()");
	}
}
