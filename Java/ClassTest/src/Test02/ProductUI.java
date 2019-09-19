package Test02;

import java.util.*;

public class ProductUI {
	private Product products;
	
	public ProductUI() {
		products = new Product();
	}
	
	
	Scanner sc = new Scanner(System.in);
	public void mainMenu() {
		String menu = " << 물품 관리 >>\n"
					+ "1. 품목 정보 등록\n"
					+ "2. 판매 정보 등록\n"
					+ "3. 판매 일람표 등록 ( 품목 명순 )\n"
					+ "4. 판매 일람표 출력 ( 판매 금액순 )\n"
					+ "0. 종료\n";
		int select = -1;
		while( select != 0) {
			System.out.print(menu);
			select = Integer.parseInt(sc.nextLine());
			switch(select) {
			case 1 : inputProductInfo();	break;
			case 2 : inputSellInfo();		break;
			case 3 : printTableProduct();	break;
			case 4 : printTableSell();		break;
			case 0 :						break;
			default : System.out.println("Error : 0 ~ 4번 사이에 숫자를 입력해 주세요.");
			}
		}
		System.out.println(" STOP ");
	}
	


	public void inputProductInfo() {
		String name;
		int price;
		System.out.print(" 품목 이름을 입력하세요 (end 입력시 Stop) : ");
		name = sc.nextLine();
		while (!name.equals("end")) {
			System.out.print(" 		가격을 입력해 주세요 : ");
			price = Integer.parseInt(sc.nextLine());
			
			System.out.print(" 품목 이름을 입력하세요 (end 입력시 Stop) : ");
			name = sc.nextLine();
			products.appendProductInfo(new ProductInfo(name,price)); // 변수 지정.
		}
	}
	
	public void inputSellInfo() {
		String name;
		int count;
		System.out.print(" 품목 이름을 입력하세요 (end 입력시 Stop) : ");
		name = sc.nextLine();
		while (!name.equals("end")) {
			System.out.print(" 		판매수량을 입력해주세요 : ");
			count = Integer.parseInt(sc.nextLine());
			System.out.print(" 품목 이름을 입력하세요 (end 입력시 Stop) : ");
			
			name = sc.nextLine();
			products.appnedProductSell(name, count);
		}
		
	}
	

	
	public void printTableProduct() {
		System.out.print(products);

	}
	
	private void printTableSell() {
		
		
	}
	
}




