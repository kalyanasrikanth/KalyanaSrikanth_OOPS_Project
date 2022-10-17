package LabAssignment3;

public class Payment {
	private double amount;
	
	double payment(Cart cart, boolean cash) {
		if(cart.getCartList().isEmpty()) {
			throw new CartEmptyException("Your Cart is empty. Please add something to checkout.");
		}
		for(Product product:cart.getCartList()) {
			amount += product.getPrice();
		}
		if(cash) {
			return amount;
		}else {
			return (amount*2);
		}
	}
}
