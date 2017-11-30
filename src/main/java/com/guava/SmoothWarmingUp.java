package com.guava;

import java.util.concurrent.TimeUnit;

import com.google.common.util.concurrent.RateLimiter;

//����Ͱ
//ƽ��Ԥ������
public class SmoothWarmingUp {
	public static void main(String[] args) {
		//ÿ������5���������������ʹ��ɵ�ƽ�����ʵ�ʱ����
		RateLimiter limiter = RateLimiter.create(5, 1000, TimeUnit.MILLISECONDS);
		for (int i = 0; i < 5; i++) {
			System.out.println(limiter.acquire());
		}
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(limiter.acquire());
		}
		
	}

}
