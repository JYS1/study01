
public class AbstractClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Animal animal = new Animal("animal"); 
		// 추상 Class 만들시 instance 생성이 안된다.
		Dog dog = new Dog("멍멍이");
		Tiger tiger = new Tiger("호돌이");
		dog.run();
		tiger.run();
		
	}

}

abstract class Animal{	// 추상 class 는 class 앞에 abstract 를 붙여준다.
	String name;
	
	public Animal ( String name ) {
		this.name = name;

	}
	
	public void eat() {
		System.out.println(" 잘 먹는다!!!");
	}
	public abstract void run(); // 추상 메소드는 ; 로 끝나야 한다.
	
}
// eat 정의했지만 , run은 정의 하지 않아서 error가 뜬다.
// override 를 해야 된다.
class Dog extends Animal {
	public Dog( String name ) {
		super(name);
	}

	@Override	// 이모테이션
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("잘 달린다.");
	}
	
}

class Tiger extends Animal {
	public Tiger ( String name ) {
		super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("정말 잘달린다.");
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
		System.out.println("영화에 최적화된 볼륨 조절");
	}
	
	public final void behavior() { // final 붙이면 상속 불가
		powerOn();
		volumnControl();
		powerOff();
	}
	
}
















