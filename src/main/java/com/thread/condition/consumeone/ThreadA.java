package com.thread.condition.consumeone;

public class ThreadA extends Thread{

	private MyService service;
	
	public ThreadA(MyService service) {
		super();
		this.service = service;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			service.set();
		}
	}
}
