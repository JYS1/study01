import java.util.Scanner;
// 10개의 정수를 입력받아 양수 갯수, 음수 갯수, 
// 양수일떄 짝수 갯수, 홀수 갯수를 출력하는 프로그램
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int number;
		int	evenCount=0, 
			oddCount=0,
			a = 0, // a = 양수 , b = 음수
			b = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.print("숫자를 입력하세요 ( " + i +" 번쨰 ) : ");
			number = sc.nextInt();
			    if (number > 0 && number % 2 == 0) {
			    	evenCount++;
			    	a++;
			    } else if (number>0 && number % 2 ==1) {
			    	oddCount++;
			    	a++;
			    } else if( number<0){
			    	b++;
			    }
		} 
		System.out.println("양수 갯수 : " + a);
		System.out.println("음수 갯수 : " + b);
		System.out.println("짝수 갯수 : " + evenCount);
		System.out.println("홀수 갯수 : " + oddCount);
		
	}

}
