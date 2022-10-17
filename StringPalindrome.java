package LabAssignment3;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the string to check if its palindrome or not.");
		String toBeChecked = (keyboard.nextLine()).toUpperCase();
		
		if(checkPalindrome(toBeChecked, 0, (toBeChecked.length()-1))) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
		keyboard.close();
	}
	
	public static boolean checkPalindrome(String toBeChecked, int leftIndex, int rightIndex) {
		if(leftIndex == rightIndex) {
			return true;
		}else if(toBeChecked.charAt(leftIndex) != toBeChecked.charAt(rightIndex)) {
			return false;
		}else {
			return checkPalindrome(toBeChecked, leftIndex+1, rightIndex-1);
		}
	}

}
