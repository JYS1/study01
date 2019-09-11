// 1 ~ 10000 사이의 3의 배수와 5의 배수를 출력하는데 한 줄에 10개씩 출력하고
// 마지막에는 3의배수와 5의배수의 개수와 합을 출력하는 프로그램
public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		
		int sum=0;
		
		for (int i = 1; i < 10000; i++) {
				if(i % 3 == 0 || i % 5 == 0) {
						System.out.print(i);
						System.out.print(' ');
						sum += i;
						count++;
						if(count % 10 == 0) {
							System.out.println("");
						}
				}
		}
		System.out.println();
		System.out.println("갯수 : " + count);
		System.out.println("합계 : " + sum);
	}
	
}
