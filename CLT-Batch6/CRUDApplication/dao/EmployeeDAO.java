package dao;

import java.util.List;

import pojo.Employee;

public interface EmployeeDAO {


	public void addEmployee(Employee refEmployee); 
	public void updateEmployee(Employee refEmployee);
	public void listEmployee(Employee refEmployee);
	 
	
}
