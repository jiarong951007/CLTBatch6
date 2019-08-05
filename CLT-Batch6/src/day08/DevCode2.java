package day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DevCode2 {

	// 1. handle NullPointerException(pointing null)
	// 2. handle NumberFormatException (BufferedReader)
	// 3. handle InputMismatchException (Scanner)
	
	static void logic() throws NumberFormatException, IOException {
		/* Scanner sc = new Scanner(in);
		System.out.println("Enter number: ")
		int number =sc.nextInt();
	System.out.println(number); */
	
		// Number Format Exception
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter number: ");
	
try {
	int number = Integer.parseInt(br.readLine());
	System.out.println(number);
	}
		
	catch (NumberFormatException e) {
		System.out.println("Please enter a number");
	} 
  //End of Number Format Exception

  //Null Pointer Exception
		/*try {
		String s = null;
		s.equals("Hello");}a
		
		
		catch (NullPointerException e) {
			System.out.println("Object is null");
		}
	//End of Number Format Exception */
		
	finally {
		System.out.println("Closing...");
	}
	}
}