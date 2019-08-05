package advance;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Java Thread pool represents a group of worker threads that
// are waiting for the job and reuse many times.

// In case of thread pool, a group of fixed size threads are created.
// A thread from the thread pool is pulled out and assigned a job by
// the service provider.
// after completion of the job, thread is contained in the thread pool again. 


public class ThreadPoolExample {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(5); //Creating a pool of 5 threads
		for (int i =0; i<5; i++) {	
			Runnable worker = new WorkerThread("" + i);
			executor.execute(worker); //calling execute method of ExecutorService
		}
		executor.shutdown();
		while(!executor.isTerminated()) { 
			
		}}}
	


