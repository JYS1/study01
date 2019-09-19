package Test01;

import java.util.Scanner;

public class StudentUI {
	private Student student;
	
	public StudentUI() {
		student = new Student();
	}
	
	Scanner sc =  new Scanner(System.in);
	
	public void mainMenu() {
		String menu = "   <<< ���� ��� >>>\n\n"
					+ "1. �л� ���� ���\n"
				    + "2. �л� ���� ���� ���\n"
				    + "3. ���� �϶�ǥ ���( �Է¼� )\n"
				    + "4. ���� �϶�ǥ ���( ��ռ� )\n"				    
				    + "0. ����\n"
				    + "���ϴ� �޴��� �����ϼ���... ";
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
			default: System.out.println( "Error : 0 ~ 4���̸� �Է� ����...\n" );
			}
		} 
		System.out.println( "\nStop program.....\n" );
	}

	private void inputStudentInfo() {
		// TODO Auto-generated method stub
		String name;
		String subject = null;
		int number = 0;
		
		System.out.print( "\n�̸��� �Է��ϼ��� ( \'end\'�� ���� ) : " );
		name = sc.nextLine();
		while( !name.equals( "end" )) {
			System.out.print(" �а� �̸��� �������� : ");
			subject = sc.nextLine();
			System.out.print("���� ���� ������ �������� :");
			number = Integer.parseInt( sc.nextLine());
			student.appendInfo(name, subject, number);
			
			System.out.print( "\n�̸��� �Է��ϼ��� ( \'end\'�� ���� ) : " );
			name = sc.nextLine();
		
		}
		
		
		
	}

	private void inputScoreInfo() {
		// TODO Auto-generated method stub
		String name;
		int index;
		int[] majors = new int [ Student.number ]; 
		int[] commons = new int[Info.COMMON_COUNT];
		
		System.out.print( "\n�̸��� �Է��ϼ��� ( \'end\'�� ���� ) : " );
		name = sc.nextLine();
		while( !name.equals( "end" )) {
			index = student.searchInfo(name);
			while ( index < 0 ) {
				for ( int i  = 0; i < Student.number; i++) {
					System.out.printf("[ %2d ]��° ������ ������ �Է��ϼ��� : ", i+1);
					majors[ i ] = Integer.parseInt( sc.nextLine());
				}
				for ( int i = 0; i < Info.COMMON_COUNT; i++) {
					System.out.printf("[ %2d ]��° ������� �� ������ �Է��ϼ��� : ", i+1);
					commons[ i ] = Integer.parseInt( sc.nextLine());
				}
				student.appendScoreInfo(name, majors, commons);
				System.out.print( "\n�̸��� �Է��ϼ��� ( \'end\'�� ���� ) : " );
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
