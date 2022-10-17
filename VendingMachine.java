package LabAssignment3;


import java.util.LinkedList;
import java.util.Queue;

public class VendingMachine {
	Queue<MarieGoldBiscuit> marieGoldBiscuit = new LinkedList<>();
	Queue<Coke> coke =  new LinkedList<>();
	Queue<KitKat> kitKat =  new LinkedList<>();
	Queue<Chikki> chikki =  new LinkedList<>();
	Queue<SaltedLays> saltedLays =  new LinkedList<>();
	
	//Max Slots for a product in a Vending Machine.
	int maxSlots = 5;
	
	//To load Vending Machine with the products.
	void vendingMachineLoading(Queue newList, Product product) {
		for(int i=0; i<maxSlots; i++) {
			newList.add(product);
		}
	}

}
