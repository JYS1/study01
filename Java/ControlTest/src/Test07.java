import java.util.Scanner;

// 10���� ������ �Է� �޾� ���� ū ������ ���� ���� ������ ����ϴ� ���α׷�
// * �ϳ��� Java Project�� 3~7������ Ŭ������ �ۼ��ϴ� �ǽ�
// * �ش� Java Project�� ���� ����_��¥�� �����Ͽ� ����.
public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = 0; 
		int min = 9999999 , max = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("���ڸ� �Է��ϼ��� ( " + i +" ���� ) : ");
			number = sc.nextInt();
			if(number > max) {
				max = number;
			} else if (number < min) {
				min = number;
			}
		}
		
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּڰ� : " + min);
	}
}
