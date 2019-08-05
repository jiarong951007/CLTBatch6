package dao;

import java.util.List;

import pojo.Employee;

public interface EmployeeDAO {


	public void addEmployee(Employee refEmployee); 
	public void updateEmployee(Employee refEmployee);
	public List <Employee> listEmployee(Employee refEmployee);
	public void findEmployee(Employee refEmployee);
	public void deleteEmployee(Employee refEmployee);
	 
	
}
