
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
			number =  Integer.parseInt(sc.nextLine()); // ���� ���� ���ڸ� ������ ����ó����
			System.out.println(5 / 0); // �Ұ����� �ൿ.
		} catch (ArithmeticException e) {	// 0������ ����� �ȵǴ� ����..
			System.out.println("Error : divide by zero");
		} catch (Exception e ) { //����ó�� �ֻ��� �� �� �������� ����� �Ѵ�. �ȱ׷��� ����..
			System.out.println("Exception...");
			e.printStackTrace();
		}
	}

}

class My {
	public int number;
}




