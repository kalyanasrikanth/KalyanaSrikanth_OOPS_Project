package LabAssignment3.vendingMachine;

public class Product {
	private Products name;
	private double price;
	
	Product(Products name, double price){
		this.name = name;
		this.price = price;
	}

	public Products getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}
