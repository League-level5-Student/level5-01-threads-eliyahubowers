package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {

	ConcurrentLinkedQueue<Task> tasks;
	
	Worker(ConcurrentLinkedQueue<Task> tasks){
		this.tasks = tasks;
	}
	
	public void run() {
		while(tasks.isEmpty() == false) {
			tasks.remove().preform();
		}
	}


}
