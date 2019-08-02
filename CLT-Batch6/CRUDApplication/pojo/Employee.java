package pojo;

public class Employee {

	private int employeeID;
	private String name;
	private String password;
	private String dob;
	
	
	//getter and setter method to get employee's password
	public int getEmployeeID() {
		return employeeID;
	}
	
		public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	} 
		
		//getter and setter method to get employee's password
		public String getEmployeeName() {
			return name;
		}
		
			public void setEmployeeName(String name) {
			this.name = name;
		} 
			
		//getter and setter method to get employee's password
		public String getEmployeePassword() {
			return password;
		}
		
			public void setEmployeePassword(String password) {
			this.password = password;
		} 
	
			//getter and setter method to get employee's date of birth
			public String getEmployeeDOB() {
				return dob;
			}
			
				public void setEmployeeDOB(String dob) {
				this.dob = dob;
			} 
}
