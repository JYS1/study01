
public class SumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum sum = new Sum();	// new 로 만들어서 Heap 에 저장.
		
		Worker worker1 = new Worker( sum, 1, 30);
		worker1.setName( "Worker Thread1" );
		
		Worker worker2 = new Worker( sum, 31, 60);
		worker2.setName( "Worker Thread2" );
		
		Worker worker3 = new Worker( sum, 61, 100);
		worker3.setName( "Worker Thread3" );
		
		worker1.start();
		worker2.start();
		worker3.start();	// 3군대에서 동시에 들어가기 떄문에 결과 값이 이상할수 있다.
							// 동기화 문제 : 공유자원을 경쟁적으로 사용함으로써 발생되는 문제.
		try {
			worker1.join();
			worker2.join();
			worker3.join();
		} catch ( Exception e ) {}
		System.out.println( "1 + 2 + 3 + ... + 98 + 99 + 100 = " + sum.getSum());
	}

}
