package Test02;

import java.util.*;

public class ProductUI {
	private Product products;
	
	public ProductUI() {
		products = new Product();
	}
	
	
	Scanner sc = new Scanner(System.in);
	public void mainMenu() {
		String menu = " << ��ǰ ���� >>\n"
					+ "1. ǰ�� ���� ���\n"
					+ "2. �Ǹ� ���� ���\n"
					+ "3. �Ǹ� �϶�ǥ ��� ( ǰ�� ��� )\n"
					+ "4. �Ǹ� �϶�ǥ ��� ( �Ǹ� �ݾ׼� )\n"
					+ "0. ����\n";
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
			default : System.out.println("Error : 0 ~ 4�� ���̿� ���ڸ� �Է��� �ּ���.");
			}
		}
		System.out.println(" STOP ");
	}
	


	public void inputProductInfo() {
		String name;
		int price;
		System.out.print(" ǰ�� �̸��� �Է��ϼ��� (end �Է½� Stop) : ");
		name = sc.nextLine();
		while (!name.equals("end")) {
			System.out.print(" 		������ �Է��� �ּ��� : ");
			price = Integer.parseInt(sc.nextLine());
			
			System.out.print(" ǰ�� �̸��� �Է��ϼ��� (end �Է½� Stop) : ");
			name = sc.nextLine();
			products.appendProductInfo(new ProductInfo(name,price)); // ���� ����.
		}
	}
	
	public void inputSellInfo() {
		String name;
		int count;
		System.out.print(" ǰ�� �̸��� �Է��ϼ��� (end �Է½� Stop) : ");
		name = sc.nextLine();
		while (!name.equals("end")) {
			System.out.print(" 		�Ǹż����� �Է����ּ��� : ");
			count = Integer.parseInt(sc.nextLine());
			System.out.print(" ǰ�� �̸��� �Է��ϼ��� (end �Է½� Stop) : ");
			
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




