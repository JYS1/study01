import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int number, 
			evenCount=0, 
			oddCount=0,
			i = 1;
		while (true) {
			System.out.print("���ڸ� �Է��ϼ��� ( " + i +" ���� ) : ");
			number = sc.nextInt();
			if(number != 0 ) {
				if(number % 2 == 0) {
					evenCount++;
				} else {
					oddCount++;
				}
			} else {
				break;
			}
			i++;
		}
		System.out.println("¦�� ���� " + evenCount);
		System.out.println("Ȧ�� ���� " + oddCount);
	}
}