package Test02;

import java.util.*;

import Test01.Entity;

public class Product {
	private List<ProductInfo> product = new ArrayList<>();
	
	
	public void appendProductInfo(ProductInfo info) {
		product.add(info);
		
	}
	
	public void appnedProductSell(String name,int count) {
		int amount = 0;
		for(int i = 0; i < product.size(); i++) {
			if(product.get(i).getName().equals(name)) {
				product.get(i).setCount(count);
				amount = 0;
				amount = (product.get(i).getPrice() * product.get(i).getCount());
				product.get(i).setAmount(amount);
			}
		}
	}
	
	
	public String toString() {
		StringBuffer str = new StringBuffer();
		
		for(ProductInfo value : product ) {
			str.append( String.format("%-7s", value.getName()));
			str.append( String.format("%4d", value.getPrice()));
			str.append( String.format("%4d", value.getCount()));
			str.append( String.format("%4d\n", value.getPrice()));
			
		}
		return str.toString();
	}
	
}
