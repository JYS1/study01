import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int MAX = 10;
		int[] number = new int [MAX];	//�迭 ����, �迭�� ����
		double avg, dif;
		int total = 0;
		for(int i = 0; i < MAX; i++) {
			System.out.print(i+1 + "�� �л� ���� :");
			number[i] = Integer.parseInt(sc.nextLine());	// �迭 ��� Ȱ�� == �Ϲ� ����
			total += number[i];
		}
		avg = total / (double)MAX;
		System.out.println();
		for(int i = 0; i < MAX; i++) {
			dif = avg - number[i];
			System.out.printf("��� [%6.2f] �� %2d �� �л� ���� [ %3d ]�� ���� [ %6.2f ]\n",
					avg, i+1 , number[i], dif);
		}
 	}

}
