package controller;

import java.util.Scanner;
import pojo.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;


public class AdminController {

	Employee refEmployee;
	EmployeeService refEmployeeService;
	
	public void adminProcess() {
		userInput();
	}

		public void userInput() {
		refEmployee = new Employee();
		refEmployeeService = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Employee ID");
		int employeeID = sc.nextInt();
		refEmployee.setEmployeeID(employeeID); 
		
		System.out.println("Enter your name");
		String name = sc.next();
		refEmployee.setEmployeeName(name); 
		
		System.out.println("Enter your password");
		String password = sc.next();
		refEmployee.setEmployeePassword(password);
			
		System.out.println("Enter your Date of Birth:");
		String dob = sc.next();
		refEmployee.setEmployeeDOB(dob);
			
		refEmployeeService.callAddEmployee(refEmployee); }
		
		public void userInputUpdateEmployee() {
			
			refEmployee = new Employee();
			refEmployeeService = new EmployeeServiceImpl();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your Employee ID");
			int employeeID = sc.nextInt();
			refEmployee.setEmployeeID(employeeID); 
			
			System.out.println("Enter your name");
			String name = sc.next();
			refEmployee.setEmployeeName(name); 
			
			System.out.println("Enter your password");
			String password = sc.next();
			refEmployee.setEmployeePassword(password);
				
			System.out.println("Enter your Date of Birth:");
			String dob = sc.next();
			refEmployee.setEmployeeDOB(dob);
		
		refEmployeeService.callUpdateEmployee(refEmployee);
		
	}

		public void userListEmployee() {
			
			refEmployee = new Employee();
			refEmployeeService = new EmployeeServiceImpl();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your Employee ID");
			int employeeID = sc.nextInt();
			refEmployee.setEmployeeID(employeeID); 
			
			
		}

}
