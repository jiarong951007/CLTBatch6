package pojo;

public class Register {
	
	// email address and password is encapsulated data by setting it to private. 
	private String userEmail;
	private String userPassword; 
	private String retypePassword;
	private String securityQn;
	
	//getter and setter method for user's email address
	public String getEmail() {
		return userEmail;
	}
	public void setEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	//getter and setter method for user's password
	public String getPassword() {
		return userPassword;
	}
	public void setPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	//getter and setter method for user's retype password
	public String getRetype() {
		return retypePassword;
	}
	public void setRetype(String retypePassword) {
		this.retypePassword = retypePassword;
	}

	//getter and setter method for user's retype password
	public String getSecurityQn() {
		return securityQn;
	}
	public void setSecurityQn(String securityQn) {
		this.securityQn = securityQn;
	}

	
}

