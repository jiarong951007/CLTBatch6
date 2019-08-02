package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import dao.MyConnection;
import pojo.Employee;

	public class EmployeeDAOImpl implements EmployeeDAO {
		
		Connection conRef;
		PreparedStatement psRef;
		
		void getConnection() {
			try {
				conRef = MyConnection.prepareConnection();
			} catch  (ClassNotFoundException | SQLException e) {
				System.out.println("Connection Error..."); }
				
			}
		
		@Override
		public void addEmployee(Employee refEmployee) {
			getConnection(); 
			
			try {
				psRef = conRef.prepareStatement("INSERT into employee(employeeid, name, password, dob) values (?,?,?,?)");
				psRef.setInt(1,refEmployee.getEmployeeID());
				psRef.setString(2,refEmployee.getEmployeeName());
				psRef.setString(3,refEmployee.getEmployeePassword());
				psRef.setString(4,refEmployee.getEmployeeDOB());
				
				psRef.executeUpdate();
				System.out.println("New employee record added successfully!");
			}
			catch (SQLException e) {
				System.out.println("Unable to add employee record...");
			}
			finally {
				
				try {
					conRef.close();
				} catch (SQLException e) {
					System.out.println("Exception caught");
					
				}
			}
		
		}

		@Override
		public void updateEmployee(Employee refEmployee) {
			getConnection();
			
			try {
				psRef = conRef.prepareStatement("UPDATE employee SET name = ?,password = ?,dob = ? where employeeid = ?");
				psRef.setString(1,refEmployee.getEmployeeName());
				psRef.setString(2,refEmployee.getEmployeePassword());
				psRef.setString(3,refEmployee.getEmployeeDOB());
				psRef.setInt(4,refEmployee.getEmployeeID());

				
				psRef.executeUpdate();
				System.out.println("Employee record updated successfully!");
			}
			catch (SQLException e) {
				System.out.println("Unable to update employee record...");
			}
			finally {
				
				try {
					conRef.close();
				} catch (SQLException e) {
					System.out.println("Exception caught");
					
				}
			
		}
		
		}

		@Override
		public void listEmployee(Employee refEmployee) {
			getConnection();
			
			try { 
				psRef= conRef.prepareStatement("SELECT * FROM employee WHERE employeeid =?");
				psRef.setInt(1,refEmployee.getEmployeeID());
				
				psRef.executeUpdate();
				System.out.println("Employee is listed");
			}
			catch (SQLException e) {
				System.out.println("Unable to list employee");
			}
			finally {
				try {
					conRef.close();
				} catch (SQLException e) {
					System.out.println("Exception caught");
				}
			}
			
		}
	}
		
		
		
		
		
		
		
		
		
			
	/*public List<Employee> listEmployees; 
	
	// this will show all the employees 
	public List<Employee> listEmployee() {
		return listEmployees;
	}*/
	
		/* public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			//call your prepareConnection() from MyConnection class
			Connection con = MyConnection.prepareConnection();
			
		//Execute a query
			System.out.println("Creating a table in given database...");
			Statement st = con.createStatement();
			
			
			//create table
			String sql = "CREATE TABLE employees " +
			"(employeeid INTEGER not NULL, " +
					" name VARCHAR(35), "+
			" password VARCHAR(15), " +
			" dob VARCHAR(15), " +
					" PRIMARY KEY (employeeid))"; 
			
			
			st.executeUpdate(sql); // for saving purpose
			System.out.println("Created table in given database..."); 
			
		}
	    
		//insert employee into table
		public void addEmployee(Employee refEmployee) {
		String sql = "INSERT INTO employees(employeeid, name, password, dob) values (?,?,?)";
		
		st.executeUpdate(sql);
		
		System.out.println("Data Inserted Successfully.."); 
		
	/*
	// this method will update the existing employees detail		
	public void updateEmployee(Employee ref) {
		
	}
	public void getEmployeeByID(int id) {
	
		}

	public void removeEmployee(int id) {
	
		
	}
*/

		
	
