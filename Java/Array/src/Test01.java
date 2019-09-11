import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int MAX = 10;
		int[] number = new int [MAX];	//배열 선언, 배열의 차원
		double avg, dif;
		int total = 0;
		for(int i = 0; i < MAX; i++) {
			System.out.print(i+1 + "번 학생 점수 :");
			number[i] = Integer.parseInt(sc.nextLine());	// 배열 요소 활용 == 일반 변수
			total += number[i];
		}
		avg = total / (double)MAX;
		System.out.println();
		for(int i = 0; i < MAX; i++) {
			dif = avg - number[i];
			System.out.printf("평균 [%6.2f] 과 %2d 번 학생 점수 [ %3d ]의 차이 [ %6.2f ]\n",
					avg, i+1 , number[i], dif);
		}
 	}

}
