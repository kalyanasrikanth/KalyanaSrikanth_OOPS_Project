package LabAssignment3;

import java.util.Scanner;

public class PowerOfXOverN {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the base: ");
		int base = keyboard.nextInt();
		
		System.out.println("Enter the exponent: ");
		int exponent = keyboard.nextInt();
		
		System.out.println("The result is: "+powerOf(base,exponent));
		keyboard.close();
	}
	
	public static int powerOf(int base, int exponent) {
		if(exponent == 0) {
			return 1;
		}else if(exponent%2==0) {
			return powerOf(base,exponent/2)*powerOf(base,exponent/2); 	
		}else {
			return base*powerOf(base,exponent/2)*powerOf(base,exponent/2);
		}
	}

}
