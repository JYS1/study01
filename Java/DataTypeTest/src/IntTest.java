
public class IntTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var = 0;
		int var2 = 10;
		final int MAX = 100;
		//final �� ����� ������� �Ǿ� �����Ҽ� ����.
		
		System.out.println("var  : " + var);
		System.out.println("var2 : " + var2);
		System.out.println("MAX  : " + MAX);
		System.out.println("------------");
		var = 1000;  		//�� ġȯ
		var2 = var2 + 10; 	//�� ����
		
		System.out.println("var  : " + var);
		System.out.println("var2 : " + var2);
		System.out.println("MAX  : " + MAX);
		
		System.out.println( var < 0);
		System.out.println( var2 != 100);
		System.out.println( var < 0 && var2 != 100);
	}
}
