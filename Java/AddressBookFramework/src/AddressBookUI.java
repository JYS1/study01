import java.util.Scanner;

public class AddressBookUI {
	private AddressBook addressBook;	//AddressBook�� AddressBookUI ����
	Scanner sc = new Scanner(System.in);
	public AddressBookUI() {
		addressBook = new AddressBook();
	}
	
	public void mainMenu() {
		String menu = "1. �ּ����� ���\n"
					+ "2. �ּ����� ����\n"
					+ "3. �ּ����� �˻�\n"
					+ "4. �ּҷ� �������\n"
					+ "0. ����\n"
					+ "���ϴ� �޴��� �����ϼ���....";
		Scanner sc = new Scanner(System.in);
		int select = -1;
		while( select != 0 ) {
			System.out.print(menu);
			select = Integer.parseInt(sc.nextLine());
			switch ( select ) {
			case 1 : inputAddressInfo(); 	break;
			case 2 : deleteAddressInfo();	break;
			case 3 : searchAddressInfo();	break;
			case 4 : printAddressBook();	break;
			case 0 : 						break;
			default : System.out.println("Error : 0 ~ 4���̸� �Է� ����...");
			}
		}
	}
	public void inputAddressInfo() {
		
		String name;
		String tel;
		String email;
		
		System.out.print(" �ּ� ���� �̸� �Է� ( \'end\' : ����) : ");
		name = sc.nextLine();
		while( !name.equals("end")) {
			System.out.print("�ּ� ���� ��ȭ��ȣ �Է� : ");
			tel = sc.nextLine();
			System.out.print("�ּ� ���� e-mail �Է� : ");
			email = sc.nextLine();
			
			addressBook.appendAddressInfo( new AddressInfo( name , tel , email ));
			
			System.out.print("�ּ� ���� �̸� �Է� ( \'end\' : ����) : ");
			name = sc.nextLine();
		}
		
	}
	public void deleteAddressInfo() {
		
		String name;
		String tel;
		
		System.out.print(" ������ ������ �̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		System.out.print(" ������ ������ ��ȭ��ȣ�� �Է��ϼ��� : ");
		tel = sc.nextLine();
		
		addressBook.removeAddressInfo(name, tel);
	}
	public void searchAddressInfo() {
		String name;
		String tel;
		
		System.out.print(" ã�� �ּ��� �̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		System.out.print(" ã�� �ּ��� ��ȭ��ȣ�� �Է��ϼ��� : ");
		tel = sc.nextLine();
		
		addressBook.searchAddressInfo(name, tel);
	}
	public void printAddressBook() {
		System.out.println();
		System.out.println( addressBook );
		System.out.println();
	}
	
}
