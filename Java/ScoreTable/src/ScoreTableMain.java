import java.util.Scanner;

public class ScoreTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_STUDENT = 10;
		
		Student[] students = new Student[ MAX_STUDENT ];
		
		int count = 0;
		
		count = inputStudent( students, MAX_STUDENT );
		printScoreTable( students, count );
	}

	public static int inputStudent( Student[] students, final int MAX_STUDENT ) {
		Scanner sc = new Scanner( System.in );
		
		final int LOW_SCORE = 0;
		final int HIGH_SCORE = 100;
		
		String name;
		int[] subjects = new int[ Student.MAX_SUBJECT ];
		
		int count = 0;
		
		System.out.printf( "[%2d]번째 학생 이름 입력 ( 이름이 \'end\' 또는 %2d명 이상 종료 ) : ",  
							count + 1, MAX_STUDENT );
		name = sc.nextLine();
		while ( !name.equals( "end" ) ) {
			++count;
			for ( int i = 0; i < Student.MAX_SUBJECT; ++i ) {
				System.out.printf( "\t[%2d]번째 과목 점수 입력 ( 0 ~ 100 ) : ", i + 1 );
				subjects[ i ] = Integer.parseInt( sc.nextLine() );
				
				while ( subjects[ i ] < LOW_SCORE || subjects[ i ] > HIGH_SCORE ) {
					System.out.printf( "\tError : 점수는 0 ~ 100사이만 입력 하세요.\n\n" );
					System.out.printf( "\t[%2d]번째 과목 점수 입력 ( 0 ~ 100 ) : ", i + 1 );
					subjects[ i ] = Integer.parseInt( sc.nextLine() );
				}
			}
			students[ count - 1 ] = new Student( name, subjects ); // 여기부분에서 이미 계산이 다끝남.
			
			if ( count < MAX_STUDENT ) {
				System.out.printf( "\n[%2d]번째 학생 이름 입력 ( 이름이 \'end\' 또는 %2d명 이상 종료 ) : ",  
							count + 1, MAX_STUDENT );	
				name = sc.nextLine();
			} else {
				break;
			}
		}
		
		return count;
	}

	public static void printScoreTable( Student[] students, int count ) {
		System.out.println();
		for ( int i = 0; i < count; ++i ) {
			System.out.println( students[ i ] );
		}
	}
	
}
