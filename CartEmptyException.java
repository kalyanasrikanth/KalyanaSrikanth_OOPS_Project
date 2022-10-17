package LabAssignment3.vendingMachine;

public class CartEmptyException extends RuntimeException {
	
	public CartEmptyException(String message) {
		super(message);
	}
}
