import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number, 
			evenCount=0, 
			oddCount=0;
		
		for(int i=1; i<=10; i++) {
			System.out.print("숫자를 입력하세요 ( " + i +"번쨰 ) : ");
			number = sc.nextInt();
			if(number % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}	
		}
		System.out.println("짝수 갯수 " + evenCount);
		System.out.println("홀수 갯수 " + oddCount);
	}
}