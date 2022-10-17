package LabAssignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoNumberInSortedArraySumEqualsTarget {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the number of elements to added to the nums list.");
		int size = keyboard.nextInt();
		
		int[] nums = new int[size];
		
		System.out.println("Please enter the elements to added to the nums list.");
		for(int i=0; i<size; i++) {
			nums[i] = keyboard.nextInt();
		}
		
		System.out.print("The entered elements are: [");
		for(int i=0; i<size; i++) {
			if(i<(nums.length-1)) {
				System.out.print(nums[i]+", ");
			}else {
				System.out.println(nums[i]+"]");
			}
		}
		
		System.out.println("Please enter the target.");
		int target = keyboard.nextInt();
		
		System.out.println("The indices of the elements are: "+checkTarget(nums, target));
		keyboard.close();
	}
	
	public static List<Integer> checkTarget(int[] nums, int target) {
		List<Integer> matchingIndices = new ArrayList<>();
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if((matchingIndices.contains(i)) || (matchingIndices.contains(j))) {
					continue;
				}
				if((nums[i]+nums[j]) == target){
					matchingIndices.add(i);
					matchingIndices.add(j);
					break;
				}
			}
		}
		return matchingIndices;
	}

}
