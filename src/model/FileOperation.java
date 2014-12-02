/*
 * Created by Mehmet ONLER on 02.12.2014
 */
package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileOperation implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3607150503738259023L;
	private String path;
	private String user;
	private String product;

	public FileOperation() {
		this.path = "DB//";
		this.user = "UserInfoDB.txt";
		this.product = "ProductInfoDB.txt";
	}

	@SuppressWarnings("unchecked")
	/**
	 * open UserInfoDB then get userList from stream
	 * check if arrayList have any element
	 * if not then add one -username:admin userType:admin-
	 * then return userList
	 * */
	public ArrayList<User> readUserList() {
		ArrayList<User> userList = new ArrayList<User>();
		try {
			// create an ObjectInputStream for the file we created before
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
					path + user));
			userList = (ArrayList<User>) ois.readObject();
			ois.close();
		} catch (Exception ex) {
			userList.add(new User(UserType.Admin, "admin"));
			writeUserList(userList);
		}

		return userList;
	}

	/**
	 * @param userList
	 *            open userInfoDB write userList to file and close the file
	 */
	public boolean writeUserList(ArrayList<User> userList) {
		try {
			// create a new file with an ObjectOutputStream
			FileOutputStream fileOut = new FileOutputStream(path + user);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);

			// // write something in the file
			out.writeObject(userList);

			// // close the stream
			out.close();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	/**
	 * open ProductInfoDB then get productList from stream
	 * check if arrayList have any element
	 * if not then return empty arrayList
	 * else return productList
	 * */
	public ArrayList<Product> readProductList() {
		ArrayList<Product> productList = new ArrayList<Product>();
		try {
			// create an ObjectInputStream for the file we created before
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
					path + product));
			productList = (ArrayList<Product>) ois.readObject();
			ois.close();
		} catch (Exception ex) {
			productList = new ArrayList<Product>();
		}
		return productList;
	}

	/**
	 * @param productList
	 *            open productInfoDB write productList to file and close the
	 *            file
	 */
	public boolean writeProductList(ArrayList<Product> productList) {
		try {
			// create a new file with an ObjectOutputStream
			FileOutputStream fileOut = new FileOutputStream(path + product);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);

			// // write something in the file
			out.writeObject(productList);

			// // close the stream
			out.close();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
