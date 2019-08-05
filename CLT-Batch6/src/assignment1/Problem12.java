package assignment1;

public class Problem12 {

	public static void main(String[] args) {
		
		class SecondLargestNumber {
			
		}
		int arr[] = {5, 2, 14, 21, 10, 39, 28, 42};
		int largest = arr[0];
		int secondlargest = arr[0];
	
		
		for (int i=0; i<arr.length; i++) 
			System.out.print(arr[i]+"\t");
				
	for (int i=0; i<arr.length; i++) {
		
		if (arr[i] > largest) {  //if the current value is greater than the largest number
			secondlargest = largest; //move the largest value to the second largest
			largest = arr[i]; //and make the current value the largest
			
		} else if (arr[i] > secondlargest) { //if the current value is smaller than greatest but greater than the second largest number
			secondlargest = arr[i]; //the current value become the second largest
		}
		}
	
	System.out.println("\nThe second largest number is "+secondlargest);
	
		int smallest = arr[0];
		int secondsmallest = arr[0]; {

		for (int j=0; j<arr.length; j++) {
	
			if (arr[j] < smallest) {
				
		secondsmallest = smallest; 
		smallest = arr[j];
		
	} else if (arr[j] < secondsmallest) {
		secondsmallest = arr[j];
	}
	}

System.out.println("\nThe second smallest number is "+secondsmallest);
	
	}
	}
	}

	
	
