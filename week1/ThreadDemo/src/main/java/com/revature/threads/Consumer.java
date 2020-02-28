package com.revature.threads;

import java.util.Queue;

public class Consumer extends Thread {

	private Queue<Integer> q;
	
	@Override
	public void run() {
		
		try {
			
			while(true) {
				synchronized (q) {
					while(q.isEmpty()) {
						System.out.println("Consumer " + getName() + " falling asleep!");
						q.wait();
					}
					
					int val = q.remove();
					
					System.out.println("Reading value: " + val);
					
					q.notifyAll();
					
					Thread.sleep(1);
				}
			}
			
		} catch(InterruptedException e) { }	
	}
	
	public void setQueue(Queue<Integer> q) {
		this.q = q;
	}
}
