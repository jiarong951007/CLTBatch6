package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayExample2 {



	public static void main(String args[]) { 
		
		
		List refList = new ArrayList();
			
			Scanner sc = new Scanner(System.in);
		
		String name; 
		
		for(int i=0; i < 10; i++){
			System.out.println("Enter your name: ");
				  name = sc.next();
			 
				  if (refList.contains(name)) {
	            System.out.println("Duplicates are not allowed!");
	            
	        }  else {
	        	refList.add(name);
		System.out.println(refList); 
		
	        }
			 }
			 }
	}

		 
		 
	



