package LabAssignment3.vendingMachine;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Product> cartList;
	
	Cart(){
		this.cartList = new ArrayList<Product>();
	}
	
	void addToCart(Product product) {
		this.cartList.add(product);
	}
	
	public List<Product> getCartList() {
		return cartList;
	}
}
