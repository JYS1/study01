
public class IntTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var = 0;
		int var2 = 10;
		final int MAX = 100;
		//final 로 만들면 상수값이 되어 변경할수 없다.
		
		System.out.println("var  : " + var);
		System.out.println("var2 : " + var2);
		System.out.println("MAX  : " + MAX);
		System.out.println("------------");
		var = 1000;  		//값 치환
		var2 = var2 + 10; 	//값 누적
		
		System.out.println("var  : " + var);
		System.out.println("var2 : " + var2);
		System.out.println("MAX  : " + MAX);
		
		System.out.println( var < 0);
		System.out.println( var2 != 100);
		System.out.println( var < 0 && var2 != 100);
	}
}
