
public class Sum {
	private int sum = 0;
	
	public Sum() {}
	
	public int getSum() {
		return sum;
	}
	
	public void setSum( int sum ) {
		this.sum = sum;
	}
	
	public void calc( int start, int stop ) {	// ���� ��ŭ �ݺ� + ����.
		for( int i = start; i <= stop; i++) {
			synchronized( this ) {	// Critical Section �� �ؼ� �ϱ� ���� ���.
				sum += i;			// Critical Section, Thread���� �����ڿ��� ����ϴ� Code Block
			}
		}
	}
}
