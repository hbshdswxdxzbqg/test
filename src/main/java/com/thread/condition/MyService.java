package com.thread.condition;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();

	public void testMethod() {
		lock.lock();//»ñÈ¡Ëø
		for (int i = 0; i < 5; i++) {
			System.out.println("threadName=" + Thread.currentThread().getName()
					+ (" " + (i + 1)));
		}
		lock.unlock();//ÊÍ·ÅËø
	}

}
