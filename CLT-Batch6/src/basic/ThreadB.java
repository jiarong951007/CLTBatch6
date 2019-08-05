package basic;

public class ThreadB implements Runnable{
	
	@Override
		public void run() {
		System.out.println("thread is running using Runnable Interface...");
	}
	
	public static void main(String args[]) {
		ThreadB tb = new ThreadB();
		
		Thread t1 = new Thread(tb);
		Thread t2 = new Thread(tb);
		Thread t3 = new Thread(tb);
		Thread t4 = new Thread(tb);
		Thread t5 = new Thread(tb);
		
		
		t1.start(); //invokes run()
		t2.start(); //invokes run()1
		t3.start(); //invokes run()2
		t4.start(); //invokes run()3
		t5.start(); //invokes run()4
		}

}
