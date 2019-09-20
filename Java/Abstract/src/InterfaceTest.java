
public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV2 tv2 = new TV2();
		Car car = new Car();
		
		tv2.powerOn();
		tv2.volumnUp();
		car.powerOn();
		car.volumnDown();
		
		IAudio[] objs = new IAudio[2];
		objs[ 0 ] = tv2;
		objs[ 1 ] = car;
		
		for( IAudio obj : objs ) {
			obj.powerOff();
		}
		
	}

}

interface IAudio {
	final int MAX_VOLUMN = 10; // 일반 상수는 가능.
	void powerOn();
	void powerOff();
	void volumnUp();
	void volumnDown();
}


class TV2 implements IAudio {
	public TV2() {
		System.out.println("TV 생성");
	}

	@Override
	public void powerOn() {
		System.out.println("TV Audio On");
	}
	@Override
	public void powerOff() {
		System.out.println("TV Audio Off");
	}
	@Override
	public void volumnUp() {
		System.out.println("TV Volumn UP");
	}
	@Override
	public void volumnDown() {
		System.out.println("TV Volumn DOWN");
	}
	
}

class Car implements IAudio {
	public Car( ) {
		System.out.println("Car 생성");
	}

	@Override
	public void powerOn() {
		System.out.println("Car Audio Power On");
	}

	@Override
	public void powerOff() {
		System.out.println("Car Audio Power Off");
	}

	@Override
	public void volumnUp() {
		System.out.println("Car Audio Volumn UP");
	}

	@Override
	public void volumnDown() {
		System.out.println("Car Audio Volumn DOWN");
	}
	
	
}







