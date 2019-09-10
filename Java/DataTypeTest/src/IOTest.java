import java.util.Scanner;

public class IOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // System.in 표준 입력장치
		int number;
		String str;
		double dnumber;
		
		System.out.print("Input integer number : ");
		number = sc.nextInt();
		System.out.println("number : "+ number);
		number = number + 5;	// 누적
		System.out.println("number : "+ number);
		
		System.out.print("Input double number : ");
		dnumber = sc.nextDouble();
		System.out.println("dnumber : " + dnumber);
		
		System.out.print("Input String : ");
		str = sc.nextLine();
		System.out.println(" str : " + str);
		//String 입력이 안됨 : 숫자 입력과 문자 입력 차이때문에 문제.
		//Keyboard buffer 때문에 생김.
	}
}
