import java.util.Scanner;

// 10�� �л��� ������ �Է¹޾� ����� ����ϰ� ������ ��հ��� ���� ����ϴ� ���α׷�

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in );
		int number1, number2, number3, number4, 
		number5, number6, number7, number8, number9, number10;
		int sum, avg, i=0;
		double avg1, avg2, avg3, avg4, avg5, avg6, avg7, avg8, avg9, avg10;
		
		System.out.print( ++i + "���� �л� ���� �Է� : ");
		number1 = sc.nextInt();
		System.out.print(++i + "���� �л� ���� �Է� : ");
		number2 = sc.nextInt();
		System.out.print(++i + "���� �л� ���� �Է� : ");
		number3 = sc.nextInt();
		System.out.print(++i + "���� �л� ���� �Է� : ");
		number4 = sc.nextInt();
		System.out.print(++i + "���� �л� ���� �Է� : ");
		number5 = sc.nextInt();
		System.out.print(++i + "���� �л� ���� �Է� : ");
		number6 = sc.nextInt();
		System.out.print(++i + "���� �л� ���� �Է� : ");
		number7 = sc.nextInt();
		System.out.print(++i + "���� �л� ���� �Է� : ");
		number8 = sc.nextInt();
		System.out.print(++i + "���� �л� ���� �Է� : ");
		number9 = sc.nextInt();
		System.out.print(++i + "���� �л� ���� �Է� : ");
		number10 = sc.nextInt();
		
		sum = (number1 + number2+ number3 +number4+ number5 
				+number6 +number7+ number8+ number9 +number10);
		avg = sum / 10;
		avg1 = number1 - avg;
		avg2 = number2 - avg;
		avg3 = number3 - avg;
		avg4 = number4 - avg;
		avg5 = number5 - avg;
		avg6 = number6 - avg;
		avg7 = number7 - avg;
		avg8 = number8 - avg;
		avg9 = number9 - avg;
		avg10 = number10 - avg;
		
	
		System.out.println("��� [ "+ avg +" ] ��   1 �� �л� ���� [ "+ number1 + " ]�� ���� [ " + avg1 + " ]" );
		System.out.println("��� [ "+ avg +" ] ��   2 �� �л� ���� [ "+ number2 + " ]�� ���� [ " + avg2 + " ]" );
		System.out.println("��� [ "+ avg +" ] ��   3 �� �л� ���� [ "+ number3 + " ]�� ���� [ " + avg3 + " ]" );
		System.out.println("��� [ "+ avg +" ] ��   4 �� �л� ���� [ "+ number4 + " ]�� ���� [ " + avg4 + " ]" );
		System.out.println("��� [ "+ avg +" ] ��   5 �� �л� ���� [ "+ number5 + " ]�� ���� [ " + avg5 + " ]" );
		System.out.println("��� [ "+ avg +" ] ��   6 �� �л� ���� [ "+ number6 + " ]�� ���� [ " + avg6 + " ]" );
		System.out.println("��� [ "+ avg +" ] ��   7 �� �л� ���� [ "+ number7 + " ]�� ���� [ " + avg7 + " ]" );
		System.out.println("��� [ "+ avg +" ] ��   8 �� �л� ���� [ "+ number8 + " ]�� ���� [ " + avg8 + " ]" );
		System.out.println("��� [ "+ avg +" ] ��   9 �� �л� ���� [ "+ number9 + " ]�� ���� [ " + avg9 + " ]" );
		System.out.println("��� [ "+ avg +" ] �� 10 �� �л� ���� [ "+ number10 + " ]�� ���� [ " + avg10 + " ]" );
		
		
	}

}
