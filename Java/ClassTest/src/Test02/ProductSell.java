package Test02;

import java.util.*;


public class ProductSell {
	private List<ProductInfo> productSell;
	
	public ProductSell() {
		productSell = new ArrayList<>();
	}
	public void appnedProductSell(String name,int count) {
		productSell.add( new ProductInfo(name ,count));
		int amount = 0;
		for(int i = 0; i < productSell.size(); i++) {
			if(productSell.get(i).getName() == name) {
				amount = 0;
				amount = (productSell.get(i).getPrice() * productSell.get(i).getCount());	
				productSell.get(i).setAmount(amount);
			}
		}
	}
	public void printProductSell() {
		for (ProductInfo product : productSell) {
			System.out.println( product );
		}
	}
	
	
}
