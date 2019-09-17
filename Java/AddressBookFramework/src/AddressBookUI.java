import java.util.Scanner;

public class AddressBookUI {
	private AddressBook addressBook;	//AddressBook과 AddressBookUI 연결
	Scanner sc = new Scanner(System.in);
	public AddressBookUI() {
		addressBook = new AddressBook();
	}
	
	public void mainMenu() {
		String menu = "1. 주소정보 등록\n"
					+ "2. 주소정보 삭제\n"
					+ "3. 주소정보 검색\n"
					+ "4. 주소록 정보출력\n"
					+ "0. 종료\n"
					+ "원하는 메뉴를 선택하세요....";
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
			default : System.out.println("Error : 0 ~ 4사이만 입력 가능...");
			}
		}
	}
	public void inputAddressInfo() {
		
		String name;
		String tel;
		String email;
		
		System.out.print(" 주소 정보 이름 입력 ( \'end\' : 종료) : ");
		name = sc.nextLine();
		while( !name.equals("end")) {
			System.out.print("주소 정보 전화번호 입력 : ");
			tel = sc.nextLine();
			System.out.print("주소 정보 e-mail 입력 : ");
			email = sc.nextLine();
			
			addressBook.appendAddressInfo( new AddressInfo( name , tel , email ));
			
			System.out.print("주소 정보 이름 입력 ( \'end\' : 종료) : ");
			name = sc.nextLine();
		}
		
	}
	public void deleteAddressInfo() {
		
		String name;
		String tel;
		
		System.out.print(" 삭제할 정보의 이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print(" 삭제할 정보의 전화번호를 입력하세요 : ");
		tel = sc.nextLine();
		
		addressBook.removeAddressInfo(name, tel);
	}
	public void searchAddressInfo() {
		String name;
		String tel;
		
		System.out.print(" 찾을 주소의 이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print(" 찾을 주소의 전화번호를 입력하세요 : ");
		tel = sc.nextLine();
		
		addressBook.searchAddressInfo(name, tel);
	}
	public void printAddressBook() {
		System.out.println();
		System.out.println( addressBook );
		System.out.println();
	}
	
}
