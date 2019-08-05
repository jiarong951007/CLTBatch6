package basic;

public class ThreadA extends Thread {

	
	// calling start method will execute a new thread
	// calling run method will execute in the current thread
	
	@Override
	public void run() {
		System.out.println("thread is running hiii...");
	}
		public static void main(String arg[]) {
			
			ThreadA ta = new ThreadA();
			Thread t = new Thread(ta); //we create object of Thread class, parameter have to be class type(so we passed a class reference)
			// ta.start(); // not a good practice
			t.start(); //once we call start(), it invokes run() automatically
			// ta.run(); // not a good practice, thread is not created here
			// t.run(); // not a good practice
		} 
	}

