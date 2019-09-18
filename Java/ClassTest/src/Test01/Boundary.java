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
		String menu = "1. ���� �Է�\n"
					+ "2. ��ȸ\n"
					+ "3. �����϶�ǥ\n"
					+ "0. ����\n";
		
		int select = -1;
		while (select != 0) {
			System.out.print(menu);
			select = Integer.parseInt(sc.nextLine());
			switch ( select ) {
			case 1 : inputEntity();	break;
			case 2 : printEntity();	break;
			case 3 : gradeCheck();	break;
			case 0 :				break;
			default: System.out.println("Error : 0 ~ 3 ���̸� �Է� ����...");
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
		
		System.out.print("�̸� �Է� ( \'end\' : ���� ) : ");
		name = sc.nextLine();
		while (!name.equals("end") ) {
			System.out.print(" 1���� ���� ���� �Է��ϼ��� : ");
			subject1 = Integer.parseInt( sc.nextLine());
			while ( subject1 < LOW_SCORE || subject1 > HIGH_SCORE ) {
				System.out.printf( "\tError : ������ 0 ~ 100���̸� �Է� �ϼ���.\n\n" );
				System.out.print(" 1���� ���� ���� �Է��ϼ��� : ");
				subject1 = Integer.parseInt( sc.nextLine());
			}
			System.out.print(" 2���� ���� ���� �Է��ϼ��� : ");
			subject2 = Integer.parseInt( sc.nextLine());
			while ( subject2 < LOW_SCORE || subject2 > HIGH_SCORE ) {
				System.out.printf( "\tError : ������ 0 ~ 100���̸� �Է� �ϼ���.\n\n" );
				System.out.print(" 2���� ���� ���� �Է��ϼ��� : ");
				subject2 = Integer.parseInt( sc.nextLine());
			}
			
			System.out.print(" 3���� ���� ���� �Է��ϼ��� : ");
			subject3 = Integer.parseInt( sc.nextLine());
			while ( subject3 < LOW_SCORE || subject3 > HIGH_SCORE ) {
				System.out.printf( "\tError : ������ 0 ~ 100���̸� �Է� �ϼ���.\n\n" );
				System.out.print(" 3���� ���� ���� �Է��ϼ��� : ");
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

			System.out.print("�̸� �Է� ( \'end\' : ���� ) : ");
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










