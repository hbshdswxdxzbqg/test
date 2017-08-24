package com.thread.condition.consumeone;

public class ThreadB extends Thread {
 
	private MyService service;
	public ThreadB(MyService service) {
		super();
		this.service = service;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			service.get();
		}
	}
}
