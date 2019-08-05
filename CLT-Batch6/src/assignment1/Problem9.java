package assignment1;

import java.util.Arrays;


public class Problem9 {

	
	public static void checkArray(int[] arr, int toCheckValue) {
	
		// to initialize the test
		boolean test = false; 
		
		
		// to loop through the array to check if its contains a particular value 
		for (int element : arr) {
		if (element == toCheckValue) {
			test = true;
			break;
		}
		}
		// print the result
		System.out.println("Is " + toCheckValue + " present in the array: " +  test);
	}
		
	
	public static void main(String[] args) {
		
		int [] arr = {3, 8, 9, 0, 22, 4, 17};
		
		int toCheckValue = 8;
		
		System.out.println(Arrays.toString(arr));
		
		checkArray(arr, toCheckValue);
				

	}

}
