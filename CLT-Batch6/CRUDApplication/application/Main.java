package application;

import java.util.Scanner;

import controller.AdminController;

public class Main {

	public static void main(String[] args) {
	
		AdminController adminControllerRef = new AdminController();
		

		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Employee Home Page:");
			System.out.println("1.Add Employee");
			System.out.println("2.Update Employee");
			System.out.println("3.List Employee");
			System.out.println("4.Get Employee by ID");
			System.out.println("5.Delete Employee");
			
			System.out.println("\nEnter Your Choice:");

			int n = sc.nextInt(); //to enter the options 1,2,3,4 or 5. 
			
			switch(n)
			{
			case 1: 
			adminControllerRef.adminProcess();
			break;
			
			case 2:  
			adminControllerRef.userInputUpdateEmployee();
			break;
			
			case 3:
			adminControllerRef.userListEmployee();
			break;
			
			case 4:
			adminControllerRef.findEmployeeByID();
			break;
			
			case 5:
			adminControllerRef.userDeleteEmployee();
			break;
			}
			
			}		

	}

}
