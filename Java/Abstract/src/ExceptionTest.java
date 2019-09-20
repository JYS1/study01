
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		My[] array = new My[ 5 ];
		try {
			array[ 0 ] = new My();
			array[ 0 ].number = 10;
			for( My my : array) {
				System.out.println( my.number );
			}
			System.out.println("Input number : ");
			number =  Integer.parseInt(sc.nextLine()); // 숫자 말고 문자를 넣으면 예외처리됨
			System.out.println(5 / 0); // 불가능한 행동.
		} catch (ArithmeticException e) {	// 0나눠서 계산이 안되는 오류..
			System.out.println("Error : divide by zero");
		} catch (Exception e ) { //예외처리 최상위 라서 맨 마지막에 써줘야 한다. 안그러면 오류..
			System.out.println("Exception...");
			e.printStackTrace();
		}
	}

}

class My {
	public int number;
}




