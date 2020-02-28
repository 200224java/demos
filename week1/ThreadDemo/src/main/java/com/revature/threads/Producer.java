package com.revature.threads;

import java.util.Queue;

public class Producer extends Thread {

	private Queue<Integer> q;
	
	public static int value = 0;
	
	@Override
	public void run() {
		
		try {
			
			while(true) {
				synchronized (q) {
					while(!q.offer(value)) {
						System.out.println("Produer " + getName() + " falling asleep!");
						q.wait();
					}
					
					System.out.println("Added value: " + value++);
					
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
