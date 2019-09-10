import java.util.Scanner;

// 세 정수를 입력받아 큰 정수에서 
// 작은 정수 순으로 출력하는 프로그램 (첫번째 정수가 0이면 종료)
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number1;
		int number2;
		int number3;
		int temp;
		
		System.out.print("숫자를 입력하세요 1번쨰 : ");
		number1 = sc.nextInt();
		System.out.print("숫자를 입력하세요 2번쨰 : ");
		number2 = sc.nextInt();
		System.out.print("숫자를 입력하세요 3번쨰 : ");
		number3 = sc.nextInt();
		
		if(number2 > number1 && number2 > number3) {
			temp = number1;
			number1 = number2;
			number2 = temp;
		} else if (number3 > number1 && number3 > number2) {
			temp = number1;
			number1 = number3;
			number3 = temp;
		} if (number3 > number2) {
			temp = number2;
			number2 = number3;
			number3 = temp;
		}
		System.out.println(number1 + " >= " + number2 + " >= " + number3);
	}
}