package controller;

import java.util.Scanner;

import pojo.Register;
import service.RegisterService;
import service.RegisterServiceImpl;

public class RegisterController {

	RegisterService refRegisterService; 
	Register refRegister;
	public void userRegisterController( ) {
		registerInput();
	}
	
	void registerInput() { 
		Scanner sc = new Scanner (System.in);
		
		//step1: registering of email address, password and security question
		System.out.println("Enter your email address:");
		String userEmail = sc.next();
		
		
		System.out.println("Enter password");
		String userPassword = sc.next();
		
	
		System.out.println("Re-type Password");
		String retypePassword = sc.next();
		
	
		System.out.println("What is your favourite color?");
		String securityQn = sc.next();
		
		//step2: creating object of Register class
		 refRegister = new Register();
	
	//step3: set value to setter method of Register class
		refRegister.setEmail(userEmail);
		refRegister.setPassword(userPassword);
		refRegister.setRetype(retypePassword);
		refRegister.setSecurityQn(securityQn);
		
	//step4: create object of RegisterServiceImpl class and refer to its interface
		refRegisterService = new RegisterServiceImpl();
		refRegisterService.CheckRegStatus(refRegister);
		
	
	}

}
