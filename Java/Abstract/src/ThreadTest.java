
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myth = new MyThread();
		Thread myth2 = new Thread( new MyThread2() );
		
		myth.setDaemon(true);
		myth.setDaemon(true);
		myth.start();	//thread 시작 방법.
		myth2.start();
		
	    try {
			myth.join();
			myth2.join();
		} catch( Exception e ) {}
		
		for ( int i = 1; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			//try {
			//	Thread.sleep( 1000 ); // 반드시 try 블럭 안에 넣어야한다. 1000 = 1초
			//} catch ( Exception e ) {}
		}
	}

}

class MyThread extends Thread{	//상속

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for ( int i = 0; i < 5; i++ ) {
			System.out.println(getName());
			try {
				Thread.sleep( 1000 ); // 반드시 try 블럭 안에 넣어야한다. 1000 = 1초
			} catch ( Exception e ) {
				
			}
		}
	}
	
}

class MyThread2 implements Runnable {	// 이방법을 많이 쓴다.

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for ( int i = 0; i < 5; i++ ) {
			System.out.println( Thread.currentThread().getName() );
		}
	}
	
}






