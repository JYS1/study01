
public class ThreadTest2 {
	public static Value value = new Value();	// 자원 공유
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread th1 = new Thread /*여기서부터*/( new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				++value.number;
				try {
					Thread.sleep( 500 );
				} catch ( Exception e ) {}
				System.out.println( value.number );
			}
			
		});						/*여기까지 임시 inner(class interface)*/
		Thread th2 = new Thread ( new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				++value.number;
				try {
					Thread.sleep( 1000 );
				} catch ( Exception e ) {}
				System.out.println( value.number );
			}
			
		});
		
		th1.start();
		th2.start();
		
	}

}

class Value {
	public int number = 0;
}













