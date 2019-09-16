
public class FuncSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sort_numbers = new int[] { 5, 3, 1, 4, 2 };

		System.out.println( "1. 다음과 같은 과정을 적용하여 작은 수에서 큰 수 순으로 출력하는 \r\n" + 
				"   프로그램( selection sort algorithm )\r\n" + 
				"   Sort 함수 정의\r\n" + 
				"\r\n" + 
				"   초기값 : 5 3 1 4 2\r\n" + 
				"   1 step : 1 5 3 4 2\r\n" + 
				"   2 step : 1 2 5 4 3\r\n" + 
				"   3 step : 1 2 3 5 4\r\n" + 
				"   4 step : 1 2 3 4 5\n" );
		printArray( sort_numbers, "초기값 : " );	
		selectionSort( sort_numbers );
		printArray( sort_numbers, "final  : " );
	}

	public static void printArray( int[] array, String title ) {
		System.out.print( "\n"+ title );
		for ( int value : array ) {
			System.out.printf( "%5d", value );
		}
		System.out.println( "\n" );
	}
	
 	public static void selectionSort( int[] array ) {
 		int max_step = array.length - 1;
		int temp;
		
 		for ( int i = 0; i < max_step; ++i ) {
			for ( int j = i + 1; j < array.length; ++j ) {
				if ( array[ i ] > array[ j ] ) {
					temp = array[ i ];
					array[ i ] = array[ j ];
					array[ j ] = temp;
				}				
			}
			System.out.print( ( i + 1 ) + "step  : " );
			for ( int value : array ) {
				System.out.printf( "%5d", value );
			}
			System.out.println();
		}
 		
 		return;
 	}
}
