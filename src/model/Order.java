/*
 * Created by Mehmet ONLER on 02.12.2014
 */
package model;
public class Order {
	private int productID;
	private OrderState orderState;

	public Order(int productID) {
		this.productID = productID;
		this.orderState = OrderState.OnStore;
	}

	public OrderState getOrderState() {
		return orderState;
	}

	public void setOrderState(OrderState orderState) {
		this.orderState = orderState;
	}

	public int getProductID() {
		return productID;
	}

	@Override
	public String toString() {
		return "Order [productID=" + productID + ", orderState=" + orderState
				+ "]";
	}
}
