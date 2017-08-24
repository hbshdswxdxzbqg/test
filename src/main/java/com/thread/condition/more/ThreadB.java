package com.thread.condition.more;

public class ThreadB extends Thread{

	private MyService service;
	
	public ThreadB(MyService service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.awaitB();
	}
}
