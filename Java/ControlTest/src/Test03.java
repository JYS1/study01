import java.util.Scanner;

// �� ������ �Է¹޾� ū �������� 
// ���� ���� ������ ����ϴ� ���α׷� (ù��° ������ 0�̸� ����)
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number1;
		int number2;
		int number3;
		int temp;
		
		System.out.print("���ڸ� �Է��ϼ��� 1���� : ");
		number1 = sc.nextInt();
		System.out.print("���ڸ� �Է��ϼ��� 2���� : ");
		number2 = sc.nextInt();
		System.out.print("���ڸ� �Է��ϼ��� 3���� : ");
		number3 = sc.nextInt();
		
		if(number2 > number1 && number2 > number3) {
			temp = number1;
			number1 = number2;
			number2 = temp;
		} else if (number3 > number1 && number3 > number2) {
			temp = number1;
			number1 = number3;
			number3 = temp;
		} if (number3 > number2) {
			temp = number2;
			number2 = number3;
			number3 = temp;
		}
		System.out.println(number1 + " >= " + number2 + " >= " + number3);
	}
}