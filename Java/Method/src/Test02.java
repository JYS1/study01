import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search();
	}
	public static void Search() {
		final int MAX_SEARCH_NUMBERS = 10;
		int[] search_numbers = new int[ MAX_SEARCH_NUMBERS ];
		Scanner sc = new Scanner( System.in );
		int searchNumber, index;
		
		
		for ( int i = 0; i < MAX_SEARCH_NUMBERS; ++i ) {
			System.out.printf( "[ %2d ]��° ���� �Է� : ", i + 1 );
			search_numbers[ i ] = Integer.parseInt( sc.nextLine() );
		}
		
		System.out.print( "\n�˻��� ������ �Է� �ϼ��� ( 0�̸� ���� ) : " );
		searchNumber = Integer.parseInt( sc.nextLine() );
		while ( searchNumber != 0 ) {
			index = 0;
			while ( index < MAX_SEARCH_NUMBERS &&
					searchNumber != search_numbers[ index ] ) {
				++index;
			}
			
			if ( index < MAX_SEARCH_NUMBERS &&
				 searchNumber == search_numbers[ index ] ) {
				System.out.printf( "���� [ %5d ]�� �迭�� index [ %2d ]�� �ֽ��ϴ�.\n", 
								   searchNumber, index );
			} else {
				System.out.printf( "���� [ %5d ]�� �迭�� �������� �ʽ��ϴ�.\n", searchNumber );
			}
			
			System.out.print( "\n�˻��� ������ �Է� �ϼ��� ( 0�̸� ���� ) : " );
			searchNumber = Integer.parseInt( sc.nextLine() );
		}
	}
}
