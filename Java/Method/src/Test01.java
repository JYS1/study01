
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort();
	}
	public static void Sort(){
		int[] sort_numbers = new int[] { 5, 3, 1, 4, 2 };
		int max_step = sort_numbers.length - 1;
		int temp;
		
		System.out.print( "�ʱⰪ : " );
		for ( int value : sort_numbers ) {
			System.out.printf( "%5d", value );
		}
		System.out.println( "\n" );
		
		for ( int i = 0; i < max_step; ++i ) {
			for ( int j = i + 1; j < sort_numbers.length; ++j ) {
				if ( sort_numbers[ i ] > sort_numbers[ j ] ) {
					temp = sort_numbers[ i ];
					sort_numbers[ i ] = sort_numbers[ j ];
					sort_numbers[ j ] = temp;
				}				
			}
		System.out.print( ( i + 1 ) + "step  : " );
			for ( int value : sort_numbers ) {
				System.out.printf( "%5d", value );
			}
			System.out.println();
		}

		System.out.print( "\nfinal  : " );
		for ( int value : sort_numbers ) {
			System.out.printf( "%5d", value );
		}
		System.out.println( "\n" );
		return;
	}
}
