import java.util.Scanner;

//10���� ������ �Է� �޾� 1���� �迭�� ���� �� �� 0�� �Էµ� ������ ������ �Է¹޾�
//10���� ������ �����ϰ� �ִ� 1���� �迭���� �˻��� �����Ͽ� ã������ �ش� data��
//index�� ����ϰ� �˻��� �����ϸ� ���� �޽��� ����ϴ� ���α׷� (linear search algorithm)
public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int number = 10;
		int number1 = 1, number2 = 0; // number1�Է�,number2 ã�¼���.
		int result = 0;
		int count = 0;
		int[] ary = new int[number];
		
		
		while ( number1 != 0 ) { 
			System.out.print(count+1 + " Input number : " );
			number1 = Integer.parseInt( sc.nextLine());
				ary[count] = number1;
				count++;
				if(count == 10) {
					number1 = 0;
				}
		}
		if (number1 == 0) {
			System.out.print( "ã�� ���ڸ� �Է��ϼ��� : " );
		
		number2 = Integer.parseInt( sc.nextLine() );
		for (int j = 0; j < ary.length; j++) {
			if(ary[j] == number2) {
				result = j;
				break;
			} else {
				result = -1;
				}
			}
		
		if(result == -1) {
			System.out.println("Error : ã�� �� �����ϴ�.");
		} else {
			System.out.println(number2 + " �� ary [ " +
						(result+1) +" ]�� �ֽ��ϴ�. ");
			}
		}
	}
	
}



