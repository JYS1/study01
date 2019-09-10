import java.util.Scanner;

// 정수를 입력받아 해당하는 정수의 구구단표를 출력하는 프로그램
// 0이면 종료.
public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		int mix = 1;
		int i = 1;
		
		while (true) {
			System.out.print("숫자를 입력하세요 ( " + i + " 번쨰 ) : ");
			number = sc.nextInt();
			
			if(number != 0) {
				mix = mix * number;
			} else {
				break;
			}
			i++;
		}
		System.out.println("곱한 값 : " + mix);
	}	

}
