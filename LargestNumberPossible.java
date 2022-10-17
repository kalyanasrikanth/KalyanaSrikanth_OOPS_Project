package LabAssignment3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class LargestNumberPossible {

	public static void main(String[] args) {
		HashMap<Integer, Integer> highestIntegerValue = new HashMap<>();

		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Please enter the number of elements to added to the nums list.");
		int size = keyboard.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Please enter the elements to added to the nums list.");
		for(int i=0; i<size; i++) {
			arr[i] = keyboard.nextInt();
		}
		
		System.out.print("The entered elements are: [");
		for(int i=0; i<size; i++) {
			if(i<(arr.length-1)) {
				System.out.print(arr[i]+", ");
			}else {
				System.out.println(arr[i]+"]");
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			highestIntegerValue.put(highestIntegerValueCheckWithIndex(arr[i]), i);
		}
		
		TreeMap<Integer,Integer> sorted = new TreeMap<Integer, Integer>(Collections.reverseOrder());
		sorted.putAll(highestIntegerValue);
		
		String highestValue = "";
		for(Entry<Integer, Integer> entry: sorted.entrySet()) {
			highestValue = highestValue+ arr[entry.getValue()];
		}
		
		System.out.println("The number is "+highestValue);
		keyboard.close();
		
	}
	
	public static int highestIntegerValueCheckWithIndex(int value) {
		int remainder = 0;
		while(value != 0) {
			remainder = value%10;
			value = value/10;
		}
		return remainder;
	}

}
