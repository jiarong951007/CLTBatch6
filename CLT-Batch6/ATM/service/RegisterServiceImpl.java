package service;

import dao.RegisterDAO;
import dao.RegisterDAOImpl;
import pojo.Register;

public class RegisterServiceImpl implements RegisterService {
	
	RegisterDAO refRegisterDAO;
  
	@Override
	public void CheckRegStatus(Register ref) {
		
		//creating an object to call the reference from RegisterDAO
		refRegisterDAO = new RegisterDAOImpl();
		if(refRegisterDAO.registerValidate(ref)==true) {
			System.out.println("Registration Successful!!");
		}else {
			System.out.println("Registration Fail!!"); 
		}
	}
}
