import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int number, 
			evenCount=0, 
			oddCount=0,
			i = 1;
		while (true) {
			System.out.print("숫자를 입력하세요 ( " + i +" 번쨰 ) : ");
			number = sc.nextInt();
			if(number != 0 ) {
				if(number % 2 == 0) {
					evenCount++;
				} else {
					oddCount++;
				}
			} else {
				break;
			}
			i++;
		}
		System.out.println("짝수 갯수 " + evenCount);
		System.out.println("홀수 갯수 " + oddCount);
	}
}