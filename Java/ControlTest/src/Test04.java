import java.util.Scanner;
// 10���� ������ �Է¹޾� ��� ����, ���� ����, 
// ����ϋ� ¦�� ����, Ȧ�� ������ ����ϴ� ���α׷�
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int number;
		int	evenCount=0, 
			oddCount=0,
			a = 0, // a = ��� , b = ����
			b = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.print("���ڸ� �Է��ϼ��� ( " + i +" ���� ) : ");
			number = sc.nextInt();
			    if (number > 0 && number % 2 == 0) {
			    	evenCount++;
			    	a++;
			    } else if (number>0 && number % 2 ==1) {
			    	oddCount++;
			    	a++;
			    } else if( number<0){
			    	b++;
			    }
		} 
		System.out.println("��� ���� : " + a);
		System.out.println("���� ���� : " + b);
		System.out.println("¦�� ���� : " + evenCount);
		System.out.println("Ȧ�� ���� : " + oddCount);
		
	}

}
