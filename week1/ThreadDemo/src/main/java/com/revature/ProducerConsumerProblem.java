package com.revature;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

import com.revature.threads.Consumer;
import com.revature.threads.Producer;

public class ProducerConsumerProblem {
	
	public static final int NUM_OF_PRODS = 4;
	public static final int NUM_OF_CONS = 4;

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread().getName());
		
		Queue<Integer> queue = new ArrayBlockingQueue<>(100);
		
		Set<Producer> producers = new HashSet<>();

		for(int i = 0; i < NUM_OF_PRODS; i++) {
			Producer p = new Producer();
			p.setQueue(queue);
			producers.add(p);
		}
		
		Set<Consumer> consumers = new HashSet<>();

		for(int i = 0; i < NUM_OF_CONS; i++) {
			Consumer c = new Consumer();
			c.setQueue(queue);
			consumers.add(c);
		}
		
		for(Producer p : producers) {
			p.start();
		}
		
		Thread.sleep(50);
		
		for(Consumer c : consumers) {
			c.start();
		}
	}
}
