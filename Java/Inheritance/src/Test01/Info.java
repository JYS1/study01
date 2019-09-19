package Test01;

public class Info extends Student{
	public static int COMMON_COUNT = 3;
	
	public Info( String name, String subject, int number) {
		this.name = name;
		this.subject = subject;
		this.number = number;
	}
	
	public static int getCOMMON_COUNT() {
		return COMMON_COUNT;
	}
	public String getSubject() {
		return subject;
	}
}
