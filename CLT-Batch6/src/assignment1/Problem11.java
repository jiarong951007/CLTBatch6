package assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Problem11 {

	public static void main(String[] args) {
	
		//array list with duplicates element 
		ArrayList<Integer> refList = new ArrayList<>(Arrays.asList(1,2,3,1,2,3,4)); //creating a new array and converting it to list
	
		//adding the list to LinkedHashSet
		LinkedHashSet<Integer> refSet = new LinkedHashSet<> (refList);
		
		
		ArrayList<Integer> removeDuplicates = new ArrayList<>(refSet);
		
		System.out.println(removeDuplicates);
	
		

}
	}