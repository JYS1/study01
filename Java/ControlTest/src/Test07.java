import java.util.Scanner;

// 10개의 정수를 입력 받아 가장 큰 정수와 가장 작은 정수를 출력하는 프로그램
// * 하나의 Java Project에 3~7까지의 클래스를 작성하는 실습
// * 해당 Java Project를 본인 성함_날짜로 압축하여 제출.
public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = 0; 
		int min = 9999999 , max = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("숫자를 입력하세요 ( " + i +" 번쨰 ) : ");
			number = sc.nextInt();
			if(number > max) {
				max = number;
			} else if (number < min) {
				min = number;
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최솟값 : " + min);
	}
}
