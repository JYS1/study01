// 1 ~ 10000 ������ 3�� ����� 5�� ����� ����ϴµ� �� �ٿ� 10���� ����ϰ�
// ���������� 3�ǹ���� 5�ǹ���� ������ ���� ����ϴ� ���α׷�
public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		
		int sum=0;
		
		for (int i = 1; i < 10000; i++) {
				if(i % 3 == 0 || i % 5 == 0) {
						System.out.print(i);
						System.out.print(' ');
						sum += i;
						count++;
						if(count % 10 == 0) {
							System.out.println("");
						}
				}
		}
		System.out.println();
		System.out.println("���� : " + count);
		System.out.println("�հ� : " + sum);
	}
	
}
