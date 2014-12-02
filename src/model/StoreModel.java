package model;

import java.util.ArrayList;

public class StoreModel {

	private ArrayList<User> userList;
	private ArrayList<Product> productList;
	private User currentUser;

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

	/**
	 * @param userID
	 * @param userType
	 * @param username
	 *            firstly, find the index of given id if index not found than
	 *            return false else change the user's information and return
	 *            true
	 */
	public boolean editUser(int userID, UserType userType, String username) {
		int index = searchByID(userID, "userList");
		if (index == -1) {
			return false;
		} else {
			userList.get(index).setUsername(username);
			userList.get(index).setUserType(userType);
		}
		return true;
	}

	/**
	 * @param productID
	 * @param productType
	 * @param title
	 * @param price
	 * 
	 *            firstly, search the product index for given productID in
	 *            productList then, if index different then -1 change
	 *            productType, title and price then return true otherwise return
	 *            false
	 * */
	public boolean editProduct(int productID, ProductType productType,
			String title, double price) {

		int index = searchByID(productID, "productList");
		if (index == -1) {
			return false;
		} else {
			productList.get(index).setType(productType);
			productList.get(index).setTitle(title);
			productList.get(index).setPrice(price);
		}
		return true;
	}

	/**
	 * @param id
	 * @param list
	 *            list is an string. write the list name. it is case sensitive
	 *            search the list for given id and return index of that element
	 *            if there is no such an id then return -1
	 * */
	public int searchByID(int id, String list) {
		if (list == "userList") {
			for (int i = 0; i < userList.size(); i++) {
				if (userList.get(i).getUserID() == id) {
					return i;
				}
			}
		} else {
			for (int i = 0; i < productList.size(); i++) {
				if (productList.get(i).getProductID() == id) {
					return i;
				}
			}
		}
		return -1;
	}

	/**
	 * @param username
	 * 				find the user object by user name and equalize it to currentUser*/
	public void setCurrentUser(String username) {
		for (int i = 0; i < userList.size(); i++) {
			if(username == userList.get(i).getUsername()){
				currentUser = userList.get(i);
				break;
			}
		}
	}

	public ArrayList<User> searchByUsername (String username){
		ArrayList<User> searchResultList = new ArrayList<User>();
		
		
		return searchResultList;		
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
