
public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;
		
		switch (number) {
		case 1 :
		case 2 :
		case 3 : // ���ڰ� 1~3�̸� number1 ���
			System.out.println("number1");
			break; 
			// ���⼭ ���߰� ������ break�� �� �־�� �ƴϸ� �ؿ����� �����
		case 10 :
		case 20 :
			System.out.println("number2");
			break;
		
		default: //����ó��
			System.out.println("other number");
		}
	}

}
