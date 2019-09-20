
public class ExceptionTest02 {

	public static void main(String[] args) /*throws Exception */ { // 예외 던지기.
		// TODO Auto-generated method stub
		try {
			System.out.println( 5 / 0 );
		} catch ( Exception e ) {
			e.printStackTrace();
		} finally {	// 예외 처리 되어도 무조건 출력이됨.
			System.out.println();
			System.out.println("stop program...");
		}
	}

}
