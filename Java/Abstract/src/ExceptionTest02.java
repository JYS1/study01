
public class ExceptionTest02 {

	public static void main(String[] args) /*throws Exception */ { // ���� ������.
		// TODO Auto-generated method stub
		try {
			System.out.println( 5 / 0 );
		} catch ( Exception e ) {
			e.printStackTrace();
		} finally {	// ���� ó�� �Ǿ ������ ����̵�.
			System.out.println();
			System.out.println("stop program...");
		}
	}

}
