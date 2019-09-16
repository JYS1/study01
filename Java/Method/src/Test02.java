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
			System.out.printf( "[ %2d ]번째 정수 입력 : ", i + 1 );
			search_numbers[ i ] = Integer.parseInt( sc.nextLine() );
		}
		
		System.out.print( "\n검색할 정수를 입력 하세요 ( 0이면 종료 ) : " );
		searchNumber = Integer.parseInt( sc.nextLine() );
		while ( searchNumber != 0 ) {
			index = 0;
			while ( index < MAX_SEARCH_NUMBERS &&
					searchNumber != search_numbers[ index ] ) {
				++index;
			}
			
			if ( index < MAX_SEARCH_NUMBERS &&
				 searchNumber == search_numbers[ index ] ) {
				System.out.printf( "정수 [ %5d ]은 배열의 index [ %2d ]에 있습니다.\n", 
								   searchNumber, index );
			} else {
				System.out.printf( "정수 [ %5d ]은 배열에 존재하지 않습니다.\n", searchNumber );
			}
			
			System.out.print( "\n검색할 정수를 입력 하세요 ( 0이면 종료 ) : " );
			searchNumber = Integer.parseInt( sc.nextLine() );
		}
	}
}
