package Test01;

import java.util.Scanner;

public class Boundary {
	private Control boundary;
	
	public Boundary() {
		boundary = new Control();
	}
	
	
	final int MAX_STUDENT = 10;
	Scanner sc = new Scanner(System.in);
	public void mainMenu() {
		String menu = "1. 성적 입력\n"
					+ "2. 조회\n"
					+ "3. 성적일람표\n"
					+ "0. 종료\n";
		
		int select = -1;
		while (select != 0) {
			System.out.print(menu);
			select = Integer.parseInt(sc.nextLine());
			switch ( select ) {
			case 1 : inputEntity();	break;
			case 2 : printEntity();	break;
			case 3 : gradeCheck();	break;
			case 0 :				break;
			default: System.out.println("Error : 0 ~ 3 사이만 입력 가능...");
			}
		}
		System.out.println("STOP");
	}
	public void inputEntity() {
		final int LOW_SCORE = 0;
		final int HIGH_SCORE = 100;
		String name;
		int total = 0;
		double average;
		String grade;
		int rank = 1;
		int subject1, subject2, subject3;
		
		System.out.print("이름 입력 ( \'end\' : 종료 ) : ");
		name = sc.nextLine();
		while (!name.equals("end") ) {
			System.out.print(" 1번쨰 과목 점수 입력하세요 : ");
			subject1 = Integer.parseInt( sc.nextLine());
			while ( subject1 < LOW_SCORE || subject1 > HIGH_SCORE ) {
				System.out.printf( "\tError : 점수는 0 ~ 100사이만 입력 하세요.\n\n" );
				System.out.print(" 1번쨰 과목 점수 입력하세요 : ");
				subject1 = Integer.parseInt( sc.nextLine());
			}
			System.out.print(" 2번쨰 과목 점수 입력하세요 : ");
			subject2 = Integer.parseInt( sc.nextLine());
			while ( subject2 < LOW_SCORE || subject2 > HIGH_SCORE ) {
				System.out.printf( "\tError : 점수는 0 ~ 100사이만 입력 하세요.\n\n" );
				System.out.print(" 2번쨰 과목 점수 입력하세요 : ");
				subject2 = Integer.parseInt( sc.nextLine());
			}
			
			System.out.print(" 3번쨰 과목 점수 입력하세요 : ");
			subject3 = Integer.parseInt( sc.nextLine());
			while ( subject3 < LOW_SCORE || subject3 > HIGH_SCORE ) {
				System.out.printf( "\tError : 점수는 0 ~ 100사이만 입력 하세요.\n\n" );
				System.out.print(" 3번쨰 과목 점수 입력하세요 : ");
				subject3 = Integer.parseInt( sc.nextLine());
			}
			
			total = subject1 + subject2 + subject3;
				
			average = total / (double)Entity.MAX_SUBJECT;
			
			if( average >= Entity.EXCELLENT) {
				grade = "Excellent";
			} else if ( average < Entity.FAIL ) {
				grade = "Fail";
			} else {
				grade = "";
			}
			boundary.rankcount(rank);
			boundary.appendEntity(new Entity(name, subject1, subject2, subject3, total, average, grade));

			System.out.print("이름 입력 ( \'end\' : 종료 ) : ");
			name = sc.nextLine();
		}
		
	}


	
	public void printEntity() {
		System.out.println();
		System.out.print(boundary);
		System.out.println();
	}
	
	public void gradeCheck() {
		
	}


}










