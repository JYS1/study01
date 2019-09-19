import java.util.Scanner;

public class SalesTableUI {
	private SalesTable salesTable;
	
	public SalesTableUI() {
		salesTable = new SalesTable();
	}
	
	public void mainMenu() {
		String menu = "   <<< 판매 관리 >>>\n\n"
					+ "1. 품목 정보 등록\n"
				    + "2. 판매 정보 등록\n"
				    + "3. 판매 일람표 출력( 품목명순 )\n"
				    + "4. 판매 일람표 출력( 판매금액순 )\n"				    
				    + "0. 종료\n"
				    + "원하는 메뉴를 선택하세요... ";
		Scanner sc = new Scanner( System.in );
		int select = -1;
		while ( select != 0 ) {
			System.out.print( menu );
			select = Integer.parseInt( sc.nextLine() );
			switch ( select ) {
			case 1: inputItemInfo();		break;
			case 2: inputSaleInfo();		break;
			case 3: printSaleTableItem();	break;
			case 4: printSaleTableAmount();	break;
			case 0: 						break;
			default: System.out.println( "Error : 0 ~ 4사이만 입력 가능...\n" );
			}
		} 
		System.out.println( "\nStop program.....\n" );
	}
	
	public void inputItemInfo() {
		Scanner sc = new Scanner( System.in );
		
		String itemName;
		int price;

		System.out.print( "\n품목명 입력 ( \'end\'면 종료 ) : " );
		itemName = sc.nextLine();
		while ( !itemName.equals( "end" ) ) {
			System.out.printf( "[ %-20s ] 단가 입력 : ", itemName );
			price = Integer.parseInt( sc.nextLine() );
			while ( price < Item.LOW_PRICE ) {
				System.out.printf( "\tError : 단가는 0이상 입력 하세요.\n\n" );
				System.out.printf( "[ %-20s ] 단가 입력 : ", itemName );
				price = Integer.parseInt( sc.nextLine() );
			}
			
			salesTable.appendItemInfo( itemName, price );
			
			System.out.print( "\n품목명 입력 ( \'end\'면 종료 ) : " );
			itemName = sc.nextLine();
		}
	}
	
	public void inputSaleInfo() {
		Scanner sc = new Scanner( System.in );
		
		String itemName;
		int saleQuantity;
		int index;

		System.out.print( "\n품목명 입력 ( \'end\'면 종료 ) : " );
		itemName = sc.nextLine();
		while ( !itemName.equals( "end" ) ) {
			index = salesTable.searchItemInfo( itemName );
			while ( index < 0 ) {
				System.out.printf( "\tError : [ %-20s ]는 등록되어 있지 않습니다.\n"
						+ "\t        품목정보 등록후 판매 정보를 등록하세요.\n", itemName );
				System.out.print( "\n품목명 입력 ( \'end\'면 종료 ) : " );
				itemName = sc.nextLine();
				if ( !itemName.equals( "end" ) ) {
					index = salesTable.searchItemInfo( itemName );
				} else {
					break;
				}
			}
			
			if ( !itemName.equals( "end" ) ) {
				System.out.printf( "[ %-20s ]의 판매 수량 입력 : ", itemName );
				saleQuantity = Integer.parseInt( sc.nextLine() );
				while ( saleQuantity < Item.LOW_QUANTITY ) {
					System.out.printf( "\tError : 판매 수량은 1 이상 입력 하세요.\n\n" );
					System.out.printf( "[ %-20s ]의 판매 수량 입력 : ", itemName );
					saleQuantity = Integer.parseInt( sc.nextLine() );
				}
				
				salesTable.appendSaleInfo( itemName, saleQuantity );
				
				System.out.println();
				System.out.print( salesTable.getSalesControl() );
				System.out.println();
				
				System.out.print( "\n품목명 입력 ( \'end\'면 종료 ) : " );
				itemName = sc.nextLine();
			} else {
				break;
			}
		}		
	}
	
	public void printSaleTableItem() {
		System.out.println();
		System.out.println( "\t  <<< 판매 일람표(품목순) >>>" );
		System.out.println();
		System.out.println( "--------------------------------------------------------" );
		System.out.println( "품목명\t\t\t단가\t판매수량\t판매금액" );
		System.out.println( "--------------------------------------------------------" );
		salesTable.printSalesTableItemName();
		System.out.println( "--------------------------------------------------------" );
		System.out.printf( "\t\t\t\t   총판매금액 : %8d\n", salesTable.getItemControl().getTotalAmount() );
		System.out.println();
	}
	
	public void printSaleTableAmount() {
		System.out.println();
		System.out.println( "\t  <<< 판매 일람표(판매금액순) >>>" );
		System.out.println();
		System.out.println( "--------------------------------------------------------" );
		System.out.println( "품목명\t\t\t단가\t판매수량\t판매금액" );
		System.out.println( "--------------------------------------------------------" );	
		salesTable.printSalesTableAmount();
		System.out.println( "--------------------------------------------------------" );
		System.out.printf( "\t\t\t\t   총판매금액 : %8d\n", salesTable.getItemControl().getTotalAmount() );
		System.out.println();		
	}
}
