import java.util.*;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int number;
		String str;
		// ���� �Է��� ���� �Է��ϸ� ���۰� ���Ƽ� ���ڸ� �Է� ����.
		System.out.print("Input number : ");
		//number = sc.nextInt();
		//sc.nextLine(); ���1
		number = Integer.parseInt(sc.nextLine()); 
		//���2 : ���ڿ��� �޾� ������ ��ȯ.
		System.out.print("Input String : ");
		str = sc.nextLine();
		
		System.out.println("number => " + number);
		System.out.println("str => "+ str);
	}

}
