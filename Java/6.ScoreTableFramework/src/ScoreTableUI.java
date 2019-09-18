import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreTableUI {
	private ScoreTable scoreTable;
	
	public ScoreTableUI() {
		scoreTable = new ScoreTable();
	}
	
	public void mainMenu() {
		String menu = "   <<< 성적 관리 >>>\n\n"
					+ "1. 학생성적정보 입력\n"
				    + "2. 학생성적정보 조회\n"
				    + "3. 성적일람표 출력\n"
				    + "0. 종료\n"
				    + "원하는 메뉴를 선택하세요... ";
		Scanner sc = new Scanner( System.in );
		int select = -1;
		while ( select != 0 ) {
			System.out.print( menu );
			select = Integer.parseInt( sc.nextLine() );
			switch ( select ) {
			case 1: inputStudentInfo();		break;
			case 2: searchStudentInfo();	break;
			case 3: printScoreTable();		break;
			case 0: 						break;
			default: System.out.println( "Error : 0 ~ 3사이만 입력 가능...\n" );
			}
		} 
		System.out.println( "\nStop program.....\n" );
	}
	
	public void inputStudentInfo() {
		Scanner sc = new Scanner( System.in );
		
		String name;
		int[] subjects = new int[ Student.MAX_SUBJECT ];
		
		int count = scoreTable.getCountStudent();
		
		boolean loop = true;
		
		if ( count >= scoreTable.MAX_STUDENT ) {
			System.out.printf( "\n정원 [ %2d ]명이 모두 입력되었습니다...\n\n", count );
			loop = false;
		}
		while ( loop ) {
			System.out.printf( "\n[%2d]번째 학생 이름 입력 ( 이름이 \'end\' 이면 종료 ) : ",  
								count + 1, ScoreTable.MAX_STUDENT );
			name = sc.nextLine();
			while ( !name.equals( "end" ) ) {
				++count;
				for ( int i = 0; i < Student.MAX_SUBJECT; ++i ) {
					System.out.printf( "\t[%2d]번째 과목 점수 입력 ( 0 ~ 100 ) : ", i + 1 );
					subjects[ i ] = Integer.parseInt( sc.nextLine() );
					while ( subjects[ i ] < Student.LOW_SCORE || subjects[ i ] > Student.HIGH_SCORE ) {
						System.out.printf( "\tError : 점수는 0 ~ 100사이만 입력 하세요.\n\n" );
						System.out.printf( "\t[%2d]번째 과목 점수 입력 ( 0 ~ 100 ) : ", i + 1 );
						subjects[ i ] = Integer.parseInt( sc.nextLine() );
					}
				}
				scoreTable.appendStudentInfo( name, subjects );
				scoreTable.setCountStudent( count );
				
				if ( count < scoreTable.MAX_STUDENT ) {
					System.out.printf( "\n[%2d]번째 학생 이름 입력 ( 이름이 \'end\' 이면 종료 ) : ",  
							count + 1, ScoreTable.MAX_STUDENT );
					name = sc.nextLine();
				} else {
					System.out.printf( "\n정원 [ %2d ]명이 모두 입력되었습니다...\n\n", count );
					loop = false;
					break;
				}
			}
			loop = false;
			System.out.println();
		}
	}
	
	public void searchStudentInfo() {
		Scanner sc = new Scanner( System.in );
		
		String name;
		
		List<Student> students;
		
		System.out.print( "\n조회할 학생 이름 입력 ( 이름이 \'end\' 이면 종료 ) : " );
		name = sc.nextLine();
		while ( !name.equals( "end" ) ) {
			students = scoreTable.searchStudentInfo( name );
			
			if ( students.size() > 0 ) {
				System.out.println( "\n---------------------------------------------------------------" );
				System.out.println( "이름\t\t과목성적\t총점\t평균\t석차\t등급" );
				System.out.println( "---------------------------------------------------------------" );
				for ( Student student : students ) {
					System.out.println( student );
				}
				System.out.println( "---------------------------------------------------------------" );
				System.out.printf( "\t\t\t\t\t\t조회학생수 : %2d\n", students.size() );
			} else {
				System.out.printf( "\n[ %-10s ] 학생은 성적이 등록되어 있지 않습니다...\n", name );
			}
			
			System.out.print( "\n조회할 학생 이름 입력 ( 이름이 \'end\' 이면 종료 ) : " );
			name = sc.nextLine();
		}
		System.out.println();
	}
	
	public void printScoreTable() {
		System.out.println();
		System.out.println( "\t\t    <<< 성적일람표 >>>" );
		System.out.println();
		System.out.println( "---------------------------------------------------------------" );
		System.out.println( "이름\t\t과목성적\t총점\t평균\t석차\t등급" );
		System.out.println( "---------------------------------------------------------------" );
		scoreTable.printScoreTable();
		System.out.println( "---------------------------------------------------------------" );
		System.out.printf( "\t\t\t\t\t\t  총학생수 : %2d\n", scoreTable.getCountStudent() );
		System.out.println();
		
	}
}
