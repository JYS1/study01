
public class ThreadTest2 {
	public static Value value = new Value();	// �ڿ� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread th1 = new Thread /*���⼭����*/( new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				++value.number;
				try {
					Thread.sleep( 500 );
				} catch ( Exception e ) {}
				System.out.println( value.number );
			}
			
		});						/*������� �ӽ� inner(class interface)*/
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













