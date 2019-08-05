package day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Customer{
	String name;
	Customer(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
	
}
public class ArrayExample3 {

  
		public static void main(String[] args) {
			
			List refList = new ArrayList();
			
			refList.add(new Customer("Charles"));
			refList.add(new Customer("Jerret"));
			
			
			Scanner sc = new Scanner(System.in);
			
			for(int i=0; i < 10; i++){
			System.out.println("Enter Name:");
			String name = sc.next();
			
			   if (refList.contains(name)) {
			      System.out.println("Duplicates are not allowed!");
		            
		        }  else {
		        	refList.add(new Customer(name));
			System.out.println(refList); 
			
		        }
			}
			}
		}
	
		

