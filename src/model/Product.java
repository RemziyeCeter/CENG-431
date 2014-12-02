package model;
public class Product {
	private ProductType type;
	private static int productID = 0;
	private String title;
	private double price;

	public Product(ProductType type, String title, double price) {
		this.type = type;
		this.title = title;
		this.price = price;
		productID++;
	}

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getProductID(){
		return productID;
	}

	@Override
	public String toString() {
		return "Product [type=" + type + ", title=" + title + ", price="
				+ price + ", ProductID()=" + getProductID() + "]";
	}
	
}
