// getter �� �ֵ� setter�� �������� ��������.
public class AddressInfo {
	private String name; // private : ��������, public : ���ٰ��� , �μ� Name�̴�.
	private String tel;
	private String email;
	//�� Method Overloading : �ߺ� ���� -> polymorphism(������)
	public AddressInfo() {
		//this.name = "";
		//this.tel = "";
		//this.email = "";
		this("","","");
	}
	
	public AddressInfo( String name ) {
		this(name,"","");
	}
	public AddressInfo( String name, String tel, String email) { // �����ڴ� return ���� ����. / �����ڴ� public������.
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
	
	
	
	public void setName( String name ) {		// setter, set ����
		this.name = name; // this �� ��ü�� ������ �ִ� (�ڽ��� ������ �ִ�) = Field Name�̴�.
	}
	public String getName() {				// getter, get ����
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
