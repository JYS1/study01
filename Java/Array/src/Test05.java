import java.util.Scanner;
// 인원수를 저장하는 배열 / 
public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int number = 20;
		int score;
		int[] student = new int[number];
		int[] ary = new int[10];
		int a1 = 0,
			a2 = 0,
			a3 = 0,
			a4 = 0,
			a5 = 0,
			a6 = 0,
			a7 = 0,
			a8 = 0,
			a9 = 0,
			a10 = 0;
		
		for(int i = 0; i <  student.length; i++) {
			System.out.print(i+1 + " Input Score : " );
			score = Integer.parseInt( sc.nextLine());
			student[i] = score;
			
			if(score >= 0 && score < 10) {
				a1++;
			} else if (score >= 10 && score < 20) {
				a2++;
			} else if (score >= 20 && score < 30) {
				a3++;
			} else if (score >= 30 && score < 40) {
				a4++;
			} else if (score >= 40 && score < 50) {
				a5++;
			} else if (score >= 50 && score < 60) {
				a6++;
			} else if (score >= 60 && score < 70) {
				a7++;
			} else if (score >= 70 && score < 80) {
				a8++;
			} else if (score >= 80 && score < 90) {
				a9++;
			} else {
				a10++;
			}
		}

		ary[0] = a1;
		ary[1] = a2;
		ary[2] = a3;
		ary[3] = a4;
		ary[4] = a5;
		ary[5] = a6;
		ary[6] = a7;
		ary[7] = a8;
		ary[8] = a9;
		ary[9] = a10;
		
		
		
		for(int i = 0; i < 9; i++) {
			System.out.println(i + " ~ " + ((i*10)+9) + " : " + ary[i] + " 명");
		}
		System.out.println("90 ~ 100 : " + ary[9] + " 명");
	}
}
