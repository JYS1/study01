import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int number = 10;
		int[] ary = new int[number];
		int score;
		
		for(int i=0; i < ary.length; i++) {
			System.out.print(i+1 + " ��° ���ڸ� �Է��ϼ��� : ");
			score = Integer.parseInt( sc.nextLine());
			ary[i] = score;
		}
		
		int max = ary[0];
		int min = ary[0];
		
		for(int i=0; i < ary.length; i++) {
			if(ary[i] > max) {
				max = ary[i];
			}
		}
		for(int i=0; i < ary.length; i++) {
			if(ary[i] < min) {
				min = ary[i];
			}
			
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	}

}
