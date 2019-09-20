
public class Sum {
	private int sum = 0;
	
	public Sum() {}
	
	public int getSum() {
		return sum;
	}
	
	public void setSum( int sum ) {
		this.sum = sum;
	}
	
	public void calc( int start, int stop ) {	// 범위 만큼 반복 + 누적.
		for( int i = start; i <= stop; i++) {
			synchronized( this ) {	// Critical Section 을 해소 하기 위한 방법.
				sum += i;			// Critical Section, Thread간에 공유자원을 사용하는 Code Block
			}
		}
	}
}
