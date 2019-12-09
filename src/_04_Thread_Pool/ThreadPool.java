package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
	
	Thread[] threads; 
	ConcurrentLinkedQueue<Task> tasks;
	
	ThreadPool(int numThreads){
		
		threads = new Thread[numThreads];
		
		tasks = new ConcurrentLinkedQueue<Task>();
		
		for(int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(()-> new Worker(tasks)); 
		}
	}
	
	void addTask(Task i) {
		tasks.add(i);
	}
	
	void start() {
		for(int i = 0; i < threads.length; i++) {
			threads[i].start();
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
