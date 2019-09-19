
public class Animal {
	protected String name; // protected : 상소 관계에 있는 class에 직접 관여 하겠다.
	
	public Animal() {
		this.name = "동물";
		System.out.println("Animal instance 생성");
	}
	public Animal( String name ) {
		this.name = name;
		System.out.println("Animal instance 생성");
	}
	
	public void eat() {
		System.out.println("Animal [ " + name + " ] 이 먹다.");
	}
	
	public void run() {
		System.out.println("Animal [ " + name + " ] 이 달린다.");
	}
}
