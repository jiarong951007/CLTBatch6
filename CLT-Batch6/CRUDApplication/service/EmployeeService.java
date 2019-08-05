package service;

import java.util.List;

import pojo.Employee;

public interface EmployeeService {

	public void callAddEmployee(Employee refEmployee);

	public void callUpdateEmployee(Employee refEmployee);
	
	public void callListEmployee(Employee refEmployee);

	public void callFindEmployeeByID(Employee refEmployee);

	public void callDeleteEmployee(Employee refEmployee);

}
	
