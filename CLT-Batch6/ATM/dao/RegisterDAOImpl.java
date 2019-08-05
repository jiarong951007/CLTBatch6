package dao;

import pojo.Register;

public class RegisterDAOImpl implements RegisterDAO {
	
	boolean status; 
		
		//connect with DB here
		
		@Override
		public boolean registerEmailValidate(Register ref) {
		
			// validating if the user input is correct
			if(ref.getEmail()=="opt@gmail.com") {
				status = true; 
			} else {
				status = false; 
			}
				return status; 
		}

		@Override
		public boolean registerRetypeValidate(Register ref) {
		
			if(ref.getPassword()== ref.getRetype()) {
				status = true; 
			} else {
				status = false; 
			}
				return status; 
		}

	}


