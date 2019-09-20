
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myth = new MyThread();
		Thread myth2 = new Thread( new MyThread2() );
		
		myth.setDaemon(true);
		myth.setDaemon(true);
		myth.start();	//thread ���� ���.
		myth2.start();
		
	    try {
			myth.join();
			myth2.join();
		} catch( Exception e ) {}
		
		for ( int i = 1; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			//try {
			//	Thread.sleep( 1000 ); // �ݵ�� try �� �ȿ� �־���Ѵ�. 1000 = 1��
			//} catch ( Exception e ) {}
		}
	}

}

class MyThread extends Thread{	//���

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for ( int i = 0; i < 5; i++ ) {
			System.out.println(getName());
			try {
				Thread.sleep( 1000 ); // �ݵ�� try �� �ȿ� �־���Ѵ�. 1000 = 1��
			} catch ( Exception e ) {
				
			}
		}
	}
	
}

class MyThread2 implements Runnable {	// �̹���� ���� ����.

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for ( int i = 0; i < 5; i++ ) {
			System.out.println( Thread.currentThread().getName() );
		}
	}
	
}






