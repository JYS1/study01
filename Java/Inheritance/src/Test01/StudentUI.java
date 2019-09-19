package Test01;

import java.util.Scanner;

public class StudentUI {
	private Student student;
	
	public StudentUI() {
		student = new Student();
	}
	
	Scanner sc =  new Scanner(System.in);
	
	public void mainMenu() {
		String menu = "   <<< 성적 등록 >>>\n\n"
					+ "1. 학생 정보 등록\n"
				    + "2. 학생 성적 정보 등록\n"
				    + "3. 성적 일람표 출력( 입력순 )\n"
				    + "4. 성적 일람표 출력( 평균순 )\n"				    
				    + "0. 종료\n"
				    + "원하는 메뉴를 선택하세요... ";
		Scanner sc = new Scanner( System.in );
		int select = -1;
		while ( select != 0 ) {
			System.out.print( menu );
			select = Integer.parseInt( sc.nextLine() );
			switch ( select ) {
			case 1: inputStudentInfo();		break;
			case 2: inputScoreInfo();		break;
			case 3: printStudent();			break;
			case 4: printStudentAvg();		break;
			case 0: 						break;
			default: System.out.println( "Error : 0 ~ 4사이만 입력 가능...\n" );
			}
		} 
		System.out.println( "\nStop program.....\n" );
	}

	private void inputStudentInfo() {
		// TODO Auto-generated method stub
		String name;
		String subject = null;
		int number = 0;
		
		System.out.print( "\n이름을 입력하세요 ( \'end\'면 종료 ) : " );
		name = sc.nextLine();
		while( !name.equals( "end" )) {
			System.out.print(" 학과 이름을 넣으세요 : ");
			subject = sc.nextLine();
			System.out.print("전공 수강 갯수를 넣으세요 :");
			number = Integer.parseInt( sc.nextLine());
			student.appendInfo(name, subject, number);
			
			System.out.print( "\n이름을 입력하세요 ( \'end\'면 종료 ) : " );
			name = sc.nextLine();
		
		}
		
		
		
	}

	private void inputScoreInfo() {
		// TODO Auto-generated method stub
		String name;
		int index;
		int[] majors = new int [ Student.number ]; 
		int[] commons = new int[Info.COMMON_COUNT];
		
		System.out.print( "\n이름을 입력하세요 ( \'end\'면 종료 ) : " );
		name = sc.nextLine();
		while( !name.equals( "end" )) {
			index = student.searchInfo(name);
			while ( index < 0 ) {
				for ( int i  = 0; i < Student.number; i++) {
					System.out.printf("[ %2d ]번째 전공의 점수를 입력하세요 : ", i+1);
					majors[ i ] = Integer.parseInt( sc.nextLine());
				}
				for ( int i = 0; i < Info.COMMON_COUNT; i++) {
					System.out.printf("[ %2d ]번째 공통과목 의 점수를 입력하세요 : ", i+1);
					commons[ i ] = Integer.parseInt( sc.nextLine());
				}
				student.appendScoreInfo(name, majors, commons);
				System.out.print( "\n이름을 입력하세요 ( \'end\'면 종료 ) : " );
				name = sc.nextLine();
			}
			
		
		}
	}

	private void printStudent() {
		// TODO Auto-generated method stub
		
	}

	private void printStudentAvg() {
		// TODO Auto-generated method stub
		
	}
}
