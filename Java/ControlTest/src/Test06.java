import java.util.Scanner;

// ������ �Է¹޾� �ش��ϴ� ������ ������ǥ�� ����ϴ� ���α׷�
// 0�̸� ����.
public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		int mix = 1;
		int i = 1;
		
		while (true) {
			System.out.print("���ڸ� �Է��ϼ��� ( " + i + " ���� ) : ");
			number = sc.nextInt();
			
			if(number != 0) {
				mix = mix * number;
			} else {
				break;
			}
			i++;
		}
		System.out.println("���� �� : " + mix);
	}	

}
