package basic;

public class ThreadC extends Thread{

	@Override
	public void run() {
		for (int i =0; i<=3; i++) {
			try {
				Thread.sleep(500);
	System.out.println("Current Thread Running: "+Thread.currentThread().getName());
			}
			catch(Exception e)
			{System.out.println("Exception has been caught"); }
			 System.out.println(i);
			}
			}
	

public static void main(String args[]) {
	ThreadC tc = new ThreadC();
	
	Thread t1 = new Thread(tc);
	Thread t2 = new Thread(tc);
	Thread t3 = new Thread(tc);
	Thread t4 = new Thread(tc);
	Thread t5 = new Thread(tc);
	
	t1.setName("thread t1");
	t2.setName("thread t2");
	t3.setName("thread t3");
	t4.setName("thread t4");
	t5.setName("thread t5");
	
	t1.start(); //invokes run
	t2.start(); //invokes run()1
	t3.start(); //invokes run()2
	
	try {
		t1.join(); //t1 will terminates first 
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	

	
	
	
	t4.start(); //invokes run()3
	t5.start(); //invokes run()4
	}

}