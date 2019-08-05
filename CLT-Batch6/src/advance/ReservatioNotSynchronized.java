package advance;

class Res implements Runnable {
	int available = 5;
	int wanted;
	Res(int i) {
		wanted =i;
	
}

	public void run() {
		System.out.println("Available berths: "+available);
		if (available>=wanted) {
			// get the name of the passenger
			String name = Thread.currentThread().getName();
			// allot the berth for him
			System.out.println(wanted+"Berths reserved for "+name);
			try {
				Thread.sleep(2000);
				available= available-wanted;
			}
			catch(InterruptedException ie) {	
			}
		} // end of if
		else
			System.out.println("Sorry... no berth available");
 	} //end of run
}  // end of class

public class ReservatioNotSynchronized {

	public static void main(String[] args) {
		
		Res r = new Res(3);
		
		
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
