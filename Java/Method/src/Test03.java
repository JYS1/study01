import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MAX_NUMBERS = 10;
		String[] name = new String[ MAX_NUMBERS ];
		int[] search_numbers1 = new int[ MAX_NUMBERS ];
		int[] search_numbers2 = new int[ MAX_NUMBERS ];
		int[] search_numbers3 = new int[ MAX_NUMBERS ];
		Insert(name, search_numbers1, search_numbers2, search_numbers3, MAX_NUMBERS);
	}

	public static void Insert (String[] name, int[] score1,
			int[] score2, int[] score3, int MAX) {
		Scanner sc = new Scanner( System.in );
		int max_name = name.length - 1;
		int score1_len = score1.length-1;
		int score2_len = score1.length-2;
		int score3_len = score1.length-3;
		String name_count;
		
		System.out.println("�̸��� 'end' �̰ų� 10���� �Ǹ� ����.");
		for ( int i = 0; i < MAX; ++i ) {
			System.out.printf("[ "+(i+1) + " ] ��° �л� �̸� �Է�  : ", i + 1 );
			name_count = sc.nextLine();
			name[ i ] = name_count;
			if ( name[i].equals("end") ) {
				MAX = i;
			} else {
				System.out.print("   1 ��° ���� ���� �Է� : " );
				score1[ i ] = Integer.parseInt( sc.nextLine() );
				System.out.print("   2 ��° ���� ���� �Է� : " );
				score2[ i ] = Integer.parseInt( sc.nextLine() );
				System.out.print("   3 ��° ���� ���� �Է� : " );
				score3[ i ] = Integer.parseInt( sc.nextLine() );
			}
		}
		System.out.println();
		for( int i = 0; i < MAX; i++) {
			
			int sum;
			sum = (score1[i] + score2[i] + score3[i]);
			double avg = sum/3;
			if(avg >= 90) {
				System.out.printf("%10s %5d %5d %5d  %5d %7.2f Excellent\n",
						name[i], score1[i], score2[i], score3[i], sum , avg);
			} else if (avg <= 60) {
				System.out.printf("%10s %5d %5d %5d  %5d %7.2f Fail\n",
						name[i], score1[i], score2[i], score3[i], sum , avg);
			} else {
				System.out.printf("%10s %5d %5d %5d  %5d %7.2f\n",
						name[i], score1[i], score2[i], score3[i], sum , avg);
			}
		}
	}
}
