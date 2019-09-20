
public class SumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum sum = new Sum();	// new �� ���� Heap �� ����.
		
		Worker worker1 = new Worker( sum, 1, 30);
		worker1.setName( "Worker Thread1" );
		
		Worker worker2 = new Worker( sum, 31, 60);
		worker2.setName( "Worker Thread2" );
		
		Worker worker3 = new Worker( sum, 61, 100);
		worker3.setName( "Worker Thread3" );
		
		worker1.start();
		worker2.start();
		worker3.start();	// 3���뿡�� ���ÿ� ���� ������ ��� ���� �̻��Ҽ� �ִ�.
							// ����ȭ ���� : �����ڿ��� ���������� ��������ν� �߻��Ǵ� ����.
		try {
			worker1.join();
			worker2.join();
			worker3.join();
		} catch ( Exception e ) {}
		System.out.println( "1 + 2 + 3 + ... + 98 + 99 + 100 = " + sum.getSum());
	}

}
