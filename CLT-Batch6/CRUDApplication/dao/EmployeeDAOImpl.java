package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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

		
		public List <Employee> listEmployee(Employee refEmployee) {
			getConnection();
			
			try { 
				psRef= conRef.prepareStatement("SELECT * FROM employee");
				ResultSet rs = psRef.executeQuery();
				System.out.println("\n\n");
				System.out.println("EmployeeID\t"+"Name"+"\t\t"+"Password"+"\t"+"DOB");
				System.out.println("=========================================================");
				
				if(rs.next()) {
				do {
					System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\n\n"); }
			
					while(rs.next());
					
				}
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
			
			List<Employee> list = null;
			return list;
			
		}
		public void findEmployee(Employee refEmployee) {
			getConnection();
			
			try { 
				psRef= conRef.prepareStatement("SELECT * FROM employee where employeeID = ?");
				psRef.setInt(1,refEmployee.getEmployeeID());
				
				ResultSet rs = psRef.executeQuery();
				System.out.println("\n\n");
				System.out.println("EmployeeID\t"+"Name"+"\t\t"+"Password"+"\t"+"DOB");
				System.out.println("=========================================================");
				
				if(rs.next()) {
				do {
					System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\n\n"); }
			
					while(rs.next());
					
				}
				}
			
			catch (SQLException e) {
				System.out.println("Unable to find employee");
			}
			finally {
				try {
					conRef.close();
				} catch (SQLException e) {
					System.out.println("Exception caught");
				}
			}
			
		}
	
		public void deleteEmployee(Employee refEmployee) {
				getConnection();
				
				try {
					psRef = conRef.prepareStatement("DELETE FROM employee where employeeid = ?");
					psRef.setInt(1,refEmployee.getEmployeeID());

					
					psRef.executeUpdate();
					System.out.println("Employee "+refEmployee.getEmployeeID()+" record deleted successfully!");
				}
				catch (SQLException e) {
					System.out.println("Unable to delete employee record...");
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
		
		
		
		
		
