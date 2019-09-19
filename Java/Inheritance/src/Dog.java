
public class Dog extends Animal { // Animal 에서 상속 받음
	//private String name;
	private int age;
	
	public Dog() {
		super(); // 상속 할때 쓰는 용어.
		System.out.println("Dog instance 생성");
	}
	
	public Dog( String name, int age ) {
		super(name);
		this.age = age;
		System.out.println( "Dog [ " + name +  " : " + age  + "살 ] instance 생성");
	}
	
	public void playDog() {
		System.out.println( "Play Dog.....");
	}

	public void eat() {
		super.eat(); 
		System.out.println( "Dog [ " + name +  " ] 가 먹다...");
	}
	
	public void run() {
		System.out.println( "Dog [ " + name + " ] 가 달린다...");
	}
	
	

}
