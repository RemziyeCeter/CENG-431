/*
 * Created by Mehmet ONLER on 02.12.2014
 */
package model;
import java.util.ArrayList;

public class User implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 771315484738324912L;
	private static int idGenerater = 0;
	private int userID;
	private UserType userType;
	private String username;
	private ArrayList<Order> orderList;

	public User(UserType userType, String username) {
		this.userType = userType;
		this.username = username;
		this.userID = ++idGenerater;
		orderList = new ArrayList<Order>();
	}

	public int getUserID() {
		return userID;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public ArrayList<Order> getOrderList() {
		return orderList;
	}

	public void addOrderList(Order order) {
		orderList.add(order);
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", userType=" + userType
				+ ", username=" + username + "]";
	}

}
