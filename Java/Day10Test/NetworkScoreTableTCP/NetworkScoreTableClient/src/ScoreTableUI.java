import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreTableUI {
	private NetworkScoreTableClient scoreTableClient;
	
	public ScoreTableUI() {
		scoreTableClient = new NetworkScoreTableClient( "localhost", 9000 );
	}
	
	public void mainMenu() {
		String menu = "   <<< ���� ���� >>>\n\n"
					+ "1. �л� ���� ���� ���\n"
				    + "2. ���� �϶�ǥ ���\n"
				    + "0. ����\n"
				    + "���ϴ� �޴��� �����ϼ���... ";
		Scanner sc = new Scanner( System.in );
		int select = -1;
		while ( select != 0 ) {
			System.out.print( menu );
			select = Integer.parseInt( sc.nextLine() );
			switch ( select ) {
			case 1: inputStudentInfo();				break;
			case 2: printScoreTable();				break;
			case 0: scoreTableClient.disconnect();	break;
			default: System.out.println( "Error : 0 ~ 2���̸� �Է� ����...\n" );
			}
		} 
		System.out.println( "\nStop program.....\n" );
	}
	
	public void inputStudentInfo() {
		Scanner sc = new Scanner( System.in );
		
		String name;
		int subject;
		
		StringBuffer message;
		
		System.out.printf( "\n�л� �̸� �Է� ( �̸��� \'end\' �̸� ���� ) : " );
		name = sc.nextLine();
		while ( !name.equals( "end" ) ) {
			message = new StringBuffer();
			message.append( "1/" );
			message.append( name + "/" );
			for ( int i = 0; i < Student.MAX_SUBJECT; ++i ) {
				System.out.printf( "\t[%2d]��° ���� ���� �Է� ( 0 ~ 100 ) : ", i + 1 );
				subject = Integer.parseInt( sc.nextLine() );
				while ( subject < Student.LOW_SCORE || subject > Student.HIGH_SCORE ) {
					System.out.printf( "\tError : ������ 0 ~ 100���̸� �Է� �ϼ���.\n\n" );
					System.out.printf( "\t[%2d]��° ���� ���� �Է� ( 0 ~ 100 ) : ", i + 1 );
					subject = Integer.parseInt( sc.nextLine() );
				}
				message.append( String.valueOf( subject ) + "/" );
			}
			scoreTableClient.send( message );
			
			System.out.printf( "\n�л� �̸� �Է� ( �̸��� \'end\' �̸� ���� ) : " );
			name = sc.nextLine();
		}
		System.out.println();
	}

	public void printScoreTable() {
		StringBuffer message = new StringBuffer();
		int count = 0;
		message.append( "2/" );
		scoreTableClient.send( message );
		
		List<String> msgReceive = scoreTableClient.receive();
		
		System.out.println();
		System.out.println( "\t\t    <<< �����϶�ǥ >>>" );
		System.out.println();
		System.out.println( "---------------------------------------------------------------" );
		System.out.println( "�̸�\t\t������\t����\t���\t����\t���" );
		System.out.println( "---------------------------------------------------------------" );
		for ( String student : msgReceive ) {
			System.out.println( student );
			++count;
		}
		System.out.println( "---------------------------------------------------------------" );
		System.out.printf( "\t\t\t\t\t\t  ���л��� : %2d\n", count );
		System.out.println();
		
	}
}
