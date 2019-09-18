package Test02;

public class ProductInfo {
	private String name;
	private int price;
	private int count;
	private int amount;
	
	

	public ProductInfo(String name, int price) {
		this.name = name;
		this.price = price;
		this.count = 0;
		this.amount  = 0;
	}
	
	
	public String getName() {
		return name;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public int getPrice() {
		return price;
	}
	public int getCount() {
		return count;
	}
	public int getAmount() {
		return amount;
	}

	
}
