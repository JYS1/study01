import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number, 
			evenCount=0, 
			oddCount=0;
		
		for(int i=1; i<=10; i++) {
			System.out.print("���ڸ� �Է��ϼ��� ( " + i +"���� ) : ");
			number = sc.nextInt();
			if(number % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}	
		}
		System.out.println("¦�� ���� " + evenCount);
		System.out.println("Ȧ�� ���� " + oddCount);
	}
}