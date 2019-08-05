package advance;

class Reserve implements Runnable {
	int available = 5;
	int wanted;
	
	
	public void run() {
					
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				
			}
			synchronized (this) {

		if (Thread.currentThread().getName().equals("Razli")) {
			wanted = 2;
			
		} else if (Thread.currentThread().getName().equals("Sulianto")) {
			wanted = 2;
			
		} else if (Thread.currentThread().getName().equals("Karthik")) {
			wanted = 3;
		}
		
		
		System.out.println("Available berths: "+available);
		if (available>=wanted) {
			// get the name of the passenger
			String name = Thread.currentThread().getName();
			// allot the berth for him
			System.out.println(wanted+" Berths reserved for "+name);
			try {
				Thread.sleep(2000);
				available= available-wanted;
			}
			catch(InterruptedException ie) {	
			}
		} // end of if
		
		else
			{String name = Thread.currentThread().getName(); 
			System.out.println("Sorry... no berth available for " +name);
 	} //end of run
	}}}  // end of class


	

public class ReservationSynchronized {

	public static void main(String[] args) {
		
		Reserve r = new Reserve();
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		
		t1.setName("Razli");
		t2.setName("Sulianto");
		t3.setName("Karthik");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
