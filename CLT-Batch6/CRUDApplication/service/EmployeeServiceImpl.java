package service;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import pojo.Employee;


public class EmployeeServiceImpl implements EmployeeService {
	
	Employee refEmployee;
	EmployeeDAO refEmployeeDAO;
	
	public void callAddEmployee(Employee refEmployee) {
	
	 refEmployeeDAO = new EmployeeDAOImpl();	
	 
	 refEmployeeDAO.addEmployee(refEmployee);
	 
	}

	public void callUpdateEmployee(Employee refEmployee) {
		
		refEmployeeDAO = new EmployeeDAOImpl(); 
		
		 refEmployeeDAO.updateEmployee(refEmployee);

	}
	
	public void callListEmployee(Employee refEmployee) {
		
		refEmployeeDAO = new EmployeeDAOImpl(); 
		
		 refEmployeeDAO.listEmployee(refEmployee);

	}
}