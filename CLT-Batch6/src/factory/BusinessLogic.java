package factory;

public class BusinessLogic {
	
	public static Bank myFactoryMethod(String reference) {
		
		if (reference.equals("dbs")) {
			return new DBSBank();
		} else if(reference.equals("citi")){
			return new Citibank();
		}
		
		else
			return new OtherBank();
	
	} // end of myFactoryMethod

} // end of BusinessLogic