package dao;

import pojo.Register;

public interface RegisterDAO {


	boolean registerEmailValidate(Register ref);
	boolean registerRetypeValidate(Register ref);
	 
	
}
