import java.util.Scanner;

public class IOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // System.in ǥ�� �Է���ġ
		int number;
		String str;
		double dnumber;
		
		System.out.print("Input integer number : ");
		number = sc.nextInt();
		System.out.println("number : "+ number);
		number = number + 5;	// ����
		System.out.println("number : "+ number);
		
		System.out.print("Input double number : ");
		dnumber = sc.nextDouble();
		System.out.println("dnumber : " + dnumber);
		
		System.out.print("Input String : ");
		str = sc.nextLine();
		System.out.println(" str : " + str);
		//String �Է��� �ȵ� : ���� �Է°� ���� �Է� ���̶����� ����.
		//Keyboard buffer ������ ����.
	}
}
