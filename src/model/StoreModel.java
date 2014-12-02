package model;
import java.util.ArrayList;

public class StoreModel {

	private ArrayList<User> userList;
	private ArrayList<Product> productList;
	private String currentUser;

	public StoreModel() {
		this.userList = new ArrayList<User>();
		this.productList = new ArrayList<Product>();
	}

	public void addUser(String username) {
		addUser(UserType.Normal, username);
	}

	public void addUser(UserType userType, String username) {
		userList.add(new User(userType, username));
	}

	public void addProduct(ProductType productType, String title, double price) {
		productList.add(new Product(productType, title, price));
	}

	/**
	 * @param username
	 *            search userList if given username exist then return true
	 *            otherwise return false
	 * */
	public boolean doesUserExist(String username) {
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getUsername() == username) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<User> getUserList() {
		return userList;
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}

	@Override
	public String toString() {
		return "StoreModel [userList=" + userList + ", productList="
				+ productList + ", currentUser=" + currentUser + "]";
	}

}
