package LabAssignment3.vendingMachine;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine();
		
		Products products[] = Products.values();
		
		for(Products eachProduct: products) {
			if(eachProduct == Products.MarieGoldBiscuits) {
				vendingMachine.vendingMachineLoading(vendingMachine.marieGoldBiscuit, new MarieGoldBiscuit());
			}else if(eachProduct == Products.CHIKKI) {
				vendingMachine.vendingMachineLoading(vendingMachine.chikki, new Chikki());
			}else if(eachProduct == Products.COKE) {
				vendingMachine.vendingMachineLoading(vendingMachine.coke, new Coke());
			}else if(eachProduct == Products.KitKat) {
				vendingMachine.vendingMachineLoading(vendingMachine.kitKat, new KitKat());
			}else {
				vendingMachine.vendingMachineLoading(vendingMachine.saltedLays, new SaltedLays());
			}
		}
		
		Scanner keyboard = new Scanner(System.in);
		int optionsMenuSelected;
		Cart cart = new Cart();
		boolean repeat = true;
		
		do {
			do {
				optionsMenuSelected = productsMenu(keyboard);
				if(optionsMenuSelected == 1) {
					try {
						if(vendingMachine.marieGoldBiscuit.isEmpty()) {
							throw new OutOfStockException("Marie Gold Biscuits are out of stock!");
						}else {
							cart.addToCart(vendingMachine.marieGoldBiscuit.peek());
							vendingMachine.marieGoldBiscuit.remove();
						}
					}catch(OutOfStockException e) {
						System.out.println(e.getMessage());
					}
				}else if(optionsMenuSelected == 2) {
					try {
						if(vendingMachine.coke.isEmpty()) {
							throw new OutOfStockException("Coke is out of stock!");
						}else {
							cart.addToCart(vendingMachine.coke.peek());
							vendingMachine.coke.remove();
						}
					}catch(OutOfStockException e) {
						System.out.println(e.getMessage());
					}
				}else if(optionsMenuSelected == 3) {
					try {
						if(vendingMachine.chikki.isEmpty()) {
							throw new OutOfStockException("Chikki is out of stock!");
						}else {
							cart.addToCart(vendingMachine.chikki.peek());
							vendingMachine.chikki.remove();
						}
					}catch(OutOfStockException e) {
						System.out.println(e.getMessage());
					}
				}else if(optionsMenuSelected == 4) {
					try {
						if(vendingMachine.kitKat.isEmpty()) {
							throw new OutOfStockException("KitKat is out of stock!");
						}else {
							cart.addToCart(vendingMachine.kitKat.peek());
							vendingMachine.kitKat.remove();
						}
					}catch(OutOfStockException e) {
						System.out.println(e.getMessage());
					}
				}else if(optionsMenuSelected == 5) {
					try {
						if(vendingMachine.saltedLays.isEmpty()) {
							throw new OutOfStockException("Salted Lays are out of stock!");
						}else {
							cart.addToCart(vendingMachine.saltedLays.peek());
							vendingMachine.saltedLays.remove();
						}
					}catch(OutOfStockException e) {
						System.out.println(e.getMessage());
					}
				}else if(optionsMenuSelected != 6) {
					System.out.println("Invalid selection. Please try again.");
				}
			}while(optionsMenuSelected != 6);
			
			if(optionsMenuSelected == 6) {
				Payment payment = new Payment();
				int paymentModeSelected;
				do {
					paymentModeSelected = paymentOptionMenu(keyboard);
					if(paymentModeSelected == 1) {
						try {
							System.out.println("Please pay $"+payment.payment(cart, true));
							repeat = false;
						}catch(CartEmptyException e) {
							System.out.println(e.getMessage());
						}
					}else if(paymentModeSelected == 2) {
						try {
							System.out.println("Please pay $"+payment.payment(cart, false));
							repeat = false;
						}catch(CartEmptyException e) {
							System.out.println(e.getMessage());
						}
					}else {
						System.out.println("Invalid selection. Please try again.");
					}
				}while((paymentModeSelected < 0) || (paymentModeSelected > 2));
			}
		}while(repeat);
	}
	
	public static int productsMenu(Scanner keyboard) {
		System.out.println("Please select any of the below items to add to cart.");
		System.out.println("1. Marie Gold Biscuits -> $10.00");
		System.out.println("2. COKE -> $20.00");
		System.out.println("3. Chikki -> $5.00");
		System.out.println("4. Kit Kat -> $14.00");
		System.out.println("5. Salted Lays -> $11.00");
		System.out.println("6. Payment");
		return keyboard.nextInt();
	}
	
	public static int paymentOptionMenu(Scanner keyboard) {
		System.out.println("Please select any of the below payment options.");
		System.out.println("1. Cash");
		System.out.println("2. Card (Need to pay double the amount for this!!)");
		return keyboard.nextInt();
	}

}
