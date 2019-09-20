
public class AbstractClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Animal animal = new Animal("animal"); 
		// �߻� Class ����� instance ������ �ȵȴ�.
		Dog dog = new Dog("�۸���");
		Tiger tiger = new Tiger("ȣ����");
		dog.run();
		tiger.run();
		
	}

}

abstract class Animal{	// �߻� class �� class �տ� abstract �� �ٿ��ش�.
	String name;
	
	public Animal ( String name ) {
		this.name = name;

	}
	
	public void eat() {
		System.out.println(" �� �Դ´�!!!");
	}
	public abstract void run(); // �߻� �޼ҵ�� ; �� ������ �Ѵ�.
	
}
// eat ���������� , run�� ���� ���� �ʾƼ� error�� ���.
// override �� �ؾ� �ȴ�.
class Dog extends Animal {
	public Dog( String name ) {
		super(name);
	}

	@Override	// �̸����̼�
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�� �޸���.");
	}
	
}

class Tiger extends Animal {
	public Tiger ( String name ) {
		super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("���� �ߴ޸���.");
	}
	
}

abstract class Audio {
	String name;
	public Audio( String name ) {
		this.name = name;
	}
	public void powerOn() {
		System.out.println("Audio Power On");
	}
	public void powerOff() {
		System.out.println("Audio Power Off");
	}



	public void volumnControl() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ�� ����ȭ�� ���� ����");
	}
	
	public final void behavior() { // final ���̸� ��� �Ұ�
		powerOn();
		volumnControl();
		powerOff();
	}
	
}
















