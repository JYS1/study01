import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str  = "hello";
		System.out.println("str  : " + str);
		
		String str2 = str;
		System.out.println("str2 : " + str2);
		
		str2 = str2 + " world";
		System.out.println("str2 : " + str2);
		System.out.println("str  : " + str);
		
		System.out.print("Input String : ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		System.out.println("str : " + str);
	}
}
