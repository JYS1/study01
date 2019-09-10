import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int MAX_LOOP = 3;
		int number1, number2;
		
		
		for (int i = 1; i <= MAX_LOOP; i++) {
			System.out.print("Input number1 : ");
			number1 = sc.nextInt();
			System.out.print("Input number2 : ");
			number2 = sc.nextInt();
			
			if (number1 == number2) {
				System.out.println("number1 : " + number1 + " == " + 
								   "number2 : " + number2);
			} else if(number1 > number2) {
				System.out.println("number1 : " + number1);
			} else {
				System.out.println("number2 : " + number2);
			}
		}
	}

}
