import java.util.Scanner;

public class Array1Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in );
		
//-- 실습 5 ------------------------------------------------------------
		final int MAX_STUDENT = 10;
		final int MAX_SCORE = 10;
		final int SCORE = 10;
		
		int[] scores = new int[ MAX_SCORE ];
		String[] titles = new String[] { " 0 ~   9 : ", "10 ~  19 : ",
										 "20 ~  29 : ", "30 ~  39 : ",
										 "40 ~  49 : ", "50 ~  59 : ",
										 "60 ~  69 : ", "70 ~  79 : ",
										 "80 ~  89 : ", "90 ~ 100 : "
										 };
		int number; 
		int index;
		
		System.out.println( "5. 20명의 학생 성적을 입력받아 다음과 같은 결과 출력 프로그램\r\n" + 
				"   0 ~   9 : x 명\r\n" + 
				"  10 ~  19 : x 명 \r\n" + 
				"  20 ~  29 : x 명\r\n" + 
				"  30 ~  39 : x 명\r\n" + 
				"  40 ~  49 : x 명\r\n" + 
				"  50 ~  59 : x 명\r\n" + 
				"  60 ~  69 : x 명\r\n" + 
				"  70 ~  79 : x 명\r\n" + 
				"  80 ~  89 : x 명\r\n" + 
				"  90 ~ 100 : x 명\n" );
		for ( int i = 0; i < MAX_STUDENT; ++i ) {
			System.out.printf( "[ %2d ]번째 학생 성적 입력 : ", i + 1 );
			number = Integer.parseInt( sc.nextLine() );
			index = number / SCORE;
			++scores[ ( index == 10 ) ? 9 : index ]; // index 가 10 과 같으면 9로 해라. 
		}
		
		System.out.println();
		for ( int i = 0; i < MAX_SCORE; ++i ) {
			System.out.printf( "%11s %2d 명\n", titles[ i ], scores[ i ] );
		}
		System.out.println( "\n" );

//-- 실습 6 ------------------------------------------------------------
		final int MAX_INT = 10;
		
		int[] numbers = new int[ MAX_INT ];
		int maxNumber, minNumber;
		
		System.out.println( "6. 10개의 정수를 입력받아 1차원 배열에 저장한 후 가장 큰 수와\r\n" + 
				"   가장 작은 수를 찾아서 출력하는 프로그램\n" );
		
		for ( int i = 0; i < MAX_INT; ++i ) {
			System.out.printf( "[ %2d ]번째 정수 입력 : ", i + 1 );
			numbers[ i ] = Integer.parseInt( sc.nextLine() );
		}
		
		maxNumber = numbers[ 0 ];
		minNumber = numbers[ 0 ];
		
		for ( int i = 1; i < MAX_INT; ++i ) {
			if ( numbers[ i ] > maxNumber ) {
				maxNumber = numbers[ i ];
			}

			if ( numbers[ i ] < minNumber ) {
				minNumber = numbers[ i ];
			}
		}
		System.out.printf( "\nMax Number : %d\nMin Number : %d\n\n", 
						   maxNumber, minNumber );

//-- 실습 7 ------------------------------------------------------------
		int[] sort_numbers = new int[] { 5, 3, 1, 4, 2 };
		int max_step = sort_numbers.length - 1;
		int temp;

		System.out.println( "7. 다음과 같은 과정을 적용하여 작은 수에서 큰 수 순으로 출력하는 \r\n" + 
				"   프로그램( selection sort algorithm )\r\n" + 
				"\r\n" + 
				"   초기값 : 5 3 1 4 2\r\n" + 
				"   1 step : 1 5 3 4 2\r\n" + 
				"   2 step : 1 2 5 4 3\r\n" + 
				"   3 step : 1 2 3 5 4\r\n" + 
				"   4 step : 1 2 3 4 5\n" );
		
		System.out.print( "초기값 : " );
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

//-- 실습 8 ------------------------------------------------------------
		final int MAX_SEARCH_NUMBERS = 10;
		int[] search_numbers = new int[ MAX_SEARCH_NUMBERS ];
		
		int searchNumber;
		
		System.out.println( "8. 10개의 정수를 입력 받아 1차원 배열에 저장 한 후 0이 입력될 때까지\r\n" + 
				"   정수를 입력받아 10개의 정수를 저장하고 있는 1차원 배열에서 검색을\r\n" + 
				"   수행하여 찾았으면 해당 data의 index를 출력하고 검색을 실패하면\r\n" + 
				"   에러 메시지 출력하는 프로그램( linear search algorithm )\n" );
		
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
				System.out.printf( "정수 [ %10d ]은 배열의 index [ %2d ]에 있습니다.\n", 
								   searchNumber, index );
			} else {
				System.out.printf( "정수 [ %10d ]은 배열에 존재하지 않습니다.\n", searchNumber );
			}
			
			System.out.print( "\n검색할 정수를 입력 하세요 ( 0이면 종료 ) : " );
			searchNumber = Integer.parseInt( sc.nextLine() );
		}
	}

}
