
public class Animal {
	protected String name; // protected : ��� ���迡 �ִ� class�� ���� ���� �ϰڴ�.
	
	public Animal() {
		this.name = "����";
		System.out.println("Animal instance ����");
	}
	public Animal( String name ) {
		this.name = name;
		System.out.println("Animal instance ����");
	}
	
	public void eat() {
		System.out.println("Animal [ " + name + " ] �� �Դ�.");
	}
	
	public void run() {
		System.out.println("Animal [ " + name + " ] �� �޸���.");
	}
}
